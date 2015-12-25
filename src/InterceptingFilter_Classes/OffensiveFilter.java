package InterceptingFilter_Classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import MVC_Classes.LoginModel;

public class OffensiveFilter implements Filter {

	@Override
	public void execute(LoginModel model) {
		if (isOffensivePassword(model.getPassword())) {
			model.setPassword("");
		}
	}

	public boolean isOffensivePassword(String password) {

		List<String> offensivePasswords = new ArrayList<String>(Arrays.asList("abc", "def", "ghi"));
		for (String passwd : offensivePasswords) {
			if (passwd.equals(password)) {
				return true;
			}
		}
		return false;
	}

}
