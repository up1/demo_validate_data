package demo.validate.refactor;

import demo.validate.User;

public class NameEmptyRule implements RegisterRule {

	public void validate(User user) {
		if (user.getName() == null || user.getName().trim().equals("")) {
			throw new IllegalArgumentException("Name should not empty");
		}
	}

}
