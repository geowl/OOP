package OOP;

import java.util.Objects;
import java.util.ArrayList;

public abstract class Helear extends Hero {
    protected int healPoint, maxRangeHeal, mana, maxMana, manaRecovery;

    public Helear(String name, int healthMax, int health, int armor, int[] damage, int posX, int posY, int init, int healPoint, int maxRangeHeal, int mana, int maxMana, int manaRecovery) {
        super(healthMax, health, armor, damage, name, posX, posY, init);
        this.healPoint = healPoint;
        this.maxRangeHeal = maxRangeHeal;
        this.mana = mana;
        this.maxMana = maxMana;
        this.manaRecovery = manaRecovery;
    }
    protected int getHealthMax(Hero hero) {
        return hero.healthMax;
    }
    protected void resurrect(Hero hero) {
        int resurrectionAmount = calculateHealingAmount(getHealthMax(hero));
        hero.health += resurrectionAmount;
        mana -= getHealthMax(hero);
    }
    protected void regenerateMana() {
        mana += manaRecovery;
        if (mana > maxMana) mana = maxMana;
    }

    protected boolean canHeal(Hero hero) {
        double distance = position.rangeEnemy(hero.position);
        return (distance < maxRangeHeal) && (hero.getHp() < healthMax - healPoint) && (mana >= healPoint);
    }

    protected boolean isAllAlliesDead(ArrayList<Hero> allies) {
        boolean isAnyAlly = false;

        for (Hero ally : allies) {
            if (ally != this && ally.getHp() > 0) {
                isAnyAlly = true;
                return false;
            }
        }

        return !isAnyAlly;
    }

    protected void helpNearestDeadAlly(ArrayList<Hero> allies) {
        Hero nearestDeadAlly = findNearestDeadAlly(allies);

        double distanceToNearestDeadAlly = position.rangeEnemy(nearestDeadAlly.position);

        if (distanceToNearestDeadAlly < maxRangeHeal) {
            if (mana >= nearestDeadAlly.healthMax) {
                resurrect(nearestDeadAlly);
                return;
            }
            return;
        }

        Vector2 nextPosition = findNextPosition(nearestDeadAlly, allies);
        boolean stepIsFree = isStepFree(nextPosition, allies);
        if (stepIsFree) position = nextPosition;
    }

    private Hero findNearestDeadAlly(ArrayList<Hero> allies) {
        Hero nearestDeadAlly = null;
        double minDistance = Double.MAX_VALUE;

        for (Hero ally : allies) {
            if (ally != this && ally.getHp() <= 0) {
                double distance = position.rangeEnemy(ally.position);
                if (distance < minDistance) {
                    minDistance = distance;
                    nearestDeadAlly = ally;
                }
            }
        }

        return nearestDeadAlly;
    }

    private int calculateHealingAmount(int amount) {
        int healingAmount = amount + damage[0];
        return healingAmount;
    }

    private Vector2 findNextPosition(Hero targetHero, ArrayList<Hero> allies) {
        return new Vector2(position.getX(), position.getY() - 1);
    }

    private boolean isStepFree(Vector2 nextPosition, ArrayList<Hero> allies) {
        for (Hero ally : allies) {
            if (nextPosition.equals(ally.position)) {
                return false;
            }
        }
        return true;
    }

}
