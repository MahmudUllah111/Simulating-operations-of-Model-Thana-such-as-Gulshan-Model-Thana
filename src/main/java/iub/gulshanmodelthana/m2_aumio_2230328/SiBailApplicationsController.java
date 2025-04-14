package iub.gulshanmodelthana.m2_aumio_2230328;

import iub.gulshanmodelthana.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class SiBailApplicationsController {

    @FXML
    private TableColumn<?, ?> bailApplicantAccusedCrimeTableColumn;

    @FXML
    private TableColumn<?, ?> bailApplicantNameTableColumn;

    @FXML
    private TableColumn<?, ?> bailApplicantSuspectIDTableColumn;

    @FXML
    private TableView<?> pendingBailApplicationsTableView;

    @FXML
    private TableColumn<?, ?> requestedBailDurationTableColumn;

    @FXML
    void approveOnClick(ActionEvent event) {

    }

    @FXML
    void backOnClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("m2_aumio_2230328/si_dashboard.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("dashboard");
        stage.setScene(nextScene);
        stage.show();

    }

    @FXML
    void denyOnClick(ActionEvent event) {

    }

}