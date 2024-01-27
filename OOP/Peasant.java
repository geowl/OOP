package OOP;

public class Peasant extends Hero{

    public Peasant(String nameHero, int posX, int posY) {
        super(100,
                100,
                1,
                new int [] {0,0}, nameHero, posX, posY);
    }

//    @Override
//    public String toString() {
//        return ("Крестьянин: " + nameHero + " " + "Здоровье: " + health + "/" + healthMax + " " + "Броня: " + armor);
//    }
//}


