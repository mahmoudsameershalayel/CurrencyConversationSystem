/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import View.ViewManager;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author 97059
 */
public class SystemPageController implements Initializable {

    @FXML
    private Button logoutBtn;
    @FXML
    private TextField nisField;
    @FXML
    private TextField usdField;
    @FXML
    private Button convertBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void handleLogout(ActionEvent event) throws IOException {
        ViewManager.closeSystemPage();
        ViewManager.openLoginPage();
    }

    @FXML
    private void handleConvert(ActionEvent event) {
        String usdTxt = usdField.getText();
        String nisTxt = nisField.getText();
        if (usdTxt.isEmpty()) {
            double nisValue = Double.parseDouble(nisTxt);
            double result = nisValue * 0.27;
            usdField.setText(Double.toString(result));
        } else {
            double usdValue = Double.parseDouble(usdTxt);
            double result = usdValue * 3.65;
            nisField.setText(Double.toString(result));
        }
    }

}
