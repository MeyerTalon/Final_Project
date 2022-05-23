import java.util.*;
public class Driver {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        int roll = 0;
        int loc = 0;

        System.out.println("Technological Terrors Transmitting Tremors Towards Thermopylae");
        Thread.sleep(5000);

        System.out.println("Welcome to Thermopylae");
        Thread.sleep(2000);
        System.out.println("It is a world filled with mythical (computer themed) and magical (wholly unoriginal) creatures!" +
            "In this fantastical world you must select your mighty avatar which you will control as you traverse this " +
                "extravagant land!");
        Thread.sleep(2000);

        System.out.println("You can choose to play as a\n1. Hacker\n2. Intern that Works Out\n3. Duck\nSelect Below:");
        int character = 0;
        while (character < 1 || character > 3) {
            character = scan.nextInt();
            if (character < 1 || character > 3) System.out.println("Try again");
        }
        Player player = new Player();
        if (character == 1) {
            player.setPlayerAttributeStatus(5, 30, 50);
            player.setPlayerType("Hacker");
        } else if (character == 2) {
            player.setPlayerAttributeStatus(40, 10, 5);
            player.setPlayerType("Intern");
        } else {
            player.setPlayerAttributeStatus(10, 50, 20);
            player.setPlayerType("Duck");
        }
        System.out.println("You are a " + player.getPlayerType());


        while (loc < 2) {
            if (loc == 0) {
                //Tutorial Encounter
                int[] rockAttributes = {100, 1, 1};
                Obstacle rock = new Obstacle(rockAttributes, "Rock");
                Encounter tutorial = new Encounter("You approach a rock :| Oh nooooo... You must choose a course of action oh lost traveler. " +
                        "Whatever shall you do?\n", "\nWould you like to:\n1. Fight\n2. Flee\n3. Negotiate\n Enter your choice:", rock, player);
                System.out.println(tutorial.getApproach() + rock + tutorial.getQuestion());
                int choiceTutorial = scan.nextInt();
                tutorial.setChoice(choiceTutorial);
                roll = Dice();
                System.out.println("You rolled a " + roll);
                if (tutorial.getChoice() == 1) {
                    player.setStrengthStatus(roll);
                }
                if (tutorial.getChoice() == 2) {
                    player.setSpeedStatus(roll);
                }
                if (tutorial.getChoice() == 3) {
                    player.setCunningStatus(roll);
                }
                tutorial.setWin();
                System.out.println(tutorial.getOutcome());

                if (tutorial.getWin()) {
                    loc++;
                }
            } else if (loc == 1) {
                //Tutorial Encounter
                int[] rockAttributes = {100, 1, 1};
                Obstacle rock = new Obstacle(rockAttributes, "Rock");
                Encounter tutorial = new Encounter("You approach a rock :| Oh nooooo... You must choose a course of action oh lost traveler. " +
                        "Whatever shall you do?\n", "\nWould you like to:\n1. Fight\n2. Flee\n3. Negotiate\n Enter your choice:", rock, player);
                System.out.println(tutorial.getApproach() + rock + tutorial.getQuestion());
                int choiceTutorial = scan.nextInt();
                tutorial.setChoice(choiceTutorial);
                roll = Dice();
                System.out.println("You rolled a " + roll);
                if (tutorial.getChoice() == 1) {
                    player.setStrengthStatus(roll);
                }
                if (tutorial.getChoice() == 2) {
                    player.setSpeedStatus(roll);
                }
                if (tutorial.getChoice() == 3) {
                    player.setCunningStatus(roll);
                }
                tutorial.setWin();
                System.out.println(tutorial.getOutcome());

                if (tutorial.getWin()) {
                    loc++;
                } else {
                    loc--;
                }
            } else if (loc == 2) {
                //Tutorial Encounter
                int[] rockAttributes = {100, 1, 1};
                Obstacle rock = new Obstacle(rockAttributes, "Rock");
                Encounter tutorial = new Encounter("You approach a rock :| Oh nooooo... You must choose a course of action oh lost traveler. " +
                        "Whatever shall you do?\n", "\nWould you like to:\n1. Fight\n2. Flee\n3. Negotiate\n Enter your choice:", rock, player);
                System.out.println(tutorial.getApproach() + rock + tutorial.getQuestion());
                int choiceTutorial = scan.nextInt();
                tutorial.setChoice(choiceTutorial);
                roll = Dice();
                System.out.println("You rolled a " + roll);
                if (tutorial.getChoice() == 1) {
                    player.setStrengthStatus(roll);
                }
                if (tutorial.getChoice() == 2) {
                    player.setSpeedStatus(roll);
                }
                if (tutorial.getChoice() == 3) {
                    player.setCunningStatus(roll);
                }
                tutorial.setWin();
                System.out.println(tutorial.getOutcome());

                if (tutorial.getWin()) {
                    loc++;
                } else {
                    loc--;
                }
            } else if (loc == 3) {
                //Tutorial Encounter
                int[] rockAttributes = {100, 1, 1};
                Obstacle rock = new Obstacle(rockAttributes, "Rock");
                Encounter tutorial = new Encounter("You approach a rock :| Oh nooooo... You must choose a course of action oh lost traveler. " +
                        "Whatever shall you do?\n", "\nWould you like to:\n1. Fight\n2. Flee\n3. Negotiate\n Enter your choice:", rock, player);
                System.out.println(tutorial.getApproach() + rock + tutorial.getQuestion());
                int choiceTutorial = scan.nextInt();
                tutorial.setChoice(choiceTutorial);
                roll = Dice();
                System.out.println("You rolled a " + roll);
                if (tutorial.getChoice() == 1) {
                    player.setStrengthStatus(roll);
                }
                if (tutorial.getChoice() == 2) {
                    player.setSpeedStatus(roll);
                }
                if (tutorial.getChoice() == 3) {
                    player.setCunningStatus(roll);
                }
                tutorial.setWin();
                System.out.println(tutorial.getOutcome());

                if (tutorial.getWin()) {
                    loc++;
                } else {
                    loc--;
                }
            } else if (loc == 4) {
                //Tutorial Encounter
                int[] rockAttributes = {100, 1, 1};
                Obstacle rock = new Obstacle(rockAttributes, "Rock");
                Encounter tutorial = new Encounter("You approach a rock :| Oh nooooo... You must choose a course of action oh lost traveler. " +
                        "Whatever shall you do?\n", "\nWould you like to:\n1. Fight\n2. Flee\n3. Negotiate\n Enter your choice:", rock, player);
                System.out.println(tutorial.getApproach() + rock + tutorial.getQuestion());
                int choiceTutorial = scan.nextInt();
                tutorial.setChoice(choiceTutorial);
                roll = Dice();
                System.out.println("You rolled a " + roll);
                if (tutorial.getChoice() == 1) {
                    player.setStrengthStatus(roll);
                }
                if (tutorial.getChoice() == 2) {
                    player.setSpeedStatus(roll);
                }
                if (tutorial.getChoice() == 3) {
                    player.setCunningStatus(roll);
                }
                tutorial.setWin();
                System.out.println(tutorial.getOutcome());

                if (tutorial.getWin()) {
                    loc++;
                } else {
                    loc--;
                }
            } else if (loc == 5) {
                //Tutorial Encounter
                int[] rockAttributes = {100, 1, 1};
                Obstacle rock = new Obstacle(rockAttributes, "Rock");
                Encounter tutorial = new Encounter("You approach a rock :| Oh nooooo... You must choose a course of action oh lost traveler. " +
                        "Whatever shall you do?\n", "\nWould you like to:\n1. Fight\n2. Flee\n3. Negotiate\n Enter your choice:", rock, player);
                System.out.println(tutorial.getApproach() + rock + tutorial.getQuestion());
                int choiceTutorial = scan.nextInt();
                tutorial.setChoice(choiceTutorial);
                roll = Dice();
                System.out.println("You rolled a " + roll);
                if (tutorial.getChoice() == 1) {
                    player.setStrengthStatus(roll);
                }
                if (tutorial.getChoice() == 2) {
                    player.setSpeedStatus(roll);
                }
                if (tutorial.getChoice() == 3) {
                    player.setCunningStatus(roll);
                }
                tutorial.setWin();
                System.out.println(tutorial.getOutcome());

                if (tutorial.getWin()) {
                    loc++;
                } else {
                    loc--;
                }
            } else if (loc == 6) {
                //Tutorial Encounter
                int[] rockAttributes = {100, 1, 1};
                Obstacle rock = new Obstacle(rockAttributes, "Rock");
                Encounter tutorial = new Encounter("You approach a rock :| Oh nooooo... You must choose a course of action oh lost traveler. " +
                        "Whatever shall you do?\n", "\nWould you like to:\n1. Fight\n2. Flee\n3. Negotiate\n Enter your choice:", rock, player);
                System.out.println(tutorial.getApproach() + rock + tutorial.getQuestion());
                int choiceTutorial = scan.nextInt();
                tutorial.setChoice(choiceTutorial);
                roll = Dice();
                System.out.println("You rolled a " + roll);
                if (tutorial.getChoice() == 1) {
                    player.setStrengthStatus(roll);
                }
                if (tutorial.getChoice() == 2) {
                    player.setSpeedStatus(roll);
                }
                if (tutorial.getChoice() == 3) {
                    player.setCunningStatus(roll);
                }
                tutorial.setWin();
                System.out.println(tutorial.getOutcome());

                if (tutorial.getWin()) {
                    loc++;
                } else {
                    loc--;
                }
            } else if (loc == 7) {
                //Tutorial Encounter
                int[] rockAttributes = {100, 1, 1};
                Obstacle rock = new Obstacle(rockAttributes, "Rock");
                Encounter tutorial = new Encounter("You approach a rock :| Oh nooooo... You must choose a course of action oh lost traveler. " +
                        "Whatever shall you do?\n", "\nWould you like to:\n1. Fight\n2. Flee\n3. Negotiate\n Enter your choice:", rock, player);
                System.out.println(tutorial.getApproach() + rock + tutorial.getQuestion());
                int choiceTutorial = scan.nextInt();
                tutorial.setChoice(choiceTutorial);
                roll = Dice();
                System.out.println("You rolled a " + roll);
                if (tutorial.getChoice() == 1) {
                    player.setStrengthStatus(roll);
                }
                if (tutorial.getChoice() == 2) {
                    player.setSpeedStatus(roll);
                }
                if (tutorial.getChoice() == 3) {
                    player.setCunningStatus(roll);
                }
                tutorial.setWin();
                System.out.println(tutorial.getOutcome());

                if (tutorial.getWin()) {
                    loc++;
                } else {
                    loc--;
                }
            } else if (loc == 8) {
                //Tutorial Encounter
                int[] rockAttributes = {100, 1, 1};
                Obstacle rock = new Obstacle(rockAttributes, "Rock");
                Encounter tutorial = new Encounter("You approach a rock :| Oh nooooo... You must choose a course of action oh lost traveler. " +
                        "Whatever shall you do?\n", "\nWould you like to:\n1. Fight\n2. Flee\n3. Negotiate\n Enter your choice:", rock, player);
                System.out.println(tutorial.getApproach() + rock + tutorial.getQuestion());
                int choiceTutorial = scan.nextInt();
                tutorial.setChoice(choiceTutorial);
                roll = Dice();
                System.out.println("You rolled a " + roll);
                if (tutorial.getChoice() == 1) {
                    player.setStrengthStatus(roll);
                }
                if (tutorial.getChoice() == 2) {
                    player.setSpeedStatus(roll);
                }
                if (tutorial.getChoice() == 3) {
                    player.setCunningStatus(roll);
                }
                tutorial.setWin();
                System.out.println(tutorial.getOutcome());

                if (tutorial.getWin()) {
                    loc++;
                } else {
                    loc--;
                }
            }



        }

//        //Encounter and Obstacle Testing1
//
//        int[] ob1arr = {90, 20, 1};
//        Obstacle ob1 = new Obstacle(ob1arr, "Trahan");
//        Encounter test = new Encounter("A Trahan crosses your path", "Would you like to:\n1. Fight\n2. Flee\n3. Negotiate", ob1, player);
//        System.out.println(test.getApproach() + " " + test.getQuestion());
//        System.out.println("What is your choice");
//        int choiceTest = scan.nextInt();
//        test.setChoice(choiceTest);
//        System.out.print(test);

    }

    public static int Dice() {
        return (int) (Math.random() * 6) + 1;
    }
}
