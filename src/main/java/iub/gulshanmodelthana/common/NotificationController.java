package iub.gulshanmodelthana.common;

import iub.gulshanmodelthana.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

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
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("common/profile_change_password.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Gulshan Model thana");
        stage.setScene(nextScene);
        stage.show();
    }

    @FXML
    void mailClick(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("common/contact.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Gulshan Model thana");
        stage.setScene(nextScene);
        stage.show();
    }

    @FXML
    void notClick(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("common/notification.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Gulshan Model thana");
        stage.setScene(nextScene);
        stage.show();
    }

    @FXML
    void outClick(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("common/login.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Gulshan Model Thana");
        stage.setScene(nextScene);
        stage.show();
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
