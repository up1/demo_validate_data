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
import demo.validate.refactor.factory.RuleFactory;

public class RegisterService {

	public boolean register(User user) {
		for (RegisterRule registerRule : RuleFactory.getRegisterRules()) {
			registerRule.validate(user);
		}
		
		return true;
	}

}
