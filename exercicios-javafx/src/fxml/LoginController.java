package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
	
	@FXML
	private TextField emailField;
	@FXML
	private PasswordField passwdField;

	public void login() {
		boolean validEmail = emailField.getText().equals("aluno@java.com.br");
		boolean validPassword = passwdField.getText().equals("123456");
		
		if ( validEmail && validPassword ) {
			Notifications.create()
				.position(Pos.TOP_CENTER)
				.title("Login FXML")
				.text("Login efetuado com sucesso")
				.showInformation();
		} else {
			Notifications.create()
				.position(Pos.TOP_CENTER)
				.title("Login FXML")
				.text("Usuário e/ou senha invalidos.")
				.showError();
		}
		
//		System.out.println(emailField.getText());
//		System.out.println(passwdField.getText());
	}
}
