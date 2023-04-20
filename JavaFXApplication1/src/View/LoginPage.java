/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author 97059
 */
public class LoginPage extends Stage{
    private Scene loginPageScene;
    public LoginPage() throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginPage.fxml"));
        Parent root = loader.load();
        loginPageScene = new Scene(root);
        this.setScene(loginPageScene);
        this.setTitle("Login Page");
    }  
}
