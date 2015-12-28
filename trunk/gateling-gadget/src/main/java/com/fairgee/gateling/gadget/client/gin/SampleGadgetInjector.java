package com.fairgee.gateling.gadget.client.gin;

import net.customware.gwt.dispatch.client.gin.AppEngineSecurityModule;
import net.customware.gwt.dispatch.client.gin.SecureDispatchModule;
import net.customware.gwt.presenter.client.place.PlaceManager;

import com.fairgee.gateling.gadget.client.mvp.SampleGadgetAppPresenter;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;

@GinModules({ AppEngineSecurityModule.class, SecureDispatchModule.class,
		SampleGadgetModule.class })
public interface SampleGadgetInjector extends Ginjector {
	SampleGadgetAppPresenter getAppPresenter();

	PlaceManager getPlaceManager();
}