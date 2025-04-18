package packaged.dashboard_one;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AssignOfficerController {

    @FXML
    private TableView<?> table_view;

    @FXML
    private TableColumn<?, ?> tc_branch;

    @FXML
    private TableColumn<?, ?> tc_id;

    @FXML
    private TableColumn<?, ?> tc_name;

    @FXML
    private TextField tf_assign;

    @FXML
    private TableColumn<?, ?> tc_case;

    @FXML
    void onAssignbutton(ActionEvent event) {

    }

    @FXML
    void onHomebutton(ActionEvent event) throws IOException {
        Parent p = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Scene s = new Scene(p);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow();
        stg.setScene(s);
        stg.show();

    }

}
