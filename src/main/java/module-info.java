module iub.gulshanmodelthana {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens iub.gulshanmodelthana to javafx.fxml;
    exports iub.gulshanmodelthana;
    exports iub.gulshanmodelthana.m1_mahmudullah_2230406;
    opens iub.gulshanmodelthana.m1_mahmudullah_2230406 to javafx.fxml;
    exports iub.gulshanmodelthana.m2_aumio_2230328;
    opens iub.gulshanmodelthana.m2_aumio_2230328 to javafx.fxml;
    exports iub.gulshanmodelthana.common;
    opens iub.gulshanmodelthana.common to javafx.fxml;
    exports iub.gulshanmodelthana.m3_jannati_2330003;
    opens iub.gulshanmodelthana.m3_jannati_2330003 to javafx.fxml;

}