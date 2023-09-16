package KW44;
/**
 * ## Addieren mit der `luckySum()`
 *
 * Entwickeln Sie nun bitte eine Methode `luckySum()`, die eine
 * variable Anzahl von ganzzahligen Parametern solange aufaddiert bis
 * der Wert 13 in einem Parameter auftaucht.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 * __Hinweis:__
 *
 * - Sehen Sie sich noch einmal variable Parameter in Unit 2 (Methoden) an.
 *
 */
class LuckySum {
    public static int luckySum(int... nums) {
        int sum = 0;
        for (int num : nums) {
            if (num == 13) return sum;
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int result = luckySum(5, 6, 13, 8);
        System.out.println(result); // => 11
        System.out.println(luckySum(1, 2, 3, 4, 5)); // => 15
        System.out.println(luckySum(1, 2)); // => 3
        System.out.println(luckySum(13)); // => 0
    }
}