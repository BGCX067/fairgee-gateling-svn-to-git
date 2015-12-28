package com.fairgee.gateling.gadget.client.place;

import net.customware.gwt.presenter.client.EventBus;
import net.customware.gwt.presenter.client.place.DefaultPlaceManager;
import net.customware.gwt.presenter.client.place.TokenFormatter;

import com.google.inject.Inject;

public class GadgetPlaceManager extends DefaultPlaceManager {

	@Inject
	public GadgetPlaceManager(EventBus eventBus, TokenFormatter tokenFormatter) {
		super(eventBus, tokenFormatter);
	}

}