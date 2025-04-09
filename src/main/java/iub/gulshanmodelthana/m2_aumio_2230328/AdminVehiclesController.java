package iub.gulshanmodelthana.m2_aumio_2230328;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class AdminVehiclesController {

    @FXML
    private Button backOnClick;

    @FXML
    private TableColumn<?, ?> distanceTraveledTableColumn;

    @FXML
    private TableColumn<?, ?> fuelConsumptionTableColumn;

    @FXML
    private TableColumn<?, ?> usageTimeTableColumn;

    @FXML
    private TableColumn<?, ?> vehicleIDTableColumn;

    @FXML
    private TextField vehicleIDTextField;

    @FXML
    private TableView<?> vehicleLogsTableView;

    @FXML
    void filterByIDOnClick(ActionEvent event) {

    }

}