package iub.gulshanmodelthana.m3_jannati_2330003;

import iub.gulshanmodelthana.common.AppendableObjectOutputStream;
import iub.gulshanmodelthana.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class SuspectEntryController {
    @FXML
    private AnchorPane suspectNameTextField;
    @FXML
    private TextArea caseDetailssTextArea;
    @FXML
    private TableColumn<SuspectEntry_model, String> entryDateColumn;
    @FXML
    private DatePicker entryDatePicker;
    @FXML
    private TableColumn<SuspectEntry_model, String> suspectNameColumn;
    @FXML
    private TableColumn<SuspectEntry_model, String> caseDetailsColumn;
    @FXML
    private TextField suspectsNameTextField;
    @FXML
    private TableView<SuspectEntry_model> suspectListTableView;

    @FXML
    private void initialize(){
        suspectNameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        caseDetailsColumn.setCellValueFactory(new PropertyValueFactory<>("details"));
        entryDateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        suspectListTableView.getItems().addAll(getSuspects());
    }

    private ArrayList<SuspectEntry_model> getSuspects() {
        ArrayList<SuspectEntry_model> suspectList = new ArrayList<>();
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        String path = "data/Suspect.bin";
        try {
            f = new File(path);
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            SuspectEntry_model temp = null;
            try{
                while (true) {
                    temp = (SuspectEntry_model) ois.readObject();
                    suspectList.add(temp);
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
        return suspectList;
    }

    private void success() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("Suspect added successfully!");
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
    public void backToDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m3_jannati_2330003/user5Dashboard");
    }

    @javafx.fxml.FXML
    public void suspectEntrySubmitButton(ActionEvent actionEvent) {
        String name = suspectsNameTextField.getText();
        String details = caseDetailssTextArea.getText();
        LocalDate date = entryDatePicker.getValue();

        if (name.isEmpty() || details.isEmpty() || date == null) {
            showAlert();
            return;
        }

        SuspectEntry_model Suspect = new SuspectEntry_model(name, details, date);

        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            f = new File("data/Suspect.bin");
            if (f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
            }
            else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(Suspect);
            oos.close();

            System.out.println("Suspect added successfully!");
            success();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        } finally {
            try { if (oos != null) oos.close(); }
            catch (IOException ignored) {}
        }

        suspectListTableView.getItems().add(Suspect);
    }
}
