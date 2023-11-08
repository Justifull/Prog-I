package KW42;
/**
 * ## Zeichenketten "rotieren"
 *
 * Entwickeln Sie nun bitte eine Methode `rotate()`, die eine Zeichenkette
 * nach links oder rechts "rotiert". Zeichen die links oder rechts aus
 * der Zeichenkette "geschoben" werden, sollen rechts bzw. links wieder
 * "hineingeschoben" werden.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweise:__
 *
 * - Beachten Sie, dass eine Rotation positiv und negativ sein kann.
 * - Beachten Sie, dass eine Rotation länger als die eigentliche Zeichenkette sein kann.
 * - Das Problem lässt sich tatsächlich ohne Schleife lösen (sicherlich aber auch mit ;-).
 *
 */
class RotateString {

    public static String rotate(int n, String s) {
        if (s.isEmpty()) return "";
        int r = Math.abs(n) % s.length();
        r = r < 0 ? r + s.length() : r;
        String left = s.substring(s.length() - r);
        String right = s.substring(0, s.length() - r);
        return left + right;
    }

    public static void main(String[] args) {
        String result = rotate(2, "Hello");
        System.out.println(result); // => "loHel"
        System.out.println(rotate(3, "Hello")); // => "lloHe"
        System.out.println(rotate(6, "Hello")); // => "oHell"
    }
}