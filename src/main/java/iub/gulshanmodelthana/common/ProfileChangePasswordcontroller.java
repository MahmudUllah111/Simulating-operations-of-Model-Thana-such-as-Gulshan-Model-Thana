package iub.gulshanmodelthana.common;

import iub.gulshanmodelthana.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class ProfileChangePasswordcontroller {

    @FXML
    private Label labName;

    @FXML
    private Label roleName;

    @FXML
    void backButton(ActionEvent event) {

    }

    @FXML
    void changeCurrentPasswordbutton(ActionEvent event) throws IOException {
      SceneSwitcher.switchTo("setting");
    }

    @FXML
    public void initialize() {
        labName.setText(Session.email);
        roleName.setText(Session.role);
    }

}

