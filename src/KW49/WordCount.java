package KW49;

import java.util.HashMap;
import java.util.Map;

/**
 * ## Worthäufigkeit in Zeichenketten bestimmen
 *
 * Entwickeln Sie nun eine Methode `wordCount()`, die die absolute
 * Häufigkeit von Worten in einem Text mittels eines Mappings zählt.
 * Worte sind durch ein oder mehrere Whitespace Zeichen
 * (Leerzeichen, Tabulatoren, Linebreaks, etc.) voneinander getrennt.
 * Worte sollen case-insensitiv gezählt werden.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweis:__
 *
 * - In regulären Ausdrücken können Sie alle Whitespace Zeichen
 *   mit `"\\s"` selektieren.
 *
 */
class WordCount {
    public static Map<String, Integer> wordCount(String s) {
        Map<String, Integer> occMap = new HashMap<>();
        if (s.isBlank()) return occMap;
        for (String word : s.split("\\s+")) {
            occMap.put(word.toLowerCase(), occMap.getOrDefault(word.toLowerCase(), 0) + 1);
        }
        return occMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> result = wordCount("aa BB cC Aa Cc Bb aA AA");
        System.out.println(result); // => { "aa": 4, "bb": 2, "cc": 2 }
        System.out.println(wordCount("Ein kleines Beispiel"));
        // => { "ein": 1, "kleines": 1, "beispiel": 1 }
    }
}