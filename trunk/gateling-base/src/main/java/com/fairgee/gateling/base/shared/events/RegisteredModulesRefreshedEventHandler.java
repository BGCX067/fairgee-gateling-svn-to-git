package com.fairgee.gateling.base.shared.events;

import com.google.gwt.event.shared.EventHandler;

public interface RegisteredModulesRefreshedEventHandler extends EventHandler {
	void onRefresh(RegisteredModulesRefreshedEvent event);
}
