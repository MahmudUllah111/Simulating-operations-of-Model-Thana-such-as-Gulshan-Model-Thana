package iub.gulshanmodelthana.m1_mahmudullah_2230406;

import iub.gulshanmodelthana.HelloApplication;
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

public class OcDashboardController {

    @FXML
    private ImageView imageUser;

    @FXML
    private Label labName;

    @FXML
    void assignmentbutton(ActionEvent event) {

    }

    @FXML
    void budgetproposalbutton(ActionEvent event) {

    }

    @FXML
    void cctvfootagebutton(ActionEvent event) {

    }

    @FXML
    void crimereportbutton(ActionEvent event) {

    }

    @FXML
    void externalcoordinationbutton(ActionEvent event) {

    }

    @FXML
    void leaverequestbutton(ActionEvent event) {

    }

    @FXML
    void ongoingcasesbutton(ActionEvent event) {

    }

    @FXML
    void onlinedatabasebutton(ActionEvent event) {

    }

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
