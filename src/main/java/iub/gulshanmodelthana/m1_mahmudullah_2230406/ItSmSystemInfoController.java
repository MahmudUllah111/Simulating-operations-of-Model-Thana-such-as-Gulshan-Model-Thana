package iub.gulshanmodelthana.m1_mahmudullah_2230406;

import iub.gulshanmodelthana.common.ProfileChangePasswordcontroller;
import iub.gulshanmodelthana.common.SceneSwitcher;
import iub.gulshanmodelthana.common.Session;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ItSmSystemInfoController {

    @FXML
    private TextArea componentdetailstextarea;

    @FXML
    private TableColumn<ItSmSystemInfo_Model, String> currentsoftwareversiontablecolumn;

    @FXML
    private ImageView imageUser;

    @FXML
    private Label labName;

    @FXML
    private TableColumn<ItSmSystemInfo_Model, String> patchedtablecolumn;

    @FXML
    private TableView<ItSmSystemInfo_Model> tableview;
    @FXML
    private Label warninglabel;

    @FXML
    void backMessage(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("m1_mahmudullah_2230406/it_systemmonitor");
    }

    @FXML
    void logClick(MouseEvent event) throws IOException {
        ProfileChangePasswordcontroller.lastscene = "m1_mahmudullah_2230406/it_smsysteminfo";
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
    void checkupdatesbutton(ActionEvent event) {
      warninglabel.setText(" System is up to Date.");
      warninglabel.setStyle("-fx-border-color: green");
    }

    @FXML
    void initialize(){
        labName.setText(Session.email);

        currentsoftwareversiontablecolumn.setCellValueFactory(new PropertyValueFactory<>("softwareversion"));
        patchedtablecolumn.setCellValueFactory(new PropertyValueFactory<>("patches"));

        componentdetailstextarea.setText(
                "System Components Overview:\n" +
                        "- Model: Asus Tuf F15\n" +
                        "- Processor: Intel Core i5-10750H (6 Cores, 12 Threads)\n" +
                        "- Memory: 16GB DDR4 2933MHz\n" +
                        "- Storage: 512GB NVMe SSD\n" +
                        "- Graphics: NVIDIA GeForce RTX 3060 8GB\n" +
                        "- Display: 15.6 4K UHD \n" +
                        "- Operating System: Windows 11 Pro 64-bit\n");

                tableview.getItems().setAll(messageList);
    }

    public static List<ItSmSystemInfo_Model> messageList = new ArrayList<>();
    static {
        messageList.add(new ItSmSystemInfo_Model("v1.0.5", "Security Patch 2025-04"));
        messageList.add(new ItSmSystemInfo_Model("v1.0.4", "Stability Patch 2025-03"));
        messageList.add(new ItSmSystemInfo_Model("v1.0.3", "Minor UI Fixes"));
        messageList.add(new ItSmSystemInfo_Model("v1.0.2", "File Optimization Patch"));
        messageList.add(new ItSmSystemInfo_Model("v1.0.1", "Initial Stable Release"));
        messageList.add(new ItSmSystemInfo_Model("v0.9.9", "Minor ethernet bugs fixed"));
        messageList.add(new ItSmSystemInfo_Model("v0.9.8", "Bug Fixes and Improvements"));
        messageList.add(new ItSmSystemInfo_Model("v0.9.5", "Performance Patch release"));
    }
}