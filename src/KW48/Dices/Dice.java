package KW48.Dices;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Dice {
    private int value;

    public Dice(int value) {
        this.value = value;
    }

    public Dice() {
        Random random = new Random();
        this.value = random.nextInt(6) + 1;
    }

    public String toString() {
        return "W" + this.value;
    }
}
