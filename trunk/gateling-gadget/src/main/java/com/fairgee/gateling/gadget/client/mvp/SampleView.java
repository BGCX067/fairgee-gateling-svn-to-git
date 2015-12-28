package com.fairgee.gateling.gadget.client.mvp;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class SampleView extends Composite implements SamplePresenter.Display {
	private Button btnHello;
	Label lblTotoJeLabbel;

	public SampleView() {

		FlowPanel fPanel = new FlowPanel();
		initWidget(fPanel);

		lblTotoJeLabbel = new Label("TOTO je labbel");
		fPanel.add(lblTotoJeLabbel);

		btnHello = new Button("Hello");
		fPanel.add(btnHello);
	}

	@Override
	public Widget asWidget() {

		return this;
	}

	@Override
	public HasClickHandlers getRefresh() {
		return btnHello;
	}

	@Override
	public HasText getMessage() {
		return lblTotoJeLabbel;
	}

}
