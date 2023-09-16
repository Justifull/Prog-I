package KW47;

import java.util.ArrayList;
import java.util.List;

/**
 * ## Palindrome in Zeichenketten bestimmen
 *
 * Palindrome sind Zeichenketten, die von vorne und hinten
 * gelesen, dasselbe Wort ergeben (z.B. "stets"). Die Groß-/
 * Kleinschreibung soll dabei ignoriert werden.
 *
 * Ein Wort ist eine zusammenhängende Zeichenkette, welches
 * durch ein oder mehrere Leerzeichen von anderen Worten in
 * einer Zeichenkette getrennt ist.
 *
 * Entwickeln Sie nun bitte eine Methode `palindromes()`,
 * um in einem String alle Palindromwörter zu bestimmen
 * und diese Palindrome als Liste von Zeichenketten zurückzugeben.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 */
class Palindromes {
    public static boolean isPalindrome(String s) {
        StringBuilder palindrome = new StringBuilder();
        for (String c : s.toLowerCase().split("")) {
            palindrome.insert(0, c);
        }
        return s.toLowerCase().contentEquals(palindrome);
    }

    public static List<String> palindromes(String s) {
        List<String> resultList = new ArrayList<>();
        if (s.isBlank()) return resultList;
        String[] words = s.split(" ");
        for (String word : words) {
            if (isPalindrome(word)) resultList.add(word);
        }
        return resultList;
    }

    public static void main(String[] args) {
        List<String> palindromes = palindromes("Es ist stets dasselbe Beispiel");
        System.out.println(palindromes); // => ["stets"]
        System.out.println(palindromes("Regallager")); // => ["Regallager"]
        System.out.println(palindromes("no palinedromes")); // => []
        System.out.println(palindromes("Natan ist stets weise")); // => ["Natan", "stets"]
    }
}