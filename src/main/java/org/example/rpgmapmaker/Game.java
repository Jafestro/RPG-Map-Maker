package org.example.rpgmapmaker;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Game extends Application {
    @Override
    public void start(Stage primaryStage) {
        TileGraphicFactory graphicFactory = new TileGraphicFactory();
        Map gameMap = new CityMap(1000, 1000, graphicFactory);

        Canvas canvas = new Canvas(1920, 1080);
        gameMap.render(canvas);

        Pane root = new Pane();
        root.getChildren().add(canvas);

        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("RPG Map");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}