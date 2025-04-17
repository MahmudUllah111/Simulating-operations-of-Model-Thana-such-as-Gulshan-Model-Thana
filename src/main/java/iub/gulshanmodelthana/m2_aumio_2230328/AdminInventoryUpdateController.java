package iub.gulshanmodelthana.m2_aumio_2230328;

import iub.gulshanmodelthana.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminInventoryUpdateController {

    @FXML
    private TextField itemNameTextField;

    @FXML
    private TextField quantityInStockTextField;

    @FXML
    private DatePicker restockingDatePicker;

    @FXML
    private TextField usageRateTextField;

    public static AdminInventoryModel itemToEdit;

    @FXML
    void updateOnClick(ActionEvent event) throws IOException {
        itemToEdit.setName(itemNameTextField.getText());
        itemToEdit.setStock(quantityInStockTextField.getText());
        itemToEdit.setUsage(usageRateTextField.getText());
        itemToEdit.setDate(restockingDatePicker.getValue());

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("m2_aumio_2230328/admin_inventory.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Update");
        stage.setScene(nextScene);
        stage.show();


    }

}