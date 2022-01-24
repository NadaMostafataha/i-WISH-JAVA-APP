/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iwishVIEW;

import iwishVIEW.MainAppBase;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import org.json.JSONObject;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class MainAppController implements Initializable {

   
    @FXML
    private AnchorPane anchor_pane_left_panel;
    @FXML
    private ImageView logo_shop;
    @FXML
    private ImageView logo_wish_list;
    @FXML
    private ImageView logo_friends;
    @FXML
    private ImageView logo_logout;
    @FXML
    private ImageView logo_recharge;
    @FXML
    private Text text_notification;
    @FXML
    private Button btn_shop;
    @FXML
    private Button btn_wish_list;
    @FXML
    private Button btn_friends_list;
    @FXML
    private Button btn_logout;
    @FXML
    private Button btn_recharge;
    @FXML
    private Text text_UserName;
    @FXML
    private ImageView userProfile;
    @FXML
    private AnchorPane AnchorPane_shop;
    @FXML
    private TextField Txt_Feild_Search;
    @FXML
    private Button btn_search;
    @FXML
    private GridPane shop_grid_pane;
    @FXML
    private ImageView product_img;
    @FXML
    private Text product_name;
    @FXML
    private Text product_price;
    @FXML
    private Button get_product_btn;
    @FXML
    private AnchorPane notification_pane;
    @FXML
    private GridPane friends_grid_pane1;
    @FXML
    private Text txt_friends_username1;
    @FXML
    private Button btn_cancel;
    @FXML
    private Button btn_accept_request;
    @FXML
    private AnchorPane AnchorPane_WishList;
    @FXML
    private GridPane wish_list_grid_pane;
    @FXML
    private ImageView image_view;
    @FXML
    private Text Text_Product_Name;
    @FXML
    private Text text_price;
    @FXML
    private Button btn_remove;
    @FXML
    private AnchorPane friends_search_pane;
    @FXML
    private GridPane friends_grid_pane11;
    @FXML
    private Text txt_friends_username11;
    @FXML
    private Button btn_add_friend;
    @FXML
    private AnchorPane AnchorPane_Friends;
    @FXML
    private GridPane friends_grid_pane;
    @FXML
    private Text txt_friends_username;
    @FXML
    private Button btn_view_wishlist;
    @FXML
    private Button btn_view_wishlist1;
    @FXML
    private AnchorPane AnchorPane_Recharge;
    @FXML
    private Label lbl_wallet;
    @FXML
    private TextField txt_creditno;
    @FXML
    private Text lbl_balance;
    @FXML
    private Text txt_balance;
    @FXML
    private TextField txt_rechage;
    @FXML
    private Text txt_notfication;
     MainAppBase MainRoot;


    /**
     * Initializes the controller class.
     */
     @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btn_shop)
            AnchorPane_shop.toFront();
        else if (event.getSource() == btn_wish_list)
            AnchorPane_WishList.toFront();
         else if (event.getSource() == btn_friends_list)
            AnchorPane_Friends.toFront();
         else if (event.getSource() == btn_recharge)
            AnchorPane_Recharge.toFront();
       
        
    }
      
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
