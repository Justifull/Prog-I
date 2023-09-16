package KW45;
/**
 * ## Cats and Dogs
 *
 * Entwickeln Sie bitte eine Methode `catsDogs()`,
 * die prüft, ob in einer Zeichenkette gleich häufig
 * die Zeichenketten "cat" und "dog" vorkommen.
 *
 * Wenn weder "cat" noch "dog" vorkommen, ist dies als
 * nicht gleich häufig zu werten.
 *
 * Beispielaufrufe finden Sie in der `main()`-Methode.
 *
 * Challenge: Lösen Sie die Aufgabe ohne Schleifen.
 *
 */
class CatsDogs {
    public static boolean catsDogs(String s) {
        if (!s.contains("dog") || !s.contains("cat")) return false;
        int catCounter = 0;
        int dogCounter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i).startsWith("cat")) catCounter++;
            if (s.substring(i).startsWith("dog")) dogCounter++;
        }
        return catCounter == dogCounter;
    }

    public static void main(String[] args) {
        boolean r = catsDogs("catdog");
        System.out.println(r); // => true
        System.out.println(catsDogs("catcat")); // => false
        System.out.println(catsDogs("1cat1cadodog")); // => true
    }
}