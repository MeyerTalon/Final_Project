import java.util.Scanner;
public class Encounter {
    private String prompt;
    private Obstacle obstacle;

    public Encounter() {
        prompt = "";
        obstacle = new Obstacle();
    }

    public Encounter(String p, Obstacle o) {
        prompt = p;
        obstacle = o;
    }

    public String toString() {
        String output = new String();
        output = prompt;
        return output;
    }
}