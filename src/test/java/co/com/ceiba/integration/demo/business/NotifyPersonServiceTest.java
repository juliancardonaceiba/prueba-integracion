package co.com.ceiba.integration.demo.business;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import co.com.ceiba.integration.demo.business.impl.NotifyPersonServiceImpl;
import co.com.ceiba.integration.demo.model.Person;
import co.com.ceiba.integration.demo.model.builder.PersonTestDataBuilder;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class NotifyPersonServiceTest {

	@InjectMocks
	private NotifyPersonServiceImpl notifyPersonService;
	
	@Mock
	private EmailService emailService;

	@Test
	public void testNotify() {
		// Arrange
		Person person = new PersonTestDataBuilder().build();
		when(emailService.send(person, "Hello World!")).thenReturn(person.getName()+" Notified2");
		// Act		
		String response = notifyPersonService.notify(person);
		// Assert
		assertNotNull(response);
	}

	@Test
	public void testNotifyAll() {
		// Arrange
		Person firstPerson = new PersonTestDataBuilder().build();
		Person secondPerson = new PersonTestDataBuilder().build();
		// Act
		List<String> responses = notifyPersonService.notifyAll(Arrays.asList(firstPerson, secondPerson));
		// Assert
		assertNotNull(responses);
	}

}
