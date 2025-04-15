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

public class OcExternalCoordinationController {

    @FXML
    private TableColumn<OcExternalCoordination_Model, String> agencyidcolumn;

    @FXML
    private TextField agencyidtextfield;

    @FXML
    private TableColumn<OcExternalCoordination_Model, String> agencynamecolumn;

    @FXML
    private TextField agencynametextfield;

    @FXML
    private TableColumn<OcExternalCoordination_Model, String> contactdetailscolumn;

    @FXML
    private TextField contactdetailstextfield;

    @FXML
    private ImageView imageUser;

    @FXML
    private Label labName;

    @FXML
    private TableView<OcExternalCoordination_Model> tableview;

    @FXML
    private Label warninglabel;

    @FXML
    void backMessage(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("m1_mahmudullah_2230406/oc_dashboard");
    }

    @FXML
    void logClick(MouseEvent event) throws IOException {
        ProfileChangePasswordcontroller.lastscene = "m1_mahmudullah_2230406/oc_externalcoordination";
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
    void selectagencybutton(ActionEvent event) throws IOException {
        OcExternalCoordination_Model selected = tableview.getSelectionModel().getSelectedItem();

        if (selected == null) {
            warninglabel.setText("Please select an agency.");
            warninglabel.setStyle("-fx-border-color: red");
            return;
        }
        SceneSwitcher.switchTo("m1_mahmudullah_2230406/oc_extcoorequest");
    }

    @FXML
    void addinfobutton(ActionEvent event) {
        String name = agencynametextfield.getText();
        String agencyId = agencyidtextfield.getText();
        String contactNo = contactdetailstextfield.getText();

        if (name.isEmpty() || agencyId.isEmpty() || contactNo.isEmpty()) {
            warninglabel.setText(" Please fill up all fields properly.");
            warninglabel.setStyle("-fx-border-color: red");
            return;
        }

        OcExternalCoordination_Model agency = new OcExternalCoordination_Model(name, agencyId, contactNo);
        messageList.add(agency);
        tableview.getItems().add(agency);
        warninglabel.setText(" Agency details added successfully.");
        warninglabel.setStyle("-fx-border-color: green");

        agencynametextfield.clear();
        agencyidtextfield.clear();
        contactdetailstextfield.clear();
    }

    @FXML
    void initialize(){
        labName.setText(Session.email);

        agencynamecolumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        agencyidcolumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        contactdetailscolumn.setCellValueFactory(new PropertyValueFactory<>("details"));

        tableview.getItems().setAll(messageList);
    }

    public static List<OcExternalCoordination_Model> messageList = new ArrayList<>();
    static {
        messageList.add(new OcExternalCoordination_Model("Rapid Action Battalion (RAB)","1911","01875309632"));
        messageList.add(new OcExternalCoordination_Model("Criminal Investigation Department (CID)","1451","01756234569"));
        messageList.add(new OcExternalCoordination_Model("National Security Intelligence (NSI) ","5062","01952313231"));
        messageList.add(new OcExternalCoordination_Model("Special Security Force (SSF)","2205","01896325478"));
        messageList.add(new OcExternalCoordination_Model("Detective Branch (DB)","9875","01734567891"));
    }
}

