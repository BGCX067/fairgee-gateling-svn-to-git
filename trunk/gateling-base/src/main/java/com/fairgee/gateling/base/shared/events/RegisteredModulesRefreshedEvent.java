package com.fairgee.gateling.base.shared.events;

import java.util.List;

import com.google.gwt.event.shared.GwtEvent;

public class RegisteredModulesRefreshedEvent extends
		GwtEvent<RegisteredModulesRefreshedEventHandler> {
	public static final Type<RegisteredModulesRefreshedEventHandler> TYPE = new Type<RegisteredModulesRefreshedEventHandler>();

	private List<String> modules;

	public List<String> getModules() {
		return modules;
	}

	@SuppressWarnings("unused")
	private RegisteredModulesRefreshedEvent() {
	}

	public RegisteredModulesRefreshedEvent(List<String> modules) {
		this.modules = modules;
	}

	@Override
	public Type<RegisteredModulesRefreshedEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(final RegisteredModulesRefreshedEventHandler handler) {
		handler.onRefresh(this);
	}

}
