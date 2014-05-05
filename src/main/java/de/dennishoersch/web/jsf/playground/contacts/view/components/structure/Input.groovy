package de.dennishoersch.web.jsf.playground.contacts.view.components.structure;

import javax.faces.component.FacesComponent;
import javax.faces.component.UINamingContainer;

@FacesComponent("components.structure.Input")
class Input extends UINamingContainer {

	private static final String REQUIRED = 'required';
	
	Map<String, String> getInputPassthrough() {
		Map<String, String> result = new HashMap()
		//println stateHelper.eval(REQUIRED)
		if (stateHelper.eval(REQUIRED)) {
			result.put(REQUIRED, REQUIRED)
		}
		return result
	}
}
