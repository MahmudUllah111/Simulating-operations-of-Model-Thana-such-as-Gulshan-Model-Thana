package iub.gulshanmodelthana.m3_jannati_2330003;

import iub.gulshanmodelthana.common.SceneSwitcher;
import javafx.event.ActionEvent;

import javax.imageio.IIOException;
import java.io.IOException;

public class User6DashboardController {
    @javafx.fxml.FXML
    public void scheduleTrainingSessionPageButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m3_jannati_2330003/schedule-training-session");
    }

    @javafx.fxml.FXML
    public void manageTransfersPageButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m3_jannati_2330003/manage-transfer-request");
    }

    @javafx.fxml.FXML
    public void trackOfficerPerformancePageButton(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("m3_jannati_2330003/track-officer-performance");
    }

    @javafx.fxml.FXML
    public void assignTaskPageButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m3_jannati_2330003/assign-task-to-officer");
    }

    @javafx.fxml.FXML
    public void viewAndUpdateOfficerProfilePageButton(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("m3_jannati_2330003/update-officer-profile");
    }

    @javafx.fxml.FXML
    public void logoutButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("common/login");
    }

    @javafx.fxml.FXML
    public void manageLeaveRequestsPageButton(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("m3_jannati_2330003/officer-leave-request");
    }

    @javafx.fxml.FXML
    public void maintainTraininingRecordsPageBUtton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m3_jannati_2330003/schedule-training-session");
    }

    @javafx.fxml.FXML
    public void generatePayrollReportPageButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m3_jannati_2330003/generate-payroll-report");
    }
}
