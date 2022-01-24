package iwishVIEW;

import CONTROLLER.HomeController;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class MainAppBase extends AnchorPane {

    protected final AnchorPane anchor_pane_left_panel;
    protected final DropShadow dropShadow;
    protected final AnchorPane anchorPane;
    protected final ImageView logo_shop;
    protected final ImageView logo_wish_list;
    protected final ImageView logo_friends;
    protected final ImageView logo_logout;
    protected final ImageView logo_recharge;
    protected final AnchorPane anchorPane0;
    protected final StackPane stackPane;
    protected final Button button;
    protected final ImageView imageView;
    protected final Text text_notification;
    protected final DropShadow dropShadow0;
    protected final Button btn_shop;
    protected final Button btn_wish_list;
    protected final Button btn_friends_list;
    protected final Button btn_logout;
    protected final Button btn_recharge;
    protected final Text text_UserName;
    protected final ImageView userProfile;
    protected final Text text;
    protected final AnchorPane AnchorPane_shop;
    protected final TextField Txt_Feild_Search;
    protected final Button btn_search;
    protected final GridPane shop_grid_pane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final RowConstraints rowConstraints;
    protected final AnchorPane anchorPane1;
    protected final ImageView product_img;
    protected final AnchorPane anchorPane2;
    protected final DropShadow dropShadow1;
    protected final Text product_name;
    protected final Text product_price;
    protected final Button get_product_btn;
    protected final AnchorPane notification_pane;
    protected final GridPane friends_grid_pane1;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints0;
    protected final AnchorPane anchorPane3;
    protected final ImageView imageView0;
    protected final Text txt_friends_username1;
    protected final Button btn_cancel;
    protected final DropShadow dropShadow2;
    protected final Button btn_accept_request;
    protected final DropShadow dropShadow3;
    protected final AnchorPane AnchorPane_WishList;
    protected final GridPane wish_list_grid_pane;
    protected final ColumnConstraints columnConstraints2;
    protected final RowConstraints rowConstraints1;
    protected final AnchorPane anchorPane4;
    protected final ImageView image_view;
    protected final Text Text_Product_Name;
    protected final Text text_price;
    protected final Button btn_remove;
    protected final DropShadow dropShadow4;
    protected final AnchorPane friends_search_pane;
    protected final GridPane friends_grid_pane11;
    protected final ColumnConstraints columnConstraints3;
    protected final RowConstraints rowConstraints2;
    protected final AnchorPane anchorPane5;
    protected final ImageView imageView1;
    protected final Text txt_friends_username11;
    protected final Button btn_add_friend;
    protected final DropShadow dropShadow5;
    protected final AnchorPane AnchorPane_Friends;
    protected final GridPane friends_grid_pane;
    protected final ColumnConstraints columnConstraints4;
    protected final RowConstraints rowConstraints3;
    protected final AnchorPane anchorPane6;
    protected final ImageView imageView2;
    protected final Text txt_friends_username;
    protected final Button btn_view_wishlist;
    protected final DropShadow dropShadow6;
    protected final Button btn_view_wishlist1;
    protected final DropShadow dropShadow7;
    protected final AnchorPane AnchorPane_Recharge;
    protected final Label lbl_wallet;
    protected final DropShadow dropShadow8;
    protected final TextField txt_creditno;
    protected final AnchorPane anchorPane7;
    protected final DropShadow dropShadow9;
    protected final Text lbl_balance;
    protected final Text txt_balance;
    protected final Button btn_recharge0;
    protected final DropShadow dropShadow10;
    protected final TextField txt_rechage;
    protected final AnchorPane anchorPane8;
    protected final FlowPane flowPane;
    protected final DropShadow dropShadow11;
    protected final Text txt_notfication;
    private HomeController ctlr;
    
    

    public MainAppBase(HomeController ctlr) {
        
        this.ctlr=ctlr;
        anchor_pane_left_panel = new AnchorPane();
        dropShadow = new DropShadow();
        anchorPane = new AnchorPane();
        logo_shop = new ImageView();
        logo_wish_list = new ImageView();
        logo_friends = new ImageView();
        logo_logout = new ImageView();
        logo_recharge = new ImageView();
        anchorPane0 = new AnchorPane();
        stackPane = new StackPane();
        button = new Button();
        imageView = new ImageView();
        text_notification = new Text();
        dropShadow0 = new DropShadow();
        btn_shop = new Button();
        btn_wish_list = new Button();
        btn_friends_list = new Button();
        btn_logout = new Button();
        btn_recharge = new Button();
        text_UserName = new Text();
        userProfile = new ImageView();
        text = new Text();
        AnchorPane_shop = new AnchorPane();
        Txt_Feild_Search = new TextField();
        btn_search = new Button();
        shop_grid_pane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        anchorPane1 = new AnchorPane();
        product_img = new ImageView();
        anchorPane2 = new AnchorPane();
        dropShadow1 = new DropShadow();
        product_name = new Text();
        product_price = new Text();
        get_product_btn = new Button();
        notification_pane = new AnchorPane();
        friends_grid_pane1 = new GridPane();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints0 = new RowConstraints();
        anchorPane3 = new AnchorPane();
        imageView0 = new ImageView();
        txt_friends_username1 = new Text();
        btn_cancel = new Button();
        dropShadow2 = new DropShadow();
        btn_accept_request = new Button();
        dropShadow3 = new DropShadow();
        AnchorPane_WishList = new AnchorPane();
        wish_list_grid_pane = new GridPane();
        columnConstraints2 = new ColumnConstraints();
        rowConstraints1 = new RowConstraints();
        anchorPane4 = new AnchorPane();
        image_view = new ImageView();
        Text_Product_Name = new Text();
        text_price = new Text();
        btn_remove = new Button();
        dropShadow4 = new DropShadow();
        friends_search_pane = new AnchorPane();
        friends_grid_pane11 = new GridPane();
        columnConstraints3 = new ColumnConstraints();
        rowConstraints2 = new RowConstraints();
        anchorPane5 = new AnchorPane();
        imageView1 = new ImageView();
        txt_friends_username11 = new Text();
        btn_add_friend = new Button();
        dropShadow5 = new DropShadow();
        AnchorPane_Friends = new AnchorPane();
        friends_grid_pane = new GridPane();
        columnConstraints4 = new ColumnConstraints();
        rowConstraints3 = new RowConstraints();
        anchorPane6 = new AnchorPane();
        imageView2 = new ImageView();
        txt_friends_username = new Text();
        btn_view_wishlist = new Button();
        dropShadow6 = new DropShadow();
        btn_view_wishlist1 = new Button();
        dropShadow7 = new DropShadow();
        AnchorPane_Recharge = new AnchorPane();
        lbl_wallet = new Label();
        dropShadow8 = new DropShadow();
        txt_creditno = new TextField();
        anchorPane7 = new AnchorPane();
        dropShadow9 = new DropShadow();
        lbl_balance = new Text();
        txt_balance = new Text();
        btn_recharge0 = new Button();
        dropShadow10 = new DropShadow();
        txt_rechage = new TextField();
        anchorPane8 = new AnchorPane();
        flowPane = new FlowPane();
        dropShadow11 = new DropShadow();
        txt_notfication = new Text();

        setId("AnchorPane");
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        AnchorPane.setBottomAnchor(anchor_pane_left_panel, 0.0);
        AnchorPane.setLeftAnchor(anchor_pane_left_panel, 0.0);
        AnchorPane.setTopAnchor(anchor_pane_left_panel, 0.0);
        anchor_pane_left_panel.setPrefHeight(400.0);
        anchor_pane_left_panel.setPrefWidth(166.0);
        anchor_pane_left_panel.setStyle("-fx-background-color: #19223F;");

        anchor_pane_left_panel.setEffect(dropShadow);

        AnchorPane.setBottomAnchor(anchorPane, 0.0);
        AnchorPane.setLeftAnchor(anchorPane, 0.0);
        AnchorPane.setTopAnchor(anchorPane, 0.0);
        anchorPane.setPrefHeight(400.0);
        anchorPane.setPrefWidth(44.0);
        anchorPane.setStyle("-fx-background-color: #19223F;");

        AnchorPane.setLeftAnchor(logo_shop, 9.0);
        logo_shop.setFitHeight(28.0);
        logo_shop.setFitWidth(28.0);
        logo_shop.setLayoutX(9.0);
        logo_shop.setLayoutY(160.0);
        logo_shop.setPickOnBounds(true);
        logo_shop.setPreserveRatio(true);
        logo_shop.setStyle("-fx-blend-mode: #ffffff;");
        logo_shop.setImage(new Image(getClass().getResource("images/shop.png").toExternalForm()));

        logo_wish_list.setFitHeight(21.0);
        logo_wish_list.setFitWidth(28.0);
        logo_wish_list.setLayoutX(13.0);
        logo_wish_list.setLayoutY(206.0);
        logo_wish_list.setPickOnBounds(true);
        logo_wish_list.setPreserveRatio(true);
        logo_wish_list.setStyle("-fx-blend-mode: #ffffff;");
        logo_wish_list.setImage(new Image(getClass().getResource("images/wishlist.png").toExternalForm()));

        logo_friends.setFitHeight(21.0);
        logo_friends.setFitWidth(28.0);
        logo_friends.setLayoutX(13.0);
        logo_friends.setLayoutY(256.0);
        logo_friends.setPickOnBounds(true);
        logo_friends.setPreserveRatio(true);
        logo_friends.setStyle("-fx-blend-mode: #ffffff;");
        logo_friends.setImage(new Image(getClass().getResource("images/freind.png").toExternalForm()));

        logo_logout.setFitHeight(28.0);
        logo_logout.setFitWidth(21.0);
        logo_logout.setLayoutX(12.0);
        logo_logout.setLayoutY(359.0);
        logo_logout.setNodeOrientation(javafx.geometry.NodeOrientation.RIGHT_TO_LEFT);
        logo_logout.setPickOnBounds(true);
        logo_logout.setPreserveRatio(true);
        logo_logout.setStyle("-fx-blend-mode: #ffffff;");
        logo_logout.setImage(new Image(getClass().getResource("images/logout.png").toExternalForm()));

        logo_recharge.setFitHeight(21.0);
        logo_recharge.setFitWidth(28.0);
        logo_recharge.setLayoutX(12.0);
        logo_recharge.setLayoutY(297.0);
        logo_recharge.setPickOnBounds(true);
        logo_recharge.setPreserveRatio(true);
        logo_recharge.setStyle("-fx-blend-mode: #ffffff;");
        logo_recharge.setImage(new Image(getClass().getResource("images/credit.png").toExternalForm()));

        anchorPane0.setLayoutX(8.0);
        anchorPane0.setLayoutY(24.0);
        anchorPane0.setPrefHeight(38.0);
        anchorPane0.setPrefWidth(33.0);

        stackPane.setPrefHeight(33.0);
        stackPane.setPrefWidth(34.0);

        button.setMnemonicParsing(false);
        button.setStyle("-fx-background-color: #19223F;");

        imageView.setFitHeight(28.0);
        imageView.setFitWidth(21.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("images/bell.png").toExternalForm()));

        text_notification.setFill(javafx.scene.paint.Color.RED);
        text_notification.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text_notification.setStrokeWidth(0.0);
        text_notification.setText("1");
        text_notification.setWrappingWidth(6.90234375);
        text_notification.setFont(new Font("System Bold", 12.0));

        anchorPane.setEffect(dropShadow0);

        btn_shop.setLayoutX(53.0);
        btn_shop.setLayoutY(151.0);
        btn_shop.setMnemonicParsing(false);
        btn_shop.setOnAction(this::handleButtonAction);
        btn_shop.setPrefHeight(33.0);
        btn_shop.setPrefWidth(124.0);
        btn_shop.setStyle("-fx-background-color: #19223F;");
        btn_shop.setText("Shop  Here!");
        btn_shop.setTextFill(javafx.scene.paint.Color.WHITE);
        btn_shop.setFont(new Font("Lato-Light", 14.0));

        btn_wish_list.setLayoutX(53.0);
        btn_wish_list.setLayoutY(198.0);
        btn_wish_list.setMnemonicParsing(false);
        btn_wish_list.setOnAction(this::handleButtonAction);
        btn_wish_list.setPrefHeight(33.0);
        btn_wish_list.setPrefWidth(124.0);
        btn_wish_list.setStyle("-fx-background-color: #19223F;");
        btn_wish_list.setText("My Wish List");
        btn_wish_list.setTextFill(javafx.scene.paint.Color.WHITE);
        btn_wish_list.setFont(new Font("Lato-Light", 14.0));

        btn_friends_list.setLayoutX(53.0);
        btn_friends_list.setLayoutY(247.0);
        btn_friends_list.setMnemonicParsing(false);
        btn_friends_list.setOnAction(this::handleButtonAction);
        btn_friends_list.setPrefHeight(33.0);
        btn_friends_list.setPrefWidth(124.0);
        btn_friends_list.setStyle("-fx-background-color: #19223F;");
        btn_friends_list.setText("My Friend's List");
        btn_friends_list.setTextFill(javafx.scene.paint.Color.WHITE);
        btn_friends_list.setFont(new Font("Lato-Light", 14.0));

        btn_logout.setLayoutX(54.0);
        btn_logout.setLayoutY(353.0);
        btn_logout.setMnemonicParsing(false);
        btn_logout.setOnAction(this::handleButtonAction);
        btn_logout.setPrefHeight(33.0);
        btn_logout.setPrefWidth(109.0);
        btn_logout.setStyle("-fx-background-color: #19223F;");
        btn_logout.setText("Logout ");
        btn_logout.setTextFill(javafx.scene.paint.Color.WHITE);
        btn_logout.setFont(new Font("Lato-Light", 14.0));

        btn_recharge.setLayoutX(51.0);
        btn_recharge.setLayoutY(294.0);
        btn_recharge.setMnemonicParsing(false);
        btn_recharge.setOnAction(this::handleButtonAction);
        btn_recharge.setPrefHeight(33.0);
        btn_recharge.setPrefWidth(116.0);
        btn_recharge.setStyle("-fx-background-color: #19223F;");
        btn_recharge.setText("Recharge");
        btn_recharge.setTextFill(javafx.scene.paint.Color.WHITE);
        btn_recharge.setFont(new Font("Lato-Light", 14.0));

        text_UserName.setFill(javafx.scene.paint.Color.WHITE);
        text_UserName.setLayoutX(66.0);
        text_UserName.setLayoutY(98.0);
        text_UserName.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text_UserName.setStrokeWidth(0.0);
        text_UserName.setText("Raneem Wael");
        text_UserName.setWrappingWidth(97.763671875);
        text_UserName.setFont(new Font("System Bold", 14.0));

        userProfile.setFitHeight(62.0);
        userProfile.setFitWidth(66.0);
        userProfile.setLayoutX(82.0);
        userProfile.setLayoutY(14.0);
        userProfile.setPickOnBounds(true);
        userProfile.setPreserveRatio(true);
        userProfile.setImage(new Image(getClass().getResource("images/user.png").toExternalForm()));

        text.setFill(javafx.scene.paint.Color.WHITE);
        text.setLayoutX(91.0);
        text.setLayoutY(117.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("   55$");
        text.setWrappingWidth(44.00000578165054);
        text.setFont(new Font("Lato Regular", 16.0));

        AnchorPane.setBottomAnchor(AnchorPane_shop, 0.0);
        AnchorPane.setRightAnchor(AnchorPane_shop, -7.0);
        AnchorPane.setTopAnchor(AnchorPane_shop, 0.0);
        AnchorPane_shop.setPrefHeight(410.0);
        AnchorPane_shop.setPrefWidth(465.0);
        AnchorPane_shop.setStyle("-fx-background-color: white;");

        Txt_Feild_Search.setLayoutX(14.0);
        Txt_Feild_Search.setLayoutY(14.0);
        Txt_Feild_Search.setPrefHeight(25.0);
        Txt_Feild_Search.setPrefWidth(318.0);
        Txt_Feild_Search.setPromptText("Search Friends");
        Txt_Feild_Search.setStyle("-fx-background-radius: 10;");

        btn_search.setLayoutX(342.0);
        btn_search.setLayoutY(11.0);
        btn_search.setMnemonicParsing(false);
        btn_search.setPrefHeight(31.0);
        btn_search.setPrefWidth(73.0);
        btn_search.setStyle("-fx-background-color: #19223F; -fx-background-radius: 15 15 15 15;");
        btn_search.setText("Search");
        btn_search.setTextFill(javafx.scene.paint.Color.valueOf("#ebebeb"));

        shop_grid_pane.setLayoutX(34.0);
        shop_grid_pane.setLayoutY(88.0);
        shop_grid_pane.setPrefHeight(202.0);
        shop_grid_pane.setPrefWidth(368.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        anchorPane1.setPrefHeight(208.0);
        anchorPane1.setPrefWidth(185.0);

        product_img.setFitHeight(126.0);
        product_img.setFitWidth(185.0);
        product_img.setLayoutX(29.0);
        product_img.setLayoutY(14.0);
        product_img.setPreserveRatio(true);
        product_img.setImage(new Image(getClass().getResource("images/R.jpg").toExternalForm()));

        anchorPane2.setLayoutX(7.0);
        anchorPane2.setLayoutY(137.0);
        anchorPane2.setPrefHeight(54.0);
        anchorPane2.setPrefWidth(167.0);
        anchorPane2.setStyle("-fx-background-radius: 20 20 20 20; -fx-border-radius: 20 20 20 20; -fx-background-color: #F5F5F5;");

        dropShadow1.setHeight(6.0);
        dropShadow1.setRadius(3.9825);
        dropShadow1.setWidth(11.93);
        anchorPane2.setEffect(dropShadow1);

        product_name.setFill(javafx.scene.paint.Color.valueOf("#19223f"));
        product_name.setLayoutX(14.0);
        product_name.setLayoutY(18.0);
        product_name.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        product_name.setStrokeWidth(0.0);
        product_name.setText("Product Name ");
        product_name.setWrappingWidth(159.232421875);
        product_name.setFont(new Font("Lato Bold", 12.0));

        product_price.setFill(javafx.scene.paint.Color.valueOf("#19223f"));
        product_price.setLayoutX(21.0);
        product_price.setLayoutY(33.0);
        product_price.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        product_price.setStrokeWidth(0.0);
        product_price.setText("price");

        get_product_btn.setLayoutX(98.0);
        get_product_btn.setLayoutY(16.0);
        get_product_btn.setMnemonicParsing(false);
        get_product_btn.setPrefHeight(25.0);
        get_product_btn.setPrefWidth(62.0);
        get_product_btn.setStyle("-fx-background-color: #19223F; -fx-background-radius: 15 15 15 15;");
        get_product_btn.setText("Get ");
        get_product_btn.setTextFill(javafx.scene.paint.Color.valueOf("#eeeeee"));
        get_product_btn.setFont(new Font(10.0));
        shop_grid_pane.setOpaqueInsets(new Insets(10.0));

        notification_pane.setLayoutX(177.0);
        notification_pane.setPrefHeight(410.0);
        notification_pane.setPrefWidth(459.0);
        notification_pane.setStyle("-fx-background-color: white;");

        friends_grid_pane1.setLayoutX(16.0);
        friends_grid_pane1.setLayoutY(40.0);
        friends_grid_pane1.setPrefHeight(91.0);
        friends_grid_pane1.setPrefWidth(390.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        anchorPane3.setPrefHeight(94.0);
        anchorPane3.setPrefWidth(390.0);
        anchorPane3.setStyle("-fx-background-color: #F5F5F5; -fx-background-radius: 15 15 15 15;");

        imageView0.setFitHeight(100.0);
        imageView0.setFitWidth(82.0);
        imageView0.setLayoutX(8.0);
        imageView0.setLayoutY(5.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("images/nerd.png").toExternalForm()));

        txt_friends_username1.setLayoutX(106.0);
        txt_friends_username1.setLayoutY(42.0);
        txt_friends_username1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        txt_friends_username1.setStrokeWidth(0.0);
        txt_friends_username1.setText("User Name ");
        txt_friends_username1.setWrappingWidth(73.00000643730164);
        txt_friends_username1.setFont(new Font("Lato Bold", 14.0));

        btn_cancel.setLayoutX(285.0);
        btn_cancel.setLayoutY(58.0);
        btn_cancel.setMnemonicParsing(false);
        btn_cancel.setPrefHeight(19.0);
        btn_cancel.setPrefWidth(91.0);
        btn_cancel.setStyle("-fx-background-color: #E8E8E8; -fx-background-radius: 15; -fx-border-radius: 15; -fx-border-width: 2;");
        btn_cancel.setText("Cancel");
        btn_cancel.setTextFill(javafx.scene.paint.Color.valueOf("#19223f"));

        dropShadow2.setHeight(6.17);
        dropShadow2.setRadius(2.585);
        dropShadow2.setWidth(6.17);
        btn_cancel.setEffect(dropShadow2);

        btn_accept_request.setLayoutX(285.0);
        btn_accept_request.setLayoutY(14.0);
        btn_accept_request.setMnemonicParsing(false);
        btn_accept_request.setPrefHeight(28.0);
        btn_accept_request.setPrefWidth(91.0);
        btn_accept_request.setStyle("-fx-background-color: #00D100; -fx-background-radius: 15; -fx-border-radius: 15; -fx-border-width: 2;");
        btn_accept_request.setText("Accept");
        btn_accept_request.setTextFill(javafx.scene.paint.Color.WHITE);

        dropShadow3.setHeight(6.17);
        dropShadow3.setRadius(2.585);
        dropShadow3.setWidth(6.17);
        btn_accept_request.setEffect(dropShadow3);

        AnchorPane.setBottomAnchor(AnchorPane_WishList, 0.0);
        AnchorPane.setRightAnchor(AnchorPane_WishList, -7.0);
        AnchorPane.setTopAnchor(AnchorPane_WishList, 0.0);
        AnchorPane_WishList.setPrefHeight(410.0);
        AnchorPane_WishList.setPrefWidth(465.0);
        AnchorPane_WishList.setStyle("-fx-background-color: white;");

        wish_list_grid_pane.setLayoutX(14.0);
        wish_list_grid_pane.setLayoutY(51.0);
        wish_list_grid_pane.setPrefHeight(126.0);
        wish_list_grid_pane.setPrefWidth(399.0);
        wish_list_grid_pane.setStyle("-fx-background-color: #F8F8F8; -fx-background-radius: 10;");

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(100.0);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        anchorPane4.setPrefHeight(126.0);
        anchorPane4.setPrefWidth(394.0);

        image_view.setFitHeight(100.0);
        image_view.setFitWidth(106.0);
        image_view.setLayoutX(14.0);
        image_view.setLayoutY(12.0);
        image_view.setPickOnBounds(true);
        image_view.setPreserveRatio(true);
        image_view.setImage(new Image(getClass().getResource("images/R.jpg").toExternalForm()));

        Text_Product_Name.setFill(javafx.scene.paint.Color.valueOf("#19223f"));
        Text_Product_Name.setLayoutX(129.0);
        Text_Product_Name.setLayoutY(40.0);
        Text_Product_Name.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        Text_Product_Name.setStrokeWidth(0.0);
        Text_Product_Name.setText("Product Name ");
        Text_Product_Name.setFont(new Font("Lato Bold", 16.0));

        text_price.setFill(javafx.scene.paint.Color.valueOf("#19223f"));
        text_price.setLayoutX(154.0);
        text_price.setLayoutY(79.0);
        text_price.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text_price.setStrokeWidth(0.0);
        text_price.setText("55$");
        text_price.setFont(new Font("Lato Bold Italic", 16.0));

        btn_remove.setLayoutX(277.0);
        btn_remove.setLayoutY(67.0);
        btn_remove.setMnemonicParsing(false);
        btn_remove.setPrefHeight(33.0);
        btn_remove.setPrefWidth(109.0);
        btn_remove.setStyle("-fx-background-color: #19223F; -fx-background-radius: 15; -fx-border-radius: 15; -fx-border-width: 2;");
        btn_remove.setText("Remove item");
        btn_remove.setTextFill(javafx.scene.paint.Color.WHITE);

        dropShadow4.setHeight(6.17);
        dropShadow4.setRadius(2.585);
        dropShadow4.setWidth(6.17);
        btn_remove.setEffect(dropShadow4);

        friends_search_pane.setLayoutX(180.0);
        friends_search_pane.setPrefHeight(410.0);
        friends_search_pane.setPrefWidth(459.0);
        friends_search_pane.setStyle("-fx-background-color: white;");

        friends_grid_pane11.setLayoutX(16.0);
        friends_grid_pane11.setLayoutY(40.0);
        friends_grid_pane11.setPrefHeight(91.0);
        friends_grid_pane11.setPrefWidth(390.0);

        columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints3.setMinWidth(10.0);
        columnConstraints3.setPrefWidth(100.0);

        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(30.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        anchorPane5.setPrefHeight(94.0);
        anchorPane5.setPrefWidth(390.0);
        anchorPane5.setStyle("-fx-background-color: #F5F5F5; -fx-background-radius: 15 15 15 15;");

        imageView1.setFitHeight(100.0);
        imageView1.setFitWidth(82.0);
        imageView1.setLayoutX(8.0);
        imageView1.setLayoutY(5.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("images/nerd.png").toExternalForm()));

        txt_friends_username11.setLayoutX(106.0);
        txt_friends_username11.setLayoutY(42.0);
        txt_friends_username11.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        txt_friends_username11.setStrokeWidth(0.0);
        txt_friends_username11.setText("User Name ");
        txt_friends_username11.setWrappingWidth(73.00000643730164);
        txt_friends_username11.setFont(new Font("Lato Bold", 14.0));

        btn_add_friend.setLayoutX(278.0);
        btn_add_friend.setLayoutY(32.0);
        btn_add_friend.setMnemonicParsing(false);
        btn_add_friend.setPrefHeight(31.0);
        btn_add_friend.setPrefWidth(98.0);
        btn_add_friend.setStyle("-fx-background-color: #19223F; -fx-background-radius: 15; -fx-border-radius: 15; -fx-border-width: 2;");
        btn_add_friend.setText("Add Friend");
        btn_add_friend.setTextFill(javafx.scene.paint.Color.WHITE);

        dropShadow5.setHeight(6.17);
        dropShadow5.setRadius(2.585);
        dropShadow5.setWidth(6.17);
        btn_add_friend.setEffect(dropShadow5);

        AnchorPane.setBottomAnchor(AnchorPane_Friends, -1.0);
        AnchorPane.setRightAnchor(AnchorPane_Friends, -10.0);
        AnchorPane.setTopAnchor(AnchorPane_Friends, 1.0);
        AnchorPane_Friends.setLayoutY(1.0);
        AnchorPane_Friends.setPrefHeight(410.0);
        AnchorPane_Friends.setPrefWidth(473.0);
        AnchorPane_Friends.setStyle("-fx-background-color: white;");

        friends_grid_pane.setLayoutX(14.0);
        friends_grid_pane.setLayoutY(44.0);
        friends_grid_pane.setPrefHeight(91.0);
        friends_grid_pane.setPrefWidth(390.0);

        columnConstraints4.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints4.setMinWidth(10.0);
        columnConstraints4.setPrefWidth(100.0);

        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(30.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        anchorPane6.setPrefHeight(94.0);
        anchorPane6.setPrefWidth(390.0);
        anchorPane6.setStyle("-fx-background-color: #F5F5F5; -fx-background-radius: 15 15 15 15;");

        imageView2.setFitHeight(100.0);
        imageView2.setFitWidth(82.0);
        imageView2.setLayoutX(8.0);
        imageView2.setLayoutY(5.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.setImage(new Image(getClass().getResource("images/nerd.png").toExternalForm()));

        txt_friends_username.setLayoutX(106.0);
        txt_friends_username.setLayoutY(42.0);
        txt_friends_username.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        txt_friends_username.setStrokeWidth(0.0);
        txt_friends_username.setText("User Name ");
        txt_friends_username.setWrappingWidth(73.00000643730164);
        txt_friends_username.setFont(new Font("Lato Bold", 14.0));

        btn_view_wishlist.setLayoutX(285.0);
        btn_view_wishlist.setLayoutY(58.0);
        btn_view_wishlist.setMnemonicParsing(false);
        btn_view_wishlist.setPrefHeight(28.0);
        btn_view_wishlist.setPrefWidth(91.0);
        btn_view_wishlist.setStyle("-fx-background-color: white; -fx-background-radius: 15; -fx-border-radius: 15; -fx-border-width: 2; -fx-border-color: #19223F;");
        btn_view_wishlist.setText("Remove ");
        btn_view_wishlist.setTextFill(javafx.scene.paint.Color.valueOf("#19223f"));

        dropShadow6.setHeight(6.17);
        dropShadow6.setRadius(2.585);
        dropShadow6.setWidth(6.17);
        btn_view_wishlist.setEffect(dropShadow6);

        btn_view_wishlist1.setLayoutX(260.0);
        btn_view_wishlist1.setLayoutY(14.0);
        btn_view_wishlist1.setMnemonicParsing(false);
        btn_view_wishlist1.setPrefHeight(31.0);
        btn_view_wishlist1.setPrefWidth(116.0);
        btn_view_wishlist1.setStyle("-fx-background-color: #19223F; -fx-background-radius: 15; -fx-border-radius: 15; -fx-border-width: 2;");
        btn_view_wishlist1.setText("View Wishlist");
        btn_view_wishlist1.setTextFill(javafx.scene.paint.Color.WHITE);

        dropShadow7.setHeight(6.17);
        dropShadow7.setRadius(2.585);
        dropShadow7.setWidth(6.17);
        btn_view_wishlist1.setEffect(dropShadow7);

        AnchorPane_Recharge.setLayoutX(179.0);
        AnchorPane_Recharge.setPrefHeight(410.0);
        AnchorPane_Recharge.setPrefWidth(459.0);
        AnchorPane_Recharge.setStyle("-fx-background-color: white;");

        lbl_wallet.setCacheShape(false);
        lbl_wallet.setLayoutX(184.0);
        lbl_wallet.setLayoutY(14.0);
        lbl_wallet.setPrefHeight(38.0);
        lbl_wallet.setPrefWidth(109.0);
        lbl_wallet.setText("Wallet");
        lbl_wallet.setTextOverrun(javafx.scene.control.OverrunStyle.CENTER_ELLIPSIS);
        lbl_wallet.setFont(new Font("Cambria", 24.0));

        lbl_wallet.setEffect(dropShadow8);

        txt_creditno.setLayoutX(114.0);
        txt_creditno.setLayoutY(239.0);
        txt_creditno.setPrefHeight(38.0);
        txt_creditno.setPrefWidth(212.0);
        txt_creditno.setPromptText("Credit Card Number");
        txt_creditno.setStyle("-fx-background-radius: 10 10 10 10; -fx-background-color: #19223F;");

        anchorPane7.setLayoutX(55.0);
        anchorPane7.setLayoutY(65.0);
        anchorPane7.setPrefHeight(152.0);
        anchorPane7.setPrefWidth(381.0);
        anchorPane7.setStyle("-fx-background-radius: 10 10 10 10; -fx-background-color: #19223F;");

        anchorPane7.setEffect(dropShadow9);

        lbl_balance.setFill(javafx.scene.paint.Color.valueOf("#f8f8f8"));
        lbl_balance.setLayoutX(33.0);
        lbl_balance.setLayoutY(69.0);
        lbl_balance.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        lbl_balance.setStrokeWidth(0.0);
        lbl_balance.setText("Your Balance");
        lbl_balance.setWrappingWidth(108.9999963901937);
        lbl_balance.setFont(new Font("Cambria", 27.0));

        txt_balance.setFill(javafx.scene.paint.Color.valueOf("#eeeeee"));
        txt_balance.setLayoutX(217.0);
        txt_balance.setLayoutY(94.0);
        txt_balance.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        txt_balance.setStrokeWidth(0.0);
        txt_balance.setText("555$");
        txt_balance.setWrappingWidth(115.9999942779541);
        txt_balance.setFont(new Font(45.0));

        btn_recharge0.setLayoutX(352.0);
        btn_recharge0.setLayoutY(345.0);
        btn_recharge0.setMnemonicParsing(false);
        btn_recharge0.setPrefWidth(84.0);
        btn_recharge0.setStyle("-fx-background-color: white; -fx-background-radius: 10 10 10 10; -fx-border-color: #19223F; -fx-border-radius: 10 10 10 10;");
        btn_recharge0.setText("Recharge");

        btn_recharge0.setEffect(dropShadow10);

        txt_rechage.setLayoutX(114.0);
        txt_rechage.setLayoutY(307.0);
        txt_rechage.setPrefHeight(38.0);
        txt_rechage.setPrefWidth(212.0);
        txt_rechage.setPromptText("Recharge Amount");
        txt_rechage.setStyle("-fx-background-radius: 10 10 10 10; -fx-background-color: #19223F;");

        anchorPane8.setLayoutX(176.0);
        anchorPane8.setPrefHeight(410.0);
        anchorPane8.setPrefWidth(459.0);
        anchorPane8.setStyle("-fx-background-color: white;");

        flowPane.setLayoutX(14.0);
        flowPane.setLayoutY(14.0);
        flowPane.setPrefHeight(75.0);
        flowPane.setPrefWidth(440.0);
        flowPane.setStyle("-fx-background-color: white;");

        flowPane.setEffect(dropShadow11);

        txt_notfication.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        txt_notfication.setStrokeWidth(0.0);
        txt_notfication.setText("here we will write notifications");
        txt_notfication.setWrappingWidth(379.10498046875);
        FlowPane.setMargin(txt_notfication, new Insets(10.0, 0.0, 0.0, 20.0));

        anchorPane.getChildren().add(logo_shop);
        anchorPane.getChildren().add(logo_wish_list);
        anchorPane.getChildren().add(logo_friends);
        anchorPane.getChildren().add(logo_logout);
        anchorPane.getChildren().add(logo_recharge);
        stackPane.getChildren().add(button);
        stackPane.getChildren().add(imageView);
        stackPane.getChildren().add(text_notification);
        anchorPane0.getChildren().add(stackPane);
        anchorPane.getChildren().add(anchorPane0);
        anchor_pane_left_panel.getChildren().add(anchorPane);
        anchor_pane_left_panel.getChildren().add(btn_shop);
        anchor_pane_left_panel.getChildren().add(btn_wish_list);
        anchor_pane_left_panel.getChildren().add(btn_friends_list);
        anchor_pane_left_panel.getChildren().add(btn_logout);
        anchor_pane_left_panel.getChildren().add(btn_recharge);
        anchor_pane_left_panel.getChildren().add(text_UserName);
        anchor_pane_left_panel.getChildren().add(userProfile);
        anchor_pane_left_panel.getChildren().add(text);
        getChildren().add(anchor_pane_left_panel);
        AnchorPane_shop.getChildren().add(Txt_Feild_Search);
        AnchorPane_shop.getChildren().add(btn_search);
        shop_grid_pane.getColumnConstraints().add(columnConstraints);
        shop_grid_pane.getColumnConstraints().add(columnConstraints0);
        shop_grid_pane.getRowConstraints().add(rowConstraints);
        anchorPane1.getChildren().add(product_img);
        anchorPane2.getChildren().add(product_name);
        anchorPane2.getChildren().add(product_price);
        anchorPane2.getChildren().add(get_product_btn);
        anchorPane1.getChildren().add(anchorPane2);
        shop_grid_pane.getChildren().add(anchorPane1);
        AnchorPane_shop.getChildren().add(shop_grid_pane);
        getChildren().add(AnchorPane_shop);
        friends_grid_pane1.getColumnConstraints().add(columnConstraints1);
        friends_grid_pane1.getRowConstraints().add(rowConstraints0);
        anchorPane3.getChildren().add(imageView0);
        anchorPane3.getChildren().add(txt_friends_username1);
        anchorPane3.getChildren().add(btn_cancel);
        anchorPane3.getChildren().add(btn_accept_request);
        friends_grid_pane1.getChildren().add(anchorPane3);
        notification_pane.getChildren().add(friends_grid_pane1);
        getChildren().add(notification_pane);
        wish_list_grid_pane.getColumnConstraints().add(columnConstraints2);
        wish_list_grid_pane.getRowConstraints().add(rowConstraints1);
        anchorPane4.getChildren().add(image_view);
        anchorPane4.getChildren().add(Text_Product_Name);
        anchorPane4.getChildren().add(text_price);
        anchorPane4.getChildren().add(btn_remove);
        wish_list_grid_pane.getChildren().add(anchorPane4);
        AnchorPane_WishList.getChildren().add(wish_list_grid_pane);
        getChildren().add(AnchorPane_WishList);
        friends_grid_pane11.getColumnConstraints().add(columnConstraints3);
        friends_grid_pane11.getRowConstraints().add(rowConstraints2);
        anchorPane5.getChildren().add(imageView1);
        anchorPane5.getChildren().add(txt_friends_username11);
        anchorPane5.getChildren().add(btn_add_friend);
        friends_grid_pane11.getChildren().add(anchorPane5);
        friends_search_pane.getChildren().add(friends_grid_pane11);
        getChildren().add(friends_search_pane);
        friends_grid_pane.getColumnConstraints().add(columnConstraints4);
        friends_grid_pane.getRowConstraints().add(rowConstraints3);
        anchorPane6.getChildren().add(imageView2);
        anchorPane6.getChildren().add(txt_friends_username);
        anchorPane6.getChildren().add(btn_view_wishlist);
        anchorPane6.getChildren().add(btn_view_wishlist1);
        friends_grid_pane.getChildren().add(anchorPane6);
        AnchorPane_Friends.getChildren().add(friends_grid_pane);
        getChildren().add(AnchorPane_Friends);
        AnchorPane_Recharge.getChildren().add(lbl_wallet);
        AnchorPane_Recharge.getChildren().add(txt_creditno);
        anchorPane7.getChildren().add(lbl_balance);
        anchorPane7.getChildren().add(txt_balance);
        AnchorPane_Recharge.getChildren().add(anchorPane7);
        AnchorPane_Recharge.getChildren().add(btn_recharge0);
        AnchorPane_Recharge.getChildren().add(txt_rechage);
        getChildren().add(AnchorPane_Recharge);
        flowPane.getChildren().add(txt_notfication);
        anchorPane8.getChildren().add(flowPane);
        getChildren().add(anchorPane8);

    }


  protected void handleButtonAction(ActionEvent event) {
                if (event.getSource() == btn_shop)
            AnchorPane_shop.toFront();
        else if (event.getSource() == btn_wish_list)
            AnchorPane_WishList.toFront();
         else if (event.getSource() == btn_friends_list)
            AnchorPane_Friends.toFront();
         else if (event.getSource() == btn_recharge)
            AnchorPane_Recharge.toFront();
            }



public Button getGet_product_btn() {
        return get_product_btn;
    }

    public ImageView getProduct_img() {
        return product_img;
    }

    public Text getProduct_name() {
        return product_name;
    }

    public Text getProduct_price() {
        return product_price;
    }

}
