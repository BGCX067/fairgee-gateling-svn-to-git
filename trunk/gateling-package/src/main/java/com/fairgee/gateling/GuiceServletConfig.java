package com.fairgee.gateling;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import net.customware.gwt.dispatch.server.guice.AppEngineSecurityModule;

import com.fairgee.gateling.base.server.PluginModule;
import com.fairgee.gateling.base.server.guice.BaseServletModule;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

public class GuiceServletConfig extends GuiceServletContextListener {

	private static final Logger log = Logger.getLogger(GuiceServletConfig.class
			.getName());

	private final List<AbstractModule> modules = getModules();

	@Override
	protected Injector getInjector() {
		return Guice.createInjector(modules);
	}

	private List<AbstractModule> getModules() {
		List<AbstractModule> result = new ArrayList<AbstractModule>();

		// this is servlet module for dispatcher, all others must be added to
		// Modules.PLUGIN_MODULES array.
		result.add(new BaseServletModule());
		result.add(new AppEngineSecurityModule());

		for (PluginModule m : Modules.PLUGIN_MODULES) {
			try {
				result.add((AbstractModule) m);
			} catch (ClassCastException e) {
				log.severe("Plugin Module " + m.getClass().getCanonicalName()
						+ " is not subclass of AbstractModule!");
			}
		}
		return result;
	}

}