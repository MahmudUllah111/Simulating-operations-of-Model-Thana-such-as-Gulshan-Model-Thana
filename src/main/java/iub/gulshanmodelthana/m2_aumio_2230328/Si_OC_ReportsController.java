package iub.gulshanmodelthana.m2_aumio_2230328;

import iub.gulshanmodelthana.HelloApplication;
import iub.gulshanmodelthana.m1_mahmudullah_2230406.OcCrimeReport_Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

import static iub.gulshanmodelthana.m1_mahmudullah_2230406.OcCrimeReportController.messageList;

public class Si_OC_ReportsController {

    @FXML
    private TextArea crimeSceneDetailsTextArea;

    @FXML
    private DatePicker datePicker;

    @FXML
    private TextField locationTextField;

    @FXML
    private TextField reportNameTextField;

    @FXML
    private ComboBox<String> reportTypeComboBox;

    @FXML
    void backOnClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("m2_aumio_2230328/si_dashboard.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("SI Dashboard");
        stage.setScene(nextScene);
        stage.show();
    }

    @FXML
    void sendReportOnClick(ActionEvent event) throws IOException {
        String reportName = reportNameTextField.getText();
        String location = locationTextField.getText();
        LocalDate date = datePicker.getValue();
        String crimeSceneDetails = crimeSceneDetailsTextArea.getText();
        String reportType = reportTypeComboBox.getValue();

        if (reportName.isEmpty() || location.isEmpty() || reportType == null || crimeSceneDetails.isEmpty() || date == null) {
            Alert warning = new Alert(Alert.AlertType.ERROR);
            warning.setContentText("Please fill in all fields.");
            warning.show();
            return;
        }


        OcCrimeReport_Model report = new OcCrimeReport_Model(reportName, location, date, reportType, crimeSceneDetails);
        messageList.add(report);


        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("m1_mahmudullah_2230406/oc_crimereport.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("OC Crime Reports");
        stage.setScene(nextScene);
        stage.show();
    }

    @FXML
    void initialize() {
        reportTypeComboBox.getItems().addAll("Traffic Incidents", "Murder", "Burglary", "Theft", "Other");
    }
}