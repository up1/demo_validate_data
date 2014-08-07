package demo.validate.refactor;

import demo.validate.User;

public class NameFormatRule implements RegisterRule {

	public void validate(User user) {
		if ( !user.getName().matches("[a-zA-Z]+")){
			throw new IllegalArgumentException("Name is wrong format");
		}
	}

}
