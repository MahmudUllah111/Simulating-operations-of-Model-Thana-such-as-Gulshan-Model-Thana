package packaged.dashboard_one;

import javafx.beans.Observable;
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

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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

    ObservableList criminal_list;


    @FXML
    private TextField tf_search;

    @FXML
    void onDeletebutton(ActionEvent event) {

    }

    @FXML
    void onEditbutton(ActionEvent event) {

    }

    @FXML
    void onSearchbutton(ActionEvent event) {

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

        criminal_list = table_view.getItems();

        tc_name.setCellValueFactory(new PropertyValueFactory("name"));
        tc_id.setCellValueFactory(new PropertyValueFactory("id"));
        tc_crime.setCellValueFactory(new PropertyValueFactory("type"));
        tc_officer.setCellValueFactory(new PropertyValueFactory("assigned"));
        tc_date.setCellValueFactory(new PropertyValueFactory("date"));




    }
}
