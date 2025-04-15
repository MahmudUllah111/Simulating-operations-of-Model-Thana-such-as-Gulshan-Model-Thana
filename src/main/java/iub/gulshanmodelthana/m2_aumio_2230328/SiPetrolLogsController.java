package iub.gulshanmodelthana.m2_aumio_2230328;

import iub.gulshanmodelthana.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SiPetrolLogsController {

    @FXML
    private TableColumn<SiPetrolLogsModel, String> OfficerIDTableColumn;

    @FXML
    private TextField PetrolOfficerNameTextField;

    @FXML
    private TableView<SiPetrolLogsModel> assignedPetrolsTableView;

    @FXML
    private DatePicker dateDatepicker;

    @FXML
    private TableColumn<SiPetrolLogsModel, String> dateTableColumn;

    @FXML
    private TableColumn<SiPetrolLogsModel, String> officerNameTableColumn;

    @FXML
    private TextField petrolOfficerIDTextField;

    @FXML
    private ComboBox<String> petrolRouteComboBox;

    @FXML
    private TableColumn<SiPetrolLogsModel, String> petrolRouteTableColumn;

    @FXML
    private TableColumn<SiPetrolLogsModel, String> petrolVehicleTableColumn;

    @FXML
    private ComboBox<String> petrolVehicleTypeComboBox;


    public static List<SiPetrolLogsModel> messageList = new ArrayList<>();

    @FXML
    void assignPetrolOfficerOnClick(ActionEvent event) throws IOException {

        String officerName = PetrolOfficerNameTextField.getText();
        String officerID = petrolOfficerIDTextField.getText();
        String petrolRoute = petrolRouteComboBox.getValue();
        String vehicleType = petrolVehicleTypeComboBox.getValue();
        LocalDate date = dateDatepicker.getValue();

        if (officerName.isEmpty() || officerID.isEmpty() || petrolRoute == null || vehicleType == null || date == null) {
            Alert warning = new Alert(Alert.AlertType.ERROR);
            warning.setContentText("Please fill in all fields.");
            warning.show();
            return;
        }

        SiPetrolLogsModel newPetrol = new SiPetrolLogsModel(officerName, officerID, petrolRoute, vehicleType, date);
        messageList.add(newPetrol);
        assignedPetrolsTableView.getItems().add(newPetrol);

        Alert success = new Alert(Alert.AlertType.INFORMATION);
        success.setContentText("Petrol officer assigned successfully.");
        success.show();

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

    @FXML
    void initialize() {
        petrolRouteComboBox.getItems().addAll("Gulshan 1", "Gulshan 2", "Notunbazar", "Police Plaza Area");
        petrolVehicleTypeComboBox.getItems().addAll("Pick up", "Car", "Bike", "On Foot");
    }
}
