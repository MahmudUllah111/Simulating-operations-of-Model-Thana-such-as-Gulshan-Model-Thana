package iub.gulshanmodelthana.common;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

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
    void logClick(MouseEvent event) throws IOException {
      SceneSwitcher.switchTo("profile_change_password");
    }

    @FXML
    void mailClick(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("contact");

    }

    @FXML
    void notClick(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("notification");

    }

    @FXML
    void outClick(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("login");
    }

    @FXML
    void sandAction(MouseEvent event) {

    }

    @FXML
    public void initialize() {
        labName.setText(Session.email);

        notificationcolumn.setCellValueFactory(new PropertyValueFactory<>("notification"));
        typecolumn.setCellValueFactory(new PropertyValueFactory<>("type"));
        timecolumn.setCellValueFactory(new PropertyValueFactory<>("time"));
        datecolumn.setCellValueFactory(new PropertyValueFactory<>("date"));

    }

}
