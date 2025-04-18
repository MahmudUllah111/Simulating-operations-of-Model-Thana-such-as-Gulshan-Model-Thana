package iub.gulshanmodelthana.m1_mahmudullah_2230406;

import iub.gulshanmodelthana.common.ProfileChangePasswordcontroller;
import iub.gulshanmodelthana.common.SceneSwitcher;
import iub.gulshanmodelthana.common.Session;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ItSmErrorLogsContoller {

    @FXML
    private TableColumn<ItSmErrorLogs_Model, String> errorcodecolumn;

    @FXML
    private TableColumn<ItSmErrorLogs_Model, String> errordetailscolumn;

    @FXML
    private ImageView imageUser;

    @FXML
    private Label labName;

    @FXML
    private TableView<ItSmErrorLogs_Model> tableview;

    @FXML
    void backMessage(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("m1_mahmudullah_2230406/it_systemmonitor");
    }

    @FXML
    void logClick(MouseEvent event) throws IOException {
        ProfileChangePasswordcontroller.lastscene = "m1_mahmudullah_2230406/it_smerrorlogs";
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
    void initialize(){
        labName.setText(Session.email);

        errorcodecolumn.setCellValueFactory(new PropertyValueFactory<>("errorcode"));
        errordetailscolumn.setCellValueFactory(new PropertyValueFactory<>("errordetails"));

        tableview.getItems().setAll(messageList);
    }
    public static List<ItSmErrorLogs_Model> messageList = new ArrayList<>();
    static {
        messageList.add(new ItSmErrorLogs_Model("ERROR101", "Database connection failed"));
        messageList.add(new ItSmErrorLogs_Model("ERROR102", "File not found configure properties"));
        messageList.add(new ItSmErrorLogs_Model("ERROR103", "Unauthorized access attempt detected"));
        messageList.add(new ItSmErrorLogs_Model("ERROR104", "System overload CPU usage exceeded 95%"));
        messageList.add(new ItSmErrorLogs_Model("ERROR105", "Email service unavailable"));
        messageList.add(new ItSmErrorLogs_Model("ERROR106", "Scheduled backup failed to execute"));
        messageList.add(new ItSmErrorLogs_Model("ERROR107", "Memory bugs detected"));
        messageList.add(new ItSmErrorLogs_Model("ERROR108", "Application crashed due to uncaught virus"));

    }
}