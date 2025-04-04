package iub.gulshanmodelthana.m2_aumio_2230328;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

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
    void backOnClick(ActionEvent event) {

    }

    @FXML
    void denyOnClick(ActionEvent event) {

    }

}