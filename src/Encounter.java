import java.util.Scanner;
public class Encounter {
    // Initial vars
    private String approach;
    private String question;
    private String outcome;
    private boolean win;
    private Obstacle obstacle;
    private Player player;
    private int choice;

    // Constructors
    public Encounter() {
        approach = "";
        question = "";
        obstacle = new Obstacle();
        player = new Player();
    }
    public Encounter(String a, String q, Obstacle o, Player p) {
        approach = a;
        question = q;
        obstacle = o;
        player = p;
    }

    // Setters
    public void setChoice(int c)
    {
        choice = c;
    }
    public void setWin()
    {
        if (getChoice() == 1) {
            if (player.getStrengthStatus() > obstacle.getStrength()) {
                win = true;
            } else {
                win = false;
            }
        }
        if (getChoice() == 2) {
            if (player.getSpeedStatus() > obstacle.getSpeed()) {
                win = true;
            } else {
                win = false;
            }
        }
        if (getChoice() == 3) {
            if (player.getCunningStatus() > obstacle.getCunning()) {
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
    public boolean getWin()
    {
        return win;
    }

    // To String
    public String toString() {
        String output = new String();
        output = approach + question;
        return output;
    }
}