package com.fairgee.gateling.base.shared.rpc;

import java.util.List;

import net.customware.gwt.dispatch.shared.Result;

public class RefreshRegisteredModulesResult implements Result {

	private static final long serialVersionUID = -2132546934795378501L;

	private List<String> modules;

	@SuppressWarnings("unused")
	private RefreshRegisteredModulesResult() {
	}

	public RefreshRegisteredModulesResult(final List<String> modules) {
		this.modules = modules;
	}

	public List<String> getModules() {
		return modules;
	}
}
