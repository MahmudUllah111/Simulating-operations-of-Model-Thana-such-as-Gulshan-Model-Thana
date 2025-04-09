package iub.gulshanmodelthana.m2_aumio_2230328;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class AdminPersonnelController {

    @FXML
    private TableColumn<?, ?> officerIDTableColumn;

    @FXML
    private TableColumn<?, ?> officerNameTableColumn;

    @FXML
    private TableView<?> personnelTableView;

    @FXML
    private TableColumn<?, ?> resultTableColumn;

    @FXML
    private TableColumn<?, ?> trainingNameTableColumn;

    @FXML
    private ComboBox<?> trainingStatusComboBox;

    @FXML
    private TableColumn<?, ?> trainingStatusTableColumn;

    @FXML
    void backOnClick(ActionEvent event) {

    }

    @FXML
    void filterByTrainingStatusOnClick(ActionEvent event) {

    }

}