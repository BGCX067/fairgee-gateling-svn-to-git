package com.fairgee.gateling;

import com.fairgee.gateling.base.server.PluginModule;
import com.fairgee.gateling.base.server.guice.BaseModule;
import com.fairgee.gateling.gadget.server.guice.SampleGadgetModule;

public class Modules {
	public static final PluginModule[] PLUGIN_MODULES = {
	/** Base Module */
	new BaseModule(),

	new SampleGadgetModule(),
	// Add all other modules

	};
}
