package KW49.Dices;

import java.util.Random;

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
