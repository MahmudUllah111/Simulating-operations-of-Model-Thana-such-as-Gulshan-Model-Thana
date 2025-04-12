package iub.gulshanmodelthana.m2_aumio_2230328;

import iub.gulshanmodelthana.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
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
    void bailApplicationOnClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("m2_aumio_2230328/si_bail_applications.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Bail Applications");
        stage.setScene(nextScene);
        stage.show();


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
    void courtCasesOnClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("m2_aumio_2230328/si_court_cases.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Court Cases");
        stage.setScene(nextScene);
        stage.show();


    }

    @FXML
    void evidenceLogsOnClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("m2_aumio_2230328/si_evidence_logs.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Evidence Logs");
        stage.setScene(nextScene);
        stage.show();


    }

    @FXML
    void logClick(MouseEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("common/profile_change_password.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Profile");
        stage.setScene(nextScene);
        stage.show();


    }

    @FXML
    void logOutOnClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("common/login.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Log Out");
        stage.setScene(nextScene);
        stage.show();

        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setContentText("You Have Logged Out.");
        alert.show();


    }

    @FXML
    void mailClick(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("common/contact.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Mail");
        stage.setScene(nextScene);
        stage.show();

    }

    @FXML
    void notClick(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("common/notification.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Petrol Logs");
        stage.setScene(nextScene);
        stage.show();

    }

    @FXML
    void petrolLogsOnCLick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("m2_aumio_2230328/si_petrol_logs.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Petrol Logs");
        stage.setScene(nextScene);
        stage.show();

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
    void suspectDatabaseOnClick(ActionEvent event) throws IOException  {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("m2_aumio_2230328/si_arrest_warrants_view.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Suspect Database");
        stage.setScene(nextScene);
        stage.show();

    }

}
