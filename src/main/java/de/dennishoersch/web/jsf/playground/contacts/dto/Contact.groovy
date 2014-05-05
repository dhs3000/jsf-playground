package de.dennishoersch.web.jsf.playground.contacts.dto

import groovy.transform.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode(includes = 'id')
class Contact implements Serializable {

	long id

	String firstname
	String lastname

	String telephone
	String email

}
