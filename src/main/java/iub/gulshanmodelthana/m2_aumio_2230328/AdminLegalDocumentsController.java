package iub.gulshanmodelthana.m2_aumio_2230328;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AdminLegalDocumentsController {

    @FXML
    private TableColumn<?, ?> caseNoTableColumn;

    @FXML
    private TextField caseNumberTextField;

    @FXML
    private TableColumn<?, ?> documentTableColumn;

    @FXML
    private TextArea documentTextArea;

    @FXML
    private ComboBox<?> documentTypeComboBox;

    @FXML
    private TableColumn<?, ?> documentTypeTaableColumn;

    @FXML
    private TableView<?> documentsTableView;

    @FXML
    private DatePicker issueDateDatePicker;

    @FXML
    private TableColumn<?, ?> issueDateTableColumn;

    @FXML
    private ComboBox<?> statusComboBox;

    @FXML
    private TableColumn<?, ?> statusTableColumn;

    @FXML
    void backOnClick(ActionEvent event) {

    }

    @FXML
    void uploadDocumentOnClick(ActionEvent event) {

    }

}
