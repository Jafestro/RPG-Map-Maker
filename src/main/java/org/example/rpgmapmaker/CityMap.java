package org.example.rpgmapmaker;

import java.util.Random;

public class CityMap extends Map {
    public CityMap(int width, int height, TileGraphicFactory graphicFactory) {
        super(width, height, graphicFactory);
    }

    @Override
    protected Tile createTile() {
        Random rand = new Random();
        int randomTile = rand.nextInt(3);
        String tileType = switch (randomTile) {
            case 0 -> "road";
            case 1 -> "forest";
            case 2 -> "building";
            default -> throw new IllegalStateException("Unexpected value: " + randomTile);
        };

        // Create the tile and assign its graphic using the factory
        return new GenericTile(tileType, graphicFactory.getTileGraphic(tileType));
    }
}
