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

public class OcCrimeReportController {

    @FXML
    private TableColumn<OcCrimeReport_Model, String> crimescenedetailscolumn;

    @FXML
    private ImageView imageUser;

    @FXML
    private Label labName;

    @FXML
    private TableColumn<OcCrimeReport_Model, String> locationcolumn;

    @FXML
    private TableColumn<OcCrimeReport_Model, String> reportnamecolumn;

    @FXML
    private TableColumn<OcCrimeReport_Model, String> reporttypecolumn;

    @FXML
    private TableView<OcCrimeReport_Model> tableview;

    @FXML
    private TableColumn<OcCrimeReport_Model, LocalDate> datecolumn;
    @FXML
    private Label warninglabel;

    @FXML
    void backMessage(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("m1_mahmudullah_2230406/oc_dashboard");
    }


    @FXML
    void logClick(MouseEvent event) throws IOException {
        ProfileChangePasswordcontroller.lastscene = "m1_mahmudullah_2230406/oc_crimereport";
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
    void approvebutton(ActionEvent event) {
        OcCrimeReport_Model selectedReport = tableview.getSelectionModel().getSelectedItem();
        if (selectedReport != null) {
            warninglabel.setText("The report is approved.");
            warninglabel.setStyle("-fx-border-color: green");
        }
        else {
            warninglabel.setText("Please select a report first.");
            warninglabel.setStyle("-fx-border-color: red");
        }
    }
    @FXML
    void denybutton(ActionEvent event) {
        OcCrimeReport_Model selectedReport = tableview.getSelectionModel().getSelectedItem();
        if (selectedReport != null) {
            warninglabel.setText("The report has been denied.");
            warninglabel.setStyle("-fx-border-color: orange");

        }
        else {
            warninglabel.setText("Please select a report first.");
            warninglabel.setStyle("-fx-border-color: red");

        }
    }

    @FXML
    void initialize() {
        labName.setText(Session.email);

        reportnamecolumn.setCellValueFactory(new PropertyValueFactory<>("reportname"));
        locationcolumn.setCellValueFactory(new PropertyValueFactory<>("location"));
        datecolumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        reporttypecolumn.setCellValueFactory(new PropertyValueFactory<>("reporttype"));
        crimescenedetailscolumn.setCellValueFactory(new PropertyValueFactory<>("crimescenedetails"));

        tableview.getItems().setAll(messageList);
    }

    public static List<OcCrimeReport_Model> messageList = new ArrayList<>();
    static {
        messageList.add(new OcCrimeReport_Model("Murder in house","Gulshan 1",LocalDate.of(2025,4,15),"Murder","A person was killed in his house by an attacker."));
        messageList.add(new OcCrimeReport_Model("Burglary in shop","Gulshan 2",LocalDate.of(2025,4,20),"Burglary","Shoplifters emptied cash register."));
        messageList.add(new OcCrimeReport_Model("Bike theft from road","Link Road",LocalDate.of(2025,4,22),"Theft","Bike was stolen at a gun point from the road"));
    }
}
