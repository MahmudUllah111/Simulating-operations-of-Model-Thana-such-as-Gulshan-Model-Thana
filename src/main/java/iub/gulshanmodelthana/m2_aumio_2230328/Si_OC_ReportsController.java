package iub.gulshanmodelthana.m2_aumio_2230328;

import iub.gulshanmodelthana.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
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
    private ComboBox<?> reportTypeComboBox;

    @FXML
    private TextField timeAndDateTextField;

    @FXML
    void addEvidenceOnClick(ActionEvent event) {

    }

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
    void fileclick(MouseEvent event) {

    }

    @FXML
    void sendReportOnClick(ActionEvent event) {

    }

}
