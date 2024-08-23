package RPGMapGenerator;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Game game = new Game();

        int valinta;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose a game type:");
            System.out.println("1: Wilderness");
            System.out.println("2: City");
            valinta = sc.nextInt();
            if (valinta == 1) {
                game.createMap(GameType.WILDERNESS);
            } else if (valinta == 2) {
                game.createMap(GameType.CITY);
            }
        } while (valinta < 1 || valinta > 2);
    }

    public void createMap(GameType gameType)
    {
        Map map;
        if(gameType.equals(GameType.WILDERNESS))
        {
            map = new WildernessMap(5,5);
            map.display();
        }
        else if(gameType.equals(GameType.CITY))
        {
            map = new CityMap(5,5);
            map.display();
        }
    }
}
