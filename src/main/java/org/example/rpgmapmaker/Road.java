package org.example.rpgmapmaker;

import javafx.scene.image.Image;

public class Road implements Tile {
    private static final Image graphic = new Image("/road.png");

    @Override
    public Image getGraphic() {
        return graphic; // Shared intrinsic state
    }

    @Override
    public String getType() {
        return "road";
    }
}