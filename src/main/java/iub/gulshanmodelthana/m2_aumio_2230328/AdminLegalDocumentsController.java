package iub.gulshanmodelthana.m2_aumio_2230328;

import iub.gulshanmodelthana.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

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
    void backOnClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("m2_aumio_2230328/si_dashboard.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("dashboard");
        stage.setScene(nextScene);
        stage.show();

    }

    @FXML
    void uploadDocumentOnClick(ActionEvent event) {

    }

}
