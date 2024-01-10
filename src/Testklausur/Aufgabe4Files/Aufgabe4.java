package Testklausur.Aufgabe4Files;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ## Combinations
 *
 * Entwickeln Sie nun bitte eine Methode `combine()`,
 * die aus zwei Listen von Zeichenketten, alle paarweisen
 * Kombinationen als Liste von `Tuple`n erzeugt.
 *
 * Auch die Klasse `Tuple` inkl. Konstruktor und `toString()`-
 *`Methode ist durch Sie zu entwickeln.
 *
 * Aufrufbeispiele zur Erzeugung von `Tuple`n und
 * `combine()` finden Sie in der `main()`-Methode.
 *
 * - Achten Sie auf eine sinnvolle Handhabung von `null` Referenzen.
 *
 */

public class Aufgabe4 {
    public static List<Tuple> combine(List<String> input1, List<String> input2) {
        List<Tuple> list = new ArrayList<>();
        if (input1 == null || input2 == null || input1.isEmpty() || input2.isEmpty()) return list;
        for (String s1 : input1) {
            for (String s2 : input2) {
                list.add(new Tuple(s1, s2));
            }
        }
        return list;
    }
    public static void main(String[] args) {
        // Tuple Erzeugung
        Tuple t = new Tuple("Hello", "World");
        Tuple r = new Tuple("Hallo", "Welt");
        System.out.println(t); // => (Hello, World)
        System.out.println(r); // => (Hallo, Welt)

        // Combine-Beispiele
        List<String> l1 = Arrays.asList("A", "B", "C");
        List<String> l2 = Arrays.asList("X", "Y");
        List<Tuple> combinations = combine(l1, l2);
        System.out.println(combinations); // => [(A, X), (A, Y), (B, X), (B, Y), (C, X), (C, Y)]
        System.out.println(combine(l1, null)); // => []
    }
}
