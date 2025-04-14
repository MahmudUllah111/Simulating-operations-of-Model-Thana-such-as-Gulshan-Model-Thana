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

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OcOngoingCasesController {

    @FXML
    private TableColumn<OcOngoingCases_Model, String> casestatuscolumn;

    @FXML
    private TableColumn<OcOngoingCases_Model, String> casseidcolumn;

    @FXML
    private TableColumn<OcOngoingCases_Model, String> crimetypecolumn;

    @FXML
    private TableColumn<OcOngoingCases_Model, LocalDate> dateofincidentcolumn;

    @FXML
    private ImageView imageUser;

    @FXML
    private Label labName;

    @FXML
    private TableColumn<OcOngoingCases_Model, String> officeridcolumn;

    @FXML
    private TableColumn<OcOngoingCases_Model, String> offiicernamecolumn;

    @FXML
    private TableColumn<OcOngoingCases_Model, String> suspectinformationcolumn;

    @FXML
    private TableView<OcOngoingCases_Model> tableview;

    @FXML
    void backMessage(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("m1_mahmudullah_2230406/oc_dashboard");
    }

    @FXML
    void logClick(MouseEvent event) throws IOException {
        ProfileChangePasswordcontroller.lastscene = "m1_mahmudullah_2230406/oc_ongoingcases";
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
    void initialize() {
        labName.setText(Session.email);

        casseidcolumn.setCellValueFactory(new PropertyValueFactory<>("caseid"));
        offiicernamecolumn.setCellValueFactory(new PropertyValueFactory<>("officername"));
        officeridcolumn.setCellValueFactory(new PropertyValueFactory<>("officerid"));
        crimetypecolumn.setCellValueFactory(new PropertyValueFactory<>("crimetype"));
        dateofincidentcolumn.setCellValueFactory(new PropertyValueFactory<>("dateofincident"));
        suspectinformationcolumn.setCellValueFactory(new PropertyValueFactory<>("suspectinfo"));
        casestatuscolumn.setCellValueFactory(new PropertyValueFactory<>("casestatus"));

        tableview.getItems().setAll(messageList);
    }

    public static List<OcOngoingCases_Model> messageList = new ArrayList<>();
    static {
        messageList.add(new OcOngoingCases_Model("1010","SI Bayezid","31313","Murder",LocalDate.of(2025,4,10),"Suspect has a deep cut mark in the right hand","Active"));
        messageList.add(new OcOngoingCases_Model("1011","SI Siam","31333","Stolen item",LocalDate.of(2025,4,9),"Suspect had a black net mask on his face","Active"));
        messageList.add(new OcOngoingCases_Model("1012","SI Rasel","50005","Suicide",LocalDate.of(2025,4,13),"Suspect info not yet found","Active"));
        messageList.add(new OcOngoingCases_Model("1013","SI Rasel","50005","Road rash",LocalDate.of(2025,4,14),"Suspect driver was intoxicated while driving","Active"));
        messageList.add(new OcOngoingCases_Model("1014","ASI Rubel","44444","Chain Snatch",LocalDate.of(2025,4,12),"Suspect has multiple scar in both hands","Active"));
        messageList.add(new OcOngoingCases_Model("1015","ASI Shamim","11211","Murder",LocalDate.of(2025,4,11),"Suspect was caught ","Completed"));


    }
}