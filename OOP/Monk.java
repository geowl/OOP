package OOP;

public class Monk extends Hero{

    public Monk(String nameHero, int posX, int posY) {
        super(50,
                50,
                2,
                new int [] {-35,-30}, nameHero, posX, posY);
    }

    @Override
    public String toString() {
        return ("Монах: " + nameHero + " " + "Здоровье: " + health + "/" + healthMax + " " + "Броня: " + armor);
    }
}
