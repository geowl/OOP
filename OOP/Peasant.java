package OOP;

public class Peasant extends Hero implements Initiative {
    @Override
    public int getInit() {
        return this.init;
    }
    private boolean ready = true;
    public Peasant(String nameHero, int posX, int posY) {
        super(100,
                100,
                1,
                new int[]{0, 0}, nameHero, posX, posY);
    }
    public boolean isReady() {
        return ready;
    }
    public void raiseReadyFlag() {
        ready = true;
    }

    @Override
    public String getInfo() {
        return "Крестьянин" + nameHero;
    }

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public void receiveHealing(int amount) {

    }

    @Override
    public void resurrect() {

    }
}

//    @Override
//    public String toString() {
//        return ("Крестьянин: " + nameHero + " " + "Здоровье: " + health + "/" + healthMax + " " + "Броня: " + armor);
//    }
//}


