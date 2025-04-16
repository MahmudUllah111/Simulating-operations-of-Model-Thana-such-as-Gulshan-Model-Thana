package iub.gulshanmodelthana.m1_mahmudullah_2230406;

import iub.gulshanmodelthana.common.ProfileChangePasswordcontroller;
import iub.gulshanmodelthana.common.SceneSwitcher;
import iub.gulshanmodelthana.common.Session;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;


import java.io.IOException;

public class ItDashboardController {

    @FXML
    private ImageView imageUser;

    @FXML
    private Label labName;

    @FXML
    void logClick(MouseEvent event) throws IOException {
        ProfileChangePasswordcontroller.lastscene = "m1_mahmudullah_2230406/it_dashboard";
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
    void accesslogsbutton(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("m1_mahmudullah_2230406/it_accesslogs");
    }

    @FXML
    void backupbutton(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("m1_mahmudullah_2230406/it_backuprestore");
    }

    @FXML
    void monitorbutton(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("m1_mahmudullah_2230406/it_systemmonitor");
    }

    @FXML
    void registerlogsbutton(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("m1_mahmudullah_2230406/it_registerlogs");
    }

    @FXML
    void unusuallogsbutton(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("m1_mahmudullah_2230406/it_unusuallogs");
    }

    @FXML
    public void initialize() {
        labName.setText(Session.email);
    }

}
