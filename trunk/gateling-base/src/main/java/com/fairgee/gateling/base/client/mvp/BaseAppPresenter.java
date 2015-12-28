package com.fairgee.gateling.base.client.mvp;

import net.customware.gwt.dispatch.client.DispatchAsync;

import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.inject.Inject;

public class BaseAppPresenter {
	private HasWidgets container;
	private ModuleAutoregistrationPresenter regmodule;
	private NavigationBarPresenter navbar;

	/*
	 * We are using Guice dependency injection here. On the constructor, we
	 * inject a dispatcher, which is an interface that contains an execute
	 * method. The implementation of the dispatcher is bound to
	 * CachingDispatchAsync in the AppleGuiceClientModule configuration of our
	 * DI injection.
	 * 
	 * The GreetingPresenter is also bound in the AppleGuiceClientModule, and
	 * remembered here in order to have it available for the showMain method.
	 */
	@Inject
	public BaseAppPresenter(final DispatchAsync dispatcher,
			ModuleAutoregistrationPresenter regmodule,
			NavigationBarPresenter navbar) {
		this.regmodule = regmodule;
		this.navbar = navbar;
	}

	/*
	 * The HasWidgets is an interface that ends up being a handle to the
	 * RootPanel from the go() method. We keep a copy of the RootPanel as the
	 * container, then call showMain() and use the handle to clear the RootPanel
	 * and add the widget version of the GreetingPresenter.
	 */
	private void showMain() {
		container.clear();
		RootPanel.get("gateling-navigation")
				.add(navbar.getDisplay().asWidget());
		RootPanel.get("gateling-content")
				.add(regmodule.getDisplay().asWidget());
	}

	/*
	 * This method is called in GreetMvp (the EntryPoint of our application) and
	 * has passed to it the RootPanel after the presenter has been retrieved
	 * from the injector on initialization. Its job is to store the RootPanel
	 * and then delegate to the showMain method for display.
	 */
	public void go(final HasWidgets container) {
		this.container = container;
		showMain();
	}
}
