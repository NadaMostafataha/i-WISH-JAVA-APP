/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import iwishVIEW.RegisterBase;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.json.JSONObject;

/**
 *
 * @author ahmed
 */
public class RegController {
    
    RegisterBase regRoot;
    ClientController clientCtlr = ClientController.getInstance();
    Stage stage;
   
    public RegController(Stage stage){
      
             this.stage = stage;
            regRoot = new RegisterBase(this);
            Scene scene = new Scene(regRoot);
            stage.setScene(scene);
            Platform.setImplicitExit(true);
            stage.show();
            
            register();
    
    }
    
    public void register(){
    
        Button regRegister = regRoot.getBtnRegister();
        TextField regUsername = regRoot.getTxtUsername();
        TextField regPassword = regRoot.getTxtPassword();
        TextField regEmail = regRoot.getTxtEmail();
        
        regRegister.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
              
               JSONObject message = new JSONObject(); 
               JSONObject user = new JSONObject();
               message.put("KEY","REG");
               user.put("USERNAME",regUsername.getText());
               user.put("PASSWORD",regPassword.getText());
               user.put("EMAIL",regEmail.getText());
               message.put("USER",user.toString());
               clientCtlr.sendRegister(message);
               LoginController client = new LoginController(stage);
                       
                     
            }
        });
        
    
    
    }    
}
