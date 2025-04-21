package iub.gulshanmodelthana.m3_jannati_2330003;

import iub.gulshanmodelthana.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ScheduleTrainingSessionController {
    @javafx.fxml.FXML
    private TableColumn sessionDateTableColumn;
    @javafx.fxml.FXML
    private TableView sessionListTableView;
    @javafx.fxml.FXML
    private TableColumn SessionTopicTableColumn;
    @javafx.fxml.FXML
    private TextField sesstionTopicTextField;
    @javafx.fxml.FXML
    private DatePicker sessionDatePicker;

    @javafx.fxml.FXML
    public void scheduleSessionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backToDahsboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m3_jannati_2330003/user-6-dashboard");
    }
}
