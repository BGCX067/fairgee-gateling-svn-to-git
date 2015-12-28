package com.fairgee.gateling.base.client.mvp;

import com.fairgee.gateling.base.client.widgets.HasMenuItems;
import com.fairgee.gateling.base.client.widgets.MenuBar;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class NavigationBarView extends Composite implements
		NavigationBarPresenter.Display {
	private MenuBar menuBar;

	public NavigationBarView() {

		menuBar = new MenuBar(false);
		initWidget(menuBar);

	}

	@Override
	public Widget asWidget() {
		return this;
	}

	@Override
	public HasMenuItems getMenuBar() {
		return menuBar;
	}

}
