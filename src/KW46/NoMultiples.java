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
        return noMultiples(3, s);
    }

    public static boolean noMultiples(int n, String s) {
        if (s.length() < n) return true;
        int counter = 0;
        for (int i = 0; i < (s.length() - 1); i++) {
            if (counter >= n) return false;
            if (s.charAt(i) == s.charAt(i + 1)) counter++;
            else counter = 1;
        }
        return counter <= n;
    }

    public static void main(String[] args) {
        boolean result = noMultiples("Hello World");
        System.out.println(result); // => true
        System.out.println(noMultiples("faaantastic")); // => false
        System.out.println(noMultiples(2, "Hello World")); // => false
    }
}