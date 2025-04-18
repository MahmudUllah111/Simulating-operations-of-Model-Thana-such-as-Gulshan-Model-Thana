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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AdminVehiclesController {

    @FXML
    private Button backOnClick;

    @FXML
    private TableColumn<AdminVehicleModel, String> distanceTraveledTableColumn;

    @FXML
    private TableColumn<AdminVehicleModel, String> fuelConsumptionTableColumn;

    @FXML
    private TableColumn<AdminVehicleModel, String> usageTimeTableColumn;

    @FXML
    private TableColumn<AdminVehicleModel, String> vehicleIDTableColumn;

    @FXML
    private TableView<AdminVehicleModel> vehicleLogsTableView;

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
    void initialize(){
       vehicleIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("ID"));
       usageTimeTableColumn.setCellValueFactory(new PropertyValueFactory<>("time"));
       distanceTraveledTableColumn.setCellValueFactory(new PropertyValueFactory<>("distance"));
       fuelConsumptionTableColumn.setCellValueFactory(new PropertyValueFactory<>("fuel"));

       vehicleLogsTableView.getItems().setAll(messageList);

   }
   public static List<AdminVehicleModel> messageList = new ArrayList<>();
    static {

        messageList.add(new AdminVehicleModel("228","2 months","1000km","50L"));
        messageList.add(new AdminVehicleModel("271","1 year","12000km","520L"));
        messageList.add(new AdminVehicleModel("235","1 month","320km","10L"));
        messageList.add(new AdminVehicleModel("206","7 days","50km","1L")); //forgot to set git title again
    }

}
