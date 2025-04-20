package iub.gulshanmodelthana.m3_jannati_2330003;

import iub.gulshanmodelthana.common.AppendableObjectOutputStream;
import iub.gulshanmodelthana.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class FileFirController {

    @javafx.fxml.FXML
    private TextField FIRIDField;
    @javafx.fxml.FXML
    private TextArea FIRDetailsTextArea;
    @javafx.fxml.FXML
    private TextField complaintNameField;
    @javafx.fxml.FXML
    private DatePicker FIRDatepicker;


    @javafx.fxml.FXML
    public void submitbuttone(ActionEvent actionEvent) {
        String ID = FIRIDField.getText();
        String name = complaintNameField.getText();
        String details = FIRDetailsTextArea.getText();
        LocalDate date = FIRDatepicker.getValue();

        if (ID.isEmpty() || name.isEmpty() || details.isEmpty() || date == null) {
            showAlert();
            return;
        }

        FileFir_model FIR = new FileFir_model(ID, name, details, date);

        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            f = new File("data/FIR.bin");
            if (f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
            }
            else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(FIR);
            oos.close();

            System.out.println("FIR added successfully!");
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
        alert.setContentText("FIR added successfully!");
        alert.show();
        return;
    }
    private void showAlert() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setContentText("Please fill in all fields.");
        alert.show();
        return;
    }

    @javafx.fxml.FXML
    public void backToDashBoardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m3_jannati_2330003/user5Dashboard");
    }
}
