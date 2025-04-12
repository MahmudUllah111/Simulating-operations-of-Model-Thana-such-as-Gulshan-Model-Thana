package iub.gulshanmodelthana.common;

import iub.gulshanmodelthana.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class NotificationController {

    @FXML
    private ImageView imageUser;

    @FXML
    private Label labName;

    @FXML
    private AnchorPane paneLog;
    @FXML
    private TableColumn<?, ?> typecolumn;
    @FXML
    private TableColumn<?, ?> notificationcolumn;
    @FXML
    private TableView<?> tableview;
    @FXML
    private TableColumn<?, ?> timecolumn;
    @FXML
    private TableColumn<?, ?> datecolumn;

    @FXML
    void logClick(MouseEvent event) {

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
    }

}
