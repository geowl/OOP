package OOP;

import java.util.ArrayList;
public abstract class Hero implements GameI, Initiative{

    protected int health, healthMax, armor, init;
    protected Vector2 position;

    int[] damage;

    String nameHero;

    protected Hero(int health, int healthMax, int armor, int[] damage, String nameHero, int posX, int posY, int init) {
        this.health = health;
        this.healthMax = healthMax;
        this.armor = armor;
        this.damage = damage;
        this.nameHero = nameHero;
        this.position = new Vector2(posX, posY);
        this.init = init;
    }

    @Override
    public void step() {
    }
    @Override
    public abstract int getInit();

    public abstract String getInfo();

    public void printEnemysDistance(ArrayList<Hero> enemys) {
        enemys.forEach(n -> System.out.print(position.rangeEnemy(n.position) + ", "));
        System.out.println();
    }

    public int[] getCoords() {
        return new int[]{position.posX, position.posY};
    }

    public int getHp() {
        return health;
    }
}

//
//
//    public  abstract  String getInfo();
//
//    public int getHp() {
//    }
//
//    public double[] getCoords() {
//    }
//
//}
//public abstract class Hero {
//
//    protected int health, healthMax, armor;
//    protected Vector2 position;
//
//    int [] damage;
//
//    String nameHero;
//
//    protected Hero(int health, int healthMax, int armor, int[] damage, String nameHero, int posX, int posY) {
//        this.health = health;
//        this.healthMax = healthMax;
//        this.armor = armor;
//        this.damage = damage;
//        this.nameHero = nameHero;
//        this.position = new Vector2(posX,posY);
//
//    }
//    public void printEnemysDistance(ArrayList<Hero> enemys){
//        enemys.forEach(n-> System.out.print(position.rangeEnemy(n.position)+", "));
//        System.out.println();
//
//    }
//
//    public int [] getCoords() {
//        return new int[]{position.posX, position.posY};
//    }
//
//    public int getHp() {
//        return health;
//    }
//}

