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
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ItSystemMonitorController {

    @FXML
    private ImageView imageUser;

    @FXML
    private Label labName;

    @FXML
    private TableColumn<ItSystemMonitor_Model, String> peroformancetablecolumn;

    @FXML
    private TableView<ItSystemMonitor_Model> tableview;

    @FXML
    private TableColumn<ItSystemMonitor_Model, LocalTime> uptimetablecolumn;

    @FXML
    void backMessage(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("m1_mahmudullah_2230406/it_dashboard");
    }

    @FXML
    void logClick(MouseEvent event) throws IOException {
        ProfileChangePasswordcontroller.lastscene = "m1_mahmudullah_2230406/it_systemmonitor";
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
    void checkerroorlogsbutton(ActionEvent event) throws IOException {
      SceneSwitcher.switchTo("m1_mahmudullah_2230406/it_smerrorlogs");
    }

    @FXML
    public void systeminfobutton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("m1_mahmudullah_2230406/it_smsysteminfo");
    }

    @FXML
    void initialize(){
        labName.setText(Session.email);

        peroformancetablecolumn.setCellValueFactory(new PropertyValueFactory<>("performance"));
        uptimetablecolumn.setCellValueFactory(new PropertyValueFactory<>("uptime"));

        tableview.getItems().setAll(messageList);
    }

    public static List<ItSystemMonitor_Model> messageList = new ArrayList<>();
    static {
        messageList.add(new ItSystemMonitor_Model("Excellent",LocalTime.of(9,45,21)));
        messageList.add(new ItSystemMonitor_Model("Good",LocalTime.of(10,30,13)));
        messageList.add(new ItSystemMonitor_Model("Average",LocalTime.of(7,14,20)));
        messageList.add(new ItSystemMonitor_Model("Below Average",LocalTime.of(11,10,44)));
        messageList.add(new ItSystemMonitor_Model("Critical",LocalTime.of(12,51,58)));
        messageList.add(new ItSystemMonitor_Model("Stable",LocalTime.of(12,59,12)));
        messageList.add(new ItSystemMonitor_Model("Offline",LocalTime.of(1,42,11)));
        messageList.add(new ItSystemMonitor_Model("High CPU Usage",LocalTime.of(1,38,30)));


    }
}