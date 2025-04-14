package iub.gulshanmodelthana.m2_aumio_2230328;

import iub.gulshanmodelthana.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminNoticesController {

    @FXML
    private TableColumn<?, ?> noticeSenderTableColumn;

    @FXML
    private TextField noticeSubjectTextField;

    @FXML
    private TableColumn<?, ?> noticeTableColumn;

    @FXML
    private TextArea noticeTextArea;

    @FXML
    private TableView<?> noticesTableView;

    @FXML
    private DatePicker publicationDatePicker;

    @FXML
    private TableColumn<?, ?> publicationDateTableColumn;

    @FXML
    private TextField senderNameTextField;

    @FXML
    private TableColumn<?, ?> subjectTableColumn;

    @FXML
    void addNoticeONClick(ActionEvent event) {

    }

    @FXML
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

}