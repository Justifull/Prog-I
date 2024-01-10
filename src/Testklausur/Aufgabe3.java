package Testklausur;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * ## `wordMultiple()`
 *
 * Gegeben sei eine Liste von Strings. Entwickeln Sie eine Methode `wordMultiple()`, die
 * mittels einer Map kenntlich macht, welche der Zeichenketten mehrmals in der
 * Liste von Strings vorkommt. Leere Zeichenketten sollen nicht berücksichtigt werden.
 *
 * Aufruf-Beispiele finden Sie in der `main()`-Methode.
 *
 */

public class Aufgabe3 {
    public static Map<String, Boolean> wordMultiple(List<String> inputList) {
        Map<String, Boolean> resultMap = new HashMap<>();
        for (String s : inputList) resultMap.put(s, resultMap.containsKey(s));
        return resultMap;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "a", "c", "b");
        Map<String, Boolean> multiple = wordMultiple(list);
        System.out.println(multiple);
        // => { "a": true, "b": true, "c": false }

        list = Arrays.asList("c", "b", "a");
        System.out.println(wordMultiple(list));
        // => { "a": false, "b": false, "c": false }

        list = Arrays.asList("c", "c", "c");
        System.out.println(wordMultiple(list));
        // => { "c": true }
    }
}
