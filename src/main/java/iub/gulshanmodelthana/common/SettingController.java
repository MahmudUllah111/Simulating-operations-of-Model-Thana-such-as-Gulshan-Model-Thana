package iub.gulshanmodelthana.common;

import iub.gulshanmodelthana.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class SettingController {

    @FXML
    private PasswordField enConfirmPassword;

    @FXML
    private PasswordField enCurrentPassword;

    @FXML
    private PasswordField enNewPassword;

    @FXML
    private ImageView imageUser;

    @FXML
    private ImageView imageUser2;

    @FXML
    private Label labName;

    @FXML
    private Label labName2;

    @FXML
    private AnchorPane paneLog;

    @FXML
    private AnchorPane paneSide;
    @FXML
    private Label labWarning;

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
        stage.setTitle("Create Account");
        stage.setScene(nextScene);
        stage.show();
    }

    @FXML
    void sandAction(MouseEvent event) {

    }

    @FXML
    void saveClick(MouseEvent event) {
        String currentPassword = enCurrentPassword.getText();
        String newPassword = enNewPassword.getText();
        String confirmPassword = enConfirmPassword.getText();

        if (currentPassword.isEmpty() || newPassword.isEmpty() || confirmPassword.isEmpty()) {
            labWarning.setText(" Please fill all the fields.");
            labWarning.setTextFill(Color.RED);
            labWarning.setStyle("-fx-border-color: red");
            labWarning.setVisible(true);
            return;
        }

        if (!newPassword.equals(confirmPassword)) {
            labWarning.setText(" Passwords do not match.");
            labWarning.setTextFill(Color.RED);
            labWarning.setStyle("-fx-border-color: red");
            labWarning.setVisible(true);
            return;
        }

        System.out.println("Previous Password: " + currentPassword);
        System.out.println("New Password: " + newPassword);
        labWarning.setText(" Password updated successfully.");
        labWarning.setTextFill(Color.GREEN);
        labWarning.setStyle("-fx-border-color: green");
        labWarning.setVisible(true);

    }
    @FXML
    public void initialize() {
        labName.setText(Session.email);
        labName2.setText(Session.email);
    }

}
