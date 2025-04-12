package iub.gulshanmodelthana.m1_mahmudullah_2230406;

import iub.gulshanmodelthana.HelloApplication;
import iub.gulshanmodelthana.common.SceneSwitcher;
import iub.gulshanmodelthana.common.Session;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class ItDashboardController {

    @FXML
    private ImageView imageUser;

    @FXML
    private Label labName;

    @FXML
    void accesslogsbutton(ActionEvent event) {

    }

    @FXML
    void backupbutton(ActionEvent event) {

    }

    @FXML
    void logClick(MouseEvent event) {

    }

    @FXML
    void mailClick(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("contact");
    }

    @FXML
    void monitorbutton(ActionEvent event) {

    }

    @FXML
    void notClick(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("notification");
    }

    @FXML
    void outClick(MouseEvent event) {

    }

    @FXML
    void registerlogsbutton(ActionEvent event) {

    }

    @FXML
    void sandAction(MouseEvent event) {

    }

    @FXML
    void unusuallogsbutton(ActionEvent event) {

    }

    @Deprecated
    void usermanagementbutton(ActionEvent event) {

    }

    @FXML
    public void initialize() {
        labName.setText(Session.email);
    }

}
