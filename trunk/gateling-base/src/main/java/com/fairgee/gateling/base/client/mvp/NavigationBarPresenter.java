package com.fairgee.gateling.base.client.mvp;

import net.customware.gwt.presenter.client.EventBus;
import net.customware.gwt.presenter.client.widget.WidgetDisplay;
import net.customware.gwt.presenter.client.widget.WidgetPresenter;

import com.fairgee.gateling.base.client.navigation.common.ModuleNavigator;
import com.fairgee.gateling.base.client.navigation.common.ModuleNavigatorRegister;
import com.fairgee.gateling.base.client.widgets.HasMenuItems;
import com.google.inject.Inject;

public class NavigationBarPresenter extends
		WidgetPresenter<NavigationBarPresenter.Display> {

	ModuleNavigatorRegister reg;

	@Inject
	public NavigationBarPresenter(Display display, EventBus eventBus,
			ModuleNavigatorRegister reg) {
		super(display, eventBus);
		this.reg = reg;
		bind();
	}

	public interface Display extends WidgetDisplay {
		HasMenuItems getMenuBar();
	}

	@Override
	protected void onBind() {
		for (ModuleNavigator nav : reg.getModules()) {
			display.getMenuBar().addItem(nav.getItem());
		}
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
