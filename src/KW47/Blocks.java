package KW47;

import java.util.ArrayList;
import java.util.List;

/**
 * ## Blöcke in Zeichenketten bestimmen.
 *
 * Entwickeln Sie nun bitte eine Methode `blocks()`,
 * um in einem String alle Blöcke gleicher aufeinander folgender Zeichen
 * zu bestimmen.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 */
class Blocks {
    /*public static List<String> blocks(String s) {
        if (s.length() <= 1) return new ArrayList<>();
        List<String> resultList = new ArrayList<>();
        StringBuilder curSelection = new StringBuilder();
        for (String c : s.split("")) {
            if (curSelection.toString().startsWith(c)) curSelection.append(c);
            else if (curSelection.length() >= 2) {
                resultList.add(curSelection.toString());
                curSelection = new StringBuilder(c);
            }
            else curSelection = new StringBuilder(c);
        }
        if (curSelection.length() >= 2) {
            resultList.add(curSelection.toString());
        }
        return resultList;
    }*/

    public static List<String> blocks(String s) {
        if (s.length() <= 1) return new ArrayList<>();
        List<String> resultList = new ArrayList<>();



        String curSelection = "";



        for (String buchstabe : s.split("")) {
            if (curSelection.startsWith(buchstabe)) curSelection += buchstabe;
            else if (curSelection.length() >= 2) {
                resultList.add(curSelection);
                curSelection = "";
            }
            else curSelection = buchstabe;
        }



        if (curSelection.length() >= 2) {
            resultList.add(curSelection);
        }
        return resultList;
    }

    public static void main(String[] args) {
        List<String> blocks = blocks("Hello faaantastic world");
        System.out.println(blocks); // => ["ll", "aaa"]
        System.out.println(blocks("aaabccdeeeefaaa")); // => ["aaa", "cc", "eeee", "aaa"]
        System.out.println(blocks("This is an example")); // => []
        System.out.println(blocks("Another  example ...")); // => ["  ", "..."]
        System.out.println(blocks("")); // => []
    }
}