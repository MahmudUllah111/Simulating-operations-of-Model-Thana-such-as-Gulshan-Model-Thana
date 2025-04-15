package iub.gulshanmodelthana.m1_mahmudullah_2230406;

import iub.gulshanmodelthana.common.ProfileChangePasswordcontroller;
import iub.gulshanmodelthana.common.SceneSwitcher;
import iub.gulshanmodelthana.common.Session;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.FileWriter;
import java.io.IOException;

public class OcExtcooRequestController {

    @FXML
    private DatePicker dateDatePicker;

    @FXML
    private ImageView imageUser;

    @FXML
    private Label labName;

    @FXML
    private TextArea purposeTextArea;

    @FXML
    private Label warninglabel;

    @FXML
    void backMessage(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("m1_mahmudullah_2230406/oc_externalcoordination");
    }

    @FXML
    void logClick(MouseEvent event) throws IOException {
        ProfileChangePasswordcontroller.lastscene = "m1_mahmudullah_2230406/oc_extcoorequest";
        SceneSwitcher.switchTo("common/profile_change_password");
    }

    @FXML
    void mailClick(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("common/contact");
    }

    @FXML
    void notClick(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("common/notification");
    }

    @FXML
    void sendRequestButton(ActionEvent event) throws IOException {
        String purpose = purposeTextArea.getText();
        String date = "";

        if (dateDatePicker.getValue() != null) {
            date = dateDatePicker.getValue().toString();
        }

        if (purpose.isEmpty() || date.isEmpty()) {
            warninglabel.setText("Please write purpose and select a date.");
            warninglabel.setStyle("-fx-border-color: red");
            return;
        }

        FileWriter fw = new FileWriter("ExternalCoordinationRequest.txt", true);
        fw.write("Purpose: " + purpose + "\n");
        fw.write("Date: " + date + "\n");
        fw.write("------------------------\n");
        fw.close();

        warninglabel.setText("Request sent successful.");
        warninglabel.setStyle("-fx-border-color: green");
        purposeTextArea.clear();
        dateDatePicker.setValue(null);
    }

    @FXML
    void initialize(){
        labName.setText(Session.email);
    }

}