package demo.validate.refactor;

import java.util.regex.Pattern;

import demo.validate.User;

public class EmailFormatRule implements RegisterRule {

	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	public void validate(User user) {
		Pattern validEmailPattern = Pattern.compile(EMAIL_PATTERN);
		if( !validEmailPattern.matcher(user.getEmail()).matches() ) {
			throw new IllegalArgumentException("Email is wrong format");
		}
	}

}
