package org.example.rpgmapmaker;

import javafx.scene.image.Image;
import java.util.HashMap;
import java.util.Map;

public class TileGraphicFactory {
    private final Map<String, Image> tileGraphics = new HashMap<>();

    public Image getTileGraphic(String type) {
        if (!tileGraphics.containsKey(type)) {
            tileGraphics.put(type, loadImageForType(type));
        }
        return tileGraphics.get(type);
    }

    private Image loadImageForType(String type) {
        return switch (type) {
            case "forest" -> new Image("/forest.png");
            case "road" -> new Image("/road.png");
            case "building" -> new Image("/building.png");
            case "swamp" -> new Image("/swamp.png");
            case "water" -> new Image("/water.png");
            default -> throw new IllegalArgumentException("Unknown tile type: " + type);
        };
    }
}