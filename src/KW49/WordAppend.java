package KW49;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ## Listen von Zeichenketten mittels `wordAppend()`verarbeiten
 *
 * Entwickeln Sie nun bitte eine Methode `wordAppend()`.
 * Diese soll eine Liste von Strings durchlaufen, um einen Ausgabestring
 * zu erzeugen. Gehen Sie dabei wie folgt vor:
 *
 * Immer wenn ein String zum 2., 4., 6., usw. mal in der Liste auftaucht,
 * soll der String an den Ausgabestring gehängt werden. Wenn kein String doppelt
 * vorkommt, soll die leere Zeichenkette zurückgegeben werden.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweis:__
 *
 * - Denken Sie über den Einsatz einer geeigneten Datenstruktur
 *   (`Collection`) nach.
 *
 */
public class WordAppend {
    public static String wordAppend(List<String> list) {
        StringBuilder stringBuilder = new StringBuilder();
        Map<String, Integer> charMap = new HashMap<>();
        for (String s : list) {
            charMap.put(s, charMap.getOrDefault(s, 0) + 1);
        }
        for (String s : charMap.keySet()) {
            int counter = charMap.get(s);
            if (counter > 1) {
                for (int i = 0; i < counter; i = i + 2) {
                    stringBuilder.append(s);
                }
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        List<String> example = Arrays.asList("a", "b", "a");
        String result = wordAppend(example);
        System.out.println(result); // -> "a"
        System.out.println(wordAppend(
                Arrays.asList("a", "b", "a", "c", "a", "d", "a")
        )); // -> "aa"
        System.out.println(wordAppend(Arrays.asList("a", "", "a"))); // -> "a"
    }
}