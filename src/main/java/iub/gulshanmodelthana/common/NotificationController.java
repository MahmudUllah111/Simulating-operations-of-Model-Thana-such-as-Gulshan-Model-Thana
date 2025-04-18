package iub.gulshanmodelthana.common;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class NotificationController {

    @FXML
    private ImageView imageUser;

    @FXML
    private Label labName;

    @FXML
    private TableColumn<Notification_Model, String> typecolumn;

    @FXML
    private TableColumn<Notification_Model, String> notificationcolumn;

    @FXML
    private TableView<Notification_Model> tableview;

    @FXML
    private TableColumn<Notification_Model, LocalTime> timecolumn;

    @FXML
    private TableColumn<Notification_Model, LocalDate> datecolumn;
    @FXML
    private AnchorPane paneLog;

    @FXML
    void logClick(MouseEvent event) throws IOException {
        ProfileChangePasswordcontroller.lastscene = "common/notification";
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
    void outClick(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("common/login");
    }

    @FXML
    public void initialize() {
        labName.setText(Session.email);

        notificationcolumn.setCellValueFactory(new PropertyValueFactory<>("notification"));
        typecolumn.setCellValueFactory(new PropertyValueFactory<>("type"));
        timecolumn.setCellValueFactory(new PropertyValueFactory<>("time"));
        datecolumn.setCellValueFactory(new PropertyValueFactory<>("date"));

        tableview.getItems().setAll(messageList);
    }

    public static List<Notification_Model> messageList = new ArrayList<>();
    static {
        messageList.add(new Notification_Model("Meeting with Mahmud", "Meeting", LocalTime.of(10,0), LocalDate.of(2025,4,10)));
        messageList.add(new Notification_Model("Submit your papers", "Notice", LocalTime.of(9,0), LocalDate.of(2025, 4, 11)));
        messageList.add(new Notification_Model("System update scheduled", "System Update", LocalTime.of(8, 30), LocalDate.of(2025, 4, 12)));
        messageList.add(new Notification_Model("Admin issue resolved", "Issue Solved", LocalTime.of(12, 45), LocalDate.of(2025, 4, 13)));
    }

}
