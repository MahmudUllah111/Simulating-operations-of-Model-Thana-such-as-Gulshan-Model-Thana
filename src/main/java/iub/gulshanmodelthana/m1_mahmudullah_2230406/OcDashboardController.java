package iub.gulshanmodelthana.m1_mahmudullah_2230406;

import iub.gulshanmodelthana.HelloApplication;
import iub.gulshanmodelthana.common.ProfileChangePasswordcontroller;
import iub.gulshanmodelthana.common.SceneSwitcher;
import iub.gulshanmodelthana.common.Session;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class OcDashboardController {

    @FXML
    private ImageView imageUser;

    @FXML
    private Label labName;

    @FXML
    void assignmentbutton(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("m1_mahmudullah_2230406/oc_assignment");
    }

    @FXML
    void budgetproposalbutton(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("m1_mahmudullah_2230406/oc_budgetproposal");
    }

    @FXML
    void cctvfootagebutton(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("m1_mahmudullah_2230406/oc_cctvfootage");
    }

    @FXML
    void crimereportbutton(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("m1_mahmudullah_2230406/oc_crimereport");
    }

    @FXML
    void externalcoordinationbutton(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("m1_mahmudullah_2230406/oc_externalcoordination");
    }

    @FXML
    void leaverequestbutton(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("m1_mahmudullah_2230406/oc_leaverequest");
    }

    @FXML
    void ongoingcasesbutton(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("m1_mahmudullah_2230406/oc_ongoingcases");
    }

    @FXML
    void onlinedatabasebutton(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("m1_mahmudullah_2230406/oc_onlinedatabase");
    }

    @FXML
    void logClick(MouseEvent event)throws IOException {
        ProfileChangePasswordcontroller.lastscene = "m1_mahmudullah_2230406/oc_dashboard";
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
    void outClick(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("common/login");
    }

    @FXML
    public void initialize() {
        labName.setText(Session.email);
    }

}
