package com.fairgee.gateling.base.client.mvp;

import java.util.List;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;

public class ModuleAutoregistrationView extends Composite implements
		ModuleAutoregistrationPresenter.Display {
	private Button button;
	private ListBox listBox;

	public ModuleAutoregistrationView() {

		FlowPanel fPanel = new FlowPanel();
		initWidget(fPanel);

		Label lblTotoJeLabbel = new Label("TOTO je labbel");
		fPanel.add(lblTotoJeLabbel);

		listBox = new ListBox();
		fPanel.add(listBox);
		listBox.setSize("100%", "90px");
		listBox.setVisibleItemCount(5);

		button = new Button("New button");
		fPanel.add(button);
	}

	private HasValue<List<String>> listmodel = new HasValue<List<String>>() {

		@Override
		public HandlerRegistration addValueChangeHandler(
				ValueChangeHandler<List<String>> handler) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void fireEvent(GwtEvent<?> event) {
			// TODO Auto-generated method stub

		}

		@Override
		public List<String> getValue() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setValue(List<String> value) {
			listBox.clear();
			for (String s : value) {
				listBox.addItem(s);
			}
		}

		@Override
		public void setValue(List<String> value, boolean fireEvents) {
			// TODO Auto-generated method stub

		}

	};

	@Override
	public Widget asWidget() {

		return this;
	}

	@Override
	public HasValue<List<String>> getRegisteredModules() {
		return listmodel;
	}

	@Override
	public HasClickHandlers getRefresh() {
		return button;
	}

}
