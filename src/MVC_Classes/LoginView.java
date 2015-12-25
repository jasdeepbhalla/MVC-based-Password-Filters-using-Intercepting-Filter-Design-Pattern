package MVC_Classes;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class LoginView extends JFrame {
	private JPanel panel;
	private JFrame frame;
	private JLabel passwordLabel;
	private JLabel filterType;
	private JLabel offensiveFilterLabel;
	private JLabel easyPasswdFilterLabel;
	private JLabel saltingFilterLabel;
	private JLabel outputLabel;
	private JPasswordField passwordField;
	private JComboBox<String> offensiveFilterDropDown;
	private JComboBox<String> easyPasswdFilterDropDown;
	private JComboBox<String> saltingFilterDropDown;

	private JButton submitBtn;

	public LoginView() {

		frame = new JFrame("MVC Assignment");
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		passwordLabel = new JLabel("Enter Password: ");
		passwordField = new JPasswordField();

		filterType = new JLabel("Choose order of filters you want? ");

		offensiveFilterLabel = new JLabel("Do not allow Offensive Passwords");
		offensiveFilterDropDown = new JComboBox<>();
		offensiveFilterDropDown.addItem("1");
		offensiveFilterDropDown.addItem("2");
		offensiveFilterDropDown.addItem("3");

		easyPasswdFilterLabel = new JLabel("Do not allow Easy Passwords");
		easyPasswdFilterDropDown = new JComboBox<>();
		easyPasswdFilterDropDown.addItem("1");
		easyPasswdFilterDropDown.addItem("2");
		easyPasswdFilterDropDown.addItem("3");

		saltingFilterLabel = new JLabel("Salting Filter");
		saltingFilterDropDown = new JComboBox<String>();
		saltingFilterDropDown.addItem("1");
		saltingFilterDropDown.addItem("2");
		saltingFilterDropDown.addItem("3");

		submitBtn = new JButton("Check Password");

		outputLabel = new JLabel("    ");

		panel.add(passwordLabel);
		panel.add(passwordField);

		panel.add(filterType);

		panel.add(offensiveFilterLabel);
		panel.add(offensiveFilterDropDown);

		panel.add(easyPasswdFilterLabel);
		panel.add(easyPasswdFilterDropDown);

		panel.add(saltingFilterLabel);
		panel.add(saltingFilterDropDown);

		panel.add(submitBtn);
		panel.add(outputLabel);

		// Display the window.
		frame.add(panel);
		frame.setSize(350, 410);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}

	public JButton getSubmitBtn() {
		return submitBtn;
	}

	public void setSubmitBtn(JButton submitBtn) {
		this.submitBtn = submitBtn;
	}

	public JComboBox getOffensiveFilterDropDown() {
		return offensiveFilterDropDown;
	}

	public void setOffensiveFilterDropDown(JComboBox offensiveFilterDropDown) {
		this.offensiveFilterDropDown = offensiveFilterDropDown;
	}

	public JComboBox getEasyPasswdFilterDropDown() {
		return easyPasswdFilterDropDown;
	}

	public void setEasyPasswdFilterDropDown(JComboBox easyPasswdFilterDropDown) {
		this.easyPasswdFilterDropDown = easyPasswdFilterDropDown;
	}

	public JComboBox getSaltingFilterDropDown() {
		return saltingFilterDropDown;
	}

	public void setSaltingFilterDropDown(JComboBox saltingFilterDropDown) {
		this.saltingFilterDropDown = saltingFilterDropDown;
	}

	public JLabel getOutputLabel() {
		return outputLabel;
	}

	public void setOutputLabel(JLabel outputLabel) {
		this.outputLabel = outputLabel;
	}

}
