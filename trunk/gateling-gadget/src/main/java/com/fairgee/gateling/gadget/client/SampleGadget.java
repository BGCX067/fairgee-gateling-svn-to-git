package com.fairgee.gateling.gadget.client;

import com.fairgee.gateling.gadget.client.gin.SampleGadgetInjector;
import com.fairgee.gateling.gadget.client.mvp.SampleGadgetAppPresenter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.gadgets.client.Gadget;
import com.google.gwt.gadgets.client.Gadget.ModulePrefs;
import com.google.gwt.gadgets.client.UserPreferences;
import com.google.gwt.user.client.ui.RootPanel;

@ModulePrefs(title = "SampleGadget", author = "lbeckk22", author_email = "lbeck22@gmail.com")
public class SampleGadget extends Gadget<UserPreferences> {

	SampleGadgetInjector injector = GWT.create(SampleGadgetInjector.class);

	@Override
	protected void init(UserPreferences preferences) {
		SampleGadgetAppPresenter presenter = injector.getAppPresenter();
		presenter.go(RootPanel.get());
		injector.getPlaceManager().fireCurrentPlace();
	}

}
