package org.example.rpgmapmaker;

import javafx.scene.image.Image;

public class Forest implements Tile {
    private static final Image graphic = new Image("/forest.png");

    @Override
    public Image getGraphic() {
        return graphic; // Shared intrinsic state
    }

    @Override
    public String getType() {
        return "forest";
    }
}