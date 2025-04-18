package iub.gulshanmodelthana.m1_mahmudullah_2230406;

import iub.gulshanmodelthana.common.ProfileChangePasswordcontroller;
import iub.gulshanmodelthana.common.SceneSwitcher;
import iub.gulshanmodelthana.common.Session;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OcCctvFootageController {

    @FXML
    private TableColumn<OcCctvFootage_Model, LocalDate> datecolumn;

    @FXML
    private TableColumn<OcCctvFootage_Model, String> footageidcolumn;

    @FXML
    private ImageView imageUser;

    @FXML
    private Label labName;

    @FXML
    private TableColumn<OcCctvFootage_Model, String> locationcolumn;

    @FXML
    private TableView<OcCctvFootage_Model> tableview;
    @FXML
    private Label warninglabel;

    @FXML
    void backMessage(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("m1_mahmudullah_2230406/oc_dashboard");
    }

    @FXML
    void logClick(MouseEvent event) throws IOException {
        ProfileChangePasswordcontroller.lastscene = "m1_mahmudullah_2230406/oc_cctvfootage";
        SceneSwitcher.switchTo("common/profile_change_password");
    }

    @FXML
    void mailClick(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("common/contact");
    }

    @FXML
    void notClick(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("common/notification");
    }

    @FXML
    public void saveselectedfootagedetailsbutton(ActionEvent actionEvent) {
        OcCctvFootage_Model selectedFootage = tableview.getSelectionModel().getSelectedItem();

        if (selectedFootage != null) {
            try (FileWriter writer = new FileWriter("SavedFootageDetails.txt", true)) {
                writer.write("Footage ID: " + selectedFootage.getFootageid() + "\n");
                writer.write("Location: " + selectedFootage.getLocation() + "\n");
                writer.write("Date: " + selectedFootage.getDate() + "\n");
                writer.write("---------------------------------------\n");
                warninglabel.setText("Footage details saved successfully.");
                warninglabel.setStyle("-fx-border-color: green");
            }
            catch (Exception e) {
            }
        }
        else {
            warninglabel.setText("Please select a footage first.");
            warninglabel.setStyle("-fx-border-color: red");
        }
    }

    @FXML
    void initialize(){
        labName.setText(Session.email);

        footageidcolumn.setCellValueFactory(new PropertyValueFactory<>("footageid"));
        locationcolumn.setCellValueFactory(new PropertyValueFactory<>("location"));
        datecolumn.setCellValueFactory(new PropertyValueFactory<>("date"));

        tableview.getItems().setAll(messageList);
    }

    public static List<OcCctvFootage_Model> messageList = new ArrayList<>();
    static {
        messageList.add(new OcCctvFootage_Model("CAM 1","Super shop entrance doors",LocalDate.of(2025,4,10)));
        messageList.add(new OcCctvFootage_Model("CAM 2","Chinese restaurant front doors",LocalDate.of(2025,4,12)));
        messageList.add(new OcCctvFootage_Model("CAM 1","Main doors of a mall",LocalDate.of(2025,4,9)));
        messageList.add(new OcCctvFootage_Model("CAM 3", "Parking lot entrance", LocalDate.of(2025, 4, 11)));
        messageList.add(new OcCctvFootage_Model("CAM 4", "Bank ATM area", LocalDate.of(2025, 4, 13)));
        messageList.add(new OcCctvFootage_Model("CAM 5", "Office building reception", LocalDate.of(2025, 4, 14)));
        messageList.add(new OcCctvFootage_Model("CAM 1", "Gas station pumps", LocalDate.of(2025, 4, 15)));

    }


}