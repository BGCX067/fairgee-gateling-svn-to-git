package com.fairgee.gateling.base.client.navigation.common;

import java.util.ArrayList;
import java.util.List;


public class ModuleNavigatorRegister {
	private List<ModuleNavigator> modules = new ArrayList<ModuleNavigator>();

	public List<ModuleNavigator> getModules() {
		return modules;
	}

	public void register(ModuleNavigator module) {
		modules.add(module);
	}

	public void unregister(ModuleNavigator module) {
		modules.remove(module);
	}

}
