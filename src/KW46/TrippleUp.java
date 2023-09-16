package KW46;
/**
 * ## Aufsteigend sortierte Tripple finden
 *
 * Schreiben Sie nun bitte eine Methode `trippleUp()`
 * die in einem Integer-Array prüft, ob dieses
 * drei aufsteigende, benachbarte Werte wie bspw. 1, 2, 3,
 * oder auch 24, 25, 26 beinhaltet.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 */
class TrippleUp {
    public static boolean trippleUp(int[] arr) {
        int prevNum = arr[0];
        int trippleCounter = 1;
        for (int n : arr) {
            if (trippleCounter >= 3) return true;
            if (prevNum == n - 1) trippleCounter++;
            else trippleCounter = 1;
            prevNum = n;
        }
        return trippleCounter >= 3;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 4, 5, 6, 2};
        int[] a2 = {1, 2, 3};
        int[] a3 = {1, 2, 4};
        int[] a4 = {3, 2, 1};

        System.out.println(trippleUp(a1)); // => true
        System.out.println(trippleUp(a2)); // => true
        System.out.println(trippleUp(a3)); // => false
        System.out.println(trippleUp(a4)); // => false
    }
}