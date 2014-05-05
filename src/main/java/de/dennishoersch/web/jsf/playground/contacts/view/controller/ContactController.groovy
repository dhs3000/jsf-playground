package de.dennishoersch.web.jsf.playground.contacts.view.controller;

import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

import com.google.common.base.Preconditions

import de.dennishoersch.web.jsf.playground.contacts.dto.Contact
import de.dennishoersch.web.jsf.playground.contacts.service.ContactService


@Named
@Singleton
class ContactController {

	@Inject
	private ContactService contactService;
	
	Collection<Contact> getAll() {
		return contactService.findAllContacts();
	}
	
	void delete(Long id) {
		Preconditions.checkNotNull(id);
		contactService.deleteContact(id);
	}
	
	void save(Contact contact) {
		Preconditions.checkNotNull(contact);
		contactService.saveContact(contact);
	}
	
}
