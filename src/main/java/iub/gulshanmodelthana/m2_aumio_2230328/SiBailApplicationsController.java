package iub.gulshanmodelthana.m2_aumio_2230328;

import iub.gulshanmodelthana.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SiBailApplicationsController {

    @FXML
    private TableColumn<SiBailApplicationsModel,String> bailApplicantAccusedCrimeTableColumn;

    @FXML
    private TableColumn<SiBailApplicationsModel,String> bailApplicantNameTableColumn;

    @FXML
    private TableColumn<SiBailApplicationsModel,String> bailApplicantSuspectIDTableColumn;

    @FXML
    private TableView<SiBailApplicationsModel> pendingBailApplicationsTableView;

    @FXML
    private TableColumn<SiBailApplicationsModel,String> requestedBailDurationTableColumn;

    @FXML
    void approveOnClick(ActionEvent event) {

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
    void denyOnClick(ActionEvent event) {

    }

    @FXML
    void initialize(){

        bailApplicantNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        bailApplicantSuspectIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("ID"));
        bailApplicantAccusedCrimeTableColumn.setCellValueFactory(new PropertyValueFactory<>("accusedCrime"));
        requestedBailDurationTableColumn.setCellValueFactory(new PropertyValueFactory<>("duration"));

        pendingBailApplicationsTableView.getItems().setAll(messageList);


    }
    public static List<SiBailApplicationsModel> messageList = new ArrayList<>();
    static {
        messageList.add(new SiBailApplicationsModel("Shuharto","2230406","Over Speeding","2 Month"));
        messageList.add(new SiBailApplicationsModel("Aumio","2230328","Over Speeding","1 Month"));
        messageList.add(new SiBailApplicationsModel("Limon","2230598","Hit and Run in traffic","1 Month"));


    }

}