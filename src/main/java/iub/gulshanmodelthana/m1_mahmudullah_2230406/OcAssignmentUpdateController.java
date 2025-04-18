package iub.gulshanmodelthana.m1_mahmudullah_2230406;

import iub.gulshanmodelthana.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.io.IOException;

public class OcAssignmentUpdateController {

    @FXML
    private RadioButton activeradiobutton;

    @FXML
    private TextField adddetailstextarea;

    @FXML
    private TextField assignedofficertextfield;

    @FXML
    private TextField assignmentidtextfield;

    @FXML
    private RadioButton completedradiobutton;

    @FXML
    private DatePicker duedatepicker;

    @FXML
    private TextField officeridtextfield;

    public static OcAssignment_Model itemToEdit;

    @FXML
    void updateButton(ActionEvent event) throws IOException {
        itemToEdit.setAssignmentid(assignmentidtextfield.getText());
        itemToEdit.setOfficerid(officeridtextfield.getText());
        itemToEdit.setAssignedofficername(assignedofficertextfield.getText());
        itemToEdit.setDuedate(duedatepicker.getValue());
        itemToEdit.setDetails(adddetailstextarea.getText());

        if (activeradiobutton.isSelected()) {
            itemToEdit.setAssignmentprogress("Active");
        }
        else if (completedradiobutton.isSelected()) {
            itemToEdit.setAssignmentprogress("Completed");
        }

        SceneSwitcher.switchTo("m1_mahmudullah_2230406/oc_assignment");
    }

    @FXML
    void initialize() {
        if (itemToEdit != null) {
            assignmentidtextfield.setText(itemToEdit.getAssignmentid());
            officeridtextfield.setText(itemToEdit.getOfficerid());
            assignedofficertextfield.setText(itemToEdit.getAssignedofficername());
            duedatepicker.setValue(itemToEdit.getDuedate());
            adddetailstextarea.setText(itemToEdit.getDetails());

            if (itemToEdit.getAssignmentprogress().equals("Active")) {
                activeradiobutton.setSelected(true);
            }
            else if (itemToEdit.getAssignmentprogress().equals("Completed")) {
                completedradiobutton.setSelected(true);
            }
        }
    }
}
