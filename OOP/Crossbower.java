package OOP;


import java.util.ArrayList;
import java.util.Iterator;
public class Crossbower extends Archer {

    public Crossbower(String nameHero, int posX, int posY) {
        super(nameHero, posX, posY);

//public class Crossbower extends Hero {
//    protected int rangeMaxDamage = 4;
//    protected Vector2 position;
//
//    public Crossbower(String nameHero, int posX, int posY) {
//        super(75, 75, 5, new int[]{10, 15}, nameHero, posX, posY);
//        this.position = new Vector2(posX, posY);
//    }
//
//    public Hero findNearestEnemy(ArrayList<Hero> enemies) {
//        Hero nearestEnemy = null;
//        double minDistance = Double.MAX_VALUE;
//        Vector2 myPosition = this.position;
//        Iterator var6 = enemies.iterator();
//
//        while(var6.hasNext()) {
//            Hero enemy = (Hero)var6.next();
//            Vector2 enemyPosition = enemy.position;
//            float distance = myPosition.rangeEnemy(enemyPosition);
//            if ((double)distance < minDistance) {
//                minDistance = (double)distance;
//                nearestEnemy = enemy;
//            }
//        }
//
//        return nearestEnemy;
//    }
//
//    public String toString() {
//        return "Арбалетчик: " + this.nameHero + " Здоровье: " + this.health + "/" + this.healthMax + " Броня: " + this.armor;
//    }


