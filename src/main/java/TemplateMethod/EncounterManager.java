package TemplateMethod;

import java.util.ArrayList;
import java.util.List;

class EncounterManager {
    private List<Enemy> enemies;
    private int currentEnemyIndex = 0;

    public EncounterManager() {
        enemies = new ArrayList<>();
        enemies.add(new Enemy("Ganir the Mad", "A wild professor...", 50, 25));
        enemies.add(new Enemy("Spindleneck", "A student with a spinning neck...", 40, 10));
        enemies.add(new Enemy("Himo the jiggler", "Himo is a giant jiggler that jiggles and shakes the enetire classroom..",150, 12 ));
    }

    public Enemy getRandomEnemy() {
        if (currentEnemyIndex < enemies.size()) {
            return enemies.get(currentEnemyIndex++);
        } else {
            return null;
        }
    }

    public boolean allEnemiesDefeated() {
        return currentEnemyIndex >= enemies.size();
    }
}
