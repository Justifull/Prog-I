package KW47;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 * ## Listen nach geraden und ungeraden Zahlen ordnen
 *
 * Entwickeln Sie nun bitte eine Methode namens `evenOdd()`,
 * die eine Liste auf Basis einer bestehenden Liste von Integern erzeugt.
 *
 * - In der neuen Liste müssen erst alle geraden Werte der ursprünglichen Liste
 *   stehen, erst dann sollen die ungeraden Werte folgen.
 * - Die Reihenfolge der ursprünglichen Liste soll innerhalb der geraden und ungeraden
 *   Werte aber erhalten bleiben.
 *
 * Aufrufbeispiele finden sich in der `main()`-Methode.
 *
 */
class EvenOdd {
    public static List<Integer> evenOdd(List<Integer> list) {
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        for (int i : list) {
            if (i % 2 == 0) evenList.add(i);
            else oddList.add(i);
        }
        evenList.addAll(oddList);
        return evenList;
    }

    public static void main(String[] args) {
        List<Integer> result = evenOdd(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(result); // => [2, 4, 6, 1, 3, 5]
        System.out.println(evenOdd(Arrays.asList(5, 1, 3))); // => [5, 1, 3]
        System.out.println(evenOdd(Arrays.asList(4, 2, 6))); // => [4, 2, 6]
    }
}