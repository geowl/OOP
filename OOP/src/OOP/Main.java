package OOP;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    static ArrayList<Hero> heroesWhite = new ArrayList<>();
    static ArrayList<Hero> heroesBlack = new ArrayList<>();

    public static void main(String[] args) {
        heroesWhite = generateCommand(3);
        heroesBlack = generateCommand(3);

        heroesWhite.forEach(n -> System.out.println(n.toString()));
        System.out.println("*******");
        heroesBlack.forEach(n -> System.out.println(n.toString()));
    }

    static String getName() {
        return NameOfHeroes.values()[new Random().nextInt(NameOfHeroes.values().length - 1)].toString();
    }

    static ArrayList<Hero> generateCommand(int n) {
        ArrayList<Hero> commandHeroes = new ArrayList<>();
        Random random = new Random();
        int rand;
        for (int i = 0; i < n; i++) {
            rand = random.nextInt(5) + 1;
            switch (rand) {
                case 1:
                    commandHeroes.add(new Crossbower(getName()));
                    break;
                case 2:
                    commandHeroes.add(new Monk(getName()));
                    break;
                case 3:
                    commandHeroes.add(new Peasant(getName()));
                    break;
                case 4:
                    commandHeroes.add(new Wizard(getName()));
                    break;
                case 5:
                    commandHeroes.add(new Pikeman(getName()));
                    break;
                case 6:
                    commandHeroes.add(new Sniper(getName()));
                    break;
                case 7:
                    commandHeroes.add(new Rogue(getName()));
                    break;
            }
        }
        return commandHeroes;
    }
}