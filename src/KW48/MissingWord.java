package KW48;

import java.util.ArrayList;
import java.util.List;

/**
 * ## `missingWord()`
 *
 * Entwickeln Sie bitte eine Methode `missingWord()`, die aus einer
 * Zeichenkette eine Liste von Worten, allerdings ohne das n-te Wort, erzeugt.
 * Ein Wort ist durch ein oder mehrere Leerzeichen von anderen Worten
 * getrennt.
 *
 * __Achtung:__
 * Das *n*-te Wort muss nicht existieren.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 */
class MissingWord {
    public static List<String> missingWord(String s, int n) {
        List<String> resultList = new ArrayList<>();
        String[] splitS = s.split("\\s+");
        for (int i = 0; i < splitS.length; i++) {
            if (i != n) resultList.add(splitS[i]);
        }
        return resultList;
    }

    public static void main(String[] args) {
        List<String> words = missingWord("Dies ist nur ein Beispiel", 2);
        System.out.println(words); // => [Dies, ist, ein, Beispiel]
        System.out.println(missingWord("Hello   World", 1));  // => [Hello]
        System.out.println(missingWord("Hello World", 0));  // => [World]
        System.out.println(missingWord("Hello World", 2));  // => [Hello World]
        System.out.println(missingWord("Hello World", -1)); // => [Hello World]
    }
}