package KW43;
/**
 * ## Vorkommen von Zeichenketten zählen
 *
 * Schreiben Sie nun eine Methode `countOccurences()` die zählt, wie häufig eine Zeichenkette *a* in einer
 * anderen Zeichenkette *b* vorkommt. Sich überlagernde Zeichenketten sind erlaubt.
 * D.h. "xx" ist als zweimal in "xxx" vorhanden zu zählen.
 * Leere Zeichenketten sind nicht zu zählen.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweise:__
 *
 * - Beachten Sie, dass leere Zeichenketten schnell eine Endlosschleife erzeugen können.
 * - Liefert VPL eine Out-of-Memory Fehlermeldung ist dies vermutlich auf eine
 *   Endlosschleife zurückzuführen.
 * - Die String-Methoden `indexOf()` oder `startsWith()` könnten hilfreich sein.
 *
 */
class CountOcc {

    public static int countOccurences(String a, String b) {
        if (a.isEmpty()) return 0;
        if (b.isEmpty()) return 0;
        int i = b.indexOf(a);
        int c = i != -1 ? 1 : 0;
        while (i != -1) {
            i = b.indexOf(a, i + 1);
            if (i != -1) c++;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(countOccurences("Hello", "Hello World")); // => 1
        System.out.println(countOccurences("abc", "abc abc abc")); // => 3
        System.out.println(countOccurences("xx", "xxx")); // => 2
    }
}