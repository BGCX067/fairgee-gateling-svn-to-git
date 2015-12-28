package com.fairgee.gateling.base.server.guice;

import java.util.logging.Logger;

import net.customware.gwt.dispatch.server.guice.ActionHandlerModule;

import com.fairgee.gateling.base.server.PluginModule;
import com.fairgee.gateling.base.server.handlers.RefreshRegisteredModulesHandler;
import com.fairgee.gateling.base.shared.rpc.RefreshRegisteredModulesAction;

public class SampleModule extends ActionHandlerModule implements PluginModule {
	private static final Logger log = Logger.getLogger(BaseModule.class
			.getName());

	private static final String BASE_MODUL = "BaseModul";

	@Override
	protected void configureHandlers() {
		log.info("Configuring Handlers.");
		this.bindHandler(RefreshRegisteredModulesAction.class,
				RefreshRegisteredModulesHandler.class);
	}

	public String getModuleName() {
		return BASE_MODUL;
	}

}
