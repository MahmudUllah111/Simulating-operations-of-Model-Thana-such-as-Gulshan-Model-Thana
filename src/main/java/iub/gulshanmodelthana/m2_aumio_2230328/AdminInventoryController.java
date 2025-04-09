package iub.gulshanmodelthana.m2_aumio_2230328;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

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
    void backOnClick(ActionEvent event) {

    }

    @FXML
    void updateSelectedOnClick(ActionEvent event) {

    }

}