package InterceptingFilter_Classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import MVC_Classes.LoginModel;

public class EasyPasswordFilter implements Filter {

	@Override
	public void execute(LoginModel model) {
		if (isEasyPassword(model.getPassword())) {
			model.setPassword("");
		}
	}

	public boolean isEasyPassword(String password) {
		List<String> easyPasswords = new ArrayList<String>(Arrays.asList("Disney", "Mickey", "Donald"));
		for (String passwd : easyPasswords) {
			if (passwd.equals(password)) {
				return true;
			}
		}
		return false;
	}

}
