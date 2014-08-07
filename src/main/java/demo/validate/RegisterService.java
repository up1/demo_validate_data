package demo.validate;

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
