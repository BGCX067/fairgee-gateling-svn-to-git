package com.fairgee.gateling.client.gin;

import net.customware.gwt.dispatch.client.gin.StandardDispatchModule;
import net.customware.gwt.presenter.client.place.PlaceManager;

import com.fairgee.gateling.base.client.gin.BaseGinModule;
import com.fairgee.gateling.base.client.gin.SampleModule;
import com.fairgee.gateling.base.client.mvp.BaseAppPresenter;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;

@GinModules({ StandardDispatchModule.class, BaseGinModule.class,
		SampleModule.class })
public interface GatelingInjector extends Ginjector {
	BaseAppPresenter getAppPresenter();

	PlaceManager getPlaceManager();
}
