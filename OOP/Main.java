package OOP;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static ArrayList<Hero> twoCommands = new ArrayList<>();
   public static ArrayList<Hero> heroesWhite = new ArrayList<>();
    public static ArrayList<Hero> heroesBlack = new ArrayList<>();



    public static void main(String[] args) {
        heroesWhite = generateCommand(0, 1);
        heroesBlack = generateCommand(3, 10);
        twoCommands = new ArrayList<>();
        twoCommands.addAll(heroesBlack);
        twoCommands.addAll(heroesWhite);
        twoCommands.sort(new Comparator<Hero>() {
            @Override
            public int compare(Hero o1, Hero o2) {
                return o2.getInitiative() - o1.getInitiative();
            }
        });
        Scanner scanner = new Scanner(System.in);
        boolean flag;
        while (true) {
            View.view();
            if (gameOverBlack()) {
                flag = true;
                break;
            }
            if (gameOverWhite()) {
                flag = false;
                break;
            }
            for (Hero h : twoCommands) {
                if (heroesBlack.contains(h)) {
                    h.step(heroesWhite, heroesBlack);
                } else {
                    h.step(heroesBlack, heroesWhite);
                }
            }
            scanner.nextLine();
        }
        if (flag) {
            System.out.println("Победила команда белых");
        }
        else {
            System.out.println("Победила команда черных");
        }
    }

        public static boolean gameOverWhite(){
            for (Hero hero : heroesWhite) {
                if (hero.health > 0) return false;
            }
            return true;
        }
        public static boolean gameOverBlack() {
            for (Hero hero : heroesBlack) {
                if (hero.health > 0) return false;
            }
            return true;
        }


            }
        }
        heroesWhite.forEach(n -> System.out.println(n.toString()));
        System.out.println("*******");
        heroesBlack.forEach(n -> n.printEnemysDistance(heroesWhite));

    static String getName() {
        return NameOfHeroes.values()[new Random().nextInt(NameOfHeroes.values().length - 1)].toString();
    }

    static ArrayList<Hero> generateCommand(int n, int y) {
        ArrayList<Hero> commandHeroes = new ArrayList<>();
        Random random = new Random();
        int rand;
        for (int i = 1; i < 11; i++) {
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
