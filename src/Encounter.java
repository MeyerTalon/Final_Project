import java.util.Scanner;
public class Encounter {
    // Initial vars
    private String approach;
    private String question;
    private String outocome;
    private boolean win;
    private Obstacle obstacle;
    private int choice;

    // Constructors
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

    // Setters
    public void setChoice(int c)
    {
        choice = c;
    }
    public void setWin()
    {
        if (getChoice() == 1) {
            if (player.getStrength() > obstacle.getStrength()) {
                win = true;
            } else {
                win = false;
            }
        }
        if (getChoice() == 2) {
            if (player.getSpeed() > obstacle.getSpeed()) {
                win = true;
            } else {
                win = false;
            }
        }
        if (getChoice() == 3) {
            if (player.getCunning > obstacle.getCunning()) {
                win = true;
            } else {
                win = false;
            }
        }
    }

    // Getters
    public String getQuestion()
    {
        return question;
    }
    public String getApproach()
    {
        return approach;
    }
    public int getChoice()
    {
        return choice;
    }
    public String getOutcome() {
        String output = new String();
        if (win) {
            output = "You defeated " + obstacle.getObstacleName() + ". Congratulations!";
        } else {
            output = "You are a FAILURE! You failed to beat " + obstacle.getObstacleName();
        }
        return output;
    }

    // To String
    public String toString() {
        String output = new String();
        output = approach + question;
        return output;
    }
}