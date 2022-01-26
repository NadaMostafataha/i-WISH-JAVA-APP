/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import MODEL.User;
import com.google.gson.Gson;
import iwishVIEW.MainAppBase;
import iwishVIEW.RegisterBase;
import iwishVIEW.loginBase;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.json.JSONObject;

/**
 *
 * @author ahmed
 */
public class HomeController {
    
    Stage stage;
    MainAppBase root;
    ClientController clientCtlr = ClientController.getInstance();
    String usernow;
    
    public HomeController (Stage stage,String username){
        usernow=username;
        this.stage = stage;
        root = new MainAppBase(this);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        Platform.setImplicitExit(true);
        stage.show();
        home(usernow);
   
        
        
     
    }
    
    public void home(String strr){
        root.setUSERNAME(strr);
        IntialBalance(strr);
        //ListItem();
        RechargeCredit(strr);
    
    }
  
   public void IntialBalance(String strrr){
       JSONObject message = new JSONObject(); 
        message.put("KEY","INTIALBALANCE");
        message.put("USERNAME",strrr);
        String intbalance = clientCtlr.sendBalancerequest(message);
         System.out.println(intbalance+"initbalance");
        root.setbalanceText(intbalance);
        root.setwalletbalance(intbalance);
        System.out.println(intbalance+"initbalance");
   } 
    
  public void ListItem(){
    
        Button addbtn = root.getGet_product_btn();
        ImageView imgproduct = root.getProduct_img();
        Text nameproduct = root.getProduct_name();
        Text priceproduct = root.getProduct_price();
        Text username = root.getText_UserName();
        
        addbtn.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
              
               JSONObject message = new JSONObject(); 
               JSONObject product = new JSONObject();
               message.put("KEY","INSERTWISH");
               product.put("IMAGE",imgproduct.getImage());
               product.put("NAME",nameproduct.getText());
               product.put("PRICE",Double.parseDouble(priceproduct.getText()));
               message.put("PRODUCT",product.toString());
               clientCtlr.sendWishlistItem(message);
                addbtn.setText("Got");
                addbtn.setStyle("-fx-background-color: #E8E8E8; -fx-background-radius: 15; -fx-border-radius: 15; -fx-border-width: 2;");
                addbtn.setTextFill(javafx.scene.paint.Color.valueOf("#19223f"));
            }
        });
        
    
   
    }   
  public void RechargeCredit(String strr2){
    Button rechargebtn = root.getBtn_charge();
    TextField rechargeamount = root.getTxt_rechage(); 
    TextField creditno = root.getTxt_creditno();
    
    rechargebtn.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
       
        @Override
        public void handle(ActionEvent event) {
             System.out.println("in action recharge");
           JSONObject message = new JSONObject(); 
           message.put("KEY","RECHARGE");
           message.put("USERNAME",strr2);
           message.put("AMOUNT", rechargeamount.getText());
           rechargeamount.clear();
           creditno.clear();
           String afterbalance = clientCtlr.sendrecharge(message);
           System.out.println("arivved ui"+afterbalance);
            root.setwalletbalance(afterbalance);
            root.setbalanceText(afterbalance);
            rechargebtn.setText("Charged");
            rechargebtn.setStyle("-fx-background-color: #E8E8E8; -fx-background-radius: 15; -fx-border-radius: 15; -fx-border-width: 2;");
            rechargebtn.setTextFill(javafx.scene.paint.Color.valueOf("#19223f"));
        }
    });
  }
  public void RemoveWishlist(String owneruser){
  AnchorPane wishpanal= root.getwishpane();
  Button remove= root.getBtn_remove();
  Text productname= root.getText_Product_Name();
  Text productprice = root.getProduct_price();
  
  
   remove.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
              
               JSONObject message = new JSONObject(); 
               JSONObject product = new JSONObject();
               message.put("KEY","REMOVEWISH");
               product.put("NAME",productname.getText());
               message.put("PRODUCT",product.toString());
               clientCtlr.sendWishlistItem(message);
               // wishpanal.
            }
        });
        
    
   
  
  
  }  
}
