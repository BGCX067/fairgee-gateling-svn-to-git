package com.fairgee.gateling.base.client.navigation.common;

import java.util.HashMap;
import java.util.Map;

import net.customware.gwt.presenter.client.widget.WidgetDisplay;
import net.customware.gwt.presenter.client.widget.WidgetPresenter;

import com.google.gwt.user.client.Command;
import com.google.inject.Provider;

public abstract class AbstractNavCommands {
	private Map<Class<?>, NavigationCommand> mapOfCommands = new HashMap<Class<?>, NavigationCommand>();

	public Command getNavigationCommand(Class<?> presenter) {
		return mapOfCommands.get(presenter);
	}

	public void createCommand(
			Class<?> presenterClass,
			Provider<? extends WidgetPresenter<? extends WidgetDisplay>> presenterProvider) {
		mapOfCommands.put(presenterClass, new NavigationCommand(
				presenterProvider));
	}
}
