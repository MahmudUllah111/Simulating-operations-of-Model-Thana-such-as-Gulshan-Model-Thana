package iub.gulshanmodelthana.m2_aumio_2230328;

import iub.gulshanmodelthana.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

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

    @Deprecated
    void addEvidenceOnClick(ActionEvent event) {

    }

    @FXML
    void backOnClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("m2_aumio_2230328/si_dashboard.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("dashboard");
        stage.setScene(nextScene);
        stage.show();

    }

    @Deprecated
    void fileclick(MouseEvent event) {

    }

    @FXML
    void sendReportOnClick(ActionEvent event) {
        String report_name = reportNameTextField.getText();
        String location = locationTextField.getText();
        String details = crimeSceneDetailsTextArea.getText();
        String date = datePicker.getId();
        String report_type = reportTypeComboBox.getTypeSelector();


        if (report_name.isEmpty() || location.isEmpty() || report_type == null || details.isEmpty()) {
            Alert warning = new Alert(Alert.AlertType.ERROR);
            warning.setContentText("Please fill in all fields.");
            warning.show();
            return;


        }

    }


    @FXML
    void initialize(){
        reportTypeComboBox.getItems().addAll("Traffic Incidents","Murder","Burglary","Other`type");
    }
}





