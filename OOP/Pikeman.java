package OOP;


public class Pikeman extends Infantry {

    public Pikeman(String nameHero, int posX, int posY) {
        super(nameHero, posX, posY);
    }

    @Override
    public String getInfo() {
        return "Копейщик" + nameHero;
    }
}


//public class Pikeman extends Hero{
//    public Pikeman(String nameHero, int posX, int posY) {
//        super(75,
//                75,
//                5,
//                new int[]{20, 35}, nameHero, posX, posY);
//    }
//    @Override
//    public String toString() {
//        return ("Копейщик: " + nameHero + " " + "Здоровье: " + health + "/" + healthMax + " " + "Броня: " + armor);
//    }
//}