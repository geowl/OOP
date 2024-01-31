package OOP;

import java.util.Random;

public class Crossbower extends Archer {

    private boolean poisonedArrowActive = false;

    public Crossbower (String nameHero, int posX, int posY, int init) {
        super(nameHero,75,75,0, new int[]{19, 24}, posX, posY, init);
    }

    public void applyDamage(Hero enemy, int damage) {
        System.out.println(enemy.getInfo() + " получил урон: " + damage);
        enemy.health -= damage;
        if (enemy.health <= 0) {
            System.out.println(enemy.getInfo() + " ПОМЕР");
        }
    }

    @Override
    protected void attack(Hero enemy) {
        System.out.println(getInfo() + " атаковал " + enemy.getInfo());

        if (isPoisonedArrow()) {
            System.out.println("Отравленная стрела " + enemy.getInfo() + " отравлен.");
            poisonedArrowActive = true;
        } else {
            int damageToEnemy = calculateDamage(enemy);
            applyDamage(enemy, damageToEnemy);
        }

        if (poisonedArrowActive) {
            System.out.println("Отравленная стрела наносит урон " + enemy.getInfo());
            int poisonDamage = calculatePoisonDamage();
            applyDamage(enemy, poisonDamage);
            if (poisonedArrowActive) {
                poisonedArrowActive = false;
            }
        }
    }

    private boolean isPoisonedArrow() {
        Random random = new Random();
        int chance = random.nextInt(100) + 1;
        return chance <= 10;
    }

    private int calculatePoisonDamage() {
        return 15;
    }

    @Override
    protected int calculateDamage(Hero enemy) {
        return damage[0];
    }

    @Override
    public String getInfo() {
        return "Арбалетчик " + nameHero;
    }
}
