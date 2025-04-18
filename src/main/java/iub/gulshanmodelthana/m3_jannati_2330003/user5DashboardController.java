package iub.gulshanmodelthana.m3_jannati_2330003;

import iub.gulshanmodelthana.common.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class user5DashboardController {
    @javafx.fxml.FXML
    public void recordSuspectEntry(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m3_jannati_2330003/suspect-entry");
    }

    @javafx.fxml.FXML
    public void generateReport(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m3_jannati_2330003/daily-report");
    }

    @javafx.fxml.FXML
    public void lostAndFound(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m3_jannati_2330003/lost-and-found");
    }

    @javafx.fxml.FXML
    public void signOut(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("common/login");
    }

    @javafx.fxml.FXML
    public void issueSummons(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m3_jannati_2330003/issue-notice");
    }

    @javafx.fxml.FXML
    public void fileFIR(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m3_jannati_2330003/fileFir");
    }

    @javafx.fxml.FXML
    public void trackOpenCases(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m3_jannati_2330003/track-cases");
    }

    @javafx.fxml.FXML
    public void registerGD(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m3_jannati_2330003/new_GD");
    }

    @javafx.fxml.FXML
    public void assignPatrolTeam(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m3_jannati_2330003/assign_patrol_team_controller");
    }
}