package OOP;

import java.util.ArrayList;

public interface Initiative {
    int getInit();
    void step(ArrayList<Hero> enemies, ArrayList<Hero> allies);
}
