package de.dennishoersch.web.jsf.playground.contacts.view.components.structure;

import javax.faces.component.FacesComponent;
import javax.faces.component.UINamingContainer;

@FacesComponent("components.structure.Row")
class Row extends UINamingContainer {

	private static final String MAIN_FACET ="main";
	private static final String SIDEBAR_FACET ="sidebar"; 
	
	boolean isUseFullContent() {
		return !getFacet(MAIN_FACET) && !getFacet(SIDEBAR_FACET);
	}
}
