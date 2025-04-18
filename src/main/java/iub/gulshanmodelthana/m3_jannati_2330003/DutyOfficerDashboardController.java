package iub.gulshanmodelthana.m3_jannati_2330003;

import iub.gulshanmodelthana.common.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class DutyOfficerDashboardController {
    @javafx.fxml.FXML
    public void signOut(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("common/login");
    }

    @javafx.fxml.FXML
    public void registerNewGD(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m3_jannati_2330003/new_GD");
    }

    @javafx.fxml.FXML
    public void recordEntry(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void trackOpenCase(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void issueNotice(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generateReport(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void manageLostAndFound(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void fileFIR(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void assignPatrolTeam(ActionEvent actionEvent) {
    }
}
