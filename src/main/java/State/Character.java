package State;

public class Character {

    private String name;
    State level;
    double experiencePoints;
    int healthPoints;

    public Character(String name)
    {
        this.name = name;
        this.level = new NoviceState();
        this.experiencePoints = 0;
        this.healthPoints = 10;
    }
    // The game character has the following levels (represented as states of the State DP): novice, intermediate, expert, and master.


    public State getLevel() {
        return level;
    }

    public void setLevel(State level) {
        this.level = level;
    }

    public double getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(double experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void train()
    {
        level.train(this);
    }

    public void meditate()
    {
        level.meditate(this);
    }

    public void fight()
    {
        level.fight(this);
    }

    public void displayStats()
    {
        System.out.println("-------------------------------------");
        System.out.println(name + ":");
        System.out.println("Level: " + getLevel());
        System.out.println("Experience points: " + getExperiencePoints());
        System.out.println("Health: " + getHealthPoints());
        System.out.println("-------------------------------------");
    }
}
