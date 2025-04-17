package iub.gulshanmodelthana.m2_aumio_2230328;

import iub.gulshanmodelthana.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AdminPersonnelController {

    @FXML
    private TableColumn<AdminPersonnelModel,String> officerIDTableColumn;

    @FXML
    private TableColumn<AdminPersonnelModel,String> officerNameTableColumn;

    @FXML
    private TableView<AdminPersonnelModel> personnelTableView;

    @FXML
    private TableColumn<AdminPersonnelModel,String> resultTableColumn;

    @FXML
    private TableColumn<AdminPersonnelModel,String> trainingNameTableColumn;

    @FXML
    private TableColumn<AdminPersonnelModel,String> trainingStatusTableColumn;

    @FXML
    void backOnClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("m2_aumio_2230328/Admin_dashboard.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("dashboard");
        stage.setScene(nextScene);
        stage.show();

    }

    @FXML
    void initialize(){

        officerNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        officerIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("ID"));
        trainingNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("training"));
        trainingStatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        resultTableColumn.setCellValueFactory(new PropertyValueFactory<>("result"));

        personnelTableView.getItems().setAll(messageList);
    }

    public static List<AdminPersonnelModel> messageList =new ArrayList<>();
    static {

        messageList.add(new AdminPersonnelModel("Mahumudullah","2230406","parkour","too heavy body","failed"));
    }

}