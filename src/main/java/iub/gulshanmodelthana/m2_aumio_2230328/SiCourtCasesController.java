package iub.gulshanmodelthana.m2_aumio_2230328;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class SiCourtCasesController {

    @FXML
    private TableColumn<?, ?> caseIDTableColumn;

    @FXML
    private TableColumn<?, ?> caseNameTableColumn;

    @FXML
    private TableColumn<?, ?> caseStatusTableColumn;

    @FXML
    private TableColumn<?, ?> caseTypeTableColumn;

    @FXML
    private TableView<?> ongoingCasesTableView;

    @FXML
    void backOnClick(ActionEvent event) {

    }

}