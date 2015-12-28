package com.fairgee.gateling.base.client.navigation.common;

import net.customware.gwt.presenter.client.widget.WidgetDisplay;
import net.customware.gwt.presenter.client.widget.WidgetPresenter;

import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.inject.Provider;

public class NavigationCommand implements Command {

	private Provider<? extends WidgetPresenter<? extends WidgetDisplay>> presenter;

	@Override
	public void execute() {
		RootPanel.get("gateling-content").clear();
		RootPanel.get("gateling-content").add(
				presenter.get().getDisplay().asWidget());
	}

	public NavigationCommand(
			Provider<? extends WidgetPresenter<? extends WidgetDisplay>> presenter) {
		this.presenter = presenter;
	}
}
