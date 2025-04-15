package iub.gulshanmodelthana.m2_aumio_2230328;

import iub.gulshanmodelthana.HelloApplication;
import iub.gulshanmodelthana.m1_mahmudullah_2230406.OcOngoingCasesController;
import iub.gulshanmodelthana.m1_mahmudullah_2230406.OcOngoingCases_Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class Si_OC_CaseManagementController {

    @FXML
    private RadioButton activeRadioButton;

    @FXML
    private RadioButton completedRadioButton;

    @FXML
    private TextField crimeTypeTextField;

    @FXML
    private DatePicker dateOfIncidentDatePicker;

    @FXML
    private TextField officerIDTextField;

    @FXML
    private TextField suspectInformationTextField;

    @FXML
    private TextField caseIDTextField;

    @FXML
    private TextField officerNameTextField;

    private ToggleGroup tg;

    @FXML
    void backOnClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("m2_aumio_2230328/si_dashboard.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("dashboard");
        stage.setScene(nextScene);
        stage.show();
    }

    @FXML
    void fileCaseOnClick(ActionEvent event) {
        String caseid = caseIDTextField.getText();
        String officername = officerNameTextField.getText();
        String officerid = officerIDTextField.getText();
        String crimetype = crimeTypeTextField.getText();
        LocalDate dateofincident = dateOfIncidentDatePicker.getValue();
        String suspectinfo = suspectInformationTextField.getText();

        String casestatus;
        if (activeRadioButton.isSelected()) {
            casestatus = "Active";
        } else if (completedRadioButton.isSelected()) {
            casestatus = "Completed";
        } else {
            casestatus = "Not Selected";
        }

        if (caseid.isEmpty() || officername.isEmpty() || officerid.isEmpty() || crimetype.isEmpty()
                || dateofincident == null || suspectinfo.isEmpty() || casestatus.equals("Not Selected")) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please fill in all fields.");
            alert.show();
            return;
        }


        OcOngoingCasesController.messageList.add(new OcOngoingCases_Model(caseid, officername, officerid, crimetype, dateofincident, suspectinfo, casestatus));

        Alert success = new Alert(Alert.AlertType.INFORMATION);
        success.setContentText("Case filed successfully.");
        success.show();


    }

    @FXML
    void reviewCasesOnClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("m1_mahmudullah_2230406/oc_ongoingcases.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Ongoing Cases");
        stage.setScene(nextScene);
        stage.show();
    }

    @FXML
    void initialize() {
        tg = new ToggleGroup();
        activeRadioButton.setToggleGroup(tg);
        completedRadioButton.setToggleGroup(tg);
    }


}
