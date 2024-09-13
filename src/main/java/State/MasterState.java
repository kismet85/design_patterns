package State;

public class MasterState implements State {
    @Override
    public void train(Character character) {
        System.out.println("You are a master, no need for training.");
    }

    @Override
    public void meditate(Character character) {
        System.out.println("You are a master, no need to meditate.");
    }

    @Override
    public void fight(Character character) {
        System.out.println("You are a master, no need to fight.");
    }
}
