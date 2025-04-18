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

public class ItAccesslogsController {

    @FXML
    private TableColumn<ItAccessLogs_Model, LocalDate> datecolumn;

    @FXML
    private TableColumn<ItAccessLogs_Model, String> emailidcolumn;

    @FXML
    private ImageView imageUser;

    @FXML
    private Label labName;

    @FXML
    private TableColumn<ItAccessLogs_Model, String> rolecolumn;

    @FXML
    private TableView<ItAccessLogs_Model> tableview;

    @FXML
    void backMessage(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("m1_mahmudullah_2230406/it_dashboard");
    }

    @FXML
    void logClick(MouseEvent event) throws IOException {
        ProfileChangePasswordcontroller.lastscene = "m1_mahmudullah_2230406/it_accesslogs";
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

        tableview.getItems().setAll(messageList);
    }

    public static List<ItAccessLogs_Model> messageList = new ArrayList<>();
    static {
        messageList.add(new ItAccessLogs_Model("aumio@gmail.com","Sub Inspector",LocalDate.of(2025,4,5)));
        messageList.add(new ItAccessLogs_Model("mahmud@gmail.com","Officer In Charge",LocalDate.of(2025,4,6)));
        messageList.add(new ItAccessLogs_Model("rahie11@gmail.com","Administrative Officer",LocalDate.of(2025,4,8)));
        messageList.add(new ItAccessLogs_Model("Omor99@gmail.com","Duty Officer ",LocalDate.of(2025,4,9)));
        messageList.add(new ItAccessLogs_Model("mahmudullah@gmail.com","HR and Training Officer",LocalDate.of(2025,4,9)));
        messageList.add(new ItAccessLogs_Model("Dipro@gmail.com","Criminal Records Manager",LocalDate.of(2025,4,10)));
        messageList.add(new ItAccessLogs_Model("rifat420@gmail.com","Complaint Registration Officer\n",LocalDate.of(2025,4,11)));

    }
}