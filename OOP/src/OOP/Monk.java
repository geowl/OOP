package OOP;

public class Monk extends Hero{
    protected Monk(String nameHero) {
        super(50,
                50,
                2,
                new int [] {-35,-30}, nameHero);;
    }
    @Override
    public String toString() {
        return ("Монах: " + nameHero + " " + "Здоровье: " + health + "/" + healthMax + " " + "Броня: " + armor);
    }
}
