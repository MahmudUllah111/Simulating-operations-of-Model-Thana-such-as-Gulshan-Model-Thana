package iub.gulshanmodelthana.m2_aumio_2230328;

import iub.gulshanmodelthana.HelloApplication;
import iub.gulshanmodelthana.m1_mahmudullah_2230406.OcAssignment_Model;
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

public class SiArrestWarrantsViewController {

    @FXML
    private TableColumn<SiArrestWarrantsViewModel, String> ageTableColumn;

    @FXML
    private TableColumn<SiArrestWarrantsViewModel, String> contactNumberTableColumn;

    @FXML
    private TableColumn<SiArrestWarrantsViewModel, String> homeAdressTableColumn;

    @FXML
    private TableColumn<SiArrestWarrantsViewModel, String> nameTableColumn;

    @FXML
    private TableView<SiArrestWarrantsViewModel> suspectWarrantTableView;

    @FXML
    private TableColumn<SiArrestWarrantsViewModel, String> warrantDetailsTableColumn;

    @FXML
    private TableColumn<SiArrestWarrantsViewModel, String> warrantIDTableColumn;

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
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<>("suspectName"));
        warrantIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("warrantID"));
        ageTableColumn.setCellValueFactory(new PropertyValueFactory<>("suspectAge"));
        homeAdressTableColumn.setCellValueFactory(new PropertyValueFactory<>("suspectHomeAddrress"));
        contactNumberTableColumn.setCellValueFactory(new PropertyValueFactory<>("suspectContaactNumber"));
        warrantDetailsTableColumn.setCellValueFactory(new PropertyValueFactory<>("suspectDetails"));

        suspectWarrantTableView.getItems().setAll(messageList);
    }


    public static List<SiArrestWarrantsViewModel> messageList = new ArrayList<>();
        static {
            messageList.add(new SiArrestWarrantsViewModel("AFM Mahamudullah", "2220406", "24", "Uttara,sector10", "0123456", "Suspect always yapps about deadline"));
            messageList.add(new SiArrestWarrantsViewModel("Naveed", "226582", "27", "Motijheel", "0123584", "Suspect is over weight"));
            messageList.add(new SiArrestWarrantsViewModel("Rahie Sakir", "226589", "24", "Malibaaagh", "02563584", "Suspect is significally Toxic"));
            messageList.add(new SiArrestWarrantsViewModel("Aumio", "2230328", "22", "Bashundhara", "02563228", "Suspect usually forget to press ctrl+s"));


        }

}