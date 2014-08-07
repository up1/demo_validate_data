package demo.validate.refactor;

import demo.validate.User;

public class AgeAllowRule implements RegisterRule {

	public void validate(User user) {
		if( user.getAge() < 20 ) {
			throw new IllegalArgumentException("Age should more than 20 years");
		}
	}

}
