/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//\\\\\mmm
package CONTROLLER;

import iwishVIEW.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class LoginController{
    
    Stage stage;
    loginBase root;
    RegisterBase regRoot;
    LoginController clt;
    ClientController clientCtlr = ClientController.getInstance();
    String username;
    
    public LoginController (Stage stage){

        this.stage = stage;
    //creating the view
        root = new loginBase(this);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        Platform.setImplicitExit(true);
        stage.show();
        
        login();
        
     
    }
    public void login (){
        
        Button btnLogin = root.getBtnLogIn();
        Button btnSignup = root.getBtnSignUp();
        TextField txtUsername = root.getTextUsername();
        TextField txtPassword = root.getTextPassword();
        
        btnLogin.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               JSONObject message = new JSONObject(); 
               JSONObject user = new JSONObject();
               message.put("KEY","LOGIN");
               user.put("USERNAME",txtUsername.getText());
               user.put("PASSWORD",txtPassword.getText());
               message.put("USER",user);
               boolean confirmation = clientCtlr.sendLogin(message);
               
               if(confirmation){
                         username= txtUsername.getText(); 
                      HomeController homectlr = new HomeController(stage,username);
                   
                      
               }
               
               }
                   
                    
            
        });
        btnSignup.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            
                RegController regctlr = new RegController(stage);
            
            }
        });
        

}
    

}

