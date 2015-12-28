package com.fairgee.gateling.base.server.handlers;

import java.util.ArrayList;
import java.util.List;

import net.customware.gwt.dispatch.server.ActionHandler;
import net.customware.gwt.dispatch.server.ExecutionContext;
import net.customware.gwt.dispatch.shared.DispatchException;

import com.fairgee.gateling.base.server.PluginModule;
import com.fairgee.gateling.base.shared.rpc.RefreshRegisteredModulesAction;
import com.fairgee.gateling.base.shared.rpc.RefreshRegisteredModulesResult;
import com.google.inject.AbstractModule;

public class RefreshRegisteredModulesHandler
		implements
		ActionHandler<RefreshRegisteredModulesAction, RefreshRegisteredModulesResult> {

	@Override
	public Class<RefreshRegisteredModulesAction> getActionType() {
		return RefreshRegisteredModulesAction.class;
	}

	@Override
	public RefreshRegisteredModulesResult execute(
			RefreshRegisteredModulesAction action, ExecutionContext context)
			throws DispatchException {
		List<AbstractModule> am = new ArrayList<AbstractModule>();
		// TODO:GuiceServletConfig.getModulesInClassPaht();
		List<String> modules = new ArrayList<String>();
		for (AbstractModule m : am) {
			PluginModule pm = (PluginModule) m;
			modules.add(pm.getModuleName());
		}
		return new RefreshRegisteredModulesResult(modules);
	}

	@Override
	public void rollback(RefreshRegisteredModulesAction action,
			RefreshRegisteredModulesResult result, ExecutionContext context)
			throws DispatchException {
		// TODO Auto-generated method stub

	}

}
