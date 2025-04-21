package iub.gulshanmodelthana.m3_jannati_2330003;

import iub.gulshanmodelthana.common.AppendableObjectOutputStream;
import iub.gulshanmodelthana.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TrainingRecordsController {
    @FXML
    private TableColumn<TrainingRecords_module, String> goalToAchieveTableColumn;
    @FXML
    private TableColumn<TrainingRecords_module, String> topicTableColumn;
    @FXML
    private TableColumn<TrainingRecords_module, String> trainingIDtableColumn;
    @FXML
    private TableView<TrainingRecords_module> trainingRecordsTableView;
    @FXML
    private TableColumn<TrainingRecords_module, String> dateOfTrainingTableColumn;
    @FXML
    private TableColumn<TrainingRecords_module, String> statusTableColumn;

    @FXML
    public void initialize() {
        trainingIDtableColumn.setCellValueFactory(new PropertyValueFactory<>("ID"));
        topicTableColumn.setCellValueFactory(new PropertyValueFactory<>("topic"));
        goalToAchieveTableColumn.setCellValueFactory(new PropertyValueFactory<>("goal"));
        dateOfTrainingTableColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("doneStatus"));
        trainingRecordsTableView.getItems().addAll(TrainingRecords_module.getAllRecords());
    }

    @FXML
    public void doneOnClick(ActionEvent actionEvent) {
        TrainingRecords_module doneRecord = trainingRecordsTableView.getSelectionModel().getSelectedItem();
        if (doneRecord == null) {
            showAlert();
            return;
        }

        ArrayList<TrainingRecords_module> trainList = TrainingRecords_module.getAllRecords();
        for (TrainingRecords_module rec : trainList) {
            if (rec.getID().equals(doneRecord.getID())) {
                rec.setDoneStatus(true);
            }
        }

        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            f = new File("data/TrainingRecord.bin");
            if (f.exists()){
                f.delete();
            }
            fos = new FileOutputStream(f);
            oos = new ObjectOutputStream(fos);
            for (TrainingRecords_module train : trainList) {
                oos.writeObject(train);
            }
            oos.close();

            System.out.println("Record updated successfully!");
            success();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        } finally {
            try { if (oos != null) oos.close(); }
            catch (IOException ignored) {}
        }
        trainingRecordsTableView.getItems().clear();
        trainingRecordsTableView.getItems().addAll(trainList);
    }

    @FXML
    public void backToDashboardOnClick(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m3_jannati_2330003/user-6-dashboard");
    }

    private void showAlert(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setContentText("Please select a record.");
        alert.show();
        return;
    }

    private void success() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("Record updated successfully!");
        alert.show();
        return;
    }
}
