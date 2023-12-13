package KW50;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static KW47.Blocks.blocks;

/**
 * ## Blocklängen in Zeichenketten bestimmen
 *
 * Entwickeln Sie nun bitte eine Methode `blockLengths()`,
 * um in einem String die Blocklängen gleicher aufeinander folgender Zeichen
 * zu bestimmen.
 *
 * Aufrufbeispiele finden Sie in der `main()`-Methode.
 *
 */
class BlockLengths {
    /*
    public static List<Integer> blockLengths(String input) {
        List<Integer> resultList = new ArrayList<>();
        if (input.isBlank()) return resultList;
        StringBuilder curLetter = new StringBuilder();
        for (String letter : input.split("")) {
            if (curLetter.toString().startsWith(letter)) curLetter.append(letter);
            else {
                if (curLetter.length() > 1) resultList.add(curLetter.length());
                curLetter = new StringBuilder(letter);
            }
        }
        if (curLetter.length() > 1) resultList.add(curLetter.length());
        return resultList;
    }
    */

    public static List<Integer> blockLengths(String input) {
        return blocks(input).stream().map(String::length).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> blocks = blockLengths("Hello faaantastic world");
        System.out.println(blocks); // => [2, 3]
        System.out.println(blockLengths("aaabccdeeeefaaa")); // => [3, 2, 4, 3]
        System.out.println(blockLengths("This is an example")); // => []
        System.out.println(blockLengths("Another  example ...")); // => [2, 3]
        System.out.println(blockLengths("")); // => []
    }
}
