package org.example.rpgmapmaker;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Map {
    private final int width;
    private final int height;
    private final Tile[][] grid;
    final TileGraphicFactory graphicFactory;

    public Map(int width, int height, TileGraphicFactory graphicFactory) {
        this.width = width;
        this.height = height;
        this.graphicFactory = graphicFactory;
        grid = new Tile[height][width];
        generateTiles();
    }

    private void generateTiles() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                grid[i][j] = createTile();
            }
        }
    }

    protected Tile createTile() {
        // Implement in subclasses
        return null;
    }

    public void render(Canvas canvas) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                Image graphic = grid[i][j].getGraphic();
                gc.drawImage(graphic, j * 32, i * 32, 32, 32); // Assuming 32x32 tiles
            }
        }
    }
}