package iub.gulshanmodelthana.m2_aumio_2230328;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

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
    void backOnClick(ActionEvent event) {

    }

    @FXML
    void issueAMaintainanceRequestOnClick(ActionEvent event) {

    }

}