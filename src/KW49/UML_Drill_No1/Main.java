package KW49.UML_Drill_No1;
/**
 * ## UML to Java (Drillaufgabe 3)
 *
 * Bitte setzen Sie das gegebene UML-Diagramm in Java-Code um.
 *
 * ![UML](../unit-06/ex-05c-uml-3/uml.png)
 *
 * Ziel der Aufgabe ist es zu prüfen, wie gut und schnell Sie UML-Diagramme lesen
 * und zielsicher in Code übersetzen können. Es kommt dabei nur auf die Klassenstruktur
 * und nicht auf die Methodenimplementierungen an!
 *
 * Methoden mit Rückgaben können Sie also als reine "Dummy"-Methoden
 * implementieren. Z.B. so:
 *
 * ```Java
 *  public int foo() {
 *      return 42;
 *  }
 *  public String bar() {
 *      return null;
 *  }
 * ```
 *
 * __Achtung__:
 * Die Anzahl Ihrer Evaluationsversuche ist auf wenige Versuche limitiert.
 * Probieren Sie also nicht einfach nur herum, sondern gehen Sie
 * sehr systematisch, bspw. in folgenden Schritten, vor:
 *
 * 1. __Implementieren Sie Ihren Code__ erst mit allen Assoziationen, Datenfeldern
 *    und Methoden gem. UML-Diagramm. Nutzen Sie hierfür die Dateien, die
 *    gem. Java-Konventionen entsprechend benannt und für Sie vorbereitet sind.
 *    D.h. entwickeln Sie eine Klasse `X` auch in der entsprechend benannten Datei `X.java`.
 * 2. __Prüfen Sie dann mittels "Run"__ in der Console, ob sich Ihre Lösung kompilieren lässt.
 *    Korrigieren Sie ggf. Fehler gem. Compiler-Errors. Die `main()`-Methode ist
 *    dafür entsprechend vorbereitet.
 * 3. __Evaluieren Sie erst dann Ihren Code__ im Evaluator. Findet der Evaluator Fehler können
 *    Sie diese ggf. noch korrigieren. Achten Sie dabei darauf, wieviel Freiversuche Sie noch haben.
 *
 */
class Main {

    public static void main(String[] args) {
        System.out.println("Prüfen Sie mittels run, ob Ihre Klassen kompilierbar sind.");
        // Beachten Sie den ggf. erforderlichen Einsatz von super() in Konstruktoren
        // voneinander abgeleiteter Klassen.

        Person p = new Person("Max Mustermann");
        Student f = new Student("Maren Musterfrau", "123-456");
        Answer a = new Answer("Das kommt darauf an ...", p);
        Question q = new Question("Wer weiß denn so was?", 0.1);
        Exam t = new Exam("Prog II", "2020-CORONA", 60);
        System.out.println("Das scheint zu funktionieren. Versuchen Sie zu evaluieren.");
    }
}