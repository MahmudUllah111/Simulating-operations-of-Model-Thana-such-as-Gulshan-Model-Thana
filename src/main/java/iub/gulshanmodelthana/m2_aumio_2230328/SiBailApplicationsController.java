package iub.gulshanmodelthana.m2_aumio_2230328;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
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
    public void denyOnClick(ActionEvent actionEvent) {
    }

    @FXML
    public void approveOnClick(ActionEvent actionEvent) {
    }

    @FXML
    public void backOnClick(ActionEvent actionEvent) {
    }
}
