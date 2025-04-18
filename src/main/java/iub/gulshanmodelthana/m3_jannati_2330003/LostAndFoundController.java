package iub.gulshanmodelthana.m3_jannati_2330003;

import iub.gulshanmodelthana.common.AppendableObjectOutputStream;
import iub.gulshanmodelthana.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class LostAndFoundController {
    @FXML
    private TextField detailsTextField;
    @FXML
    private TextField nameTextField;

    @FXML
    public void returnToDashBoardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m3_jannati_2330003/user5Dashboard");
    }

    private void success() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("Lost item added successfully!");
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
    public void saveButton(ActionEvent actionEvent) {
        String name = nameTextField.getText();
        String details = detailsTextField.getText();

        if (name.isEmpty() || details.isEmpty()) {
            showAlert();
            return;
        }

        LostAndFound_model Lost = new LostAndFound_model(name, details);

        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            f = new File("data/LostAndFound.bin");
            if (f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
            }
            else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(Lost);
            oos.close();

            System.out.println("Lost item added successfully!");
            success();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        } finally {
            try { if (oos != null) oos.close(); }
            catch (IOException ignored) {}
        }
    }
}
