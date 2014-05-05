package de.dennishoersch.web.jsf.playground.contacts.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.inject.Named;

import com.google.common.collect.ImmutableList;

import de.dennishoersch.web.jsf.playground.contacts.dto.Contact;

@javax.inject.Singleton
class ContactService {

	private final List<Contact> contacts = new ArrayList()
	private long idCounter = 1
	
	ContactService() {
		saveContact(new Contact(firstname: "Hans", lastname: "Hurper", telephone: "030-76354651", email: "hans@hurper.de"))
		saveContact(new Contact(firstname: "Helge", lastname: "Wimper", telephone: "030-50734651", email: "helge.wimper@gmx.de"))
		saveContact(new Contact(firstname: "Menge", lastname: "Wurtz", telephone: "040-76323551", email: "menge_wurtz@web.de"))
	}
	
	
	Collection<Contact> findAllContacts() {
		return ImmutableList.copyOf(contacts)
	}
	
	void saveContact(Contact contact) {
		if (!contact.id) {
			contact.id = idCounter++
		}
		if (contacts.contains(contact)) {
			return
		}
		contacts.add(contact)
	}
	
	void deleteContact(long id) {
		Contact c = contacts.find {
			it.id == id
		}
		contacts.remove(c);
	}
	
}
