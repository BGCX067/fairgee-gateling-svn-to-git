package com.fairgee.gateling.base.client.widgets;

import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.gwt.user.client.ui.MenuItemSeparator;

public interface HasMenuItems {

	MenuItem addItem(MenuItem item);

	MenuItem addItem(String text, boolean asHTML, MenuBar popup);

	MenuItemSeparator addSeparator(MenuItemSeparator separator);

	void removeItem(MenuItem item);

	void removeSeparator(MenuItemSeparator separator);
}
