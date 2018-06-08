package co.com.ceiba.integration.demo.business.impl;

import org.springframework.stereotype.Service;

import co.com.ceiba.integration.demo.business.EmailService;
import co.com.ceiba.integration.demo.model.Person;

@Service
public class EmailServiceImpl implements EmailService{

	@Override
	public String send(Person person,String message) {
		return person.getName()+" Notified";
	}

}
