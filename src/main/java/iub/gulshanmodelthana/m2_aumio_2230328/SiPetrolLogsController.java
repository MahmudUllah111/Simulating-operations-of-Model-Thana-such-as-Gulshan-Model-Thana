package iub.gulshanmodelthana.m2_aumio_2230328;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class SiPetrolLogsController {

    @FXML
    private TableColumn<?, ?> OfficerIDTableColumn;

    @FXML
    private TextField PetrolOfficerNameTextField;

    @FXML
    private TableView<?> assignedPetrolsTableView;

    @FXML
    private DatePicker dateDatepicker;

    @FXML
    private TableColumn<?, ?> dateTableColumn;

    @FXML
    private TableColumn<?, ?> officerNameTableColumn;

    @FXML
    private TextField petrolOfficerIDTextField;

    @FXML
    private ComboBox<?> petrolRouteComboBox;

    @FXML
    private TableColumn<?, ?> petrolRouteTableColumn;

    @FXML
    private TableColumn<?, ?> petrolVehicleTableColumn;

    @FXML
    private ComboBox<?> petrolVehicleTypeTextField;

    @FXML
    void assignPetrolOfficerOnClick(ActionEvent event) {

    }

    @FXML
    public void backOnClick(ActionEvent actionEvent) {
    }
}