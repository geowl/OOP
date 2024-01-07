package OOP;

import java.util.ArrayList;

public class Crossbower extends Hero {
       public Crossbower(String nameHero, int posX, int posY) {
        super(75, 75, 5, new int [] {10,15}, nameHero, posX, posY);
        rangeMaxDamage = 4;
        this.position = new Vector2(posX, posY);
    }


    public Hero findNearestEnemy(ArrayList<Hero> enemies) {
        Hero nearestEnemy = null;
        double minDistance = Double.MAX_VALUE;
        Vector2 myPosition = this.position;

        for (Hero enemy : enemies) {
            Vector2 enemyPosition = enemy.position;
            float distance = myPosition.rangeEnemy(enemyPosition);

            if (distance < minDistance) {
                minDistance = distance;
                nearestEnemy = enemy;
            }
        }

        return nearestEnemy;
    }


    protected int rangeMaxDamage;
    protected Vector2 position;
    @Override
    public String toString() {
        return ("Арбалетчик: " + nameHero + " " + "Здоровье: " + health + "/" + healthMax + " " + "Броня: " + armor);
    }
}
