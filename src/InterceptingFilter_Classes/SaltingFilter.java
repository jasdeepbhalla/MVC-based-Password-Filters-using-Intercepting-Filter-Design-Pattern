package InterceptingFilter_Classes;

import MVC_Classes.LoginModel;

public class SaltingFilter implements Filter {

	@Override
	public void execute(LoginModel model) {
		String saltedPassword = model.getPassword() + "salt12345";
		model.setPassword(saltedPassword);
	}
}
