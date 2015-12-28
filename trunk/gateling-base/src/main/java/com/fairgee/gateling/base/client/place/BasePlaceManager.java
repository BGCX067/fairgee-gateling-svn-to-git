package com.fairgee.gateling.base.client.place;

import net.customware.gwt.presenter.client.EventBus;
import net.customware.gwt.presenter.client.place.DefaultPlaceManager;
import net.customware.gwt.presenter.client.place.TokenFormatter;

import com.google.inject.Inject;

public class BasePlaceManager extends DefaultPlaceManager {

	@Inject
	public BasePlaceManager(EventBus eventBus, TokenFormatter tokenFormatter,
			ModuleAutoregistrationPlace map) {
		super(eventBus, tokenFormatter, map);
	}

}
