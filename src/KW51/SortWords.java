package KW51;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * ## `sortWords()`
 *
 * Entwickeln Sie bitte eine Methode `sortWords()`, die aus einer
 * Zeichenkette eine Liste von alphabetisch sortierten Worten erzeugt.
 * Ein Wort ist durch ein oder mehrere Leerzeichen von anderen Worten
 * getrennt.
 *
 * Treten Worte mehrfach in der Zeichenkette auf, sollen diese nur
 * einmal in der Liste alphabetisch sortierter Wörter auftreten.
 * Worte sind Case-sensitiv zu handhaben.
 *
 * __Hinweis:__
 * Denken Sie über den Einsatz einer TreeMap nach.
 * Eine TreeMap erhält das Ordnungskriterium eines Schlüssels.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 */
class SortWords {
    public static List<String> sortList(List<String> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                String savedString = list.get(i + 1);
                list.set(i + 1, list.get(i));
                list.set(i, savedString);
                sortList(list);
            }
        }
        return list;
    }

    public static List<String> sortWords(String input) {
        List<String> sortedList = new ArrayList<>();
        if (input.isBlank()) return sortedList;
        for (String word : input.split("\\s+")) {
            if (!sortedList.contains(word)) sortedList.add(word);
        }
        return sortList(sortedList);
    }

    public static void main(String[] args) {
        List<String> words = sortWords("Dies ist nur ein Beispiel");
        System.out.println(words); // => [Beispiel, Dies, ein, ist, nur]
        System.out.println(sortWords("Abc Abc Abc"));  // => [Abc]
        System.out.println(sortWords("abc Abc"));  // => [Abc, abc]
    }
}