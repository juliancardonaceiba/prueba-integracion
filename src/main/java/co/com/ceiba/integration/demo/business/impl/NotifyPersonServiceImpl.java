package co.com.ceiba.integration.demo.business.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.ceiba.integration.demo.business.EmailService;
import co.com.ceiba.integration.demo.business.NotifyPersonService;
import co.com.ceiba.integration.demo.model.Person;

@Service
public class NotifyPersonServiceImpl implements NotifyPersonService {

	private EmailService emailService;
	
	@Override
	public String notify(Person person) {
		return emailService.send(person, "Hello World!");
	}

	@Override
	public List<String> notifyAll(List<Person> people) {
		return Collections.emptyList();
	}

	public EmailService getEmailService() {
		return emailService;
	}

	@Autowired
	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}
	
	

}
