package iub.gulshanmodelthana.m2_aumio_2230328;

import iub.gulshanmodelthana.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminMonthlyReportsController {

    @FXML
    void ArrestOnCLick(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("m2_aumio_2230328/si_arrest_warrants_view.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Arrest");
        stage.setScene(nextScene);
        stage.show();

    }

    @FXML
    void backOnClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("m2_aumio_2230328/Admin_dashboard.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("dashboard");
        stage.setScene(nextScene);
        stage.show();

    }

    @FXML
    void incidentOnClick(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("m1_mahmudullah_2230406/oc_ongoingcases.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Incidents");
        stage.setScene(nextScene);
        stage.show();

    }

    @FXML
    void investigtionOnClick(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("m2_aumio_2230328/si_evidence_logs.fxml"));
        Scene nextScene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("investigation");
        stage.setScene(nextScene);
        stage.show();

    }

}
