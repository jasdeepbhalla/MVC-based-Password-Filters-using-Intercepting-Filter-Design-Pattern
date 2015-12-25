package MVC_Classes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import InterceptingFilter_Classes.EasyPasswordFilter;
import InterceptingFilter_Classes.FilterManager;
import InterceptingFilter_Classes.OffensiveFilter;
import InterceptingFilter_Classes.SaltingFilter;

public class LoginController {
	private LoginModel model;
	private LoginView view;
	private ActionListener actionListener;
	FilterManager filterManager;

	public LoginController(LoginModel loginModel, LoginView loginView) {
		this.model = loginModel;
		this.view = loginView;
	}

	public void control() {
		actionListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String givenPassword = view.getPasswordField().getText();
				String output;
				boolean checkFlag = false;
				// TODO Auto-generated method stub
				if (!view.getPasswordField().getText().isEmpty() && !view.getPasswordField().getText().equals("")) {

					model.setPassword(view.getPasswordField().getText());
					filterManager = new FilterManager();
					checkFlag = checkPassword();
					if (!checkFlag) {
						output = "Error: Same dropdown options are selected";
					} else {
						if ((model.getPassword().isEmpty())
								|| !givenPassword.equals(model.getPassword().substring(0, givenPassword.length()))) {
							output = "Given password: '" + givenPassword + "' is an invalid password";

						} else {
							output = "Given password: '" + givenPassword + "' is a valid Password";
						}

					}
				} else {
					output = "Error: Empty password field";
				}

				view.getOutputLabel().setText(output);

			}
		};

		view.getSubmitBtn().addActionListener(actionListener);

	}

	public boolean checkPassword() {
		if ((view.getOffensiveFilterDropDown().getSelectedItem()
				.equals(view.getEasyPasswdFilterDropDown().getSelectedItem()) || view.getOffensiveFilterDropDown()
				.getSelectedItem().equals(view.getSaltingFilterDropDown().getSelectedItem()))
				|| (view.getEasyPasswdFilterDropDown().equals(view.getSaltingFilterDropDown().getSelectedItem()) || view
						.getEasyPasswdFilterDropDown().equals(view.getOffensiveFilterDropDown().getSelectedItem()))
				|| (view.getSaltingFilterDropDown().getSelectedItem()
						.equals(view.getOffensiveFilterDropDown().getSelectedItem()) || view.getSaltingFilterDropDown()
						.getSelectedItem().equals(view.getEasyPasswdFilterDropDown().getSelectedItem()))) {
			return false;

		} else {
			if (view.getOffensiveFilterDropDown().getSelectedItem().equals("1")
					&& view.getEasyPasswdFilterDropDown().getSelectedItem().equals("2")
					&& view.getSaltingFilterDropDown().getSelectedItem().equals("3")) {
				filterManager.setFilter(new OffensiveFilter());
				filterManager.setFilter(new EasyPasswordFilter());
				filterManager.setFilter(new SaltingFilter());

			} else if (view.getOffensiveFilterDropDown().getSelectedItem().equals("2")
					&& view.getEasyPasswdFilterDropDown().getSelectedItem().equals("1")
					&& view.getSaltingFilterDropDown().getSelectedItem().equals("3")) {
				filterManager.setFilter(new EasyPasswordFilter());
				filterManager.setFilter(new OffensiveFilter());
				filterManager.setFilter(new SaltingFilter());

			} else if (view.getOffensiveFilterDropDown().getSelectedItem().equals("2")
					&& view.getEasyPasswdFilterDropDown().getSelectedItem().equals("3")
					&& view.getSaltingFilterDropDown().getSelectedItem().equals("1")) {
				filterManager.setFilter(new SaltingFilter());
				filterManager.setFilter(new OffensiveFilter());
				filterManager.setFilter(new EasyPasswordFilter());

			} else if (view.getOffensiveFilterDropDown().getSelectedItem().equals("3")
					&& view.getEasyPasswdFilterDropDown().getSelectedItem().equals("1")
					&& view.getSaltingFilterDropDown().getSelectedItem().equals("2")) {
				filterManager.setFilter(new EasyPasswordFilter());
				filterManager.setFilter(new SaltingFilter());
				filterManager.setFilter(new OffensiveFilter());

			} else if (view.getOffensiveFilterDropDown().getSelectedItem().equals("3")
					&& view.getEasyPasswdFilterDropDown().getSelectedItem().equals("2")
					&& view.getSaltingFilterDropDown().getSelectedItem().equals("1")) {

				filterManager.setFilter(new SaltingFilter());
				filterManager.setFilter(new EasyPasswordFilter());
				filterManager.setFilter(new OffensiveFilter());

			} else if (view.getOffensiveFilterDropDown().getSelectedItem().equals("1")
					&& view.getEasyPasswdFilterDropDown().getSelectedItem().equals("3")
					&& view.getSaltingFilterDropDown().getSelectedItem().equals("2")) {
				filterManager.setFilter(new OffensiveFilter());
				filterManager.setFilter(new SaltingFilter());
				filterManager.setFilter(new EasyPasswordFilter());

			}

			setFilterManager(filterManager);
			sendRequest(model);

			return true;
		}

	}

	public String getPassword() {
		return model.getPassword();
	}

	public void setPassword(String password) {
		model.setPassword(password);
	}

	public void setFilterManager(FilterManager filterManager) {
		this.filterManager = filterManager;
	}

	public void sendRequest(LoginModel model) {
		filterManager.filterRequest(model);
	}

}
