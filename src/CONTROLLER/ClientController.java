/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import iwishVIEW.loginBase;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONObject;

/**
 *
 * @author ahmed
 */
public class ClientController  {
    
    private static ClientController client;
    
     Socket s;
     DataInputStream dis;
     PrintStream ps ;
    private boolean loginResponseFlag ;
    private boolean blockingFlag = true;
    
    private ClientController(){
    
        connect();
        streams();
        new Thread(){
            public void run(){
                while(true){
                    try {
                        String msg = dis.readLine();
                        JSONObject confirm = new JSONObject(msg);
                        
                        switch(confirm.getString("KEY")){
                            case "LOGIN":
                                loginResponseFlag = Boolean.parseBoolean(confirm.getString("CONFIRM")); // recieved confirmation from server
                                blockingFlag = false;
                                break;
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }.start();
    }
    
    public static ClientController getInstance(){
    
        if (client == null)
            client = new ClientController();
        
        return client;
    
    }
            
    public boolean sendLogin(JSONObject json){
        ps.println(json.toString());
        while(blockingFlag){
            
        }
        return loginResponseFlag;
    }
    
    public void  sendRegister(JSONObject json){
    ps.println(json.toString());
        
    }
            
            
            
    private void connect(){ 
    try {
            s = new Socket("127.0.0.1",5005);
            
        } 
        catch(SocketException se){
            try {
                s.close();
          
            } catch (IOException ex) {
                Logger.getLogger(loginBase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch (IOException ex) {
            Logger.getLogger(loginBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
     private void streams(){
     
        try {
            dis = new DataInputStream(s.getInputStream());
            ps = new PrintStream(s.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     
     }
   
    
}     
            


