package Testklausur.Aufgabe4Files;

public class Tuple {
    private final String first;
    private final String second;

    public Tuple(String fst, String snd) {
        first = fst;
        second = snd;
    }

    public String toString() {
        return String.format("(%s, %s)", first, second);
    }
}
