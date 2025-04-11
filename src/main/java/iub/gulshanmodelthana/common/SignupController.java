package iub.gulshanmodelthana.common;

import iub.gulshanmodelthana.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SignupController {

    @FXML
    private TextField addresstextfield;

    @FXML
    private AnchorPane anchData;

    @FXML
    private DatePicker birthdaydatepicker;

    @FXML
    private TextField congirmpasswordtextfield;

    @FXML
    private TextField countrytextfield;

    @FXML
    private TextField emailtextfield;

    @FXML
    private Label labWarning;

    @FXML
    private TextField nametextfield;

    @FXML
    private TextField nidtextfield;

    @FXML
    private TextField passwordtextfield;

    @FXML
    private TextField phonetextfield;

    @FXML
    void registerbutton(ActionEvent event) {

    }

    @FXML
    void switchTologin(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("common/login.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Gulshan Model Thana");
        stage.setScene(nextScene);
        stage.show();

    }

}
