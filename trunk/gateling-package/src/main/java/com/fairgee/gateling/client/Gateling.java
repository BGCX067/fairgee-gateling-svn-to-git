package com.fairgee.gateling.client;

import com.fairgee.gateling.base.client.mvp.BaseAppPresenter;
import com.fairgee.gateling.client.gin.GatelingInjector;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * GWT Entry point
 * 
 * @author Stephen Callaghan
 */
public class Gateling implements EntryPoint {
	private final GatelingInjector injector = GWT.create(GatelingInjector.class);

	public void onModuleLoad() {

		BaseAppPresenter presenter = injector.getAppPresenter();
		presenter.go(RootPanel.get());

		injector.getPlaceManager().fireCurrentPlace();
	}

}
