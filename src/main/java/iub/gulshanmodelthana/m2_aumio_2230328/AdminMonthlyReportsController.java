package iub.gulshanmodelthana.m2_aumio_2230328;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class AdminMonthlyReportsController {

    @FXML
    private TableColumn<?, ?> activityNameTableColumn;

    @FXML
    private TextField activityNameTextField;

    @FXML
    private TableColumn<?, ?> budgetSpentTableColumn;

    @FXML
    private TextField budgetSpentTextField;

    @FXML
    private DatePicker dateDatePicker;

    @FXML
    private TableColumn<?, ?> dateTableColumn;

    @FXML
    private TableView<?> monthlyActivitiesTableView;

    @FXML
    private TableColumn<?, ?> purposeTableColumn;

    @FXML
    private TextField purposeTextField;

    @FXML
    void baclOnClick(ActionEvent event) {

    }

    @FXML
    void genarateActivityOnClick(ActionEvent event) {

    }

}