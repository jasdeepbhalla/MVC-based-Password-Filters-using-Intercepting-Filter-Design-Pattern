package MVC_Classes;

import javax.swing.SwingUtilities;

public class mainClass {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				LoginModel loginModel = new LoginModel();
				LoginView loginView = new LoginView();

				LoginController loginController = new LoginController(loginModel, loginView);
				loginController.control();
			}
		});
	}
}
