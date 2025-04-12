package iub.gulshanmodelthana.common;

import iub.gulshanmodelthana.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class SettingController {

    @FXML
    private TableColumn<?, ?> dtableSide;

    @FXML
    private PasswordField enConfirmPassword;

    @FXML
    private PasswordField enCurrentPassword;

    @FXML
    private PasswordField enNewPassword;

    @FXML
    private ImageView imageUser;

    @FXML
    private ImageView imageUser2;

    @FXML
    private Label labName;

    @FXML
    private Label labName2;

    @FXML
    private AnchorPane paneLog;

    @FXML
    private AnchorPane paneSide;

    @FXML
    private TableView<?> tableSide;

    @FXML
    void logClick(MouseEvent event) {

    }

    @FXML
    void mailClick(MouseEvent event) {

    }

    @FXML
    void notClick(MouseEvent event) {

    }

    @FXML
    void outClick(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("common/login.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Create Account");
        stage.setScene(nextScene);
        stage.show();
    }

    @FXML
    void sandAction(MouseEvent event) {

    }

    @FXML
    void saveClick(MouseEvent event) {

    }

    @FXML
    void windowClick(MouseEvent event) {

    }

}
