package RPGMapGenerator;

public class WaterTile implements Tile {
    @Override
    public char getCharacter() {
        return 'W';
    }

    @Override
    public String getDescription() {
        return "Water";
    }
}
