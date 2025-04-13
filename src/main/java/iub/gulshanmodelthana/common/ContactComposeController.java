package iub.gulshanmodelthana.common;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.io.FileWriter;
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
        String to = fieldTo.getText();
        String subject = fieldsubject.getText();
        String message = textarea.getText();

        if (to.isEmpty() || subject.isEmpty() || message.isEmpty()) {
            labFile.setText("Please fill out all fields before sending.");
            labFile.setTextFill(Color.RED);
            labFile.setStyle("-fx-border-color: red");
            labFile.setVisible(true);
            return;
        }
        try {
            FileWriter fw = new FileWriter("SentMessage.txt", true);
            fw.write("To: " + to + "\n");
            fw.write("Subject: " + subject + "\n");
            fw.write("Message: " + message + "\n");
            fw.write("------------------------\n");
            fw.close();

            labFile.setText(" Message sent successful.");
            labFile.setStyle("-fx-border-color: green");
            labFile.setVisible(true);

            fieldTo.clear();
            fieldsubject.clear();
            textarea.clear();

        } catch (Exception e) {
            labFile.setText("Failed to sent message.");
            labFile.setVisible(true);
        }
    }

    @FXML
    void initialize(){
        labName.setText(Session.email);
    }
}