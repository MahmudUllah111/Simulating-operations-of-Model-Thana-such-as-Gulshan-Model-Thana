package iub.gulshanmodelthana.m3_jannati_2330003;

import iub.gulshanmodelthana.common.AppendableObjectOutputStream;
import iub.gulshanmodelthana.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class AssignPatrolTeamController {
    @FXML
    private TextArea patrolGoalTextArea;
    @FXML
    private DatePicker patrolDatePicker;
    @FXML
    private ComboBox officerBox;

    @FXML
    public void initialize() {
        officerBox.getItems().addAll(AssignPatrolTeam_model.getOfficers());
    }

    @FXML
    public void assignPatrolButton(ActionEvent actionEvent) {
        String patrolGoal = patrolGoalTextArea.getText();
        LocalDate date = patrolDatePicker.getValue();
        String officer = String.valueOf(officerBox.getValue());

        if (patrolGoal.isEmpty() || officer.isEmpty() || date == null) {
            showAlert();
            return;
        }

        AssignPatrolTeam_model patrol = new AssignPatrolTeam_model(date, patrolGoal, officer);

        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            f = new File("data/patrolAssign.bin");
            if (f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
            }
            else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(patrol);
            oos.close();

            System.out.println("Patrol added successfully!");
            success();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        } finally {
            try { if (oos != null) oos.close(); }
            catch (IOException ignored) {}
        }
    }


    private void success() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("Patrol added successfully!");
        alert.show();
        return;
    }
    private void showAlert() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setContentText("Please fill in all fields.");
        alert.show();
        return;
    }
    @FXML
    public void patrolBackToDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m3_jannati_2330003/user5Dashboard");
    }
}
