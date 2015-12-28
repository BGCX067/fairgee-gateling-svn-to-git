package com.fairgee.gateling.base.client.navigation;

import com.fairgee.gateling.base.client.mvp.SamplePresenter;
import com.fairgee.gateling.base.client.navigation.common.AbstractModuleNavigator;
import com.fairgee.gateling.base.client.navigation.common.ModuleNavigatorRegister;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.inject.Inject;

public class SampleNavigator extends AbstractModuleNavigator {

	MenuItem mi;

	@Inject
	public SampleNavigator(ModuleNavigatorRegister reg, SampleNavCommands commands) {
		super(reg);

		mi = new MenuItem("Sample",
				commands.getNavigationCommand(SamplePresenter.class));
	}

	@Override
	public MenuItem getItem() {
		return mi;
	}

}
