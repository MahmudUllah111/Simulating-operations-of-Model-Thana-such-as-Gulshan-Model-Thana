package iub.gulshanmodelthana.common;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class ProfileChangePasswordcontroller {

    @FXML
    private Label labName;

    @FXML
    private Label roleName;

    public static String lastscene = null;

    @FXML
    void backButton(ActionEvent event) throws IOException {
    SceneSwitcher.switchTo(lastscene);
    }

    @FXML
    void changeCurrentPasswordbutton(ActionEvent event) throws IOException {
      SceneSwitcher.switchTo("common/setting");
    }

    @FXML
    public void initialize() {
        labName.setText(Session.email);
        roleName.setText(Session.role);
    }

}

