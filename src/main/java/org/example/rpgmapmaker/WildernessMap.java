package org.example.rpgmapmaker;

import java.util.Random;

public class WildernessMap extends Map {
    public WildernessMap(int width, int height, TileGraphicFactory graphicFactory) {
        super(width, height, graphicFactory);
    }

    @Override
    protected Tile createTile() {
        Random rand = new Random();
        int randomTile = rand.nextInt(3);
        String tileType = switch (randomTile) {
            case 0 -> "swamp";
            case 1 -> "water";
            case 2 -> "forest";
            default -> throw new IllegalStateException("Unexpected value: " + randomTile);
        };

        // Create the tile and assign its graphic using the factory
        return new GenericTile(tileType, graphicFactory.getTileGraphic(tileType));
    }
}