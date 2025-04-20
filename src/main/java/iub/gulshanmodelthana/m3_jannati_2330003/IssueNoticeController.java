package iub.gulshanmodelthana.m3_jannati_2330003;

import iub.gulshanmodelthana.common.AppendableObjectOutputStream;
import iub.gulshanmodelthana.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class IssueNoticeController {
    @javafx.fxml.FXML
    private TextArea noticeTextArea;

    @javafx.fxml.FXML
    public void backToDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m3_jannati_2330003/user5Dashboard");
    }

    @javafx.fxml.FXML
    public void newNoticeButton(ActionEvent actionEvent) {
        noticeTextArea.clear();
    }

    @javafx.fxml.FXML
    public void generateNoticeButton(ActionEvent actionEvent) {
        String notice = noticeTextArea.getText();
        if (notice.isEmpty()) {
            showAlert();
            return;
        }

        IssueNotice_model Notice = new IssueNotice_model(notice);
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            f = new File("data/Notice.bin");
            if (f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
            }
            else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(Notice);
            oos.close();

            System.out.println("Notice added successfully!");
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
        alert.setContentText("Notice added successfully!");
        alert.show();
        return;
    }

    private void showAlert() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setContentText("Please fill in all fields and select a role.");
        alert.show();
        return;
    }

}
