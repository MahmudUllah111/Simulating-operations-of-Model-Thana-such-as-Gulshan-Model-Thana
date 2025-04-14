package iub.gulshanmodelthana.m2_aumio_2230328;

import iub.gulshanmodelthana.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Si_OC_CaseManagementController {

    @FXML
    private RadioButton activeRadioButton;

    @FXML
    private TextField caseIDTextView;

    @FXML
    private RadioButton completedRadioButton;

    @FXML
    private TextField crimeTypeTextField;

    @FXML
    private DatePicker dateOfIncidentDatePicker;

    @FXML
    private TextField officerIDTextField;

    @FXML
    private TextField officerNameTextFile;

    @FXML
    private TextField suspectInformationTextField;

    @FXML
    void backOnClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("m2_aumio_2230328/si_dashboard.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("dashboard");
        stage.setScene(nextScene);
        stage.show();

    }

    @FXML
    void fileCaseOnClick(ActionEvent event) {

    }

    @FXML
    void reviewCasesOnClick(ActionEvent event) {

    }

}