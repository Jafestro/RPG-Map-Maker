package org.example.rpgmapmaker;


import javafx.scene.image.Image;

public interface Tile {
    Image getGraphic();  // Provides the shared intrinsic graphic
    String getType();    // Type of tile (e.g., "forest", "road")
}

