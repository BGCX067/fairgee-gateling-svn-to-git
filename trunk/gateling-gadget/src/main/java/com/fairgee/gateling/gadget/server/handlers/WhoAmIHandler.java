package com.fairgee.gateling.gadget.server.handlers;

import net.customware.gwt.dispatch.server.ActionHandler;
import net.customware.gwt.dispatch.server.ExecutionContext;
import net.customware.gwt.dispatch.shared.DispatchException;

import com.fairgee.gateling.gadget.shared.rpc.WhoAmIAction;
import com.fairgee.gateling.gadget.shared.rpc.WhoAmIResult;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

public class WhoAmIHandler implements ActionHandler<WhoAmIAction, WhoAmIResult> {

	@Override
	public Class<WhoAmIAction> getActionType() {
		return WhoAmIAction.class;
	}

	@Override
	public WhoAmIResult execute(WhoAmIAction action, ExecutionContext context)
			throws DispatchException {
		UserService userService = UserServiceFactory.getUserService();
		User user = userService.getCurrentUser();
		String username = user.getEmail();
		return new WhoAmIResult(username);
	}

	@Override
	public void rollback(WhoAmIAction action, WhoAmIResult result,
			ExecutionContext context) throws DispatchException {

	}

}
