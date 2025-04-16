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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ItUnusuallogsController {

    @FXML
    private TableColumn<ItUnusuallogs_Model, String> activitycolumn;

    @FXML
    private TableColumn<ItUnusuallogs_Model, LocalDate> datecolumn;

    @FXML
    private TableColumn<ItUnusuallogs_Model, String> emailidcolumn;

    @FXML
    private ImageView imageUser;

    @FXML
    private Label labName;

    @FXML
    private TableColumn<ItUnusuallogs_Model, String> rolecolumn;

    @FXML
    private TableView<ItUnusuallogs_Model> tableview;

    @FXML
    void backMessage(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("m1_mahmudullah_2230406/it_dashboard");
    }

    @FXML
    void logClick(MouseEvent event) throws IOException {
        ProfileChangePasswordcontroller.lastscene = "m1_mahmudullah_2230406/it_unusuallogs";
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

        emailidcolumn.setCellValueFactory(new PropertyValueFactory<>("emailid"));
        rolecolumn.setCellValueFactory(new PropertyValueFactory<>("role"));
        datecolumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        activitycolumn.setCellValueFactory(new PropertyValueFactory<>("activity"));

        tableview.getItems().setAll(messageList);
    }

    public static List<ItUnusuallogs_Model> messageList = new ArrayList<>();
    static {
        messageList.add(new ItUnusuallogs_Model("aumio@police.gov.bd","Sub Inspector",LocalDate.of(2025,4,5),"Tried to swap murder report file with false report."));
        messageList.add(new ItUnusuallogs_Model("mahmud@police.gov.bd","Officer In Charge",LocalDate.of(2025,4,6),"Searched citizen info in the online database portal."));
        messageList.add(new ItUnusuallogs_Model("Omor99@police.gov.bd","Duty Officer ",LocalDate.of(2025,4,9),"Tried to access secret communication messages."));
        messageList.add(new ItUnusuallogs_Model("mahmudullah@police.gov.bd","HR and Training Officer",LocalDate.of(2025,4,9),"Assigning new cases to officers without upper authority approval."));
        messageList.add(new ItUnusuallogs_Model("unknown1user@xyz.com", "Unknown", LocalDate.of(2025, 4, 12), "Attempted access to restricted surveillance footage."));
        messageList.add(new ItUnusuallogs_Model("rakib99@xyz.gov", "Network Admin", LocalDate.of(2025, 4, 12), "Tried to access a large amount of server logs at midnight."));
        messageList.add(new ItUnusuallogs_Model("farhan@xyz.gov", "Forensics Officer", LocalDate.of(2025, 4, 12), "Accessed deleted records from case archive."));
        messageList.add(new ItUnusuallogs_Model("guestlogin", "Temporary Access", LocalDate.of(2025, 4, 13), "Logged in with expired guest account."));
        messageList.add(new ItUnusuallogs_Model("adminbackup@xyz.com", "Unknown", LocalDate.of(2025, 4, 14), "Aborted scheduled system backup unexpectedly."));
        messageList.add(new ItUnusuallogs_Model("sami@xyz.gov", "HR Officer", LocalDate.of(2025, 4, 14), "Tried to modify officer records."));
    }
}
