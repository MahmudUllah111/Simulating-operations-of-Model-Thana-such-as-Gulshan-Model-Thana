package iub.gulshanmodelthana.common;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ContactController {

    @FXML
    private ImageView imageUser;

    @FXML
    private Label labName;

    @FXML
    private TableColumn<Contact_Model, String> messageColumn;
    @FXML
    private TableView<Contact_Model> tableView;
    @FXML
    private TableColumn<Contact_Model, String> fromColumn;
    @FXML
    private TableColumn<Contact_Model, String> subjectColumn;
    @FXML
    private TableColumn<Contact_Model, LocalDate> dateColumn;
    @FXML
    private DatePicker filterdp;


    @FXML
    void filterClick(MouseEvent event) {
        LocalDate selectedDate = filterdp.getValue();

        if (selectedDate == null) {
            tableView.getItems().setAll(messageList);
            return;
        }

        List<Contact_Model> filteredList = new ArrayList<>();
        for (Contact_Model cm : messageList) {
            if (selectedDate.equals(cm.getDate())) {
                filteredList.add(cm);
            }
        }

        tableView.getItems().setAll(filteredList);
    }

    @FXML
    void comClick(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("contact_compose");
    }

    @FXML
    void logClick(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("profile_change_password");
    }

    @FXML
    void mailClick(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("contact");
    }

    @FXML
    void notClick(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("notification");
    }

    @FXML
    void outClick(MouseEvent event) throws IOException {
       SceneSwitcher.switchTo("login");
    }

    @FXML
    void sandAction(MouseEvent event) {
    }

    @FXML
    public void initialize() {
        labName.setText(Session.email);

        fromColumn.setCellValueFactory(new PropertyValueFactory<>("from"));
        subjectColumn.setCellValueFactory(new PropertyValueFactory<>("subject"));
        messageColumn.setCellValueFactory(new PropertyValueFactory<>("message"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));

        tableView.getItems().setAll(messageList);
    }

    public static List<Contact_Model> messageList = new ArrayList<>();

    static {
        messageList.add(new Contact_Model("Mahmud", "Meeting", "Join at 10 AM", LocalDate.of(2025,4,10)));
        messageList.add(new Contact_Model("HR", "Notice", "Submit Papers", LocalDate.of(2025, 4, 13)));
        messageList.add(new Contact_Model("Support", "System Update", "Is on the way", LocalDate.of(2025, 4, 11)));
        messageList.add(new Contact_Model("Admin", "Issue Solved", "Fixed", LocalDate.of(2025, 4, 12)));
    }

}
