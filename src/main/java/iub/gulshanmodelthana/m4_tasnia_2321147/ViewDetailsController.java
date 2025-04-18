package packaged.dashboard_one;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewDetailsController {

    @FXML
    private Label lbl_details;

    @FXML
    private TextField tf_id;

    @FXML
    void onHomebutton(ActionEvent event) throws IOException {

        Parent p = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Scene s = new Scene(p);
        Stage stg = (Stage)((Node)event.getSource()).getScene().getWindow();
        stg.setScene(s);
        stg.show();

    }

}
