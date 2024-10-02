package TemplateMethod;

import java.util.Scanner;

class ClassroomRPG extends Game {
    private Player player;
    private Enemy currentEnemy;
    private EncounterManager encounterManager;
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void initializeGame(int numberOfPlayers) {
        System.out.println("Enter your name: ");
        String playerName = scanner.nextLine();
        player = new Player(playerName, 100, 20);
        encounterManager = new EncounterManager();
        System.out.println(playerName + " has entered the classroom...");
    }

    @Override
    public boolean endOfGame() {
        return player.getHealth() <= 0 || encounterManager.allEnemiesDefeated();
    }


    @Override
    public void playSingleTurn(int playerTurn) {
        if (currentEnemy == null || currentEnemy.getHealth() <= 0) {
            currentEnemy = encounterManager.getRandomEnemy();
            if (currentEnemy == null) {
                return;
            }
            System.out.println("A wild " + currentEnemy.getName() + " appears!");
            System.out.println(currentEnemy.getDescription());
        }

        System.out.println("Choose your action:");
        System.out.println("1. Attack");
        System.out.println("2. Defend");
        System.out.println("3. Hide");
        System.out.println("4. Distract");

        int action = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        switch (action) {
            case 1:
                System.out.println("You attack " + currentEnemy.getName() + "!");
                currentEnemy.takeDamage(player.getAttackPower());
                break;
            case 2:
                System.out.println("You defend yourself!");
                player.increaseDefense();
                break;
            case 3:
                System.out.println("You try to hide!");
                if (Math.random() > 0.5) {
                    System.out.println("You successfully hid from " + currentEnemy.getName() + "!");
                    return;
                } else {
                    System.out.println("You failed to hide!");
                }
                break;
            case 4:
                System.out.println("You attempt to distract " + currentEnemy.getName() + "!");
                if (Math.random() > 0.5) {
                    System.out.println(currentEnemy.getName() + " is distracted and skips their turn!");
                    return;
                } else {
                    System.out.println("The distraction failed!");
                }
                break;
            default:
                System.out.println("Invalid action. You lose your turn!");
                break;
        }

        if (currentEnemy.getHealth() > 0) {
            System.out.println(currentEnemy.getName() + " attacks you!");
            player.takeDamage(currentEnemy.getAttackPower());
        } else {
            System.out.println(currentEnemy.getName() + " has been defeated!");
        }
    }


    @Override
    public void displayWinner() {
        if (player.getHealth() > 0) {
            System.out.println("Congratulations " + player.getName() + ", you have survived the classroom!");
        } else {
            System.out.println("Game over! You were defeated in the classroom...");
        }
    }
}