/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import iwishVIEW.loginBase;
import java.io.DataInputStream;
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
    //private JSONObject data;
    String datarecived;
    
    private ClientController(){
    
        connect();
        streams();
        new Thread(){
            public void run(){
                while(true){
                    try {
                        String msg = dis.readLine();
                        //System.out.println(msg);
                        JSONObject confirm = null;
                        confirm = new JSONObject(msg);
                        //data = null;
                        switch(confirm.getString("KEY")){
                            case "LOGIN":
                                if(confirm.getString("CONFIRM").equals("TRUE")){
                                loginResponseFlag = true ;
                                blockingFlag = false;
                                }
                                break;
                            case "INTIALBALANCE":
                                datarecived= confirm.getString("BALANCE");
                                System.out.println(datarecived);
                                blockingFlag = false;
                            break; 
                            case "RECHARGE":
                                datarecived= confirm.getString("NEWBALANCE");
                                System.out.println(datarecived);
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
            System.out.println("Connecting...");
        }
        blockingFlag=true;
        return loginResponseFlag;
    }
    
    public void  sendRegister(JSONObject json){
    ps.println(json.toString());
        System.out.println("Connecting...");
    }
    
     public void sendWishlistItem(JSONObject json){
    ps.println(json.toString());
    
    }
    
    public String sendBalancerequest(JSONObject json){
        ps.println(json.toString());
        while(blockingFlag){
            System.out.println("waitting balance...");
        }
        System.out.println("rrrr"+datarecived); 
        blockingFlag=true;
        return datarecived;
    } 
    
    public String sendrecharge(JSONObject json){
        ps.println(json.toString());
        while(blockingFlag){
            System.out.println("waitting charge...");
        }
        System.out.println("recivied charge"+datarecived); 
        // blockingFlag=true;
        return datarecived;
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
            


