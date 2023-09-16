package KW46;
/**
 * ## checkBrackets()
 *
 * Eine vollständige Klammerung bedeutet: Jeder geöffneten Klammer
 * muss eine schließende Klammer folgen. Darüber hinaus müssen
 * die runden Klammern korrekt verschachtelt sein. Andere Zeichen
 * sind zu ignorieren.
 *
 * Schreiben Sie nun eine Methode `checkBrackets()`, die prüft, ob eine
 * Zeichenkette den oben angegebenenen Regeln einer vollständigen
 * Klammerung entspricht oder nicht.
 *
 */
public class CheckBrackets {
    public static boolean checkBrackets(String s) {
        int openCounter = 0;
        int closeConter = 0;
        for (String c : s.split("")) {
            if (c.equals("(")) openCounter++;
            if (c.equals(")")) closeConter++;
        }
        return openCounter == closeConter;
    }


    public static void main(String[] args) {

        boolean check = checkBrackets("()");
        System.out.println(check); // => true
        System.out.println(checkBrackets("(()(a)(()((c))))")); // => true

        System.out.println(checkBrackets("(()")); // => false
        System.out.println(checkBrackets("a (()())a)")); // => false
    }
}