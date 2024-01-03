package OOP;

public class Pikeman extends Hero{
    protected Pikeman(String nameHero) {
        super(75,
                75,
                5,
                new int[]{20, 35}, nameHero);
    }

    @Override
    public String toString() {
        return ("Копейщик: " + nameHero + " " + "Здоровье: " + health + "/" + healthMax + " " + "Броня: " + armor);
    }
}