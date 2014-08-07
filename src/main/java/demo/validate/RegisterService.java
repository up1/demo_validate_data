package demo.validate;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class RegisterService {

	public boolean register(User user) {
		if (user.getName() == null || user.getName().trim().equals("")) {
			throw new IllegalArgumentException("Name should not empty");
		}
		if (user.getEmail() == null || user.getEmail().trim().equals("")) {
			throw new IllegalArgumentException("Email should not empty");
		}

		if ( !user.getName().matches("[a-zA-Z]+")){
			throw new IllegalArgumentException("Name is wrong format");
		}
		String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		Pattern validEmailPattern = Pattern.compile(EMAIL_PATTERN);
		if( !validEmailPattern.matcher(user.getEmail()).matches() ) {
			throw new IllegalArgumentException("Email is wrong format");
		}
		
		List<String> notAllowDomains = Arrays.asList("domain01.cc","domain02.cc", "domain03.cc");
		if(notAllowDomains.contains(user.getEmail().split("@")[1])) {
			throw new IllegalArgumentException("Domain Email is not allow");
		}
		
		if( user.getAge() < 20 ) {
			throw new IllegalArgumentException("Age should more than 20 years");
		}

		return true;
	}

}
