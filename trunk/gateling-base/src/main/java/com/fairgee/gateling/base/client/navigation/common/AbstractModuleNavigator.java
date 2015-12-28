package com.fairgee.gateling.base.client.navigation.common;

import com.google.inject.Inject;

public abstract class AbstractModuleNavigator implements ModuleNavigator {

	ModuleNavigatorRegister reg;

	@Inject
	public AbstractModuleNavigator(ModuleNavigatorRegister reg) {
		this.reg = reg;
		reg.register(this);
	}

}
