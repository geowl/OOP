package OOP;

import java.util.ArrayList;

public abstract class Archer extends Hero implements Initiative {
    private int init;
    private int arrows = 0;

//    public Archer(String nameHero, int posX, int posY) {
//        super(75, 75, 0, new int[]{30, 45}, nameHero, posX, posY);
//        this.init = 0;
////    }
//rotected Hero(int health, int healthMax, int armor, int[] damage, String nameHero, int posX, int posY) {
//    this.health = health;
//    this.healthMax = healthMax;
//    this.armor = armor;
//    this.damage = damage;
//    this.nameHero = nameHero;
//    this.position = new Vector2(posX, posY);
    protected Archer(String nameHero, int healthMax, int health, int armor, int[] damage, int posX, int posY, int init) {
        super(health, healthMax, armor, new int[] {}, nameHero, posX, posY, init);
        this.init = init;
    }
    @Override
    public int getInit() {
        return this.init;
    }

    @Override
    public void step(ArrayList<Hero> enemies, ArrayList<Hero> allies) {
        if (health <= 0) {
            return;
        } else if (damage[1] <= 0) {
            System.out.println("У " + nameHero + " нет стрел.");
            return;
        }

        Hero nearestEnemy = findNearestEnemy(enemies);
        if (nearestEnemy != null) {
            damage[1]--;
            attack(nearestEnemy);

            int damageToEnemy = calculateDamage(nearestEnemy);

            if (nearestEnemy.armor > 0) {
                nearestEnemy.armor -= damageToEnemy;
            } else {
                nearestEnemy.health -= damageToEnemy;
            }

            System.out.println(nameHero + " выстрелил в " + nearestEnemy.nameHero +
                    " Осталось стрел: " + damage[1] +
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
                    System.out.println(nameHero + " получил стрелу от крестьянина ");
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

    protected void attack(Hero enemy) {
    }
    protected int calculateDamage(Hero enemy) {
        return damage[0];
    }
}
