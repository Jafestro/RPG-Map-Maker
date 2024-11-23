module org.example.rpgmapmaker {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.rpgmapmaker to javafx.fxml;
    exports org.example.rpgmapmaker;
}