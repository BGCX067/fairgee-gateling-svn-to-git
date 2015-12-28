package com.fairgee.gateling.base.client.place;

import net.customware.gwt.presenter.client.gin.ProvidedPresenterPlace;

import com.fairgee.gateling.base.client.mvp.ModuleAutoregistrationPresenter;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class ModuleAutoregistrationPlace extends
		ProvidedPresenterPlace<ModuleAutoregistrationPresenter> {

	private static final String name = "ModuleAutoregistrationPlace";

	@Inject
	public ModuleAutoregistrationPlace(
			Provider<ModuleAutoregistrationPresenter> presenter) {
		super(presenter);
	}

	@Override
	public String getName() {
		return name;
	}

}
