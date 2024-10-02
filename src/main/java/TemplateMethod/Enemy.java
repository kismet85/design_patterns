package TemplateMethod;

public class Enemy {
    private final String name;
    private final String description;
    private int health;
    private final int attackPower;

    public Enemy(String name, String description, int health, int attackPower) {
        this.name = name;
        this.description = description;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public int getHealth() { return health; }
    public int getAttackPower() { return attackPower; }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " took " + damage + " damage. Remaining health: " + health);
    }
}