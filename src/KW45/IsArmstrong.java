package KW45;
/**
 * ## Armstrongzahlen
 *
 * Ja, so etwas gibt es. Eine Armstrongzahl ist eine Zahl,
 * deren Summe ihrer Stellen, jeweils potenziert mit ihrer Stellenanzahl,
 * wieder die Zahl selbst ergibt.
 *
 * Z.B.: $153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153$
 *
 * Entwickeln Sie nun bitte eine Methode `isArmstrong()`, die prüft,
 * ob eine Zahl eine Armstrongzahl ist.
 *
 * Entwickeln Sie zusätzlich eine Methode `countArmstrongs()` die
 * angibt, wieviele Armstrongzahlen es bis zu einer oberen
 * Schranke gibt.
 *
 * Aufruf Beispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweise:__
 *
 * - https://de.wikipedia.org/wiki/Narzisstische_Zahl
 * - Mittels % 10 koennen Sie den Wert der letzten Ziffer bestimmen.
 * - Mittels / 10 koennen Sie eine Zahl um eine Stelle nach rechts "rausschieben".
 *
 */
public class IsArmstrong {
    public static int numLength(int n) {
        int num = n;
        int length = 0;
        while (num > 0) {
            num /= 10;
            length++;
        }
        return length;
    }

    public static boolean isArmstrong(int n) {
        int num = n;
        int numCompare = 0;
        while (num > 0) {
            int curNum = num % 10;
            numCompare += Math.pow(curNum, numLength(n));
            num /= 10;
        }
        return numCompare == n;
    }

    public static int countArmstrongs(int n) {
        int armstrongCounter = 0;
        for (int i = 0; i <= n; i++) {
            if (isArmstrong(i)) armstrongCounter++;
        }
        return armstrongCounter;
    }

    public static void main(String[] args) {
        boolean result = isArmstrong(153);
        System.out.println(result); // => true
        System.out.println(isArmstrong(999)); // => false

        int n = countArmstrongs(100);
        System.out.println(n); // => 10
        System.out.println(countArmstrongs(153)); // => 11
        System.out.println(countArmstrongs(1000)); // => 14
    }
}