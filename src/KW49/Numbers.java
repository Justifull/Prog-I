package KW49;

import java.util.ArrayList;
import java.util.List;

/**
 * ## Dezimalzahlen in Zeichenketten bestimmen
 *
 * Entwickeln Sie nun bitte eine Methode `numbers()`,
 * um in einem String alle Dezimalzahlen zu bestimmen
 * und diese als Liste von Integer Werten zurückzugeben.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweise:__
 *
 * - Die Java-Methode `boolean Character.isDigit(char)` prüft,
 *   ob ein Zeichen eine Ziffer ('0', '1', .. '9') ist.
 * - Die Java-Methode `int Integer.parseInt(String)` konvertiert eine
 *   Zeichenkette in einen `int`-Wert (z.B. "101" -> 101).
 */
class Numbers {
    public static List<Integer> numbers(String s) {
        List<Integer> resultList = new ArrayList<>();
        if (s.isBlank()) return new ArrayList<>();
        StringBuilder curNum = new StringBuilder();
        for (String split : s.split("")) {
            if (Character.isDigit(split.charAt(0))) curNum.append(split);
            else if (curNum.length() > 0) {
                resultList.add(Integer.parseInt(curNum.toString()));
                curNum.delete(0, curNum.length());
            }
        }
        if (curNum.length() > 0) {
            resultList.add(Integer.parseInt(curNum.toString()));
            curNum.delete(0, curNum.length());
        }
        return resultList;
    }

    public static void main(String[] args) {
        List<Integer> values = numbers("This is 1 world");
        System.out.println(values); // => [1]
        System.out.println(numbers("no numbers")); // => []
        System.out.println(numbers("1 12 123 1234")); // => [1, 12, 123, 1234]
        System.out.println(numbers("ab1c23ef45gh")); // => [1, 23, 45]
    }
}
