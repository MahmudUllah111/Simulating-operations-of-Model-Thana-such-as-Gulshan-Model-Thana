package iub.gulshanmodelthana.common;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ContactInboxController {

    @FXML
    private ImageView imageUser;

    @FXML
    private TextArea inboxmessagetextarea;

    @FXML
    private Label labName;

    @FXML
    private TextField subjectinboxtextfield;

    @FXML
    void backarrow(MouseEvent event) throws IOException {
        SceneSwitcher.switchTo("common/contact_compose");
    }

    @FXML
    void logClick(MouseEvent event) throws IOException {
        ProfileChangePasswordcontroller.lastscene = "common/contact_inbox";
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
    void replybutton(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("common/contact_compose");
    }

    @FXML
    void initialize() throws FileNotFoundException {
        labName.setText(Session.email);

        File myfile = new File("SentMessage.txt");
        Scanner sc = new Scanner(myfile);

        String subject = "";
        String message = "";

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            if (line.startsWith("Subject:")){
                subject = line.substring(9);
            }
            else if (line.startsWith("Message:")){
                message = line.substring(9);
                while(sc.hasNextLine()){
                    line = sc.nextLine();
                    message = message + "\n" + line;
                }
            }
        }
        sc.close();
        subjectinboxtextfield.setText(subject);
        inboxmessagetextarea.setText(message);
    }

}