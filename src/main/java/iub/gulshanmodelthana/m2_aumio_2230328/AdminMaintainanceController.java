package iub.gulshanmodelthana.m2_aumio_2230328;

import iub.gulshanmodelthana.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminMaintainanceController {

    @FXML
    private TextField assignPersonnelForMaintainanceTextField;

    @FXML
    private TableColumn<?, ?> assignedPersonnelIDTableColumn;

    @FXML
    private TextField assignedPersonnelIDTextField;

    @FXML
    private TableColumn<?, ?> assignedPersonnelNameTableColumn;

    @FXML
    private TableView<?> maintainanceRequestsTavleView;

    @FXML
    private TextField maintainanceStatusTextField;

    @FXML
    private TableColumn<?, ?> maintainanceTypeTableColumn;

    @FXML
    private TextField maintainanceTypeTextField;

    @FXML
    private TableColumn<?, ?> statusTableColumn;

    @FXML
    void archiveSelectedRequestOnClick(ActionEvent event) {

    }

    @FXML
    void backOnClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("m2_aumio_2230328/si_dashboard.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("dashboard");
        stage.setScene(nextScene);
        stage.show();

    }

    @FXML
    void issueAMaintainanceRequestOnClick(ActionEvent event) {

    }

}