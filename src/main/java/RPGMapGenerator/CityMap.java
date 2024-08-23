package RPGMapGenerator;

import java.util.Random;

public class CityMap extends Map {
    @Override
    public Tile createTile() {
        Random randomTile = new Random();
        int value = randomTile.nextInt(3);
        return switch (value) {
            case 0 -> new RoadTile();
            case 1 -> new ForestTile();
            case 2 -> new BuildingTile();
            default -> null;
        };
    }

    public CityMap(int width, int height) {
        super(width, height);
    }
}
