package iub.gulshanmodelthana.m2_aumio_2230328;

import iub.gulshanmodelthana.HelloApplication;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class SiEvidenceLogsController {

    @FXML
    private TableColumn<SiEvidenceLogsModel, LocalDate> evidenceCollectionDateTableColumn;

    @FXML
    private TableView<SiEvidenceLogsModel> evidenceEntriesTableView;

    @FXML
    private TableColumn<SiEvidenceLogsModel, String> evidenceLocaationTableColumn;

    @FXML
    private TableColumn<SiEvidenceLogsModel, String> itemDetailsTableColumn;

    @FXML
    private TableColumn<SiEvidenceLogsModel, String> reportIDTableColumn;

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
    void initialize() {

        itemDetailsTableColumn.setCellValueFactory(new PropertyValueFactory<>("itemDetail"));
        reportIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("reportID"));
        evidenceLocaationTableColumn.setCellValueFactory(new PropertyValueFactory<>("evidenceLocation"));
        evidenceCollectionDateTableColumn.setCellValueFactory(new PropertyValueFactory<>("evidenceCollectionDate"));

        evidenceEntriesTableView.getItems().setAll(messageList);

    }

    public static List<SiEvidenceLogsModel>messageList = new ArrayList<>();
    static {
        messageList.add(new SiEvidenceLogsModel("gun","252","Uttara",LocalDate.of(2025,4,16)));
        messageList.add(new SiEvidenceLogsModel("Knife","271","Bashindhara",LocalDate.of(2025,4,10)));
        messageList.add(new SiEvidenceLogsModel("glass","252","Malibagh",LocalDate.of(2025,3,06)));

        //this change is for git ,I forgot to set title of git
    }

}
