package KW42;
/**
 *
 *  ## Zeichenketten aneinander hängen
 *
 * Entwickeln Sie bitte eine Methode `minConcat()`,
 * die zwei Zeichenketten unterschiedlicher Länge
 * aneinander hängt. Dabei soll die längere der
 * beiden Zeichenketten auf die Länge der kürzeren
 * Zeichenkette so gekürzt werden, dass die ersten
 * Zeichen der Zeichenkette nicht in das Resultat
 * übernommen werden.
 *
 * Beispielaufrufe finden Sie in der `main()`-Methode.
 *
 */
class MinConcat {

    public static String minConcat(String a, String b) {
        String bNew = a.length() < b.length() ? b.substring(b.length() - a.length()) : b;
        String aNew = a.length() > b.length() ? a.substring(a.length() - b.length()) : a;
        return aNew + bNew;
    }

    public static void main(String[] args) {

        String resultat = minConcat("Hello", "Hi");
        System.out.println(resultat); // => "loHi"

        System.out.println(minConcat("Hello", "java"));
        // => "ellojava"
        System.out.println(minConcat("java", "Hello"));
        // => "javaello"
    }
}