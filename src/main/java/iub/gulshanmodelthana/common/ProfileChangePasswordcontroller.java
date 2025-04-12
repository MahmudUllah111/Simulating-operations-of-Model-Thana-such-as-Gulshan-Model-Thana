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
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("common/setting.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Gulshan Model Thana");
        stage.setScene(nextScene);
        stage.show();
    }

    @FXML
    public void initialize() {
        labName.setText(Session.email);
        roleName.setText(Session.role);
    }

}

