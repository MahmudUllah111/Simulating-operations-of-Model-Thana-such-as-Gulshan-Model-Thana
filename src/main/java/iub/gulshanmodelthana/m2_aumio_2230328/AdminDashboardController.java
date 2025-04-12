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

public class AdminDashboardController {

    @FXML
    private ImageView imageInbox;

    @FXML
    private ImageView imageNotice;

    @FXML
    private ImageView imageUser;

    @FXML
    void financeOnClick(ActionEvent event) {

    }

    @FXML
    void inventoryOnClick(ActionEvent event) {

    }

    @FXML
    void leagalDocumentsOnCLick(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("m2_aumio_2230328/admin_legal_documents.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Legal Documents");
        stage.setScene(nextScene);
        stage.show();

    }

    @FXML
    void logClick(MouseEvent event) {

    }

    @FXML
    void logOutOnCLick(ActionEvent event) {

    }

    @FXML
    void mailClick(MouseEvent event) {

    }

    @FXML
    void maintainanceOnClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("m2_aumio_2230328/admin_maintainance.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Maintainance");
        stage.setScene(nextScene);
        stage.show();

    }

    @FXML
    void monthlyReportOnClick(ActionEvent event) {

    }

    @FXML
    void notClick(MouseEvent event) {

    }

    @FXML
    void noticesOnClick(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("m2_aumio_2230328/admin_notices.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Notices");
        stage.setScene(nextScene);
        stage.show();

    }

    @FXML
    void personnelOnClick(ActionEvent event) {

    }

    @FXML
    void vehicleOnCLick(ActionEvent event) {

    }

    @Deprecated
    public void legalDocumentsOnCLick(ActionEvent actionEvent) {
    }
}