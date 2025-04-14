package iub.gulshanmodelthana.m2_aumio_2230328;

import iub.gulshanmodelthana.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SiArrestWarrantController {

    @FXML
    private TextField suspectAgeTextField;

    @FXML
    private TextField suspectContactNumberTextField;

    @FXML
    private TextArea suspectDetailsTextField;

    @FXML
    private TextField suspectHomeAdressTextField;

    @FXML
    private TextField suspectNameTextField;

    @FXML
    private TextField warrantIDTextField;

    @FXML
    void addWarrantOnClick(ActionEvent event) throws IOException {

        String suspectName = suspectNameTextField.getText();
        String warrantID = warrantIDTextField.getText();
        String suspectAge = suspectAgeTextField.getText();
        String suspectHomeAddress = suspectHomeAdressTextField.getText();
        String suspectContactNumber = suspectContactNumberTextField.getText();
        String suspectDetails = suspectDetailsTextField.getText();

        if (suspectName.isEmpty() || warrantID.isEmpty() || suspectAge.isEmpty() || suspectHomeAddress.isEmpty() || suspectContactNumber.isEmpty() || suspectDetails.isEmpty()) {
            Alert warning = new Alert(Alert.AlertType.ERROR);
            warning.setContentText("Please fill in all fields.");
            warning.show();
            return;




        }
    }

        @FXML
        void backOnClick (ActionEvent event) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("m2_aumio_2230328/si_dashboard.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("dashboard");
            stage.setScene(nextScene);
            stage.show();

        }

        @FXML
        void suspectDatabaseOnClick (ActionEvent event) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("m2_aumio_2230328/si_arrest_warrants_view.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Suspect Database");
            stage.setScene(nextScene);
            stage.show();

        }
    }