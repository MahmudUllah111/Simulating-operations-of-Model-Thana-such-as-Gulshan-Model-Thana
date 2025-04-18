package iub.gulshanmodelthana.m3_jannati_2330003;

import iub.gulshanmodelthana.common.AppendableObjectOutputStream;
import iub.gulshanmodelthana.common.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.time.LocalDate;

public class NewGDController {
    @FXML
    private TextField GDIDField;
    @FXML
    private TextArea GDDetailsTextArea;
    @FXML
    private TextField complaintNameField;
    @FXML
    private TextField ContactNoField;
    @FXML
    private DatePicker gdDatepicker;
    @FXML
    private TableColumn<NewGD_model, String> gdIdTableColumn;
    @FXML
    private TableColumn<NewGD_model, String> complaintNameTableColumn;
    @FXML
    private TableColumn<NewGD_model, String> contactNoTableColumn;
    @FXML
    private TableColumn<NewGD_model, String> gdDateColumn;
    @FXML
    private TableColumn<NewGD_model, String> gdDetailsTableColumn;
    @FXML
    private TableView<NewGD_model> gdListTable;
    private ObservableList<NewGD_model> GDList = FXCollections.observableArrayList();
    

    @FXML
    public void initialize() {
        gdIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("ID"));
        complaintNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        contactNoTableColumn.setCellValueFactory(new PropertyValueFactory<>("contact"));
        gdDateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        gdDetailsTableColumn.setCellValueFactory(new PropertyValueFactory<>("details"));
        GDList = getGD();
        gdListTable.setItems(GDList);
    }


    @FXML
    public void saveGdButton(ActionEvent actionEvent) {
        String ID = GDIDField.getText();
        String name = complaintNameField.getText();
        String contact = ContactNoField.getText();
        String details = GDDetailsTextArea.getText();
        LocalDate date = gdDatepicker.getValue();

        if (ID.isEmpty() || name.isEmpty() || contact.isEmpty() || details.isEmpty() || date == null) {
            showAlert();
            return;
        }

        NewGD_model GD = new NewGD_model(ID, name, contact, details, date);

        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            f = new File("data/GD.bin");
            if (f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
            }
            else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(GD);
            oos.close();

            System.out.println("GD added successfully!");
            success();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        } finally {
            try { if (oos != null) oos.close(); }
            catch (IOException ignored) {}
        }

        GDList.add(GD);
    }

    private ObservableList<NewGD_model> getGD() {
        ObservableList<NewGD_model> GDList = FXCollections.observableArrayList();
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        String path = "data/GD.bin";
        try {
            f = new File(path);
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            NewGD_model temp = null;
            try{
                while (true) {
                    temp = (NewGD_model) ois.readObject();
                    GDList.add(temp);
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
        return GDList;
    }


    private void success() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("GD added successfully!");
        alert.show();
        return;
    }

    private void showAlert() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setContentText("Please fill in all fields and select a role.");
        alert.show();
        return;
    }

    @FXML
    public void backToDashBoardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m3_jannati_2330003/DutyOfficerDashboard");
    }

}
