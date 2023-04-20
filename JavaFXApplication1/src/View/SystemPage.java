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
public class SystemPage extends Stage {

    private Scene systemPageScene;

    public SystemPage() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SystemPage.fxml"));
        Parent root = loader.load();
        systemPageScene = new Scene(root);
        this.setScene(systemPageScene);
        this.setTitle("System Page");
    }

}
