package org.example.rpgmapmaker;

import javafx.scene.image.Image;

public class GenericTile implements Tile {
    private final String type;
    private final Image graphic;

    public GenericTile(String type, Image graphic) {
        this.type = type;
        this.graphic = graphic;
    }

    @Override
    public Image getGraphic() {
        return graphic; // Shared intrinsic state
    }

    @Override
    public String getType() {
        return type;
    }
}