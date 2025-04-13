package iub.gulshanmodelthana.common;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

import java.io.IOException;

public class ContactComposeController {

    @FXML
    private TextField fieldTo;

    @FXML
    private ImageView imageUser;

    @FXML
    private Label labFile;

    @FXML
    private Label labName;
    @FXML
    private TextArea textarea;
    @FXML
    private TextField fieldsubject;

    @FXML
    void backMessage(MouseEvent event) throws IOException {
     SceneSwitcher.switchTo("contact");
    }

    @FXML
    void fileClick(MouseEvent event) {

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
    void sendClick(MouseEvent event) {

    }

}
