package OOP;

import java.util.Random;

import java.util.Random;

abstract class Healer extends Hero {
    private int[] healings = {30, 35};
    private double[] reviveChances = {0.2, 1};
    private static final Random random = new Random();

    public Healer(int healthMax, int armor, int initiative, int[] damage, String nameHero, int posX, int posY) {
        super(healthMax, armor, initiative, damage, nameHero, posX, posY);
    }

    public void heal(Hero allies) {
        if (allies.isAlive()) {
            int healingAmount = getRandomHealing();
            allies.receiveHealing(healingAmount);
            System.out.println(this.nameHero() + " лечит " + allies.nameHero() + " на + " + healingAmount + " хп");
        }
    }

    private int getRandomHealing() {
        return healings[random.nextInt(healings.length)];
    }

    public void revive(Hero allies) {
        if (!allies.isAlive() && random.nextDouble() < getRandomReviveChance()) {
            allies.resurrect();
            System.out.println(this.nameHero() + " воскрешает " + allies.nameHero());
        }
    }

    private double getRandomReviveChance() {
        return reviveChances[random.nextInt(reviveChances.length)];
    }
}
