package com.fairgee.gateling.base.client.navigation;

import com.fairgee.gateling.base.client.mvp.SamplePresenter;
import com.fairgee.gateling.base.client.navigation.common.AbstractNavCommands;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class SampleNavCommands extends AbstractNavCommands {
	@Inject
	public SampleNavCommands(Provider<SamplePresenter> sp) {
		createCommand(SamplePresenter.class, sp);
	}

}
