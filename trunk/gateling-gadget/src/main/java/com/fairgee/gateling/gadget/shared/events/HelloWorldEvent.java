package com.fairgee.gateling.gadget.shared.events;

import com.google.gwt.event.shared.GwtEvent;

public class HelloWorldEvent extends GwtEvent<HelloWorldEventHandler> {
	public static final Type<HelloWorldEventHandler> TYPE = new Type<HelloWorldEventHandler>();

	private String message;

	public String getMessage() {
		return message;
	}

	@SuppressWarnings("unused")
	private HelloWorldEvent() {
	}

	public HelloWorldEvent(String message) {
		this.message = message;
	}

	@Override
	public Type<HelloWorldEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(final HelloWorldEventHandler handler) {
		handler.onRefresh(this);
	}

}
