package iub.gulshanmodelthana.m2_aumio_2230328;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class SiCaseManagementController {

    @FXML
    private TableView<?> caseReviewTableView;

    @FXML
    private TableColumn<?, ?> crimeTypeTableColumn;

    @FXML
    private TextField crimeTypeTextField;

    @FXML
    private DatePicker dateOfIncidentDatePicker;

    @FXML
    private TableColumn<?, ?> dateOfIncidentTableColumn;

    @FXML
    private TableColumn<?, ?> suspectIDTableColumn;

    @FXML
    private TextField suspectIDTextField;

    @FXML
    private TableColumn<?, ?> suspectInformationURLTableColumn;

    @FXML
    private TextField suspectInformationURLTextField;

    @FXML
    private TableColumn<?, ?> suspectNameTableColumn;

    @FXML
    private TextField suspectNameTextFile;

    @FXML
    void backOnClick(ActionEvent event) {

    }

    @FXML
    void fileCaseOnClick(ActionEvent event) {

    }

    @FXML
    void selectCaseOnClick(ActionEvent event) {

    }

}
