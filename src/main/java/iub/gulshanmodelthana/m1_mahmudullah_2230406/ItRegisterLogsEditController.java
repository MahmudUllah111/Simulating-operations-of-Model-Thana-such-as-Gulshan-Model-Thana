package iub.gulshanmodelthana.m1_mahmudullah_2230406;

import iub.gulshanmodelthana.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ItRegisterLogsEditController {

    @FXML
    private TextField emailidtextfield;

    @FXML
    private TextField nametextfield;

    @FXML
    private TextField passwordtextfield;

    @FXML
    private DatePicker registrationdatepicker;

    @FXML
    private ComboBox<String> rolecombobox;

    public static ItRegisterLogs_Model itemToEdit;

    @FXML
    void updateButton(ActionEvent event) throws IOException {
        if (itemToEdit != null) {
            itemToEdit.setName(nametextfield.getText());
            itemToEdit.setEmailid(emailidtextfield.getText());
            itemToEdit.setPassword(passwordtextfield.getText());
            itemToEdit.setDate(registrationdatepicker.getValue());
            itemToEdit.setRole(rolecombobox.getValue());

            SceneSwitcher.switchTo("m1_mahmudullah_2230406/it_registerlogs");
        }
    }

    @FXML
    void initialize() {
        rolecombobox.getItems().addAll("Sub Inspector", "Assistant Sub Inspector", "Officer", "Duty Officer", "Administrator", "HR");

        if (itemToEdit != null) {
            nametextfield.setText(itemToEdit.getName());
            emailidtextfield.setText(itemToEdit.getEmailid());
            passwordtextfield.setText(itemToEdit.getPassword());
            registrationdatepicker.setValue(itemToEdit.getDate());
            rolecombobox.setValue(itemToEdit.getRole());
        }
    }
}
