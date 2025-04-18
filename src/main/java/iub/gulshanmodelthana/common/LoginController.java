package iub.gulshanmodelthana.common;

import iub.gulshanmodelthana.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField emailtextfield;

    @FXML
    private PasswordField passwordtextfield;

    @FXML
    private ComboBox<String> roleComboBox;

    @FXML
    void loginbutton(ActionEvent event) throws IOException {
        String email = emailtextfield.getText();
        String password = passwordtextfield.getText();
        String selectedRole = roleComboBox.getValue();

        if (email.isEmpty() || password.isEmpty() || selectedRole == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please fill in all fields and select a role.");
            alert.show();
            return;
        }

        Session.email = email;
        Session.role = selectedRole;

        FXMLLoader fxmlLoader = null;
        switch (selectedRole) {
            case "Officer In Charge":
                fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("m1_mahmudullah_2230406/oc_dashboard.fxml"));
                break;
            case "IT Officer":
                fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("m1_mahmudullah_2230406/it_dashboard.fxml"));
                break;
            case "Sub Inspector":
                fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("m2_aumio_2230328/si_dashboard.fxml"));
                break;
            case "Administrative Officer":
                fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("m2_aumio_2230328/admin_dashboard.fxml"));
                break;
        }

        if (fxmlLoader != null) {
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("Gulshan Model Thana");
            stage.setScene(nextScene);
            stage.show();
        }
    }

    @FXML
    void signupbutton(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("common/signup");
    }

    @FXML
    void initialize(){
        roleComboBox.getItems().addAll("Officer In Charge","IT Officer",
                                            "Sub Inspector","Administrative Officer",
                                            "Duty Officer","Training Officer",
                                            "Criminal Records Manager","Complaint Registration Officer");

    }
}
