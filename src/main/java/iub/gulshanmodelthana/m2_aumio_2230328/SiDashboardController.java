package iub.gulshanmodelthana.m2_aumio_2230328;

import iub.gulshanmodelthana.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class SiDashboardController {

    @FXML
    private ImageView dashboardImageView;

    @FXML
    private ImageView mailImageView;

    @FXML
    private ImageView notificationImageWiew;

    @FXML
    private ImageView userImageView;

    @FXML
    void arrestWarrentOnClick(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("m2_aumio_2230328/si_arrest_warrant.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Arrest Warrant");
        stage.setScene(nextScene);
        stage.show();
    }

    @FXML
    void bailApplicationOnClick(ActionEvent event) {


    }

    @FXML
    void caseManagementOnClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("m2_aumio_2230328/si_oc_case_management.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Case Management");
        stage.setScene(nextScene);
        stage.show();


    }

    @FXML
    void courtCasesOnClick(ActionEvent event) {

    }

    @FXML
    void evidenceLogsOnClick(ActionEvent event) {

    }

    @FXML
    void logClick(MouseEvent event) {

    }

    @FXML
    void logOutOnClick(ActionEvent event) {

    }

    @FXML
    void mailClick(MouseEvent event) {

    }

    @FXML
    void notClick(MouseEvent event) {

    }

    @FXML
    void petrolLogsOnCLick(ActionEvent event) {

    }

    @FXML
    void reportsOnClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("m2_aumio_2230328/si_oc_reports.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Reports");
        stage.setScene(nextScene);
        stage.show();

    }

    @FXML
    void sandAction(MouseEvent event) {

    }

    @FXML
    void suspectDatabaseOnClick(ActionEvent event) {

    }

}
