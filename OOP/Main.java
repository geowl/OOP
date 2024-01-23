package OOP;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    static ArrayList<Hero> heroesWhite = new ArrayList<>();
    static ArrayList<Hero> heroesBlack = new ArrayList<>();

    public static void main(String[] args) {
        heroesWhite = generateCommand(5, 0);
        heroesBlack = generateCommand(5, 9);

        heroesWhite.forEach(n -> System.out.println(n.toString()));
        System.out.println("*******");
        heroesBlack.forEach(n -> n.printEnemysDistance(heroesWhite));
    }

    static String getName() {
        return NameOfHeroes.values()[new Random().nextInt(NameOfHeroes.values().length - 1)].toString();
    }

    static ArrayList<Hero> generateCommand(int n, int y) {
        ArrayList<Hero> commandHeroes = new ArrayList<>();
        Random random = new Random();
        int rand;
        for (int i = 0; i < n; i++) {
            rand = random.nextInt(7) + 1;
            switch (rand) {
                case 1:
                    commandHeroes.add(new Crossbower(getName(), i, y));
                    break;
                case 2:
                    commandHeroes.add(new Monk(getName(), i, y));
                    break;
                case 3:
                    commandHeroes.add(new Peasant(getName(), i, y));
                    break;
                case 4:
                    commandHeroes.add(new Wizard(getName(), i, y));
                    break;
                case 5:
                    commandHeroes.add(new Pikeman(getName(), i, y));
                    break;
                case 6:
                    commandHeroes.add(new Sniper(getName(), i, y));
                    break;
                case 7:
                    commandHeroes.add(new Rogue(getName(), i, y));
                    break;
            }
        }
        return commandHeroes;
    }

    ArrayList<Hero> units = new ArrayList<>();
    ArrayList<Hero> units = new ArrayList<Hero>();
    units.add(new Crossbower(3));
    units.add(new Sniper(3));
    units.add(new Pikeman(2));
    units.add(new Rogue(2));
    units.add(new Monk(1));
    units.add(new Wizard(1));
    units.add (new Peasant(0));

    units.sort(Comparator.comparingInt(unit ->((Initiative)unit).init))
    {
        for (Unit unit : units) {
            unit.step();
        }
    }
}
