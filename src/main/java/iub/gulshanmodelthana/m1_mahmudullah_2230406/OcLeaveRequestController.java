package iub.gulshanmodelthana.m1_mahmudullah_2230406;

import iub.gulshanmodelthana.common.ProfileChangePasswordcontroller;
import iub.gulshanmodelthana.common.SceneSwitcher;
import iub.gulshanmodelthana.common.Session;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OcLeaveRequestController {

    @FXML
    private ImageView imageUser;

    @FXML
    private Label labName;

    @FXML
    private TableColumn<OcLeaveRequest_Model, String> officeridcolumn;

    @FXML
    private TableColumn<OcLeaveRequest_Model, String> offiicernamecolumn;

    @FXML
    private TableColumn<OcLeaveRequest_Model, String> reasoncolumn;

    @FXML
    private TableColumn<OcLeaveRequest_Model, String> requestidcolumn;

    @FXML
    private TableView<OcLeaveRequest_Model> tableview;
    @FXML
    private Label warninglabel;
    @FXML
    private TableColumn datecolumn;

    @FXML
    void backMessage(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("m1_mahmudullah_2230406/oc_dashboard");
    }

    @FXML
    void logClick(MouseEvent event) throws IOException {
        ProfileChangePasswordcontroller.lastscene = "m1_mahmudullah_2230406/oc_leaverequest";
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
    void approveleaverequestbutton(ActionEvent event) {
        OcLeaveRequest_Model selectedReport = tableview.getSelectionModel().getSelectedItem();
        if (selectedReport != null) {
            warninglabel.setText(" The request has been approved.");
            warninglabel.setStyle("-fx-border-color: green");
        }
        else {
            warninglabel.setText(" Please select a request first.");
            warninglabel.setStyle("-fx-border-color: red");
        }
    }

    @FXML
    void rejectleaverequestbutton(ActionEvent event) {
        OcLeaveRequest_Model selectedReport = tableview.getSelectionModel().getSelectedItem();
        if (selectedReport != null) {
            warninglabel.setText(" The request has been rejected.");
            warninglabel.setStyle("-fx-border-color: orange");
        }
        else {
            warninglabel.setText(" Please select a request first.");
            warninglabel.setStyle("-fx-border-color: red");

        }
    }

    @FXML
    void initialize() {
        labName.setText(Session.email);

        requestidcolumn.setCellValueFactory(new PropertyValueFactory<>("requestid"));
        offiicernamecolumn.setCellValueFactory(new PropertyValueFactory<>("officername"));
        officeridcolumn.setCellValueFactory(new PropertyValueFactory<>("officerid"));
        datecolumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        reasoncolumn.setCellValueFactory(new PropertyValueFactory<>("reason"));

        tableview.getItems().setAll(messageList);
    }

    public static List<OcLeaveRequest_Model> messageList = new ArrayList<>();
    static {
        messageList.add(new OcLeaveRequest_Model("1001","SI Mahmud","1111212",LocalDate.of(2025,4,16),"Because of illness"));
        messageList.add(new OcLeaveRequest_Model("1002","SI Onto","1111180",LocalDate.of(2025,4,15),"To attend a marriage ceremony."));
        messageList.add(new OcLeaveRequest_Model("1003","SI Sranto","1111313",LocalDate.of(2025,4,19),"Going to village."));
        messageList.add(new OcLeaveRequest_Model("1004","ASI Ahnaf","9999999",LocalDate.of(2025,4,17),"To attend a function."));
        messageList.add(new OcLeaveRequest_Model("1005","ASI Aumio","2211111",LocalDate.of(2025,4,22),"To enter the SI promotion exam."));


    }
}
