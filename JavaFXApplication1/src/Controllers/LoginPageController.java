/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.ApplicationUser;
import View.ViewManager;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author 97059
 */
public class LoginPageController implements Initializable {


    @FXML
    private TextField usernameFieldId;
    @FXML
    private PasswordField passwordFieldId;
    @FXML
    private Label wrongLogin;
    @FXML
    private Button loginBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void handleLoginBtn(ActionEvent event) throws IOException {
        ApplicationUser admin = new ApplicationUser();
        admin.setUserName("admin");
        admin.setPassword("admin");
        if (usernameFieldId.getText().equals(admin.getUserName()) && passwordFieldId.getText().equals(admin.getPassword())) {
            ViewManager.closeLoginPage();
            ViewManager.openSystemPage();
        } else if (usernameFieldId.getText().isEmpty() && passwordFieldId.getText().isEmpty()) {
            wrongLogin.setText("please Enter your data");
        } else {
            wrongLogin.setText(" error in username or password!!");
        }
    }

}
