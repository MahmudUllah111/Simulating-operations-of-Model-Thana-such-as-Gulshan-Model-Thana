package iub.gulshanmodelthana.m1_mahmudullah_2230406;

import iub.gulshanmodelthana.common.Contact_Model;
import iub.gulshanmodelthana.common.ProfileChangePasswordcontroller;
import iub.gulshanmodelthana.common.SceneSwitcher;
import iub.gulshanmodelthana.common.Session;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OcAssignmentController {

    @FXML
    private RadioButton activeradiobutton;

    @FXML
    private TextArea adddetailstextarea;

    @FXML
    private TableColumn<OcAssignment_Model, String> assignedofficernamecolumn;

    @FXML
    private TextField assignedofficertextfield;

    @FXML
    private TextField assignedofficertextfield1;

    @FXML
    private TableColumn<OcAssignment_Model, String> assignmentidcolumn;

    @FXML
    private TextField assignmentidtextfield;

    @FXML
    private TableColumn<OcAssignment_Model, String> assignmentprogresscolumn;

    @FXML
    private RadioButton completedradiobutton;

    @FXML
    private TableColumn<OcAssignment_Model, String> detailscolumn;

    @FXML
    private TableColumn<OcAssignment_Model, LocalDate> duedatecolumn;

    @FXML
    private DatePicker duedatepicker;

    @FXML
    private ImageView imageUser;

    @FXML
    private Label labName;

    @FXML
    private TableColumn<OcAssignment_Model, String> officeridcolumn;

    @FXML
    private TableView<OcAssignment_Model> tableview;

    @FXML
    private Label warninglabel;

    ToggleGroup tg;


    @FXML
    void backMessage(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("m1_mahmudullah_2230406/oc_dashboard");
    }

    @FXML
    void logClick(MouseEvent event) throws IOException {
        ProfileChangePasswordcontroller.lastscene = "m1_mahmudullah_2230406/oc_assignment";
        SceneSwitcher.switchTo("common/profile_change_password");
    }

    @FXML
    void mailClick(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("common/contact");
    }

    @FXML
    void notClick(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("common/notification");
    }

    @FXML
    void updateofficerbutton(ActionEvent event) {

    }

    @FXML
    public void addtotableview(ActionEvent actionEvent) {
        String assignmentId = assignmentidtextfield.getText();
        String officerId = assignedofficertextfield1.getText();
        String officerName = assignedofficertextfield.getText();
        LocalDate dueDate = duedatepicker.getValue();
        String details = adddetailstextarea.getText();
        String progress;

        if (activeradiobutton.isSelected()) {
            progress = "Active";
        }
        else if (completedradiobutton.isSelected()) {
            progress = "Completed";
        }
        else {
            progress = "Not Selected";
        }

        if (assignmentId.isEmpty() || officerId.isEmpty() || officerName.isEmpty() || dueDate == null || details.isEmpty() || progress.equals("Not Selected")) {
            warninglabel.setText("Please fill up properly.");
            warninglabel.setStyle("-fx-border-color: red");
            warninglabel.setVisible(true);
            return;
        }

        OcAssignment_Model newassign = new OcAssignment_Model(assignmentId, officerId, officerName, dueDate, details, progress);
        messageList.add(newassign);
        tableview.getItems().setAll(messageList);
        warninglabel.setText("Added");
        warninglabel.setStyle("-fx-border-color: green");
        warninglabel.setVisible(true);

    }

    @FXML
    void initialize(){
        labName.setText(Session.email);

        tg = new ToggleGroup();
        activeradiobutton.setToggleGroup(tg);
        completedradiobutton.setToggleGroup(tg);

        duedatepicker.setValue(LocalDate.now());

        assignmentidcolumn.setCellValueFactory(new PropertyValueFactory<>("assignmentid"));
        officeridcolumn.setCellValueFactory(new PropertyValueFactory<>("officerid"));
        assignedofficernamecolumn.setCellValueFactory(new PropertyValueFactory<>("assignedofficername"));
        duedatecolumn.setCellValueFactory(new PropertyValueFactory<>("duedate"));
        detailscolumn.setCellValueFactory(new PropertyValueFactory<>("details"));
        assignmentprogresscolumn.setCellValueFactory(new PropertyValueFactory<>("assignmentprogress"));

        tableview.getItems().setAll(messageList);
    }

    public static List<OcAssignment_Model> messageList = new ArrayList<>();
    static {
        messageList.add(new OcAssignment_Model("1001","1212121","SIMahmud",LocalDate.of(2025,4,20),"Submit murder investigation report asap.","Active"));
        messageList.add(new OcAssignment_Model("1002","1212122","SIOnto",LocalDate.of(2025,4,24),"Submit forencis report.","Active"));
        messageList.add(new OcAssignment_Model("1003","3333313","SISranto",LocalDate.of(2025,4,12),"Home robbery investigation.","Completed"));
    }
}
