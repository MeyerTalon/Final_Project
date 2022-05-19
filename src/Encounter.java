import java.util.Scanner;
public class Encounter {
    private String approach;
    private String question;
    private String victory;
    private Obstacle obstacle;

    public Encounter() {
        approach = "";
        question = "";
        victory = "";
        obstacle = new Obstacle();
    }

    public Encounter(String a, String q, String v, Obstacle o) {
        approach = a;
        question = q;
        victory = v;
        obstacle = o;
    }

    public String toString() {
        String output = new String();
        output = approach + question + victory;
        return output;
    }
}