package InterceptingFilter_Classes;

import MVC_Classes.LoginModel;

public interface Filter {
	public void execute(LoginModel model);
}
