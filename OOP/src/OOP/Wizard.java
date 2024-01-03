package OOP;

public class Wizard extends Hero {
    protected Wizard(String nameHero) {
        super(50,
                50,
                2,
                new int[]{-35, -30}, nameHero);
        ;
    }

    @Override
    public String toString() {
        return ("Колдун: " + nameHero + " " + "Здоровье: " + health + "/" + healthMax + " " + "Броня: " + armor);
    }
}