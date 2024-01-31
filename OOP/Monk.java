package OOP;

public class Monk extends Helear {
    public Monk(String nameHero, int posX, int posY,int init) {
        super(nameHero,
                50,
                50,
                0,
                0,
                new int[]{-10, -15},
                posY,
                posY,
                2,
                7,
                3,
                100,
                100,
                5, init);
    }

    @Override
    public String toString() {
        return "Monk" + super.toString();
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