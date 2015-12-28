package com.fairgee.gateling.gadget.client.gin;

import net.customware.gwt.presenter.client.DefaultEventBus;
import net.customware.gwt.presenter.client.EventBus;
import net.customware.gwt.presenter.client.gin.AbstractPresenterModule;
import net.customware.gwt.presenter.client.place.ParameterTokenFormatter;
import net.customware.gwt.presenter.client.place.PlaceManager;
import net.customware.gwt.presenter.client.place.TokenFormatter;

import com.fairgee.gateling.gadget.client.mvp.SampleGadgetAppPresenter;
import com.fairgee.gateling.gadget.client.mvp.SamplePresenter;
import com.fairgee.gateling.gadget.client.mvp.SampleView;
import com.fairgee.gateling.gadget.client.place.GadgetPlaceManager;
import com.google.inject.Singleton;

public class SampleGadgetModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		bind(EventBus.class).to(DefaultEventBus.class).in(Singleton.class);
		bind(TokenFormatter.class).to(ParameterTokenFormatter.class);
		bind(PlaceManager.class).to(GadgetPlaceManager.class)
				.asEagerSingleton();

		bind(SampleGadgetAppPresenter.class).in(Singleton.class);

		this.bindDisplay(SamplePresenter.Display.class, SampleView.class);
	}
}
