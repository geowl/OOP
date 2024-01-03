package OOP;

public class Peasant extends Hero{
    protected Peasant(String nameHero) {
        super(100,
                100,
                1,
                new int [] {0,0}, nameHero);
    }
    @Override
    public String toString() {
        return ("Крестьянин: " + nameHero + " " + "Здоровье: " + health + "/" + healthMax + " " + "Броня: " + armor);
    }
}


