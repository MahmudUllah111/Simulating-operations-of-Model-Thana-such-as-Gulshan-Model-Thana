package iub.gulshanmodelthana.common;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;


import java.io.IOException;
import java.time.LocalDate;

public class SignupController {

    @FXML
    private TextField addresstextfield;

    @FXML
    private AnchorPane anchData;

    @FXML
    private DatePicker birthdaydatepicker;

    @FXML
    private TextField congirmpasswordtextfield;

    @FXML
    private TextField countrytextfield;

    @FXML
    private TextField emailtextfield;

    @FXML
    private Label labWarning;

    @FXML
    private TextField nametextfield;

    @FXML
    private TextField nidtextfield;

    @FXML
    private TextField passwordtextfield;

    @FXML
    private TextField phonetextfield;

    @FXML
    void registerbutton(ActionEvent event) {
        String name = nametextfield.getText();
        String email = emailtextfield.getText();
        String phone = phonetextfield.getText();
        String address = addresstextfield.getText();
        String country = countrytextfield.getText();
        String nid = nidtextfield.getText();
        String password = passwordtextfield.getText();
        String confirmPassword = congirmpasswordtextfield.getText();

        String birthday;
        if (birthdaydatepicker.getValue() != null) {
            birthday = birthdaydatepicker.getValue().toString();
        } else {
            birthday = "";
        }

        if (name.isEmpty() || email.isEmpty() || phone.isEmpty() || address.isEmpty()
                || country.isEmpty() || birthday.isEmpty() || nid.isEmpty()
                || password.isEmpty() || confirmPassword.isEmpty()) {

            labWarning.setText(" Please fill all the fields.");
            labWarning.setTextFill(Color.RED);
            labWarning.setStyle("-fx-border-color: red");
            labWarning.setVisible(true);
            return;
        }

        if (!password.equals(confirmPassword)) {
            labWarning.setText(" Passwords do not match.");
            labWarning.setTextFill(Color.RED);
            labWarning.setStyle("-fx-border-color: red");
            labWarning.setVisible(true);
            return;
        }

        System.out.println("Registration Successful.");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
        System.out.println("Country: " + country);
        System.out.println("Birthday: " + birthday);
        System.out.println("NID: " + nid);

        labWarning.setText(" Registration successful. You can now login.");
        labWarning.setTextFill(Color.GREEN);
        labWarning.setStyle("-fx-border-color: green");
        labWarning.setVisible(true);

    }

    @FXML
    void switchTologin(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("common/login");

    }

    @FXML
    void initialize(){
        birthdaydatepicker.setValue(LocalDate.now());
    }

}
