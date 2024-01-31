package OOP;

public class Rogue extends Infantry {

    public Rogue(String nameHero, int posX, int posY,int init) {
        super(100,100,5,new int[] {20,30}, nameHero, posX, posY,init);
    }

    @Override
    public String getInfo() {
        return "Разбойник" + nameHero;
    }
}



//public class Rogue extends Hero {
//
//    public Rogue(String nameHero, int posX, int posY) {
//        super(100,
//                100,
//                5,
//                new int [] {20,30}, nameHero, posX, posY);
//    }
//
//    @Override
//    public String toString() {
//        return ("Разбойник: " + nameHero + " " + "Здоровье: " + health + "/" + healthMax + " " + "Броня: " + armor);
//    }
//}

