package State;

public class IntermediateState implements State {

    private static final int LEVEL_UP_EXPERIENCE = 200;
    @Override
    public void train(Character character) {
        System.out.println("You feel training is becoming easier and you quickly learn new skill!");
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
        System.out.println("You cannot fight at this level!");
    }

    private void checkLevelUp(Character character) {
        if(character.getExperiencePoints() >= LEVEL_UP_EXPERIENCE)
        {
            System.out.println("You have leveled up, you are now at expert level!");
            character.setLevel(new ExpertState());
        }
    }

    @Override
    public String toString() {
        return "Intermediate";
    }
}
