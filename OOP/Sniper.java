package OOP;

public class Sniper extends Archer {

    public Sniper(String nameHero, int posX, int posY) {
        super(nameHero, posX, posY);
    }

    @Override
    public String getInfo() {
        return "Снайпер" + nameHero;
    }
}
//public class Sniper extends Hero {
//    public Sniper(String nameHero, int posX, int posY) {
//        super(75,
//                75,
//                2,
//                new int[]{10, 15}, nameHero, posX, posY);
//    }
//
//    @Override
//    public String toString() {
//        return ("Снайпер: " + nameHero + " " + "Здоровье: " + health + "/" + healthMax + " " + "Броня: " + armor);
//    }
//}
