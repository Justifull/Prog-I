package KW50;

import java.util.ArrayList;
import java.util.List;

/**
 * ## Liste von Blöcken aus Zeichenketten extrahieren
 *
 * Unter einem Block verstehen wir eine Folge gleicher Zeichen, z.B. “aaaa”.
 * Blöcke mit mehr als einem Zeichen, können kompakt dargestellt werden,
 * indem nur das Zeichen und die Wiederholung angegeben wird
 * (die Kompaktschreibweise für “aaaa” wäre “a4”).
 * Blöcke der Länge 1 werden nicht in Kompaktschreibweise notiert
 * (“a” wird also nie zu “a1”).
 *
 * Entwickeln Sie nun bitte eine Methode `compacts()`,
 * die aus einer beliebigen Zeichenkette eine Liste von Blöcken in
 * Kompaktschreibweise erzeugt.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 */
class Compacts {
    public static List<String> compacts(String input) {
        List<String> compactList = new ArrayList<>();
        if (input.isBlank()) return compactList;
        String curLetter = "";
        int letterCounter = 1;
        for (String letter : input.split("")) {
            if (curLetter.equals(letter)) letterCounter++;
            else if (!curLetter.isBlank()) {
                compactList.add(curLetter + (letterCounter > 1 ? letterCounter : ""));
                letterCounter = 1;
            }
            curLetter = letter;
        }
        compactList.add(curLetter + (letterCounter > 1 ? letterCounter : ""));
        return compactList;
    }

    public static void main(String[] args) {
        List<String> blocks = compacts("Hello");
        System.out.println(blocks); // => ["H", "e", "l2", "o"]
        System.out.println(compacts("Oooorder")); // => ["O", "o3", "r", "d", "e", "r"]
        System.out.println(compacts("C3PO")); // => ["C", "3", "P", "O"]
        System.out.println(compacts("...")); // => [".3"]
        System.out.println(compacts("")); // => []
    }
}
