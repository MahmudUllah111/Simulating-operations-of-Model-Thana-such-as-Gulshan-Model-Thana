package iub.gulshanmodelthana.common;

import iub.gulshanmodelthana.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField emailtextfield;

    @FXML
    private PasswordField passwordtextfield;

    @FXML
    private ComboBox<?> roleComboBox;

    @FXML
    void loginbutton(ActionEvent event) {

    }

    @FXML
    void signupbutton(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("common/signup.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Create Account");
        stage.setScene(nextScene);
        stage.show();
    }
}
