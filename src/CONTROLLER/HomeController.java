/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import MODEL.Product;
import MODEL.User;
import com.google.gson.Gson;
import iwishVIEW.MainAppBase;
import iwishVIEW.RegisterBase;
import iwishVIEW.loginBase;
import java.util.ArrayList;
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
import org.json.JSONArray;
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
         LoadShopItems();
        RechargeCredit(strr);
        SelectWishlist(strr);
        SelectFriendList(strr);
        AddToWishlist(strr);
        RemoveFromWishlist(strr);
        SelectFriendWishList();
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
    
  public void AddToWishlist(String USER){
    
        Button addbtn = root.getGet_product_btn();
        Text nameproduct = root.getProduct_name();
        Text priceproduct = root.getProduct_price();
        
        addbtn.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
              
               JSONObject message = new JSONObject(); 
               JSONObject product = new JSONObject();
               message.put("KEY","INSERTWISH");
               message.put("USERNAME",USER);
               product.put("NAME",nameproduct.getText());
               product.put("PRICE",Double.parseDouble(priceproduct.getText()));
               message.put("PRODUCT",product.toString());
               clientCtlr.sendWishlistItem(message);
                addbtn.setText("Got");
                addbtn.setStyle("-fx-background-color: #E8E8E8; -fx-background-radius: 15; -fx-border-radius: 15; -fx-border-width: 2;");
                addbtn.setTextFill(javafx.scene.paint.Color.valueOf("#19223f"));
                SelectWishlist(USER);
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

  public void SelectWishlist(String owneruser){
      AnchorPane wishpanel=root.getwishpane();
      Button mywishlist=root.getBtn_wish_list();
      mywishlist.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               JSONObject message = new JSONObject(); 
               message.put("KEY","SELECTLIST");
               message.put("USERNAME",owneruser);
              JSONArray allArray=clientCtlr.updateWishList(message);
              ArrayList<Product> listofdata=new ArrayList<Product>();
              for(int i=0;i<allArray.length();i++){
              //listofdata.add(allArray.get(i));
               JSONObject arr =allArray.getJSONObject(i);
               Double price=arr.getDouble("PRICE");
               String product_name=arr.getString("NAME");
               //error//wishpanel.getChildren().add(root.setProductName2(product_name),root.setProductPrice2(Double.toString(price)));
               System.out.println(" "+price+""+product_name);
              }
              //System.out.println(" "+allArray);
              
               // wishpanal.
            }
        });
     
  }
  
  
  public void RemoveFromWishlist(String USER){
  AnchorPane wishpanal= root.getwishpane();
  Button remove= root.getBtn_remove1();
  Text productname= root.getText_Product_Name();
  Text productprice = root.getProduct_price();
  
  
   remove.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
             
               JSONObject message = new JSONObject(); 
               message.put("KEY","REMOVEWISH");
               message.put("PRODUCTNAME",productname.getText());
               message.put("USERNAME", USER);
               clientCtlr.sendWishlistItem(message);
               System.out.println("remove key check"+message);
               System.out.println("transfer to controller");
               wishpanal.getChildren().remove(productname);
               wishpanal.getChildren().remove(productprice);
               SelectWishlist(USER);
            }
        });
         
  
  }
  /*headers*/
  public void LoadShopItems(){

               JSONObject message = new JSONObject(); 
               message.put("KEY","shoplist");
              JSONArray allproduct=clientCtlr.updateshoplist(message);
              ArrayList<Product> listofdata=new ArrayList<Product>();
              for(int i=0;i<allproduct.length();i++){
               JSONObject arr =allproduct.getJSONObject(i);
               Double price=arr.getDouble("PRICE");
               String product_name=arr.getString("NAME");
               System.out.println("shop items"+price+""+product_name);
              }
              //System.out.println(" "+allArray);
            }
  
    public void SelectFriendList(String USER){
       AnchorPane friendspane=root.getAnchorPane_Friends();
      Button myfriendlist=root.getBtn_friends_list();
      myfriendlist.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               JSONObject message = new JSONObject(); 
               message.put("KEY","FRIENDSLIST");
               message.put("USERNAME",USER);
              JSONArray all=clientCtlr.friendList(message);
                      for(int i=0;i<all.length();i++){
                          JSONObject arry =all.getJSONObject(i);
                           String name=arry.getString("username");
                             System.out.println(""+name);
                             }
         
            }
        });
         
    }
     public void SelectFriendWishList(){
        AnchorPane friendwishlist=root.getFriends_wishlist_pane();
        Button friendwish=root.getBtn_view_friend_wishlist();
        Text friendname=root.getTxt_friends_username();
        String friendd=friendname.getText();
        friendwish.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
             friendwishlist.toFront(); 
              JSONObject message = new JSONObject(); 
               message.put("KEY","SELECTFRIENDWISHLIST");
               message.put("USERNAME",friendd);
               System.out.println("frieeeend"+friendd);
              JSONArray allArrayy=clientCtlr.WishList(message);
              for(int i=0;i<allArrayy.length();i++){
               JSONObject arr =allArrayy.getJSONObject(i);
               Double price=arr.getDouble("PRICE");
               String product_name=arr.getString("NAME");
               System.out.println(" "+price+""+product_name);
              }
             
        }
        });
         
    }

}

