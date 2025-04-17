package iub.gulshanmodelthana.m2_aumio_2230328;

import iub.gulshanmodelthana.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

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
    void backOnClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("m2_aumio_2230328/Admin_dashboard.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("dashboard");
        stage.setScene(nextScene);
        stage.show();

    }

    @FXML
    void filterByIDOnClick(ActionEvent event) {

    }

}
