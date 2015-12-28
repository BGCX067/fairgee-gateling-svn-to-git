package com.fairgee.gateling.gadget.server.guice;

import java.util.logging.Logger;

import net.customware.gwt.dispatch.server.guice.ActionHandlerModule;

import com.fairgee.gateling.base.server.PluginModule;
import com.fairgee.gateling.gadget.server.handlers.WhoAmIHandler;
import com.fairgee.gateling.gadget.shared.rpc.WhoAmIAction;

public class SampleGadgetModule extends ActionHandlerModule implements PluginModule {
	private static final Logger log = Logger.getLogger(SampleGadgetModule.class
			.getName());

	private static final String SAMPLEGADGET_MODUL = "SampleGadgetModul";

	@Override
	protected void configureHandlers() {
		log.info("Configuring Handlers.");
		bindHandler(WhoAmIAction.class, WhoAmIHandler.class);
	}

	public String getModuleName() {
		return SAMPLEGADGET_MODUL;
	}

}
