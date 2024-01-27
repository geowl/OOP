package OOP;


public class Monk extends Healer{

    public Monk(int healthMax, int armor, int initiative, int[] damage, String nameHero, int posX, int posY) {
        super(healthMax, armor, initiative, damage, nameHero, posX, posY);
    }

    @Override
    public String getInfo() {
        return "Монах";
    }
}
//
//    public Monk(String nameHero, int posX, int posY) {
//        super(50,
//                50,
//                2,
//                new int [] {-35,-30}, nameHero, posX, posY);
//    }
//
//    @Override
//    public String toString() {
//        return ("Монах: " + nameHero + " " + "Здоровье: " + health + "/" + healthMax + " " + "Броня: " + armor);
//    }
//}
