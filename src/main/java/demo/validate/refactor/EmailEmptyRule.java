package demo.validate.refactor;

import demo.validate.User;

public class EmailEmptyRule implements RegisterRule {

	public void validate(User user) {
		if (user.getEmail() == null || user.getEmail().trim().equals("")) {
			throw new IllegalArgumentException("Email should not empty");
		}
	}

}
