package iub.gulshanmodelthana.m1_mahmudullah_2230406;

import iub.gulshanmodelthana.common.Session;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class OcDashboardController {

    @FXML
    private ImageView imageUser;

    @FXML
    private Label labName;

    @FXML
    void assignmentbutton(ActionEvent event) {

    }

    @FXML
    void budgetproposalbutton(ActionEvent event) {

    }

    @FXML
    void cctvfootagebutton(ActionEvent event) {

    }

    @FXML
    void crimereportbutton(ActionEvent event) {

    }

    @FXML
    void externalcoordinationbutton(ActionEvent event) {

    }

    @FXML
    void leaverequestbutton(ActionEvent event) {

    }

    @FXML
    void logClick(MouseEvent event) {

    }

    @FXML
    void mailClick(MouseEvent event) {

    }

    @FXML
    void notClick(MouseEvent event) {

    }

    @FXML
    void ongoingcasesbutton(ActionEvent event) {

    }

    @FXML
    void onlinedatabasebutton(ActionEvent event) {

    }

    @FXML
    void outClick(MouseEvent event) {

    }

    @FXML
    void sandAction(MouseEvent event) {

    }

    @FXML
    public void initialize() {
        labName.setText(Session.email);
    }

}
