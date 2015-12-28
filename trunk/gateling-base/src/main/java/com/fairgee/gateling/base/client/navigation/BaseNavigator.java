package com.fairgee.gateling.base.client.navigation;

import com.fairgee.gateling.base.client.mvp.ModuleAutoregistrationPresenter;
import com.fairgee.gateling.base.client.navigation.common.AbstractModuleNavigator;
import com.fairgee.gateling.base.client.navigation.common.ModuleNavigatorRegister;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.inject.Inject;

public class BaseNavigator extends AbstractModuleNavigator {

	MenuItem mi;

	BaseNavCommands commands;

	@Inject
	public BaseNavigator(ModuleNavigatorRegister reg, BaseNavCommands commands) {
		super(reg);
		this.commands = commands;
		init();
	}

	private void init() {
		MenuBar mb = new MenuBar(true);
		mb.addItem("show XYZ", commands
				.getNavigationCommand(ModuleAutoregistrationPresenter.class));
		mi = new MenuItem("Settings", mb);

	}

	@Override
	public MenuItem getItem() {
		return mi;
	}

}
