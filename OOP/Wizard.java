package OOP;

public class Wizard extends Healer{


    public Wizard(int healthMax, int armor, int initiative, int[] damage, String nameHero, int posX, int posY) {
        super(healthMax, armor, initiative, damage, nameHero, posX, posY);
    }

    @Override
    public String getInfo() {
        return "Колдун" + nameHero;
    }
}


//public class Wizard extends Hero {
//
//    public Wizard( String nameHero, int posX, int posY) {
//        super(50, 50, 2, new int [] {-35,-30}, nameHero, posX, posY);
//    }
//
//
//    @Override
//    public String toString() {
//        return ("Колдун: " + nameHero + " " + "Здоровье: " + health + "/" + healthMax + " " + "Броня: " + armor);
//    }
//}