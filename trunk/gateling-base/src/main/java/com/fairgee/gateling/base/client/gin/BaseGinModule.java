package com.fairgee.gateling.base.client.gin;

import net.customware.gwt.presenter.client.DefaultEventBus;
import net.customware.gwt.presenter.client.EventBus;
import net.customware.gwt.presenter.client.gin.AbstractPresenterModule;
import net.customware.gwt.presenter.client.place.ParameterTokenFormatter;
import net.customware.gwt.presenter.client.place.PlaceManager;
import net.customware.gwt.presenter.client.place.TokenFormatter;

import com.fairgee.gateling.base.client.mvp.BaseAppPresenter;
import com.fairgee.gateling.base.client.mvp.ModuleAutoregistrationPresenter;
import com.fairgee.gateling.base.client.mvp.ModuleAutoregistrationView;
import com.fairgee.gateling.base.client.mvp.NavigationBarPresenter;
import com.fairgee.gateling.base.client.mvp.NavigationBarView;
import com.fairgee.gateling.base.client.navigation.BaseNavCommands;
import com.fairgee.gateling.base.client.navigation.BaseNavigator;
import com.fairgee.gateling.base.client.navigation.common.ModuleNavigatorRegister;
import com.fairgee.gateling.base.client.place.BasePlaceManager;
import com.google.inject.Singleton;

public class BaseGinModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		bind(ModuleNavigatorRegister.class).in(Singleton.class);
		bind(BaseNavCommands.class).in(Singleton.class);
		bind(BaseNavigator.class).asEagerSingleton();

		bind(EventBus.class).to(DefaultEventBus.class).in(Singleton.class);
		bind(TokenFormatter.class).to(ParameterTokenFormatter.class);
		bind(PlaceManager.class).to(BasePlaceManager.class).asEagerSingleton();

		bind(BaseAppPresenter.class).in(Singleton.class);

		this.bindDisplay(ModuleAutoregistrationPresenter.Display.class,
				ModuleAutoregistrationView.class);
		this.bindDisplay(NavigationBarPresenter.Display.class,
				NavigationBarView.class);

	}
}
