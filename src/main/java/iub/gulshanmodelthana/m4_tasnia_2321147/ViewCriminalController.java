package iub.gulshanmodelthana.m4_tasnia_2321147;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ViewCriminalController implements Initializable {

    @FXML
    private TableView<Criminals> table_view;

    @FXML
    private TableColumn<Criminals, String> tc_crime;

    @FXML
    private TableColumn<Criminals, String> tc_date;

    @FXML
    private TableColumn<Criminals, String> tc_id;

    @FXML
    private TableColumn<Criminals, String> tc_name;

    @FXML
    private TableColumn<Criminals, String> tc_officer;

    ObservableList<Criminals> criminal_list = FXCollections.observableArrayList();


    @FXML
    private TextField tf_search;

    @FXML
    void onDeletebutton(ActionEvent event) {
        Criminals selectedCriminal = table_view.getSelectionModel().getSelectedItem();
        if (selectedCriminal != null) {
            criminal_list.remove(selectedCriminal);
            saveDataToFile("Criminals.txt");
            table_view.setItems(criminal_list);
        }

    }

    @FXML
    void onEditbutton(ActionEvent event) {
        saveDataToFile("Criminals.txt");
    }

    private void saveDataToFile(String filename) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (Criminals criminal : criminal_list) {
                String line = criminal.getName() + " " + criminal.getId() + " " + criminal.getType()
                        + " " + criminal.getAssigned() + " " + criminal.getDate();
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @FXML
    void onSearchbutton(ActionEvent event) {

        String searchTerm = tf_search.getText().trim().toLowerCase();
        ObservableList<Criminals> filteredList = FXCollections.observableArrayList();

        if (!searchTerm.isEmpty()) {
            for (Criminals criminal : criminal_list) {
                if (criminal.getName().toLowerCase().contains(searchTerm) ||
                        criminal.getId().toLowerCase().contains(searchTerm) ||
                        criminal.getType().toLowerCase().contains(searchTerm) ||
                        criminal.getAssigned().toLowerCase().contains(searchTerm) ||
                        criminal.getDate().toLowerCase().contains(searchTerm)) {

                    filteredList.add(criminal);
                }
            }
            table_view.setItems(filteredList);
        } else {
            table_view.setItems(criminal_list);
        }

    }

    @FXML
    void onHomebutton(ActionEvent event) throws IOException {
        Parent p = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Scene s = new Scene(p);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow();
        stg.setScene(s);
        stg.show();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        String filename = "Criminals.txt";

        try (Scanner s = new Scanner(new FileReader(filename))) {
            while (s.hasNext()) {
                if (!s.hasNext()) break;
                String name = s.next();
//                System.out.println(userid);

                if (!s.hasNext()) break;
                String id = s.next();
//                System.out.println(password);

                if (!s.hasNext()) break;
                String crime = s.next();

                if (!s.hasNext()) break;
                String officer= s.next();

                if (!s.hasNext()) break;
                String date = s.next();

            }

        } catch (FileNotFoundException e) {
//            lbl_error.setText("Login file not found.");
        } catch (IOException e) {
//            lbl_error.setText("Error loading page.");
        }


        tc_name.setCellValueFactory(new PropertyValueFactory<>("name"));
        tc_id.setCellValueFactory(new PropertyValueFactory<>("id"));
        tc_crime.setCellValueFactory(new PropertyValueFactory<>("type"));
        tc_officer.setCellValueFactory(new PropertyValueFactory<>("assigned"));
        tc_date.setCellValueFactory(new PropertyValueFactory<>("date"));





    }
}
