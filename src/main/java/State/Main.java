package State;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);
            Character character = new Character("Hero");

            while (!(character.getLevel() instanceof MasterState)) {
                character.displayStats();
                System.out.println("Choose an action: 1 - Train, 2 - Meditate, 3 - Fight");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> character.train();
                    case 2 -> character.meditate();
                    case 3 -> character.fight();
                    default -> System.out.println("Invalid action. Try again.");
                }
            }

            System.out.println("Game Over! You've reached Master level.");
        }
}
