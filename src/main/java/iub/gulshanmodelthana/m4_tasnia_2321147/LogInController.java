package iub.gulshanmodelthana.m4_tasnia_2321147;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class LogInController implements Initializable {
    String userid, password;

    @FXML
    private TextField tf_id;

    @FXML
    private PasswordField tf_pass;

    @FXML
    private Label lbl_error;

    @FXML
    void onLoginbutton(ActionEvent event) throws IOException {

        String id = tf_id.getText().trim();
        String passwordInput = tf_pass.getText().trim();
        String filename = "loginlist.txt";

        try (Scanner s = new Scanner(new FileReader(filename))) {
            while (s.hasNext()) {
                if (!s.hasNext()) break;
                userid = s.next();
                System.out.println(userid);

                if (!s.hasNext()) break;
                password = s.next();
                System.out.println(password);

                if (userid.equals(id) && password.equals(passwordInput)) {
                    Parent p = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
                    Scene s1 = new Scene(p);
                    Stage stg = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    stg.setScene(s1);
                    stg.show();
                    return;
                }
            }
            lbl_error.setText("Not Matched");

        } catch (FileNotFoundException e) {
            lbl_error.setText("Login file not found.");
        } catch (IOException e) {
            lbl_error.setText("Error loading page.");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
