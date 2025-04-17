package iub.gulshanmodelthana.m2_aumio_2230328;

import iub.gulshanmodelthana.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class AdminLegalDocumentsController {

    @FXML
    private TableColumn<AdminLegalDocumentsModel,String> caseNoTableColumn;

    @FXML
    private TextField caseNumberTextField;

    @FXML
    private TableColumn<AdminLegalDocumentsModel,String> documentTableColumn;

    @FXML
    private TextArea documentTextArea;

    @FXML
    private ComboBox<String> documentTypeComboBox;

    @FXML
    private TableColumn<AdminLegalDocumentsModel,String> documentTypeTaableColumn;

    @FXML
    private TableView<AdminLegalDocumentsModel> documentsTableView;

    @FXML
    private DatePicker issueDateDatePicker;

    @FXML
    private TableColumn<AdminLegalDocumentsModel,String> issueDateTableColumn;

    @FXML
    private ComboBox<String> statusComboBox;

    @FXML
    private TableColumn<AdminLegalDocumentsModel,String> statusTableColumn;

    @FXML
    void backOnClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("m2_aumio_2230328/Admin_dashboard.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("dashboard");
        stage.setScene(nextScene);
        stage.show();

    }

    @FXML
    void uploadDocumentOnClick(ActionEvent event) {
        String type = documentTypeComboBox.getValue();
        String number = caseNumberTextField.getText();
        LocalDate date = issueDateDatePicker.getValue();
        String status = statusComboBox.getValue();
        String document = documentTextArea.getText();

        if(type.isEmpty()||number.isEmpty()||date==null||status.isEmpty()||document.isEmpty()){

            Alert warning = new Alert(Alert.AlertType.ERROR);
            warning.setContentText("Please fill in all fields.");
            warning.show();
            return;
        }

        AdminLegalDocumentsModel newDocument = new AdminLegalDocumentsModel(type,number,date,status,document);
        documentsTableView.getItems().add(newDocument);



    }

    @FXML
    void initialize(){

        documentTypeComboBox.getItems().addAll("case","Bail Application","Notices","Evidence","Report","Leave Application","Application","Other");
        statusComboBox.getItems().addAll("Active","Accepted","denied");


        documentTypeTaableColumn.setCellValueFactory(new PropertyValueFactory<>("type"));
        caseNoTableColumn.setCellValueFactory(new PropertyValueFactory<>("number"));
        issueDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        documentTableColumn.setCellValueFactory(new PropertyValueFactory<>("document"));

    }

}
