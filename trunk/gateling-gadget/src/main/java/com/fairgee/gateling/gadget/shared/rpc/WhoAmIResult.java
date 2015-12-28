package com.fairgee.gateling.gadget.shared.rpc;

import net.customware.gwt.dispatch.shared.Result;

public class WhoAmIResult implements Result {

	private static final long serialVersionUID = -2132546934795378501L;

	private String user;

	@SuppressWarnings("unused")
	private WhoAmIResult() {
	}

	public WhoAmIResult(final String user) {
		this.user = user;
	}

	public String getUser() {
		return user;
	}

}
