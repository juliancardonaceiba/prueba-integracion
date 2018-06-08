package co.com.ceiba.integration.demo.model.builder;

import co.com.ceiba.integration.demo.model.Person;

public class PersonTestDataBuilder {

	private String name;

	private String lastName;

	public PersonTestDataBuilder() {
		super();
		this.name = "Julian";
		this.lastName = "Cardona";
	}

	public PersonTestDataBuilder withName(String name) {
		this.name = name;
		return this;
	}

	public PersonTestDataBuilder withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public Person build() {
		return new Person(name, lastName);
	}
}
