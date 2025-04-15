package iub.gulshanmodelthana.m1_mahmudullah_2230406;

import iub.gulshanmodelthana.common.ProfileChangePasswordcontroller;
import iub.gulshanmodelthana.common.SceneSwitcher;
import iub.gulshanmodelthana.common.Session;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OcOnlineDatabaseController {

    @FXML
    private RadioButton activeradiobutton;

    @FXML
    private RadioButton bailedradiobutton;

    @FXML
    private TableColumn<OcOnlineDatabase_Model, String> casenumbercolumn;

    @FXML
    private TextField casenumbertextfield;

    @FXML
    private TableColumn<OcOnlineDatabase_Model, String> casestatuscolumn;

    @FXML
    private ImageView imageUser;

    @FXML
    private Label labName;

    @FXML
    private TextField searchtextfield;

    @FXML
    private TableColumn<OcOnlineDatabase_Model, String> suspectaddresscolumn;

    @FXML
    private TextField suspectaddresstextfield;

    @FXML
    private TableColumn<OcOnlineDatabase_Model, String> suspectcontactnocolumn;

    @FXML
    private TextField suspectcontactnotextfield;

    @FXML
    private TableColumn<OcOnlineDatabase_Model, String> suspectnamecolumn;

    @FXML
    private TextField suspectnametextfield;

    @FXML
    private TableColumn<OcOnlineDatabase_Model, String> suspectrecordidcolumn;

    @FXML
    private TextField suspectrecordidtextfield;

    @FXML
    private TableView<OcOnlineDatabase_Model> tableview;

    @FXML
    private Label warninglabel;

    ToggleGroup tg;

    @FXML
    void backMessage(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("m1_mahmudullah_2230406/oc_dashboard");
    }

    @FXML
    void logClick(MouseEvent event) throws IOException {
        ProfileChangePasswordcontroller.lastscene = "m1_mahmudullah_2230406/oc_onlinedatabase";
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
    void searchbutton(ActionEvent event) {
        String text = searchtextfield.getText();

        if (text.isEmpty()) {
            warninglabel.setText("Please put data in the search field.");
            warninglabel.setStyle("-fx-border-color: red");
            return;
        }

        List<OcOnlineDatabase_Model> filtered = new ArrayList<>();
        for (OcOnlineDatabase_Model od : messageList) {
            if (od.getName().equals(text) || od.getCaseno().equals(text) || od.getRecordid().equals(text)) {
                filtered.add(od);
            }
        }
        if (filtered.isEmpty()) {
            warninglabel.setText("No matching data found.");
            warninglabel.setStyle("-fx-border-color: red");
        }
        else {
            warninglabel.setText("Searched data found.");
            warninglabel.setStyle("-fx-border-color: green");
        }

        tableview.getItems().setAll(filtered);
    }

    @FXML
    void addbutton(ActionEvent event) {
        String name = suspectnametextfield.getText();
        String recordId = suspectrecordidtextfield.getText();
        String contactNo = suspectcontactnotextfield.getText();
        String address = suspectaddresstextfield.getText();
        String caseNo = casenumbertextfield.getText();
        String caseStatus = "";

        if (activeradiobutton.isSelected()) {
            caseStatus = "Active";
        }
        else if (bailedradiobutton.isSelected()) {
            caseStatus = "Bailed";
        }

        if (name.isEmpty() || recordId.isEmpty() || contactNo.isEmpty() || address.isEmpty() || caseNo.isEmpty() || caseStatus.isEmpty()) {
            warninglabel.setText("Please fill up all fields properly.");
            warninglabel.setStyle("-fx-border-color: red");
            return;
        }

        OcOnlineDatabase_Model newEntry = new OcOnlineDatabase_Model(name, recordId, contactNo, address, caseNo, caseStatus);
        messageList.add(newEntry);
        tableview.getItems().add(newEntry);
        warninglabel.setText("Suspect added successfully.");
        warninglabel.setStyle("-fx-border-color: green");
    }

    @FXML
    void initialize(){
        labName.setText(Session.email);
        tg = new ToggleGroup();
        activeradiobutton.setToggleGroup(tg);
        bailedradiobutton.setToggleGroup(tg);

        suspectnamecolumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        suspectrecordidcolumn.setCellValueFactory(new PropertyValueFactory<>("recordid"));
        suspectcontactnocolumn.setCellValueFactory(new PropertyValueFactory<>("contactno"));
        suspectaddresscolumn.setCellValueFactory(new PropertyValueFactory<>("address"));
        casenumbercolumn.setCellValueFactory(new PropertyValueFactory<>("caseno"));
        casestatuscolumn.setCellValueFactory(new PropertyValueFactory<>("casestatus"));

        tableview.getItems().setAll(messageList);
    }

    public static List<OcOnlineDatabase_Model> messageList = new ArrayList<>();
    static {
        messageList.add(new OcOnlineDatabase_Model("Q.I.A Aummio","141111","01711831982","Bashundhara, Dhaka", "228","Active"));
        messageList.add(new OcOnlineDatabase_Model("Rifat Hossain Khan","141112","01797284704","Kamarapara, Dhaka", "229","Active"));
        messageList.add(new OcOnlineDatabase_Model("Rahie Sakir","141113","01989004785","Malibagh, Dhaka", "230","Active"));
        messageList.add(new OcOnlineDatabase_Model("Md. Omor khaiom","141114","01654223131","Uttorkhan, Dhaka", "231","Active"));
        messageList.add(new OcOnlineDatabase_Model("A.F.M Mahmud Ullah","141115","01875351392","Uttara, Dhaka", "232","Bailed"));
        messageList.add(new OcOnlineDatabase_Model("Dipro Rahman","141116","01761629897","Shantinagar, Dhaka", "233","Bailed"));

    }
}
