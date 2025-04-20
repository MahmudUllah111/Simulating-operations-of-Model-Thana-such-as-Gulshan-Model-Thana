package iub.gulshanmodelthana.m3_jannati_2330003;

import iub.gulshanmodelthana.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;

import javax.sound.midi.Track;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class DailyReportController {
    @FXML
    private DatePicker reportDatePicker;
    @FXML
    private TextArea reportTextArea;

    @FXML
    public void returnToDashBoardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m3_jannati_2330003/user5Dashboard");
    }

    @javafx.fxml.FXML
    public void generateReport(ActionEvent actionEvent) {
        LocalDate date = reportDatePicker.getValue();
        if (date == null) {
            showAlert();
            return;
        }


        ArrayList<NewGD_model> GDList = NewGDController.getGD();
        ArrayList<FileFir_model> FIRList = TrackCasesController.getFIR();
        ArrayList<AssignPatrolTeam_model> PatrolList = new ArrayList<>();
        ArrayList<SuspectEntry_model> SuspectList = new ArrayList<>();

        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        String path = "data/patrolAssign.bin";
        try {
            f = new File(path);
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            AssignPatrolTeam_model temp = null;
            try{
                while (true) {
                    temp = (AssignPatrolTeam_model) ois.readObject();
                    PatrolList.add(temp);
                }
            }
            catch (IOException | ClassNotFoundException e){
                System.out.println(e.toString());
            }
            System.out.println("End of file\n");
        } catch (IOException ex) {
            System.out.println(ex.toString());
        } finally {
            try { if (ois != null) ois.close(); }
            catch (IOException ignored) {}
        }

        File f2 = null;
        FileInputStream fis2 = null;
        ObjectInputStream ois2 = null;
        String path2 = "data/Suspect.bin";
        try {
            f2 = new File(path2);
            fis2 = new FileInputStream(f2);
            ois2 = new ObjectInputStream(fis2);
            SuspectEntry_model temp2 = null;
            try{
                while (true) {
                    temp2 = (SuspectEntry_model) ois2.readObject();
                    SuspectList.add(temp2);
                }
            }
            catch (IOException | ClassNotFoundException e){
                System.out.println(e.toString());
            }
            System.out.println("End of file\n");
        } catch (IOException ex) {
            System.out.println(ex.toString());
        } finally {
            try { if (ois2 != null) ois2.close(); }
            catch (IOException ignored) {}
        }

        System.out.println(GDList);
        System.out.println(FIRList);
        System.out.println(PatrolList);
        System.out.println(SuspectList);
        reportTextArea.clear();
        reportTextArea.appendText("Daily report:\n" + date.toString() + "\n");
        for (NewGD_model gd : GDList) {
            if (gd.getDate().equals(date)) {
                reportTextArea.appendText(gd.toString()+"\n");
            }
        }
        for (FileFir_model fir : FIRList) {
            if (fir.getDate().equals(date)) {
                reportTextArea.appendText(fir.toString()+"\n");
            }
        }
        for (AssignPatrolTeam_model patrol : PatrolList) {
            if (patrol.getDate().equals(date)) {
                reportTextArea.appendText(patrol.toString() + "\n");
            }
        }
        for (SuspectEntry_model suspect : SuspectList) {
            if (suspect.getDate().equals(date)) {
                reportTextArea.appendText(suspect.toString() + "\n");
            }
        }

    }

    private void showAlert() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setContentText("Please fill in all fields.");
        alert.show();
        return;
    }

}
