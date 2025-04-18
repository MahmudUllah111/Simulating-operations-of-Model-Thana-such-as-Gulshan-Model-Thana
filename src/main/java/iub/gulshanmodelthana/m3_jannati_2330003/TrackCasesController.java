package iub.gulshanmodelthana.m3_jannati_2330003;

import iub.gulshanmodelthana.common.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class TrackCasesController {
    @javafx.fxml.FXML
    private Label DetailsShowLabel;
    @javafx.fxml.FXML
    private TableColumn<FileFir_model, String> casseStatusTableColumn;
    @javafx.fxml.FXML
    private TableColumn<FileFir_model, String> caseIdTableColumn;
    @javafx.fxml.FXML
    private TextField caseIdSearch;
    @javafx.fxml.FXML
    private TableView<FileFir_model> caseTable;

    @FXML
    public void initialize() {
        casseStatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        caseIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("ID"));
        caseTable.getItems().addAll(getFIR());
    }

    public static ArrayList<FileFir_model> getFIR() {
        ArrayList<FileFir_model> FIRList = new ArrayList<>();
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        String path = "data/FIR.bin";
        try {
            f = new File(path);
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            FileFir_model temp = null;
            try{
                while (true) {
                    temp = (FileFir_model) ois.readObject();
                    FIRList.add(temp);
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
        return FIRList;
    }

    @javafx.fxml.FXML
    public void backToDashboardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m3_jannati_2330003/user5Dashboard");
    }

    @javafx.fxml.FXML
    public void showCaseDetailsButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void caseIdSearcjButton(ActionEvent actionEvent) {
        String search = caseIdSearch.getText();
        if (search.isEmpty()) {
            caseTable.getItems().clear();
            caseTable.getItems().addAll(getFIR());
            return;
        }
        ArrayList<FileFir_model> newList = new ArrayList<>();
        for (FileFir_model fir : getFIR()) {
            if (fir.getID().equals(search)) {
                newList.add(fir);
            }
        }
        caseTable.getItems().clear();
        caseTable.getItems().addAll(newList);
    }
}
