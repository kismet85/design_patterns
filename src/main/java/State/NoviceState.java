package State;

public class NoviceState implements State {

    private static final int LEVEL_UP_EXPERIENCE = 50;
    @Override
    public void train(Character character) {
        System.out.println("Beginning your training, clumsy at first but gain experience!");
        character.setExperiencePoints(character.getExperiencePoints() + 25);
        checkLevelUp(character);
    }

    @Override
    public void meditate(Character character) {
        System.out.println("You cannot meditate at this level!");
    }

    @Override
    public void fight(Character character) {
        System.out.println("You cannot fight at this level!");
    }

    private void checkLevelUp(Character character) {
        if(character.getExperiencePoints() >= LEVEL_UP_EXPERIENCE)
        {
            System.out.println("You have leveled up, you are now intermediary level!");
            character.setLevel(new IntermediateState());
        }
    }

    @Override
    public String toString() {
        return "Novice";
    }
}
