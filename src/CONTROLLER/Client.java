/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//\\\\\mmm
package CONTROLLER;

import iwishVIEW.*;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author ahmed
 */
public class Client {
    
    RegisterBase root;
    Socket s ;
    //DataInputStream dis;
    PrintStream ps ;
    public Client (Stage stage){
    // connecting to server
    try {
            s = new Socket("127.0.0.1",5005);
            //dis = new DataInputStream(s.getInputStream());
            ps = new PrintStream(s.getOutputStream());
        } 
        catch(SocketException se){
            try {
                s.close();
                //dis.close();
            } catch (IOException ex) {
                Logger.getLogger(RegisterBase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch (IOException ex) {
            Logger.getLogger(RegisterBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    //creating the view
        root = new RegisterBase(this);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        Platform.setImplicitExit(true);
        stage.show();
            
    }
    public void init() {
        
        Button btnRegister = root.getBtnRegister();
        TextField txtUsername = root.getTxtUsername();
        TextField txtPassword = root.getTxtUsername();
        TextField txtEmail = root.getTxtUsername();
        btnRegister.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               
                    ps.println("reg");
                    ps.println(txtUsername.getText());
                    txtUsername.clear();
                    ps.println(txtPassword.getText());
                    txtPassword.clear();
                     ps.println(txtEmail.getText());
                    txtEmail.clear();
                    
                
            }
        });
        

}
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(IWISH.class,args); 
    }
    
}

