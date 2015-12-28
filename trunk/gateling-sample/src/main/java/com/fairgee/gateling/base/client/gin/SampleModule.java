package com.fairgee.gateling.base.client.gin;

import net.customware.gwt.presenter.client.gin.AbstractPresenterModule;

import com.fairgee.gateling.base.client.mvp.SamplePresenter;
import com.fairgee.gateling.base.client.mvp.SampleView;
import com.fairgee.gateling.base.client.navigation.SampleNavCommands;
import com.fairgee.gateling.base.client.navigation.SampleNavigator;
import com.google.inject.Singleton;

public class SampleModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		this.bind(SampleNavigator.class).asEagerSingleton();
		this.bind(SampleNavCommands.class).in(Singleton.class);

		this.bindDisplay(SamplePresenter.Display.class, SampleView.class);
	}
}
