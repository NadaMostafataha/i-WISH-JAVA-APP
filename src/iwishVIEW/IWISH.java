/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iwishVIEW;
//new project
import CONTROLLER.Client;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author dell
 */
public class IWISH extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        Client client = new Client(stage);
        
    }
}
