package com.fairgee.gateling.base.server.guice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import net.customware.gwt.dispatch.server.Dispatch;
import net.customware.gwt.dispatch.server.guice.GuiceSecureDispatchServlet;
import net.customware.gwt.dispatch.server.secure.SecureSessionValidator;

import com.google.gwt.user.server.rpc.RPCServletUtils;
import com.google.inject.Inject;

public class GadgetEnabledGuiceDispatchServlet extends
		GuiceSecureDispatchServlet {

	@Inject
	public GadgetEnabledGuiceDispatchServlet(Dispatch dispatch,
			SecureSessionValidator sessionValidator) {
		super(dispatch, sessionValidator);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1532777596009792491L;

	// This is necessary to allow Gadgets call rpc
	@Override
	protected String readContent(HttpServletRequest request)
			throws ServletException, IOException {
		return RPCServletUtils.readContentAsUtf8(request, false);
	}
}
