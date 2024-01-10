package Testklausur;

/**
 *
 * ## String-Mixer
 *
 * Entwickeln Sie eine Methode `mixxer()` die für zwei Zeichenketten,
 * `a` und `b`, eine Zeichenkette aus dem ersten Zeichen von `a`, dem ersten Zeichen von `b`,
 * dem zweiten Zeichen von `a`, dem zweiten Zeichen von `b` usw. erstellt.
 * Alle übrig gebliebenen Zeichen werden an das Ende des Ergebnisses angehängt.
 *
 * Aufrufbeispiele finden Sie in der `main()` Methode.
 *
 */

public class Aufgabe2 {
    public static String mixxer(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        int longest = Math.max(s1.length(), s2.length());
        for (int i = 0; i < longest; i++) {
            if (i < s1.length()) result.append(s1.charAt(i));
            if (i < s2.length()) result.append(s2.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String mixed = mixxer("abc", "xyz");
        System.out.println(mixed);
        // => axbycz

        System.out.println(mixxer("Hello", "")); // => Hello
        System.out.println(mixxer("", "World")); // => World
        System.out.println(mixxer("So", "Long")); // => SLoong
        System.out.println(mixxer("Long", "So")); // => LSoong
    }
}
