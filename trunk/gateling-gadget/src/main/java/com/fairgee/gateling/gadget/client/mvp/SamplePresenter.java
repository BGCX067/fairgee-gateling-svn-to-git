package com.fairgee.gateling.gadget.client.mvp;

import net.customware.gwt.dispatch.client.DispatchAsync;
import net.customware.gwt.presenter.client.EventBus;
import net.customware.gwt.presenter.client.widget.WidgetDisplay;
import net.customware.gwt.presenter.client.widget.WidgetPresenter;

import com.fairgee.gateling.gadget.shared.events.HelloWorldEvent;
import com.fairgee.gateling.gadget.shared.events.HelloWorldEventHandler;
import com.fairgee.gateling.gadget.shared.rpc.WhoAmIAction;
import com.fairgee.gateling.gadget.shared.rpc.WhoAmIResult;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HasText;
import com.google.inject.Inject;

public class SamplePresenter extends WidgetPresenter<SamplePresenter.Display> {

	public interface Display extends WidgetDisplay {
		HasText getMessage();

		HasClickHandlers getRefresh();
	}

	private DispatchAsync dispatcher;

	@Inject
	public SamplePresenter(final Display display, final EventBus eventBus,
			final DispatchAsync dispatcher) {
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
		eventBus.addHandler(HelloWorldEvent.TYPE, new HelloWorldEventHandler() {
			@Override
			public void onRefresh(HelloWorldEvent event) {
				display.getMessage().setText(event.getMessage());
			}
		});
	}

	protected void doRefresh() {
		dispatcher.execute(new WhoAmIAction(),
				new AsyncCallback<WhoAmIResult>() {

					@Override
					public void onFailure(Throwable e) {
						Window.alert("Error: " + e.getMessage());
					}

					@Override
					public void onSuccess(WhoAmIResult result) {
						eventBus.fireEvent(new HelloWorldEvent(result.getUser()));
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
