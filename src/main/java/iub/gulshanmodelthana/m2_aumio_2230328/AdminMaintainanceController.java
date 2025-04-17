package iub.gulshanmodelthana.m2_aumio_2230328;

import iub.gulshanmodelthana.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminMaintainanceController {

    @FXML
    private TextField assignPersonnelForMaintainanceTextField;

    @FXML
    private TableColumn<AdminMaintainanceModel,String> assignedPersonnelIDTableColumn;

    @FXML
    private TextField assignedPersonnelIDTextField;

    @FXML
    private TableColumn<AdminMaintainanceModel,String> assignedPersonnelNameTableColumn;

    @FXML
    private TableView<AdminMaintainanceModel> maintainanceRequestsTavleView;

    @FXML
    private TextField maintainanceStatusTextField;

    @FXML
    private TableColumn<AdminMaintainanceModel,String> maintainanceTypeTableColumn;

    @FXML
    private TextField maintainanceTypeTextField;

    @FXML
    private TableColumn<AdminMaintainanceModel,String> statusTableColumn;



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

        String type = maintainanceTypeTextField.getText();
        String status = maintainanceStatusTextField.getText();
        String name = assignPersonnelForMaintainanceTextField.getText();
        String ID = assignedPersonnelIDTextField.getText();


        if(type.isEmpty()||status.isEmpty()||name.isEmpty()||ID.isEmpty()){

            Alert warning = new Alert(Alert.AlertType.ERROR);
            warning.setContentText("Please fill in all fields.");
            warning.show();
            return;

        }


        AdminMaintainanceModel newMaintainance = new AdminMaintainanceModel(type,status,name,ID);
        maintainanceRequestsTavleView.getItems().add(newMaintainance);

    }


    @FXML
    void initialize(){

        maintainanceTypeTableColumn.setCellValueFactory(new PropertyValueFactory<>("type"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        assignedPersonnelNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        assignedPersonnelIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("ID"));
    }

}