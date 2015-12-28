package com.fairgee.gateling.base.client.mvp;

import java.util.List;

import net.customware.gwt.dispatch.client.DispatchAsync;
import net.customware.gwt.presenter.client.EventBus;
import net.customware.gwt.presenter.client.widget.WidgetDisplay;
import net.customware.gwt.presenter.client.widget.WidgetPresenter;

import com.fairgee.gateling.base.shared.events.RegisteredModulesRefreshedEvent;
import com.fairgee.gateling.base.shared.events.RegisteredModulesRefreshedEventHandler;
import com.fairgee.gateling.base.shared.rpc.RefreshRegisteredModulesAction;
import com.fairgee.gateling.base.shared.rpc.RefreshRegisteredModulesResult;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HasValue;
import com.google.inject.Inject;

public class ModuleAutoregistrationPresenter extends
		WidgetPresenter<ModuleAutoregistrationPresenter.Display> {

	public interface Display extends WidgetDisplay {
		HasValue<List<String>> getRegisteredModules();

		HasClickHandlers getRefresh();
	}

	private DispatchAsync dispatcher;

	@Inject
	public ModuleAutoregistrationPresenter(final Display display,
			final EventBus eventBus, final DispatchAsync dispatcher) {
		super(display, eventBus);
		this.dispatcher = dispatcher;
		bind();
	}

	@Override
	protected void onBind() {
		// bind refresh button
		display.getRefresh().addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				doRefresh();
			}
		});

		// bind list of results
		eventBus.addHandler(RegisteredModulesRefreshedEvent.TYPE,
				new RegisteredModulesRefreshedEventHandler() {
					@Override
					public void onRefresh(RegisteredModulesRefreshedEvent event) {
						display.getRegisteredModules().setValue(
								event.getModules());
					}
				});
	}

	protected void doRefresh() {
		dispatcher.execute(new RefreshRegisteredModulesAction(),
				new AsyncCallback<RefreshRegisteredModulesResult>() {

					@Override
					public void onFailure(Throwable e) {
						Window.alert("Error: " + e.getMessage());
					}

					@Override
					public void onSuccess(RefreshRegisteredModulesResult result) {
						eventBus.fireEvent(new RegisteredModulesRefreshedEvent(
								result.getModules()));
					}

				});
	}

	@Override
	protected void onUnbind() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void onRevealDisplay() {
		// TODO Auto-generated method stub

	}
}
