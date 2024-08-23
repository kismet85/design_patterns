package RPGMapGenerator;

import java.util.Random;

public class WildernessMap extends Map {

    public WildernessMap(int width, int height) {
        super(width, height);
    }

    public Tile createTile()
    {
        Random randomTile = new Random();
        int value = randomTile.nextInt(3);
        return switch (value) {
            case 0 -> new SwampTile();
            case 1 -> new ForestTile();
            case 2 -> new WaterTile();
            default -> null;
        };
    }
}
