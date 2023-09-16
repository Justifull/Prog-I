package KW46;
/**
 * ## Tripple in Zeichenketten finden
 *
 * Entwickeln Sie nun bitte eine Methode `noMultiples()`, die prüft, ob in
 * einer Zeichenkette niemals drei (oder mehr) gleiche Zeichen aufeinander
 * folgen.
 *
 * Verallgemeinern Sie `noMultiples()` nun so,
 * dass die Anzahl der zu wiederholenden Zeichen parameterisiert ist.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweis:__
 *
 * - Sehen Sie sich noch einmal überladene Methoden in Unit 2 (Methoden) an.
 *
 */
class NoMultiples {
    public static boolean noMultiples(String s) {
        if (s.length() < 3) return true;
        String[] splitS = s.split("");
        String prevChar = splitS[0];
        int counter = 1;
        for (String c : splitS) {
            if (counter == 3) return false;
            if (c.equals(prevChar)) counter++;
            else counter = 1;
            prevChar = c;
        }
        return counter < 3;
    }

    public static boolean noMultiples(int n, String s) {
        if (s.length() < n) return true;
        String[] splitS = s.split("");
        String prevChar = splitS[0];
        int counter = 1;
        for (String c : splitS) {
            if (counter == n) return false;
            if (c.equals(prevChar)) counter++;
            else counter = 1;
            prevChar = c;
        }
        return counter < n;
    }

    public static void main(String[] args) {
        boolean result = noMultiples("Hello World");
        System.out.println(result); // => true
        System.out.println(noMultiples("faaantastic")); // => false
        System.out.println(noMultiples(2, "Hello World")); // => false
    }
}