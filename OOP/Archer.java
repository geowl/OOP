package OOP;

import java.util.ArrayList;

public abstract class Archer extends Hero {
    private int arrows = 0;

    public Archer(int healthMax, int armor, int[] damage, String nameHero, int posX, int posY) {
        super(75, 75, 0, new int[]{0, 0}, nameHero, posX, posY);
    }

    @Override
    public abstract void attack(Hero enemy);

    @Override
    public abstract int calculateDamage(Hero enemy);

    @Override
    public void step(ArrayList<Hero> enemies) {
        if (health <= 0) {
            return;
        } else if (damage[1] <= 0) {
            System.out.println("У " + nameHero + " нет стрел.");
            return;
        }

        Hero nearestEnemy = findNearestEnemy(enemies);
        if (nearestEnemy != null) {
            attack(nearestEnemy);
            damage[1]--;
            int damageToEnemy = calculateDamage(nearestEnemy);

            if (nearestEnemy.armor > 0) {
                nearestEnemy.armor -= damageToEnemy;
            } else {
                nearestEnemy.health -= damageToEnemy;
            }

            System.out.println(nameHero + " выстрелил в " + nearestEnemy.nameHero +
                    ". Осталось стрел: " + damage[1] +
                    " У " + nearestEnemy.nameHero + " осталось хп: " + nearestEnemy.health +
                    ", брони: " + nearestEnemy.armor);
        } else {
            System.out.println(nameHero + " НЕТ ПРОТИВНИКА В ЗОНЕ ВЫСТРЕЛА.");
        }
    }

    public void addArrowFromPeasants(ArrayList<Hero> Peasant) {
        for (Hero hero : Peasant) {
            if (hero instanceof Peasant) {
                Peasant peasant = (Peasant) hero;
                if (peasant.isAlive() && peasant.isReady()) {
                    peasant.raiseReadyFlag();
                    arrows++;
                    System.out.println(" получил стрелу от крестьянина ");
                    break;
                }
            }
        }
    }

    private Hero findNearestEnemy(ArrayList<Hero> enemies) {
        Hero nearestEnemy = null;
        double minDistance = Double.MAX_VALUE;
        Vector2 myPosition = position;

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
}
