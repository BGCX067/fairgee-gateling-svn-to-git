package com.fairgee.gateling.base.client.navigation;

import com.fairgee.gateling.base.client.mvp.ModuleAutoregistrationPresenter;
import com.fairgee.gateling.base.client.navigation.common.AbstractNavCommands;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class BaseNavCommands extends AbstractNavCommands {
	@Inject
	public BaseNavCommands(Provider<ModuleAutoregistrationPresenter> map) {
		createCommand(ModuleAutoregistrationPresenter.class, map);
	}
}
