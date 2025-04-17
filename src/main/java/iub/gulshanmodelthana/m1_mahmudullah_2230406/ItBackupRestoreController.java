package iub.gulshanmodelthana.m1_mahmudullah_2230406;

import iub.gulshanmodelthana.common.ProfileChangePasswordcontroller;
import iub.gulshanmodelthana.common.SceneSwitcher;
import iub.gulshanmodelthana.common.Session;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;


import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ItBackupRestoreController {

    @FXML
    private TableColumn<ItBackupRestore_Model, String> backupfilecontenttablecolumn;

    @FXML
    private TextArea backupfiletextarea;

    @FXML
    private DatePicker datePicker;

    @FXML
    private TableColumn<ItBackupRestore_Model, LocalDate> datetablecolumn;

    @FXML
    private TextField filenameTextField;

    @FXML
    private TableColumn<ItBackupRestore_Model, String> filenametablecolumn;

    @FXML
    private ImageView imageUser;

    @FXML
    private Label labName;

    @FXML
    private TableView<ItBackupRestore_Model> tableview;

    @FXML
    private Label warninglabel;

    @FXML
    void backMessage(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("m1_mahmudullah_2230406/it_dashboard");
    }

    @FXML
    void logClick(MouseEvent event) throws IOException {
        ProfileChangePasswordcontroller.lastscene = "m1_mahmudullah_2230406/it_backuprestore";
        SceneSwitcher.switchTo("common/profile_change_password");
    }

    @FXML
    void mailClick(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("common/contact");
    }

    @FXML
    void notClick(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("common/notification");
    }

    @FXML
    void restorebutton(ActionEvent event) {
        ItBackupRestore_Model selectedFile = tableview.getSelectionModel().getSelectedItem();

        if (selectedFile != null) {
            backupfiletextarea.setText(selectedFile.getFilecontent());
            filenameTextField.setText(selectedFile.getFilename());
            datePicker.setValue(selectedFile.getDate());
            warninglabel.setText(" Backup restored.");
            warninglabel.setStyle("-fx-border-color: green");
        }
        else {
            warninglabel.setText(" Please select a backup to restore.");
            warninglabel.setStyle("-fx-border-color: red");
        }
    }

    @FXML
    public void createbackupfilebutton(ActionEvent actionEvent) {

        String name = filenameTextField.getText();
        String content = backupfiletextarea.getText();
        LocalDate date = datePicker.getValue();

        if (name.isEmpty() || content.isEmpty() || date == null) {
            warninglabel.setText(" Fill all fields!");
            warninglabel.setStyle("-fx-border-color: red");
            return;
        }

        try {
            FileWriter writer = new FileWriter(name + ".txt");
            writer.write(content);
            writer.close();

            ItBackupRestore_Model file = new ItBackupRestore_Model(name, content, date);
            tableview.getItems().add(file);
            warninglabel.setText(" Backup created successfully.");
            warninglabel.setStyle("-fx-border-color: green");

            backupfiletextarea.clear();
            filenameTextField.clear();
        }
        catch (Exception e) {
            warninglabel.setText(" Export failed!");
            warninglabel.setStyle("-fx-border-color: red");
        }
    }

    @FXML
    void initialize() {
        labName.setText(Session.email);

        filenametablecolumn.setCellValueFactory(new PropertyValueFactory<>("filename"));
        backupfilecontenttablecolumn.setCellValueFactory(new PropertyValueFactory<>("filecontent"));
        datetablecolumn.setCellValueFactory(new PropertyValueFactory<>("date"));

        tableview.getItems().setAll(messageList);
    }

    public static List<ItBackupRestore_Model> messageList = new ArrayList<>();
    static {
        messageList.add(new ItBackupRestore_Model("Backupv1","Access logs and password backup file",LocalDate.of(2025,3,1)));
        messageList.add(new ItBackupRestore_Model("Backupv2","Registration data file backup",LocalDate.of(2025,4,1)));
    }
}