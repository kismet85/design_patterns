package TemplateMethod;

class Player {
    private final String name;
    private int health;
    private final int attackPower;

    private int defense = 10;

    private int baseDefense;

    public Player(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getAttackPower() { return attackPower; }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " took " + damage + " damage. Remaining health: " + health);
    }

    public void increaseDefense() {

        this.defense += 10;
    }

    public void resetDefense() {
        this.defense = baseDefense;
    }

}