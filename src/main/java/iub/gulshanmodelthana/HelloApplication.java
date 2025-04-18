package iub.gulshanmodelthana;

import iub.gulshanmodelthana.common.SceneSwitcher;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        SceneSwitcher.stage = stage;

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("common/login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Gulshan Model Thana");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {

        launch();
    }
}