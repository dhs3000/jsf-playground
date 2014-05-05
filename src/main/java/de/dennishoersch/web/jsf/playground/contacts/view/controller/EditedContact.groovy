package de.dennishoersch.web.jsf.playground.contacts.view.controller;

import javax.faces.view.ViewScoped
import javax.inject.Named

import de.dennishoersch.web.jsf.playground.contacts.dto.Contact;

@Named
@ViewScoped
class EditedContact implements Serializable {
	private static final long serialVersionUID = 1L;
	
	Contact contact = new Contact();
}
