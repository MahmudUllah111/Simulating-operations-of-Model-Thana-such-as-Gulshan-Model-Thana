package iub.gulshanmodelthana.m2_aumio_2230328;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

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
    void backOnClick(ActionEvent event) {

    }

}