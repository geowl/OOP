package OOP;

import java.util.Random;

public class Sniper extends Archer {

    public Sniper(String nameHero, int posX, int posY) {
        super(nameHero, posX, posY);
    }
    public void applyDamage(Hero enemy, int damage) {
        System.out.println(enemy.getInfo() + " получил урон: " + damage);
        enemy.health -= damage;
        if (enemy.health <= 0) {
            System.out.println(enemy.getInfo() + " уничтожен.");
        }
    }

    @Override
    protected void attack(Hero enemy) {
        System.out.println(getInfo() + " атаковал " + enemy.getInfo());
        if (isCriticalHit()) {
            int criticalDamage = calculateCriticalDamage(enemy);
            System.out.println("Критический урон " + enemy.getInfo() + " убит");
            enemy.health = 0;
        } else {
            int damageToEnemy = calculateDamage(enemy);
            applyDamage(enemy, damageToEnemy);
        }
    }

    private boolean isCriticalHit() {
        Random random = new Random();
        int chance = random.nextInt(100) + 1;
        return chance >= 95;
    }

    private int calculateCriticalDamage(Hero enemy) {
        return damage[1] * 3;
    }

    @Override
    protected int calculateDamage(Hero enemy) {
        return damage[1];
    }

    @Override
    public String getInfo() {
        return "Снайпер " + nameHero;
    }
}
