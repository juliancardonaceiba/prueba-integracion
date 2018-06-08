package co.com.ceiba.integration.demo.business;

import java.util.List;

import co.com.ceiba.integration.demo.model.Person;

public interface NotifyPersonService {

	public String notify(Person person);
	
	public List<String> notifyAll(List<Person> people);

}
