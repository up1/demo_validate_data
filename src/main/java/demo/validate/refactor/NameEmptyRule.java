package demo.validate.refactor;

import demo.validate.User;

public class NameEmptyRule implements RegisterRule {

	public void validate(User user) {
		if (user.getName() == null || "".equals(user.getName().trim())) {
			throw new IllegalArgumentException("Name should not empty");
		}
	}

}
