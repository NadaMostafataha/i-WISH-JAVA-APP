/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import iwishVIEW.MainAppBase;
import iwishVIEW.RegisterBase;
import iwishVIEW.loginBase;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author ahmed
 */
public class HomeController {
    
    Stage stage;
    MainAppBase root;
    ClientController clientCtlr = ClientController.getInstance();
    
    
    public HomeController (Stage stage){

        this.stage = stage;
        root = new MainAppBase(this);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        Platform.setImplicitExit(true);
        stage.show();
        
        home();
        
        
        
     
    }
    
    public void home(){
    
    
    
    
    }
    
    
    
}
