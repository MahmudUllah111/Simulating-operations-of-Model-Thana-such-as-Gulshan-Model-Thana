package packaged.dashboard_one;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private TableView<?> table_view;

    @FXML
    private TableColumn<?, ?> tc_crime;

    @FXML
    private TableColumn<?, ?> tc_date;

    @FXML
    private TableColumn<?, ?> tc_name;

    @FXML
    void addnew(ActionEvent event) throws IOException {
        Parent p = FXMLLoader.load(getClass().getResource("addcriminal.fxml"));
        Scene s = new Scene(p);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow();
        stg.setScene(s);
        stg.show();
    }

    @FXML
    void assignofficer(ActionEvent event) throws IOException {

        Parent p = FXMLLoader.load(getClass().getResource("assignofficer.fxml"));
        Scene s = new Scene(p);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow();
        stg.setScene(s);
        stg.show();

    }

    @FXML
    void criminal_records(ActionEvent event) throws IOException {
        Parent p = FXMLLoader.load(getClass().getResource("viewcriminal.fxml"));
        Scene s = new Scene(p);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow();
        stg.setScene(s);
        stg.show();

    }

    @FXML
    void exportrecords(ActionEvent event) {

    }

    @FXML
    void searchrecords(ActionEvent event) {

    }

    @FXML
    void viewdetails(ActionEvent event) throws IOException {

        Parent p = FXMLLoader.load(getClass().getResource("viewdetails.fxml"));
        Scene s = new Scene(p);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow();
        stg.setScene(s);
        stg.show();

    }

}
