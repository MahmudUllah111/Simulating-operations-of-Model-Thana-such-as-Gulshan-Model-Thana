package iub.gulshanmodelthana.m2_aumio_2230328;

import iub.gulshanmodelthana.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AdminInventoryController {

    @FXML
    private TableColumn<AdminInventoryModel,String> itemNameTableColumn;

    @FXML
    private TextField itemNameTextField;

    @FXML
    private TableColumn<AdminInventoryModel,String> quantityInStockTableColumn;

    @FXML
    private TextField quantityInStockTextField;

    @FXML
    private DatePicker restockingDatePicker;

    @FXML
    private TableColumn<AdminInventoryModel,String> restockingDateTableColumn;

    @FXML
    private TableView<AdminInventoryModel> suppliesTableView;

    @FXML
    private TableColumn<AdminInventoryModel,String> usageRateTableColumn;

    @FXML
    private TextField usageRateTextField;

    @FXML
    void addEntryOnClick(ActionEvent event) {

        String name = itemNameTextField.getText();
        String stock = quantityInStockTextField.getText();
        String usage = usageRateTextField.getText();
        LocalDate date = restockingDatePicker.getValue();

        if(name.isEmpty()||stock.isEmpty()||usage.isEmpty()||date==null){

            Alert warning = new Alert(Alert.AlertType.ERROR);
            warning.setContentText("Please fill in all fields.");
            warning.show();
            return;
        }

        AdminInventoryModel newEntry = new AdminInventoryModel(name,stock,usage,date);
        suppliesTableView.getItems().add(newEntry);

    }

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
    void updateSelectedOnClick(ActionEvent event) throws IOException{
        AdminInventoryModel selected = suppliesTableView.getSelectionModel().getSelectedItem();
        if(selected ==null){
            Alert warning = new Alert(Alert.AlertType.ERROR);
            warning.setContentText("Please select from table");
            warning.show();
            return;
        }
        AdminInventoryUpdateController.itemToEdit = selected;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("m2_aumio_2230328/admin_inventory_update.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Update");
        stage.setScene(nextScene);
        stage.show();





    }

    @FXML
    void initialize(){

        itemNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        quantityInStockTableColumn.setCellValueFactory(new PropertyValueFactory<>("stock"));
        usageRateTableColumn.setCellValueFactory(new PropertyValueFactory<>("usage"));
        restockingDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("date"));

        suppliesTableView.getItems().setAll(messageList);
    }

    public static List<AdminInventoryModel> messageList = new ArrayList<>();
    static {

        messageList.add(new AdminInventoryModel("ammo","5 crate","security",LocalDate.of(2025,03,25)));
    }

}