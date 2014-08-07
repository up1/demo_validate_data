package demo.validate;

import static org.junit.Assert.*;

import org.junit.Test;

public class ValidattionTest {

	@Test
	public void validInput() {
		User user = new User();
		user.setName("Somkiat");
		user.setEmail("up1@somkiat.cc");
		user.setAge(30);
		
		RegisterService registerService = new RegisterService();
		assertTrue(registerService.register(user));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void nameIsEmpty() {
		User user = new User();
		user.setName("ddd");
		
		RegisterService registerService = new RegisterService();
		registerService.register(user);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void nameIsWrongFormat() {
		User user = new User();
		user.setName("somkiat-Up1");
		
		RegisterService registerService = new RegisterService();
		registerService.register(user);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void emailIsEmpty() {
		User user = new User();
		user.setName("somkiat");
		user.setEmail("");
		
		RegisterService registerService = new RegisterService();
		registerService.register(user);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void emailDomainNotAllow() {
		User user = new User();
		user.setName("Somkiat");
		user.setEmail("up1@domain01.cc");
		user.setAge(30);
		
		RegisterService registerService = new RegisterService();
		assertTrue(registerService.register(user));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void ageLessThan20() {
		User user = new User();
		user.setName("Somkiat");
		user.setEmail("up1@domain01.cc");
		user.setAge(19);
		
		RegisterService registerService = new RegisterService();
		assertTrue(registerService.register(user));
	}

}
