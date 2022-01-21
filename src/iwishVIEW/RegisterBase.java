package iwishVIEW;



import CONTROLLER.LoginController;
import CONTROLLER.RegController;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;

public class RegisterBase extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final ImageView imageView;
    protected final AnchorPane anchorPane0;
    protected final Button btnRegister;
    protected final TextField txtEmail;
    protected final TextField txtPassword;
    protected final Text text;
    protected final Text text0;
    protected final Text text1;
    protected final TextField txtUsername;
    protected final ImageView imageView0;
    Socket s ;
    //DataInputStream dis;
    PrintStream ps ;
    

    public RegisterBase(RegController regctlr) {

        
        anchorPane = new AnchorPane();
        imageView = new ImageView();
        anchorPane0 = new AnchorPane();
        btnRegister = new Button();
        txtEmail = new TextField();
        txtPassword = new TextField();
        text = new Text();
        text0 = new Text();
        text1 = new Text();
        txtUsername = new TextField();
        imageView0 = new ImageView();
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

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(400.0);
        anchorPane.setPrefWidth(224.0);

        imageView.setFitHeight(545.0);
        imageView.setFitWidth(259.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("images/ss.jpg").toExternalForm()));
        setLeft(anchorPane);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setPrefHeight(400.0);
        anchorPane0.setPrefWidth(378.0);

        btnRegister.setLayoutX(87.0);
        btnRegister.setLayoutY(311.0);
        btnRegister.setMnemonicParsing(false);
        btnRegister.setPrefHeight(31.0);
        btnRegister.setPrefWidth(169.0);
        btnRegister.setText("Register");
        btnRegister.setTextFill(javafx.scene.paint.Color.valueOf("#47159d"));

        txtEmail.setLayoutX(119.0);
        txtEmail.setLayoutY(232.0);
        txtEmail.setPrefHeight(31.0);
        txtEmail.setPrefWidth(206.0);

        txtPassword.setLayoutX(119.0);
        txtPassword.setLayoutY(184.0);
        txtPassword.setPrefHeight(31.0);
        txtPassword.setPrefWidth(206.0);

        text.setFill(javafx.scene.paint.Color.valueOf("#47159d"));
        text.setLayoutX(28.0);
        text.setLayoutY(254.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Email");

        text0.setFill(javafx.scene.paint.Color.valueOf("#47159d"));
        text0.setLayoutX(28.0);
        text0.setLayoutY(206.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Password");

        text1.setFill(javafx.scene.paint.Color.valueOf("#47159d"));
        text1.setLayoutX(28.0);
        text1.setLayoutY(162.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Username ");

        txtUsername.setLayoutX(119.0);
        txtUsername.setLayoutY(140.0);
        txtUsername.setPrefHeight(31.0);
        txtUsername.setPrefWidth(205.0);

        imageView0.setFitHeight(59.0);
        imageView0.setFitWidth(62.0);
        imageView0.setLayoutX(142.0);
        imageView0.setLayoutY(24.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("images/More-security-icon-2-300x300.png").toExternalForm()));
        setRight(anchorPane0);

        anchorPane.getChildren().add(imageView);
        anchorPane0.getChildren().add(btnRegister);
        anchorPane0.getChildren().add(txtEmail);
        anchorPane0.getChildren().add(txtPassword);
        anchorPane0.getChildren().add(text);
        anchorPane0.getChildren().add(text0);
        anchorPane0.getChildren().add(text1);
        anchorPane0.getChildren().add(txtUsername);
        anchorPane0.getChildren().add(imageView0);

    }

    public Button getBtnRegister() {
        return btnRegister;
    }

    public TextField getTxtEmail() {
        return txtEmail;
    }

    public TextField getTxtPassword() {
        return txtPassword;
    }

    public TextField getTxtUsername() {
        return txtUsername;
    }
    
    
}
