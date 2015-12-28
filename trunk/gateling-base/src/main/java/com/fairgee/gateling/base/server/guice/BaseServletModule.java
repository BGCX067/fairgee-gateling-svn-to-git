package com.fairgee.gateling.base.server.guice;

import com.google.inject.Singleton;
import com.google.inject.servlet.ServletModule;

public class BaseServletModule extends ServletModule {

	@Override
	public void configureServlets() {
		bind(GadgetEnabledGuiceDispatchServlet.class).in(Singleton.class);
		serve("/gateling/dispatch").with(
				GadgetEnabledGuiceDispatchServlet.class);

	}
}