package KW48;

import KW45.IsArmstrong;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ## Armstrongzahlen gruppieren
 *
 * Entwickeln Sie nun bitte die Methoden
 *
 * - `armstrongs()`, die eine Liste aller aufsteigend sortierter
 *   Armstrongzahlen bis zu einer oberen Schranke erzeugt,
 * - und `groupyByLength()`, die eine Liste von Integer Werten mittels einer
 *   Map nach der Anzahl ihrer Stellen gruppiert. Die Map soll das Ordnungskriterium
 *   Stellenanzahl bei einer sequentiellen Verarbeitung der Schlüssel erhalten.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweise:__
 *
 * - Sie haben bereits einmal eine Lösung entwickelt, die prüft, ob eine Zahl eine Armstrongzahl ist.
 * - Beachten Sie die Wahl ihrer Map-Implementierung.
 *
 */
class GroupArmstrongs {
    public static List<Integer> armstrongs(int n) {
        List<Integer> resultList = new ArrayList<>();
        if (n <= 0) return resultList;
        for (int i = 1; i <= n; i++) {
            if (IsArmstrong.isArmstrong(i)) resultList.add(i);
        }
        return resultList;
    }

    public static Map<Integer, List<Integer>> groupByLength(List<Integer> list) {
        Map<Integer, List<Integer>> resultMap = new HashMap<>();
        for (Integer i : list) {
            Integer numLength = IsArmstrong.numLength(i);
            List<Integer> numbers = resultMap.getOrDefault(numLength, new ArrayList<>());
            numbers.add(i);
            resultMap.put(numLength, numbers);
        }
        return resultMap;
    }

    public static void main(String[] args) {
        List<Integer> lance = armstrongs(500);
        System.out.println(lance);
        // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407]

        Map<Integer, List<Integer>> grouped = groupByLength(lance);
        System.out.println(grouped);
        // {1=[0, 1, 2, 3, 4, 5, 6, 7, 8, 9], 3=[153, 370, 371, 407]}
    }
}