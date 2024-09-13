package State;

public class ExpertState implements State {
    private static final int LEVEL_UP_EXPERIENCE = 800;

    @Override
    public void train(Character character) {
        System.out.println("You are now an expert, training gains little valuable experience!");
        character.setExperiencePoints(character.getExperiencePoints() + 25);
        checkLevelUp(character);
    }

    @Override
    public void meditate(Character character) {
        System.out.println("Meditating in peace...you feel tranquility!");
        character.setHealthPoints(character.getHealthPoints() + 1);
    }

    @Override
    public void fight(Character character) {
        System.out.println("Fighting... gaining experience but losing health.");
        character.setExperiencePoints(character.getExperiencePoints() + 100);
        character.setHealthPoints(character.getHealthPoints() - 2);

        if (character.getHealthPoints() <= 0) {
            System.out.println("You have died. Game over.");
            System.exit(0);
        }

        checkLevelUp(character);
    }

    private void checkLevelUp(Character character) {
        if(character.getExperiencePoints() >= LEVEL_UP_EXPERIENCE)
        {
            System.out.println("You have leveled up, you are now a Master!!!");
            character.setLevel(new MasterState());
        }
    }

    @Override
    public String toString() {
        return "Expert";
    }
}
