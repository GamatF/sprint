package com.gamatf.sprint;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

@SpringUI
@Theme("valo")
public class SprintUI extends UI {
	
	private static final long serialVersionUID = 7644846200080914916L;
	
	@Override
	protected void init(VaadinRequest request) {
		setContent(new Label("Sprint"));
	}
	
}

