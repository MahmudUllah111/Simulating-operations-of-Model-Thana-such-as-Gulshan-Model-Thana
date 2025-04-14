package iub.gulshanmodelthana.m2_aumio_2230328;

import iub.gulshanmodelthana.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminInventoryController {

    @FXML
    private TableColumn<?, ?> itemNameTableColumn;

    @FXML
    private TextField itemNameTextField;

    @FXML
    private TableColumn<?, ?> quantityInStockTableColumn;

    @FXML
    private TextField quantityInStockTextField;

    @FXML
    private DatePicker restockingDatePicker;

    @FXML
    private TableColumn<?, ?> restockingDateTableColumn;

    @FXML
    private TableView<?> suppliesTableView;

    @FXML
    private TableColumn<?, ?> usageRateTableColumn;

    @FXML
    private TextField usageRateTextField;

    @FXML
    void addEntryOnClick(ActionEvent event) {

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
    void updateSelectedOnClick(ActionEvent event) {

    }

}