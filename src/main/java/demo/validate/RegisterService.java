package demo.validate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import demo.validate.refactor.AgeAllowRule;
import demo.validate.refactor.EmailDomainRule;
import demo.validate.refactor.EmailEmptyRule;
import demo.validate.refactor.EmailFormatRule;
import demo.validate.refactor.NameEmptyRule;
import demo.validate.refactor.NameFormatRule;
import demo.validate.refactor.RegisterRule;

public class RegisterService {

	public boolean register(User user) {
		
		List<RegisterRule> registerRules = new ArrayList<RegisterRule>();
		registerRules.add(new NameEmptyRule());
		registerRules.add(new NameFormatRule());
		registerRules.add(new EmailEmptyRule());
		registerRules.add(new EmailFormatRule());
		registerRules.add(new EmailDomainRule());
		registerRules.add(new AgeAllowRule());
		for (RegisterRule registerRule : registerRules) {
			registerRule.validate(user);
		}
		
		return true;
	}

}
