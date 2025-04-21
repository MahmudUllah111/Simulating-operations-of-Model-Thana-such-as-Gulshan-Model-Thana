package iub.gulshanmodelthana.m4_tasnia_2321147;

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

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AssignOfficerController implements Initializable {

    @FXML
    private TableView<AssignedOfficer> table_view;

    @FXML
    private TableColumn<AssignedOfficer , String> tc_branch;

    @FXML
    private TableColumn<AssignedOfficer, String> tc_id;

    @FXML
    private TableColumn<AssignedOfficer , String> tc_name;

    @FXML
    private TextField tf_assign;

    @FXML
    private TableColumn<AssignedOfficer , String> tc_case;


    ObservableList item_list;

    @FXML
    void onAssignbutton(ActionEvent event) {
        String name = tc_name.getText();
        String id = tc_id.getText();
        String branch = tc_branch.getText();
        String status = tc_case.getText();

        AssignedOfficer officer = new AssignedOfficer(name, id, branch, status);
        item_list.add(new AssignedOfficer(name, id, branch, status));





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

        tc_name.setCellValueFactory(new PropertyValueFactory("name"));
        tc_id.setCellValueFactory(new PropertyValueFactory("id"));
        tc_branch.setCellValueFactory(new PropertyValueFactory("branch"));
        tc_case.setCellValueFactory(new PropertyValueFactory("status"));

        item_list= table_view.getItems();


    }
}
