package iub.gulshanmodelthana.m3_jannati_2330003;

import iub.gulshanmodelthana.common.AppendableObjectOutputStream;
import iub.gulshanmodelthana.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class ScheduleTrainingSessionController {
    @javafx.fxml.FXML
    private TableColumn<TrainingRecords_module, String> sessionDateTableColumn;
    @javafx.fxml.FXML
    private TableView<TrainingRecords_module> sessionListTableView;
    @javafx.fxml.FXML
    private TableColumn<TrainingRecords_module, String> SessionTopicTableColumn;
    @javafx.fxml.FXML
    private TextField sesstionTopicTextField;
    @javafx.fxml.FXML
    private DatePicker sessionDatePicker;
    @javafx.fxml.FXML
    private ToggleGroup officerTG;
    @javafx.fxml.FXML
    private RadioButton ITRB;
    @javafx.fxml.FXML
    private RadioButton dutyRB;
    @javafx.fxml.FXML
    private RadioButton adminRB;
    @javafx.fxml.FXML
    private TextField goalTextField;
    @javafx.fxml.FXML
    private TextField IDTextField;

    @javafx.fxml.FXML
    public void initialize() {
        SessionTopicTableColumn.setCellValueFactory(new PropertyValueFactory<>("topic"));
        sessionDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        sessionListTableView.getItems().addAll(TrainingRecords_module.getAllRecords());
    }

    @javafx.fxml.FXML
    public void scheduleSessionButton(ActionEvent actionEvent) {
        String officer = "";
        if (dutyRB.isSelected()) {
            officer = "Duty Officer";
        }
        else if (ITRB.isSelected()){
            officer = "IT Officer";
        }
        else if (adminRB.isSelected()){
            officer = "Admin Officer";
        }
        LocalDate date = sessionDatePicker.getValue();
        String topic = sesstionTopicTextField.getText();
        String ID = IDTextField.getText();
        String goal = goalTextField.getText();

        if (officer.isEmpty() || date == null || topic.isEmpty() || ID.isEmpty() || goal.isEmpty()) {
            showAlert();
            return;
        }

        TrainingRecords_module newSession = new TrainingRecords_module(ID, topic, goal, officer, date, false);

        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            f = new File("data/TrainingRecord.bin");
            if (f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
            }
            else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(newSession);
            oos.close();

            System.out.println("Session added successfully!");
            success();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        } finally {
            try { if (oos != null) oos.close(); }
            catch (IOException ignored) {}
        }
        sessionListTableView.getItems().clear();
        sessionListTableView.getItems().addAll(TrainingRecords_module.getAllRecords());
    }

    @javafx.fxml.FXML
    public void backToDahsboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m3_jannati_2330003/user-6-dashboard");
    }

    private void showAlert(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setContentText("Please fill up all fields.");
        alert.show();
        return;
    }

    private void success() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("Session added successfully!");
        alert.show();
        return;
    }
}
