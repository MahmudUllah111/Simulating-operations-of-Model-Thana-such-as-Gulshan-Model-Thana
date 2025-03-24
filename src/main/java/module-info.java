module iub.gulshanmodelthana {
    requires javafx.controls;
    requires javafx.fxml;


    opens iub.gulshanmodelthana to javafx.fxml;
    exports iub.gulshanmodelthana;
    exports iub.gulshanmodelthana.m1_mahmudullah_2230406;
    opens iub.gulshanmodelthana.m1_mahmudullah_2230406 to javafx.fxml;


}