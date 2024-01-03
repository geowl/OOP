package OOP;

public class Sniper extends Hero {
    protected Sniper(String nameHero) {
        super(75,
                75,
                2,
                new int[]{10, 15}, nameHero);
        ;
    }

    @Override
    public String toString() {
        return ("Снайпер: " + nameHero + " " + "Здоровье: " + health + "/" + healthMax + " " + "Броня: " + armor);
    }
}
