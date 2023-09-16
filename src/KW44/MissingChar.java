package KW44;
/**
 * ## `missingChar()``
 *
 * Entwickeln Sie bitte eine Methode `missingChar()`, die aus einer
 * Zeichenkette eine neue Zeichenkette erzeugt, in der das n-te Zeichen fehlt.
 *
 *
 * __Achtung:__
 * Der Wert von *n* muss nicht in der ursprünglichen Zeichenkette liegen.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * Challenge: Versuchen Sie diese Aufgabe ohne Schleifen zu lösen.
 *
 */
class MissingChar {
    public static String missingChar(String s, int n) {
        if (n <= 0 || n > s.length()) return s;
        return s.substring(0, n) + s.substring(n + 1);
    }

    public static void main(String[] args) {
        String s = missingChar("Hello", 3);
        System.out.println(s); // => Helo
        System.out.println(missingChar("Hello", 1));  // => Hllo
        System.out.println(missingChar("Hello", 4));  // => Hell
        System.out.println(missingChar("Hello", -1)); // => Hello
        System.out.println(missingChar("Hello", 10)); // => Hello
    }
}