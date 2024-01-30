package OOP;

import java.util.ArrayList;

public abstract class Infantry extends Hero implements Initiative{
    @Override
    public int getInitiative() {
        return this.init;
    }
    private final String currentDirection = "Начальное направление: ВВЕРХ";

    public Infantry(String nameHero, int posX, int posY) {
        super(75, 75, 5, new int[]{20, 35}, nameHero, posX, posY);
    }

    @Override
    public void step(ArrayList<Hero> enemies) {
        if (health <= 0) {
            return;
        }
        Hero nearestEnemy = findNearestEnemy(enemies);
        if (nearestEnemy != null) {
            attack(nearestEnemy);
            int damageToEnemy = calculateDamage(nearestEnemy);
            if (nearestEnemy.armor > 0) {
                nearestEnemy.armor -= damageToEnemy;
            } else {
                nearestEnemy.health -= damageToEnemy;
            }

            System.out.println(nameHero + " атаковал " + nearestEnemy.nameHero +
                    " у " + nearestEnemy.nameHero + " осталось хп: " + nearestEnemy.health +
                    " брони: " + nearestEnemy.armor);

            if (nearestEnemy.health <= 0) {
                System.out.println(nearestEnemy.nameHero + " погиб от атаки " + nameHero + "!");
            }
        } else {
            move(enemies);
        }
    }

    protected void move(ArrayList<Hero> enemies) {
        if (enemies.isEmpty()) {
            return;
        }

        Hero nearestEnemy = findNearestEnemy(enemies);
        int dX = nearestEnemy.position.getX() - position.getX();
        int dY = nearestEnemy.position.getY() - position.getY();

        if (Math.abs(dX) > Math.abs(dY)) {
            if (dX > 0) {
                position.moveRight(1);
                System.out.println(nameHero + " двигается вправо");
            } else {
                position.moveLeft(1);
                System.out.println(nameHero + " двигается влево");
            }
        } else {
            if (dY > 0) {
                position.moveDown(1);
                System.out.println(nameHero + " двигается вниз");
            } else {
                position.moveUp(1);
                System.out.println(nameHero + " двигается вверх");
            }
        }
    }

    @Override
    public String getInfo() {
        return null;
    }

    protected abstract Hero findNearestEnemy(ArrayList<Hero> enemies);
    protected abstract void attack(Hero enemy);
    protected abstract int calculateDamage(Hero enemy);
}
