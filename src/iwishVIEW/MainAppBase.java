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
    protected final AnchorPane friends_search_pane;
    protected final GridPane friends_grid_pane11;
    protected final ColumnConstraints columnConstraints;
    protected final RowConstraints rowConstraints;
    protected final AnchorPane anchorPane1;
    protected final ImageView imageView0;
    protected final Text txt_friends_username11;
    protected final Button btn_add_friend;
    protected final DropShadow dropShadow1;
    protected final AnchorPane AnchorPane_Recharge;
    protected final Label lbl_wallet;
    protected final DropShadow dropShadow2;
    protected final TextField txt_creditno;
    protected final AnchorPane anchorPane2;
    protected final DropShadow dropShadow3;
    protected final Text lbl_balance;
    protected final Text txt_balance;
    protected final Button btn_charge;
    protected final DropShadow dropShadow4;
    protected final TextField txt_rechage;
    protected final AnchorPane AnchorPane_Friends;
    protected final GridPane friends_grid_pane;
    protected final ColumnConstraints columnConstraints0;
    protected final RowConstraints rowConstraints0;
    protected final AnchorPane friends_pane;
    protected final ImageView imageView1;
    protected final Text txt_friends_username;
    protected final Button btn_view_wishlist_rm;
    protected final DropShadow dropShadow5;
    protected final Button btn_view_wishlist;
    protected final DropShadow dropShadow6;
    protected final AnchorPane notification_pane;
    protected final FlowPane flowPane;
    protected final DropShadow dropShadow7;
    protected final Text txt_notfication;
    protected final AnchorPane notification_pane_2;
    protected final GridPane friends_grid_pane1;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints1;
    protected final AnchorPane anchorPane3;
    protected final ImageView imageView2;
    protected final Text txt_friends_username1;
    protected final Button btn_cancel;
    protected final DropShadow dropShadow8;
    protected final Button btn_accept_request;
    protected final DropShadow dropShadow9;
    protected final AnchorPane AnchorPane_WishList_con;
    protected final GridPane wish_list_grid_pane;
    protected final ColumnConstraints columnConstraints2;
    protected final RowConstraints rowConstraints2;
    protected final AnchorPane anchorPane4;
    protected final ImageView image_view;
    protected final Text Text_Product_Name;
    protected final Text text_price;
    protected final Button btn_remove;
    protected final DropShadow dropShadow10;
    protected final AnchorPane friends_wishlist_pane;
    protected final GridPane wish_list_grid_pane1;
    protected final ColumnConstraints columnConstraints3;
    protected final RowConstraints rowConstraints3;
    protected final AnchorPane contribute_pane;
    protected final ImageView image_view1;
    protected final Text Text_Product_Name1;
    protected final Text text_price1;
    protected final Button btn_contribute;
    protected final DropShadow dropShadow11;
    protected final TextField txt_contribute;
    protected final AnchorPane AnchorPane_WishList;
    protected final GridPane wish_list_grid_pane0;
    protected final ColumnConstraints columnConstraints4;
    protected final RowConstraints rowConstraints4;
    protected final AnchorPane wishpane;
    protected final ImageView product_img1;
    protected final Text Text_Product_Name2;
    protected final Text text_price2;
    protected final Button btn_remove1;
    protected final DropShadow dropShadow12;
    protected final AnchorPane AnchorPane_shop;
    protected final TextField Txt_Feild_Search;
    protected final Button btn_search;
    protected final GridPane shop_grid_pane;
    protected final ColumnConstraints columnConstraints5;
    protected final ColumnConstraints columnConstraints6;
    protected final RowConstraints rowConstraints5;
    protected final AnchorPane product_pane;
    protected final ImageView product_img;
    protected final AnchorPane anchorPane5;
    protected final DropShadow dropShadow13;
    protected final Text product_name;
    protected final Text product_price;
    protected final Button get_product_btn;

    public MainAppBase(HomeController ctlr) {

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
        friends_search_pane = new AnchorPane();
        friends_grid_pane11 = new GridPane();
        columnConstraints = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        anchorPane1 = new AnchorPane();
        imageView0 = new ImageView();
        txt_friends_username11 = new Text();
        btn_add_friend = new Button();
        dropShadow1 = new DropShadow();
        AnchorPane_Recharge = new AnchorPane();
        lbl_wallet = new Label();
        dropShadow2 = new DropShadow();
        txt_creditno = new TextField();
        anchorPane2 = new AnchorPane();
        dropShadow3 = new DropShadow();
        lbl_balance = new Text();
        txt_balance = new Text();
        btn_charge = new Button();
        dropShadow4 = new DropShadow();
        txt_rechage = new TextField();
        AnchorPane_Friends = new AnchorPane();
        friends_grid_pane = new GridPane();
        columnConstraints0 = new ColumnConstraints();
        rowConstraints0 = new RowConstraints();
        friends_pane = new AnchorPane();
        imageView1 = new ImageView();
        txt_friends_username = new Text();
        btn_view_wishlist_rm = new Button();
        dropShadow5 = new DropShadow();
        btn_view_wishlist = new Button();
        dropShadow6 = new DropShadow();
        notification_pane = new AnchorPane();
        flowPane = new FlowPane();
        dropShadow7 = new DropShadow();
        txt_notfication = new Text();
        notification_pane_2 = new AnchorPane();
        friends_grid_pane1 = new GridPane();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints1 = new RowConstraints();
        anchorPane3 = new AnchorPane();
        imageView2 = new ImageView();
        txt_friends_username1 = new Text();
        btn_cancel = new Button();
        dropShadow8 = new DropShadow();
        btn_accept_request = new Button();
        dropShadow9 = new DropShadow();
        AnchorPane_WishList_con = new AnchorPane();
        wish_list_grid_pane = new GridPane();
        columnConstraints2 = new ColumnConstraints();
        rowConstraints2 = new RowConstraints();
        anchorPane4 = new AnchorPane();
        image_view = new ImageView();
        Text_Product_Name = new Text();
        text_price = new Text();
        btn_remove = new Button();
        dropShadow10 = new DropShadow();
        friends_wishlist_pane = new AnchorPane();
        wish_list_grid_pane1 = new GridPane();
        columnConstraints3 = new ColumnConstraints();
        rowConstraints3 = new RowConstraints();
        contribute_pane = new AnchorPane();
        image_view1 = new ImageView();
        Text_Product_Name1 = new Text();
        text_price1 = new Text();
        btn_contribute = new Button();
        dropShadow11 = new DropShadow();
        txt_contribute = new TextField();
        AnchorPane_WishList = new AnchorPane();
        wish_list_grid_pane0 = new GridPane();
        columnConstraints4 = new ColumnConstraints();
        rowConstraints4 = new RowConstraints();
        wishpane = new AnchorPane();
        product_img1 = new ImageView();
        Text_Product_Name2 = new Text();
        text_price2 = new Text();
        btn_remove1 = new Button();
        dropShadow12 = new DropShadow();
        AnchorPane_shop = new AnchorPane();
        Txt_Feild_Search = new TextField();
        btn_search = new Button();
        shop_grid_pane = new GridPane();
        columnConstraints5 = new ColumnConstraints();
        columnConstraints6 = new ColumnConstraints();
        rowConstraints5 = new RowConstraints();
        product_pane = new AnchorPane();
        product_img = new ImageView();
        anchorPane5 = new AnchorPane();
        dropShadow13 = new DropShadow();
        product_name = new Text();
        product_price = new Text();
        get_product_btn = new Button();

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
        text_UserName.setText("username");
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
        text.setText("0$");
        text.setWrappingWidth(44.00000578165054);
        text.setFont(new Font("Lato Regular", 16.0));

        friends_search_pane.setLayoutX(180.0);
        friends_search_pane.setPrefHeight(410.0);
        friends_search_pane.setPrefWidth(459.0);
        friends_search_pane.setStyle("-fx-background-color: white;");

        friends_grid_pane11.setLayoutX(16.0);
        friends_grid_pane11.setLayoutY(40.0);
        friends_grid_pane11.setPrefHeight(91.0);
        friends_grid_pane11.setPrefWidth(390.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        anchorPane1.setPrefHeight(94.0);
        anchorPane1.setPrefWidth(390.0);
        anchorPane1.setStyle("-fx-background-color: #F5F5F5; -fx-background-radius: 15 15 15 15;");

        imageView0.setFitHeight(100.0);
        imageView0.setFitWidth(82.0);
        imageView0.setLayoutX(8.0);
        imageView0.setLayoutY(5.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("images/nerd.png").toExternalForm()));

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

        dropShadow1.setHeight(6.17);
        dropShadow1.setRadius(2.585);
        dropShadow1.setWidth(6.17);
        btn_add_friend.setEffect(dropShadow1);

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

        lbl_wallet.setEffect(dropShadow2);

        txt_creditno.setLayoutX(114.0);
        txt_creditno.setLayoutY(239.0);
        txt_creditno.setPrefHeight(38.0);
        txt_creditno.setPrefWidth(212.0);
        txt_creditno.setPromptText("Credit Card Number");
        txt_creditno.setStyle("-fx-background-radius: 10 10 10 10; -fx-background-color: #19223F;");

        anchorPane2.setLayoutX(55.0);
        anchorPane2.setLayoutY(65.0);
        anchorPane2.setPrefHeight(152.0);
        anchorPane2.setPrefWidth(381.0);
        anchorPane2.setStyle("-fx-background-radius: 10 10 10 10; -fx-background-color: #19223F;");

        anchorPane2.setEffect(dropShadow3);

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

        btn_charge.setLayoutX(352.0);
        btn_charge.setLayoutY(345.0);
        btn_charge.setMnemonicParsing(false);
        btn_charge.setPrefWidth(84.0);
        btn_charge.setStyle("-fx-background-color: white; -fx-background-radius: 10 10 10 10; -fx-border-color: #19223F; -fx-border-radius: 10 10 10 10;");
        btn_charge.setText("Recharge");

        btn_charge.setEffect(dropShadow4);

        txt_rechage.setLayoutX(114.0);
        txt_rechage.setLayoutY(307.0);
        txt_rechage.setPrefHeight(38.0);
        txt_rechage.setPrefWidth(212.0);
        txt_rechage.setPromptText("Recharge Amount");
        txt_rechage.setStyle("-fx-background-radius: 10 10 10 10; -fx-background-color: #19223F;");

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

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        friends_pane.setPrefHeight(94.0);
        friends_pane.setPrefWidth(390.0);
        friends_pane.setStyle("-fx-background-color: #F5F5F5; -fx-background-radius: 15 15 15 15;");

        imageView1.setFitHeight(100.0);
        imageView1.setFitWidth(82.0);
        imageView1.setLayoutX(8.0);
        imageView1.setLayoutY(5.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("images/nerd.png").toExternalForm()));

        txt_friends_username.setLayoutX(106.0);
        txt_friends_username.setLayoutY(42.0);
        txt_friends_username.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        txt_friends_username.setStrokeWidth(0.0);
        txt_friends_username.setText("User Name ");
        txt_friends_username.setWrappingWidth(73.00000643730164);
        txt_friends_username.setFont(new Font("Lato Bold", 14.0));

        btn_view_wishlist_rm.setLayoutX(285.0);
        btn_view_wishlist_rm.setLayoutY(58.0);
        btn_view_wishlist_rm.setMnemonicParsing(false);
        btn_view_wishlist_rm.setPrefHeight(28.0);
        btn_view_wishlist_rm.setPrefWidth(91.0);
        btn_view_wishlist_rm.setStyle("-fx-background-color: white; -fx-background-radius: 15; -fx-border-radius: 15; -fx-border-width: 2; -fx-border-color: #19223F;");
        btn_view_wishlist_rm.setText("Remove ");
        btn_view_wishlist_rm.setTextFill(javafx.scene.paint.Color.valueOf("#19223f"));

        dropShadow5.setHeight(6.17);
        dropShadow5.setRadius(2.585);
        dropShadow5.setWidth(6.17);
        btn_view_wishlist_rm.setEffect(dropShadow5);

        btn_view_wishlist.setLayoutX(260.0);
        btn_view_wishlist.setLayoutY(14.0);
        btn_view_wishlist.setMnemonicParsing(false);
        btn_view_wishlist.setPrefHeight(31.0);
        btn_view_wishlist.setPrefWidth(116.0);
        btn_view_wishlist.setStyle("-fx-background-color: #19223F; -fx-background-radius: 15; -fx-border-radius: 15; -fx-border-width: 2;");
        btn_view_wishlist.setText("View Wishlist");
        btn_view_wishlist.setTextFill(javafx.scene.paint.Color.WHITE);

        dropShadow6.setHeight(6.17);
        dropShadow6.setRadius(2.585);
        dropShadow6.setWidth(6.17);
        btn_view_wishlist.setEffect(dropShadow6);

        notification_pane.setLayoutX(176.0);
        notification_pane.setPrefHeight(410.0);
        notification_pane.setPrefWidth(459.0);
        notification_pane.setStyle("-fx-background-color: white;");

        flowPane.setLayoutX(14.0);
        flowPane.setLayoutY(14.0);
        flowPane.setPrefHeight(75.0);
        flowPane.setPrefWidth(440.0);
        flowPane.setStyle("-fx-background-color: white;");

        flowPane.setEffect(dropShadow7);

        txt_notfication.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        txt_notfication.setStrokeWidth(0.0);
        txt_notfication.setText("here we will write notifications");
        txt_notfication.setWrappingWidth(379.10498046875);
        FlowPane.setMargin(txt_notfication, new Insets(10.0, 0.0, 0.0, 20.0));

        notification_pane_2.setLayoutX(177.0);
        notification_pane_2.setPrefHeight(410.0);
        notification_pane_2.setPrefWidth(459.0);
        notification_pane_2.setStyle("-fx-background-color: white;");

        friends_grid_pane1.setLayoutX(16.0);
        friends_grid_pane1.setLayoutY(40.0);
        friends_grid_pane1.setPrefHeight(91.0);
        friends_grid_pane1.setPrefWidth(390.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        anchorPane3.setPrefHeight(94.0);
        anchorPane3.setPrefWidth(390.0);
        anchorPane3.setStyle("-fx-background-color: #F5F5F5; -fx-background-radius: 15 15 15 15;");

        imageView2.setFitHeight(100.0);
        imageView2.setFitWidth(82.0);
        imageView2.setLayoutX(8.0);
        imageView2.setLayoutY(5.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.setImage(new Image(getClass().getResource("images/nerd.png").toExternalForm()));

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

        dropShadow8.setHeight(6.17);
        dropShadow8.setRadius(2.585);
        dropShadow8.setWidth(6.17);
        btn_cancel.setEffect(dropShadow8);

        btn_accept_request.setLayoutX(285.0);
        btn_accept_request.setLayoutY(14.0);
        btn_accept_request.setMnemonicParsing(false);
        btn_accept_request.setPrefHeight(28.0);
        btn_accept_request.setPrefWidth(91.0);
        btn_accept_request.setStyle("-fx-background-color: #00D100; -fx-background-radius: 15; -fx-border-radius: 15; -fx-border-width: 2;");
        btn_accept_request.setText("Accept");
        btn_accept_request.setTextFill(javafx.scene.paint.Color.WHITE);

        dropShadow9.setHeight(6.17);
        dropShadow9.setRadius(2.585);
        dropShadow9.setWidth(6.17);
        btn_accept_request.setEffect(dropShadow9);

        AnchorPane.setBottomAnchor(AnchorPane_WishList_con, 0.0);
        AnchorPane.setRightAnchor(AnchorPane_WishList_con, -7.0);
        AnchorPane.setTopAnchor(AnchorPane_WishList_con, 0.0);
        AnchorPane_WishList_con.setPrefHeight(410.0);
        AnchorPane_WishList_con.setPrefWidth(465.0);
        AnchorPane_WishList_con.setStyle("-fx-background-color: white;");

        wish_list_grid_pane.setLayoutX(14.0);
        wish_list_grid_pane.setLayoutY(51.0);
        wish_list_grid_pane.setPrefHeight(126.0);
        wish_list_grid_pane.setPrefWidth(399.0);
        wish_list_grid_pane.setStyle("-fx-background-color: #F8F8F8; -fx-background-radius: 10;");

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(100.0);

        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(30.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

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

        dropShadow10.setHeight(6.17);
        dropShadow10.setRadius(2.585);
        dropShadow10.setWidth(6.17);
        btn_remove.setEffect(dropShadow10);

        friends_wishlist_pane.setPrefHeight(424.0);
        friends_wishlist_pane.setPrefWidth(473.0);
        friends_wishlist_pane.setStyle("-fx-background-color: white;");

        wish_list_grid_pane1.setLayoutX(14.0);
        wish_list_grid_pane1.setLayoutY(51.0);
        wish_list_grid_pane1.setPrefHeight(126.0);
        wish_list_grid_pane1.setPrefWidth(399.0);
        wish_list_grid_pane1.setStyle("-fx-background-color: #F8F8F8; -fx-background-radius: 10;");

        columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints3.setMinWidth(10.0);
        columnConstraints3.setPrefWidth(100.0);

        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(30.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        contribute_pane.setPrefHeight(126.0);
        contribute_pane.setPrefWidth(394.0);

        image_view1.setFitHeight(100.0);
        image_view1.setFitWidth(106.0);
        image_view1.setLayoutX(14.0);
        image_view1.setLayoutY(12.0);
        image_view1.setPickOnBounds(true);
        image_view1.setPreserveRatio(true);
        image_view1.setImage(new Image(getClass().getResource("images/R.jpg").toExternalForm()));

        Text_Product_Name1.setFill(javafx.scene.paint.Color.valueOf("#19223f"));
        Text_Product_Name1.setLayoutX(129.0);
        Text_Product_Name1.setLayoutY(40.0);
        Text_Product_Name1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        Text_Product_Name1.setStrokeWidth(0.0);
        Text_Product_Name1.setText("Product Name ");
        Text_Product_Name1.setFont(new Font("Lato Bold", 16.0));

        text_price1.setFill(javafx.scene.paint.Color.valueOf("#19223f"));
        text_price1.setLayoutX(154.0);
        text_price1.setLayoutY(79.0);
        text_price1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text_price1.setStrokeWidth(0.0);
        text_price1.setText("55$");
        text_price1.setFont(new Font("Lato Bold Italic", 16.0));

        btn_contribute.setLayoutX(273.0);
        btn_contribute.setLayoutY(72.0);
        btn_contribute.setMnemonicParsing(false);
        btn_contribute.setPrefHeight(33.0);
        btn_contribute.setPrefWidth(109.0);
        btn_contribute.setStyle("-fx-background-color: #19223F; -fx-background-radius: 15; -fx-border-radius: 15; -fx-border-width: 2;");
        btn_contribute.setText("Contribute");
        btn_contribute.setTextFill(javafx.scene.paint.Color.WHITE);

        dropShadow11.setHeight(6.17);
        dropShadow11.setRadius(2.585);
        dropShadow11.setWidth(6.17);
        btn_contribute.setEffect(dropShadow11);

        txt_contribute.setLayoutX(275.0);
        txt_contribute.setLayoutY(29.0);
        txt_contribute.setPrefHeight(31.0);
        txt_contribute.setPrefWidth(106.0);

        AnchorPane_WishList.setLayoutX(174.0);
        AnchorPane_WishList.setLayoutY(-4.0);
        AnchorPane_WishList.setPrefHeight(432.0);
        AnchorPane_WishList.setPrefWidth(465.0);
        AnchorPane_WishList.setStyle("-fx-background-color: white;");

        wish_list_grid_pane0.setLayoutX(14.0);
        wish_list_grid_pane0.setLayoutY(51.0);
        wish_list_grid_pane0.setPrefHeight(126.0);
        wish_list_grid_pane0.setPrefWidth(399.0);
        wish_list_grid_pane0.setStyle("-fx-background-color: #F8F8F8; -fx-background-radius: 10;");

        columnConstraints4.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints4.setMinWidth(10.0);
        columnConstraints4.setPrefWidth(100.0);

        rowConstraints4.setMinHeight(10.0);
        rowConstraints4.setPrefHeight(30.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        wishpane.setPrefHeight(126.0);
        wishpane.setPrefWidth(394.0);

        product_img1.setFitHeight(126.0);
        product_img1.setFitWidth(91.0);
        product_img1.setLayoutX(14.0);
        product_img1.setLayoutY(12.0);
        product_img1.setPreserveRatio(true);
        product_img1.setImage(new Image(getClass().getResource("images/R.jpg").toExternalForm()));

        Text_Product_Name2.setFill(javafx.scene.paint.Color.valueOf("#19223f"));
        Text_Product_Name2.setLayoutX(129.0);
        Text_Product_Name2.setLayoutY(40.0);
        Text_Product_Name2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        Text_Product_Name2.setStrokeWidth(0.0);
        Text_Product_Name2.setText("Product Name ");
        Text_Product_Name2.setFont(new Font("Lato Bold", 16.0));

        text_price2.setFill(javafx.scene.paint.Color.valueOf("#19223f"));
        text_price2.setLayoutX(154.0);
        text_price2.setLayoutY(79.0);
        text_price2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text_price2.setStrokeWidth(0.0);
        text_price2.setText("55$");
        text_price2.setFont(new Font("Lato Bold Italic", 16.0));

        btn_remove1.setLayoutX(277.0);
        btn_remove1.setLayoutY(67.0);
        btn_remove1.setMnemonicParsing(false);
        btn_remove1.setPrefHeight(33.0);
        btn_remove1.setPrefWidth(109.0);
        btn_remove1.setStyle("-fx-background-color: #19223F; -fx-background-radius: 15; -fx-border-radius: 15; -fx-border-width: 2;");
        btn_remove1.setText("Remove item");
        btn_remove1.setTextFill(javafx.scene.paint.Color.WHITE);

        dropShadow12.setHeight(6.17);
        dropShadow12.setRadius(2.585);
        dropShadow12.setWidth(6.17);
        btn_remove1.setEffect(dropShadow12);

        AnchorPane.setBottomAnchor(AnchorPane_shop, 0.0);
        AnchorPane.setRightAnchor(AnchorPane_shop, -7.0);
        AnchorPane.setTopAnchor(AnchorPane_shop, 0.0);
        AnchorPane_shop.setPrefHeight(428.0);
        AnchorPane_shop.setPrefWidth(473.0);
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

        columnConstraints5.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints5.setMinWidth(10.0);
        columnConstraints5.setPrefWidth(100.0);

        columnConstraints6.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints6.setMinWidth(10.0);
        columnConstraints6.setPrefWidth(100.0);

        rowConstraints5.setMinHeight(10.0);
        rowConstraints5.setPrefHeight(30.0);
        rowConstraints5.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        product_pane.setPrefHeight(208.0);
        product_pane.setPrefWidth(185.0);

        product_img.setFitHeight(126.0);
        product_img.setFitWidth(185.0);
        product_img.setLayoutX(29.0);
        product_img.setLayoutY(14.0);
        product_img.setPreserveRatio(true);
        product_img.setImage(new Image(getClass().getResource("images/R.jpg").toExternalForm()));

        anchorPane5.setLayoutX(7.0);
        anchorPane5.setLayoutY(137.0);
        anchorPane5.setPrefHeight(54.0);
        anchorPane5.setPrefWidth(167.0);
        anchorPane5.setStyle("-fx-background-radius: 20 20 20 20; -fx-border-radius: 20 20 20 20; -fx-background-color: #F5F5F5;");

        dropShadow13.setHeight(6.0);
        dropShadow13.setRadius(3.9825);
        dropShadow13.setWidth(11.93);
        anchorPane5.setEffect(dropShadow13);

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
        friends_grid_pane11.getColumnConstraints().add(columnConstraints);
        friends_grid_pane11.getRowConstraints().add(rowConstraints);
        anchorPane1.getChildren().add(imageView0);
        anchorPane1.getChildren().add(txt_friends_username11);
        anchorPane1.getChildren().add(btn_add_friend);
        friends_grid_pane11.getChildren().add(anchorPane1);
        friends_search_pane.getChildren().add(friends_grid_pane11);
        getChildren().add(friends_search_pane);
        AnchorPane_Recharge.getChildren().add(lbl_wallet);
        AnchorPane_Recharge.getChildren().add(txt_creditno);
        anchorPane2.getChildren().add(lbl_balance);
        anchorPane2.getChildren().add(txt_balance);
        AnchorPane_Recharge.getChildren().add(anchorPane2);
        AnchorPane_Recharge.getChildren().add(btn_charge);
        AnchorPane_Recharge.getChildren().add(txt_rechage);
        getChildren().add(AnchorPane_Recharge);
        friends_grid_pane.getColumnConstraints().add(columnConstraints0);
        friends_grid_pane.getRowConstraints().add(rowConstraints0);
        friends_pane.getChildren().add(imageView1);
        friends_pane.getChildren().add(txt_friends_username);
        friends_pane.getChildren().add(btn_view_wishlist_rm);
        friends_pane.getChildren().add(btn_view_wishlist);
        friends_grid_pane.getChildren().add(friends_pane);
        AnchorPane_Friends.getChildren().add(friends_grid_pane);
        getChildren().add(AnchorPane_Friends);
        flowPane.getChildren().add(txt_notfication);
        notification_pane.getChildren().add(flowPane);
        getChildren().add(notification_pane);
        friends_grid_pane1.getColumnConstraints().add(columnConstraints1);
        friends_grid_pane1.getRowConstraints().add(rowConstraints1);
        anchorPane3.getChildren().add(imageView2);
        anchorPane3.getChildren().add(txt_friends_username1);
        anchorPane3.getChildren().add(btn_cancel);
        anchorPane3.getChildren().add(btn_accept_request);
        friends_grid_pane1.getChildren().add(anchorPane3);
        notification_pane_2.getChildren().add(friends_grid_pane1);
        getChildren().add(notification_pane_2);
        wish_list_grid_pane.getColumnConstraints().add(columnConstraints2);
        wish_list_grid_pane.getRowConstraints().add(rowConstraints2);
        anchorPane4.getChildren().add(image_view);
        anchorPane4.getChildren().add(Text_Product_Name);
        anchorPane4.getChildren().add(text_price);
        anchorPane4.getChildren().add(btn_remove);
        wish_list_grid_pane.getChildren().add(anchorPane4);
        AnchorPane_WishList_con.getChildren().add(wish_list_grid_pane);
        wish_list_grid_pane1.getColumnConstraints().add(columnConstraints3);
        wish_list_grid_pane1.getRowConstraints().add(rowConstraints3);
        contribute_pane.getChildren().add(image_view1);
        contribute_pane.getChildren().add(Text_Product_Name1);
        contribute_pane.getChildren().add(text_price1);
        contribute_pane.getChildren().add(btn_contribute);
        contribute_pane.getChildren().add(txt_contribute);
        wish_list_grid_pane1.getChildren().add(contribute_pane);
        friends_wishlist_pane.getChildren().add(wish_list_grid_pane1);
        AnchorPane_WishList_con.getChildren().add(friends_wishlist_pane);
        getChildren().add(AnchorPane_WishList_con);
        wish_list_grid_pane0.getColumnConstraints().add(columnConstraints4);
        wish_list_grid_pane0.getRowConstraints().add(rowConstraints4);
        wishpane.getChildren().add(product_img1);
        wishpane.getChildren().add(Text_Product_Name2);
        wishpane.getChildren().add(text_price2);
        wishpane.getChildren().add(btn_remove1);
        wish_list_grid_pane0.getChildren().add(wishpane);
        AnchorPane_WishList.getChildren().add(wish_list_grid_pane0);
        getChildren().add(AnchorPane_WishList);
        AnchorPane_shop.getChildren().add(Txt_Feild_Search);
        AnchorPane_shop.getChildren().add(btn_search);
        shop_grid_pane.getColumnConstraints().add(columnConstraints5);
        shop_grid_pane.getColumnConstraints().add(columnConstraints6);
        shop_grid_pane.getRowConstraints().add(rowConstraints5);
        product_pane.getChildren().add(product_img);
        anchorPane5.getChildren().add(product_name);
        anchorPane5.getChildren().add(product_price);
        anchorPane5.getChildren().add(get_product_btn);
        product_pane.getChildren().add(anchorPane5);
        shop_grid_pane.getChildren().add(product_pane);
        AnchorPane_shop.getChildren().add(shop_grid_pane);
        getChildren().add(AnchorPane_shop);

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

    public Text getText_UserName() {
        return text_UserName;
    }

    public Button getBtn_charge() {
        return btn_charge;
    }

    public Text getbalanceText() {
        return text;
    }

    public Text getTxt_balance() {
        return txt_balance;
    }

    public TextField getTxt_rechage() {
        return txt_rechage;
    }
    
    public void setbalanceText(String balance){
    text.setText(balance);
    }
    
    public void setwalletbalance(String balance){
    txt_balance.setText(balance);
    }
    
     public void setUSERNAME(String NAME){
    text_UserName.setText(NAME);
    }

    public Button getBtn_remove() {
        return btn_remove;
    }

    public Button getBtn_view_wishlist() {
        return btn_view_wishlist;
    }

    public Button getBtn_view_wishlist1() {
        return btn_view_wishlist_rm;
    }

    public TextField getTxt_creditno() {
        return txt_creditno;
    }

 

    public AnchorPane getwishpane() {
        return wishpane;
    }

    public Text getText_Product_Name() {
        return Text_Product_Name;
    }

    public Text getText_price() {
        return text_price;
    }
}
