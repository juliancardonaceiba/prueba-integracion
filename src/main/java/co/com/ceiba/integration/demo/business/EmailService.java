package co.com.ceiba.integration.demo.business;

import co.com.ceiba.integration.demo.model.Person;

public interface EmailService {

	public String send(Person person,String message);
}
