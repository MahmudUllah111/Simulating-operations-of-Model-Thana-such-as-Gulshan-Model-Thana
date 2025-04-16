package iub.gulshanmodelthana.m1_mahmudullah_2230406;

import iub.gulshanmodelthana.common.ProfileChangePasswordcontroller;
import iub.gulshanmodelthana.common.SceneSwitcher;
import iub.gulshanmodelthana.common.Session;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ItRegisterlogsController {

    @FXML
    private TableColumn<ItRegisterLogs_Model, LocalDate> datecolumn;

    @FXML
    private TableColumn<ItRegisterLogs_Model, String> emailidcolumn;

    @FXML
    private TextField emailidtextfield;

    @FXML
    private DatePicker filterlogsbydatedatepicker;

    @FXML
    private ImageView imageUser;

    @FXML
    private Label labName;

    @FXML
    private TableColumn<ItRegisterLogs_Model, String> namecolumn;

    @FXML
    private TextField nametextfield;

    @FXML
    private TableColumn<ItRegisterLogs_Model, String> passwordcolumn;

    @FXML
    private TextField passwordtextfield;

    @FXML
    private DatePicker registrationdatepicker;

    @FXML
    private TableColumn<ItRegisterLogs_Model, String> rolecolumn;

    @FXML
    private ComboBox<String> rolecombobox;

    @FXML
    private TableView<ItRegisterLogs_Model> tableview;

    @FXML
    private Label warninglabel;

    @FXML
    void backMessage(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("m1_mahmudullah_2230406/it_dashboard");
    }

    @FXML
    void logClick(MouseEvent event) throws IOException {
        ProfileChangePasswordcontroller.lastscene = "m1_mahmudullah_2230406/it_registerlogs";
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
    void filterbydatebutton(ActionEvent event) {
        LocalDate selectedDate = filterlogsbydatedatepicker.getValue();
        if (selectedDate == null) {
            tableview.getItems().setAll(messageList);
            warninglabel.setText(" Please select a date first.");
            warninglabel.setStyle("-fx-border-color: orange");
            return;
        }
        List<ItRegisterLogs_Model> filteredList = new ArrayList<>();
        for (ItRegisterLogs_Model log : messageList) {
            if (log.getDate().equals(selectedDate)) {
                filteredList.add(log);
            }
        }
        tableview.getItems().setAll(filteredList);

        if (filteredList.isEmpty()) {
            warninglabel.setText(" No data found for selected date.");
            warninglabel.setStyle("-fx-border-color: red");
        } else {
            warninglabel.setText(" Filter successful.");
            warninglabel.setStyle("-fx-border-color: green");
        }
    }

    @FXML
    void registerbutton(ActionEvent event) {
        String name = nametextfield.getText();
        String email = emailidtextfield.getText();
        String password = passwordtextfield.getText();
        LocalDate date = registrationdatepicker.getValue();
        String role = rolecombobox.getValue();

        if (name.isEmpty() || email.isEmpty() || password.isEmpty() || date == null || role == null) {
            warninglabel.setText(" Please fill all the fields.");
            warninglabel.setStyle("-fx-border-color: red");
            return;
        }
        ItRegisterLogs_Model newUser = new ItRegisterLogs_Model(name, email, password, date, role);
        messageList.add(newUser);
        tableview.getItems().setAll(messageList);
        warninglabel.setText(" User registered successfully.");
        warninglabel.setStyle("-fx-border-color: green");
    }

    @FXML
    public void edituserbutton(ActionEvent actionEvent) throws IOException {
        ItRegisterLogs_Model selected = tableview.getSelectionModel().getSelectedItem();
        if (selected == null) {
            warninglabel.setText(" Please select a row to edit.");
            warninglabel.setStyle("-fx-border-color: red;");
            return;
        }
        ItRegisterLogsEditController.itemToEdit = selected;

        SceneSwitcher.switchTo("m1_mahmudullah_2230406/it_registerlogsedit");
    }

    @FXML
    void initialize(){
        labName.setText(Session.email);
        rolecombobox.getItems().addAll("Sub Inspector","Assistant Sub Inspector","Officer","Duty Officer","Administrator","HR");

        namecolumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        emailidcolumn.setCellValueFactory(new PropertyValueFactory<>("emailid"));
        passwordcolumn.setCellValueFactory(new PropertyValueFactory<>("password"));
        datecolumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        rolecolumn.setCellValueFactory(new PropertyValueFactory<>("role"));

        tableview.getItems().setAll(messageList);
    }
    public static List<ItRegisterLogs_Model> messageList = new ArrayList<>();
    static {
        messageList.add(new ItRegisterLogs_Model("A.F.M Mahmud Ullah","mahmud@police.gov.bd","12321",LocalDate.of(2025,2,4),"Officer In Charge"));
        messageList.add(new ItRegisterLogs_Model("Q.I.A Aumio","aumio@police.gov.bd","45654",LocalDate.of(2025,1,10),"Sub Inspector"));
        messageList.add(new ItRegisterLogs_Model("Rahie Sakir","rahie12@police.gov.bd","56765",LocalDate.of(2025,2,18),"Sub Inspector"));
        messageList.add(new ItRegisterLogs_Model("Md. Omor khaiom","omorkhaiom99@police.gov.bd","32123",LocalDate.of(2025,1,1),"Sub Inspector"));
        messageList.add(new ItRegisterLogs_Model("Rifat Hossain khan","rifatkhan11@police.gov.bd","65456",LocalDate.of(2025,2,9),"Assistant Sub Inspector"));
        messageList.add(new ItRegisterLogs_Model("Simoon Islam","simon333@police.gov.bd","78987",LocalDate.of(2025,3,26),"Assistant Sub Inspector"));

    }

}