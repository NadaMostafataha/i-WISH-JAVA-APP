package iwishVIEW;

import CONTROLLER.LoginController;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class loginBase extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final ImageView imageView;
    protected final AnchorPane anchorPane0;
    protected final ImageView imageView0;
    protected final Text text;
    protected final TextField textUsername;
    protected final Text text0;
    protected final TextField textPassword;
    protected final Text text1;
    protected final Button btnLogIn;
    protected final Text text2;
    protected final Button btnSignUp;
    private LoginController client;
    DataInputStream dis;
    

    public loginBase(LoginController client) {

        anchorPane = new AnchorPane();
        imageView = new ImageView();
        anchorPane0 = new AnchorPane();
        imageView0 = new ImageView();
        text = new Text();
        textUsername = new TextField();
        text0 = new Text();
        textPassword = new TextField();
        text1 = new Text();
        btnLogIn = new Button();
        text2 = new Text();
        btnSignUp = new Button();
        this.client = client;

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(400.0);
        anchorPane.setPrefWidth(236.0);

        imageView.setFitHeight(400.0);
        imageView.setFitWidth(265.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("images/ss.jpg").toExternalForm()));
        setLeft(anchorPane);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setPrefHeight(400.0);
        anchorPane0.setPrefWidth(365.0);

        imageView0.setFitHeight(40.0);
        imageView0.setFitWidth(37.0);
        imageView0.setLayoutX(147.0);
        imageView0.setLayoutY(29.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("images/More-security-icon-2-300x300.png").toExternalForm()));

        text.setFill(javafx.scene.paint.Color.valueOf("#3e16a4"));
        text.setLayoutX(42.0);
        text.setLayoutY(159.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Username");

        textUsername.setLayoutX(134.0);
        textUsername.setLayoutY(138.0);

        text0.setFill(javafx.scene.paint.Color.valueOf("#3e16a4"));
        text0.setLayoutX(44.0);
        text0.setLayoutY(206.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Password");

        textPassword.setLayoutX(134.0);
        textPassword.setLayoutY(185.0);

        text1.setFill(javafx.scene.paint.Color.valueOf("#3e16a4"));
        text1.setLayoutX(22.0);
        text1.setLayoutY(307.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Does not have an account?");

        btnLogIn.setLayoutX(87.0);
        btnLogIn.setLayoutY(241.0);
        btnLogIn.setMnemonicParsing(false);
        btnLogIn.setPrefHeight(31.0);
        btnLogIn.setPrefWidth(121.0);
        btnLogIn.setText("Log in");
        btnLogIn.setTextFill(javafx.scene.paint.Color.valueOf("#3e16a4"));

        text2.setFill(javafx.scene.paint.Color.valueOf("#3e16a4"));
        text2.setLayoutX(103.0);
        text2.setLayoutY(110.0);
        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Welcome to IWISH ");
        text2.setWrappingWidth(135.56005859375);
        text2.setFont(new Font("System Bold Italic", 15.0));

        btnSignUp.setLayoutX(88.0);
        btnSignUp.setLayoutY(332.0);
        btnSignUp.setMnemonicParsing(false);
        btnSignUp.setPrefHeight(31.0);
        btnSignUp.setPrefWidth(119.0);
        btnSignUp.setText("Sign up");
        btnSignUp.setTextFill(javafx.scene.paint.Color.valueOf("#3e16a4"));
        setCenter(anchorPane0);

        anchorPane.getChildren().add(imageView);
        anchorPane0.getChildren().add(imageView0);
        anchorPane0.getChildren().add(text);
        anchorPane0.getChildren().add(textUsername);
        anchorPane0.getChildren().add(text0);
        anchorPane0.getChildren().add(textPassword);
        anchorPane0.getChildren().add(text1);
        anchorPane0.getChildren().add(btnLogIn);
        anchorPane0.getChildren().add(text2);
        anchorPane0.getChildren().add(btnSignUp);
        
        

    }

    public TextField getTextUsername() {
        return textUsername;
    }

    public TextField getTextPassword() {
        return textPassword;
    }

    public Button getBtnLogIn() {
        return btnLogIn;
    }

    public Button getBtnSignUp() {
        return btnSignUp;
    }
    
}
