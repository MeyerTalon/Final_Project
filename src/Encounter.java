import java.util.Scanner;
public class Encounter {
    private String approach;
    private String question;
    private String outocome;
    private boolean win;
    private Obstacle obstacle;

    public Encounter() {
        approach = "";
        question = "";
        obstacle = new Obstacle();
    }

    public Encounter(String a, String q, Obstacle o) {
        approach = a;
        question = q;
        obstacle = o;
    }
    public String getOutcome()
    {
        String output = new String();
        if (win) {
            output = "You defeated " + obstacle.getObstalceName() + ". Congratulations!";
        }
        return output;
    }
    public String toString() {
        String output = new String();
        output = approach + question;
        return output;
    }
}