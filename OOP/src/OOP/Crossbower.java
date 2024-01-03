package OOP;

public class Crossbower extends Hero {
    protected Crossbower(String nameHero) {
        super(75,
                75,
                5,
                new int[]{10, 15}, nameHero);
    }

    @Override
    public String toString() {
        return ("Арбалетчик: " + nameHero + " " + "Здоровье: " + health + "/" + healthMax + " " + "Броня: " + armor);
    }
}
