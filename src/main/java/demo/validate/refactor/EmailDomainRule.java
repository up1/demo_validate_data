package demo.validate.refactor;

import java.util.Arrays;
import java.util.List;

import demo.validate.User;

public class EmailDomainRule implements RegisterRule {

	public void validate(User user) {
		List<String> notAllowDomains = Arrays.asList("domain01.cc","domain02.cc", "domain03.cc");
		if(notAllowDomains.contains(user.getEmail().split("@")[1])) {
			throw new IllegalArgumentException("Domain Email is not allow");
		}
	}

}
