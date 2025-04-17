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
import java.util.ArrayList;
import java.util.List;


public class AdminNoticesController {

    @FXML
    private TableColumn<AdminNoticesModel,String> noticeSenderTableColumn;

    @FXML
    private TextField noticeSubjectTextField;

    @FXML
    private TableColumn<AdminNoticesModel,String> noticeTableColumn;

    @FXML
    private TextArea noticeTextArea;

    @FXML
    private TableView<AdminNoticesModel> noticesTableView;

    @FXML
    private DatePicker publicationDatePicker;

    @FXML
    private TableColumn<AdminNoticesModel,String> publicationDateTableColumn;

    @FXML
    private TextField senderNameTextField;

    @FXML
    private TableColumn<AdminNoticesModel,String> subjectTableColumn;

    public static List<AdminNoticesModel> messageList = new ArrayList<>();

    @FXML
    void addNoticeONClick(ActionEvent event) {
        String subject = noticeSubjectTextField.getText();
        String name =senderNameTextField.getText();
        LocalDate date = publicationDatePicker.getValue();
        String notice = noticeTextArea.getText();

        if(subject.isEmpty()||name.isEmpty()||date==null||notice.isEmpty()){
            Alert warning = new Alert(Alert.AlertType.ERROR);
            warning.setContentText("Please fill in all fields.");
            warning.show();
            return;

        }

        AdminNoticesModel newNotice = new AdminNoticesModel(subject, name, date, notice);
        noticesTableView.getItems().add(newNotice);


        Alert success = new Alert(Alert.AlertType.INFORMATION);
        success.setContentText("Notice added successfully.");
        success.show();






    }

    @Deprecated
    void archiveSelectedNoticeOnClick(ActionEvent event) {


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
    void initialize(){

        subjectTableColumn.setCellValueFactory(new PropertyValueFactory<>("subject"));
        noticeSenderTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        publicationDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        noticeTableColumn.setCellValueFactory(new PropertyValueFactory<>("notice"));

        noticesTableView.getItems().setAll(messageList);





    }

}