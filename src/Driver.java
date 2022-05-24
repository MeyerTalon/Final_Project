import java.util.*;
public class Driver {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        int roll = 0;
        int loc = 0;
        char space = 'a';
        //String test = "";


        System.out.println("Technological Terrors Transmitting Tremors Towards Thermopylae");
        Thread.sleep(5000);
        //test = scan.next();
        System.out.println("Welcome to Thermopylae");
        Thread.sleep(2000);
        System.out.println("It is a world filled with mythical (computer themed) and magical (wholly unoriginal) creatures!\n" +
            "In this fantastical world you must select your mighty avatar which you will control as you traverse this \n" +
                "extravagant land! You, the player, and all the obstacles you shall face have three attributes: Strength, Speed, \n" +
                "and Cunning. At each encounter you will choose a course of action and roll a dice to improve your attributes. \n" +
                "At the end of the encounter if the attribute you chose, which corresponds to the course of action you took, \n" +
                "is greater than the obstacle's, you win! If otherwise, well, you get the idea ;)");
        Thread.sleep(10000);

        System.out.println("You can choose to play as a\n1. Hacker (The Brains)\n2. Intern that Works Out (The Brawn)\n3. Rubber Duck Debugger (Fast Boy)\nSelect Below:");
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
                int[] rockAttributes = {1, 1, 1};
                Obstacle rock = new Obstacle(rockAttributes, "Rock");
                Encounter tutorial = new Encounter("wandering through your village, you approach a rock :| Oh nooooo... You must choose a course of action oh lost traveler. " +
                        "Whatever shall you do?", "\nWould you like to:\n1. Fight\n2. Flee\n3. Negotiate\n Enter your choice:", rock, player);
                Thread.sleep(1000);
                System.out.println(tutorial.getApproach());
                Thread.sleep(1000);
                System.out.print(rock);
                Thread.sleep(1000);
                System.out.println(tutorial.getQuestion());
                int choiceTutorial = scan.nextInt();
                tutorial.setChoice(choiceTutorial);
                roll = Dice();
                Thread.sleep(2000);
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
                Thread.sleep(1000);
                System.out.println(tutorial.getOutcome());

                if (tutorial.getWin()) {
                    System.out.println("Congratulations! You have defeated the rock. This marks you as the strongest in the village, and you choose to journey to the lair of the TraHydra," +
                            "but the journey will be perilous.");
                    loc++;
                } else {
                    loc--;
                }
            } else if (loc == 1) {
                //First Encounter
                int[] compMouseAttributes = {100, 1, 1};
                Obstacle compMouse = new Obstacle(compMouseAttributes, "Computer Mouse");
                Encounter tutorial = new Encounter("A computer mouse approaches you. It looks hungry. You feed it, and it suddenly begins to grow. You wonder if it plans on making you its next meal..." +
                        "Whatever shall you do?", "\nWould you like to:\n1. Fight\n2. Flee\n3. Negotiate\n Enter your choice:", compMouse, player);
                Thread.sleep(1000);
                System.out.println(tutorial.getApproach());
                Thread.sleep(1000);
                System.out.print(compMouse);
                Thread.sleep(1000);
                System.out.println(tutorial.getQuestion());
                int choiceTutorial = scan.nextInt();
                tutorial.setChoice(choiceTutorial);
                roll = Dice();
                Thread.sleep(2000);
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
                Thread.sleep(1000);
                System.out.println(tutorial.getOutcome());

                if (tutorial.getWin()) {
                    loc++;
                } else {
                    loc--;
                }
            } else if (loc == 2) {
                //Second Encounter
                int[] trojanHorseAttributes = {100, 1, 1};
                Obstacle trojanHorse = new Obstacle(trojanHorseAttributes, "Trojan Horse");
                Encounter tutorial = new Encounter("A wild Trojan horse has appeared! And it's not the kind you can saddle up... What do you do?" +
                        "Whatever shall you do?", "\nWould you like to:\n1. Fight\n2. Flee\n3. Negotiate\n Enter your choice:", trojanHorse, player);
                Thread.sleep(1000);
                System.out.println(tutorial.getApproach());
                Thread.sleep(1000);
                System.out.print(trojanHorse);
                Thread.sleep(1000);
                System.out.println(tutorial.getQuestion());
                int choiceTutorial = scan.nextInt();
                tutorial.setChoice(choiceTutorial);
                roll = Dice();
                Thread.sleep(2000);
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
                Thread.sleep(1000);
                System.out.println(tutorial.getOutcome());

                if (tutorial.getWin()) {
                    loc++;
                } else {
                    loc--;
                }
            } else if (loc == 3) {
                //Third Encounter
                int[] coronaAttributes = {100, 1, 1};
                Obstacle corona = new Obstacle(coronaAttributes, "Corona");
                Encounter tutorial = new Encounter("Coronavirus has been spreading through the class, and breaking news says computers can catch Corona now. Your computer has been doing some suspicious coughing. How are you going to fight the virus?" +
                        "Whatever shall you do?", "\nWould you like to:\n1. Fight\n2. Flee\n3. Negotiate\n Enter your choice:", corona, player);
                Thread.sleep(1000);
                System.out.println(tutorial.getApproach());
                Thread.sleep(1000);
                System.out.print(corona);
                Thread.sleep(1000);
                System.out.println(tutorial.getQuestion());
                int choiceTutorial = scan.nextInt();
                tutorial.setChoice(choiceTutorial);
                roll = Dice();
                Thread.sleep(2000);
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
                Thread.sleep(1000);
                System.out.println(tutorial.getOutcome());

                if (tutorial.getWin()) {
                    loc++;
                } else {
                    loc--;
                }
            } else if (loc == 4) {
                //Fourth Encounter
                int[] duckAttributes = {100, 1, 1};
                Obstacle duck = new Obstacle(duckAttributes, "Rubber Duck");
                Encounter tutorial = new Encounter("Enough of these pesky bugs. Your rubber duck, bored from listening to your problems for all these years, is ready to rebel. It helped you defeat your coding struggles, now you must defeat it." +
                        "Whatever shall you do?", "\nWould you like to:\n1. Fight\n2. Flee\n3. Negotiate\n Enter your choice:", duck, player);
                Thread.sleep(1000);
                System.out.println(tutorial.getApproach());
                Thread.sleep(1000);
                System.out.print(duck);
                Thread.sleep(1000);
                System.out.println(tutorial.getQuestion());
                int choiceTutorial = scan.nextInt();
                tutorial.setChoice(choiceTutorial);
                roll = Dice();
                Thread.sleep(2000);
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
                Thread.sleep(1000);
                System.out.println(tutorial.getOutcome());

                if (tutorial.getWin()) {
                    loc++;
                } else {
                    loc--;
                }
            } else if (loc == 5) {
                //Fifth Encounter
                int[] robotAttributes = {100, 1, 1};
                Obstacle robot = new Obstacle(robotAttributes, "Robot");
                Encounter tutorial = new Encounter("It's a bird, it's a plane, it's a... robot? It seems that the robot revolution has begun." +
                        "Whatever shall you do?", "\nWould you like to:\n1. Fight\n2. Flee\n3. Negotiate\n Enter your choice:", robot, player);
                Thread.sleep(1000);
                System.out.println(tutorial.getApproach());
                Thread.sleep(1000);
                System.out.print(robot);
                Thread.sleep(1000);
                System.out.println(tutorial.getQuestion());
                int choiceTutorial = scan.nextInt();
                tutorial.setChoice(choiceTutorial);
                roll = Dice();
                Thread.sleep(2000);
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
                Thread.sleep(1000);
                System.out.println(tutorial.getOutcome());

                if (tutorial.getWin()) {
                    loc++;
                } else {
                    loc--;
                }
            } else if (loc == 6) {
                //Six Encounter
                int[] neckBeardAttributes = {20, 20, 40};
                Obstacle neckBeard = new Obstacle(neckBeardAttributes, "Rock");
                Encounter sixthEncounter = new Encounter("You approach the dread pirate Neck Beard the Discord Mod!!! Quick! Choose a course of action before he spills diet Dr. Pepper on you! " +
                        "Whatever shall you do?", "\nWould you like to:\n1. Fight and Surely Perish\n2. Cowardly Flee Like a Coward\n3. Have a Battle of Wits\n Enter your choice:", neckBeard, player);
                Thread.sleep(1000);
                System.out.println(sixthEncounter.getApproach());
                Thread.sleep(1000);
                System.out.print(neckBeard);
                Thread.sleep(1000);
                System.out.println(sixthEncounter.getQuestion());
                int choiceTutorial = scan.nextInt();
                sixthEncounter.setChoice(choiceTutorial);
                roll = Dice();
                Thread.sleep(2000);
                System.out.println("You rolled a " + roll);
                if (sixthEncounter.getChoice() == 1) {
                    player.setStrengthStatus(roll);
                }
                if (sixthEncounter.getChoice() == 2) {
                    player.setSpeedStatus(roll);
                }
                if (sixthEncounter.getChoice() == 3) {
                    player.setCunningStatus(roll);
                }
                sixthEncounter.setWin();
                Thread.sleep(1000);
                System.out.println(sixthEncounter.getOutcome());

                if (sixthEncounter.getWin()) {
                    loc++;
                } else {
                    loc--;
                }
            } else if (loc == 7) {
                //Seventh Encounter
                int[] rockAttributes = {100, 1, 1};
                Obstacle rock = new Obstacle(rockAttributes, "Rock");
                Encounter tutorial = new Encounter("You approach a rock :| Oh nooooo... You must choose a course of action oh lost traveler. " +
                        "Whatever shall you do?", "\nWould you like to:\n1. Fight\n2. Flee\n3. Negotiate\n Enter your choice:", rock, player);
                Thread.sleep(1000);
                System.out.println(tutorial.getApproach());
                Thread.sleep(1000);
                System.out.print(rock);
                Thread.sleep(1000);
                System.out.println(tutorial.getQuestion());
                int choiceTutorial = scan.nextInt();
                tutorial.setChoice(choiceTutorial);
                roll = Dice();
                Thread.sleep(2000);
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
                Thread.sleep(1000);
                System.out.println(tutorial.getOutcome());

                if (tutorial.getWin()) {
                    loc++;
                } else {
                    loc--;
                }
            } else if (loc == 8) {
                //Final Encounter
                int[] trahatt = {90, 90, 90};
                Obstacle traHydra = new Obstacle(trahatt, "TraHydra");
                Encounter finalBoss = new Encounter("After endless fights, dangerous adventures, and countless close calls with death, you have finally arrived. The lair of the TraHydra stands before you. " +
                        "\nYou stare up at foreboding castle, and as you look the gates open wide and a single large figure steps toward you. The TraHydra.\nHe calls out: who dares stand before the gates of  my castle" +
                        "\nTrembling, you call out: It is I, " + player.getPlayerType() + "\nSnarling, the TraHydra takes another step" +
                        "How do you choose to approach this fight.", "\nWould you like to:\n1. Face the being head on, attacking with your dual bladed heavy axes\n2. Attack from the shadows, quickly avoiding all attacks\n3. SHow the TraHydra the error of his ways\nMake your choice:", traHydra, player);
                Thread.sleep(1000);
                System.out.println(finalBoss.getApproach());
                Thread.sleep(1000);
                System.out.print(traHydra);
                Thread.sleep(1000);
                System.out.println(finalBoss.getQuestion());
                int choiceTutorial = scan.nextInt();
                finalBoss.setChoice(choiceTutorial);
                roll = Dice();
                Thread.sleep(2000);
                System.out.println("You rolled a " + roll);
                if (finalBoss.getChoice() == 1) {
                    player.setStrengthStatus(roll);
                }
                if (finalBoss.getChoice() == 2) {
                    player.setSpeedStatus(roll);
                }
                if (finalBoss.getChoice() == 3) {
                    player.setCunningStatus(roll);
                }
                finalBoss.setWin();
                Thread.sleep(1000);
                System.out.println(finalBoss.getOutcome());

                if (finalBoss.getWin()) {
                    loc++;
                } else {
                    System.out.println("You barely escape with your life, losing a limb in the process");
                    loc--;
                }
            }
        }
        System.out.println("You win");

    }

    public static int Dice() {
        return (int) (Math.random() * 6) + 1;
    }
}
