import java.util.*;
public class Driver {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        int roll = 0;
        int loc = 0;
        char space = 'a';
        //String test = "";


        System.out.println("\n\nTechnological Terrors Transmitting Tremors Towards Thermopylae");
        Thread.sleep(5000);
        //test = scan.next();
        System.out.println("\n\n\n\nWelcome to Thermopylae");
        Thread.sleep(2000);
        System.out.println("It is a world filled with mythical (computer themed) and magical (wholly unoriginal) creatures!" +
            "In this fantastical world you must select your mighty avatar which you will control as you traverse this " +
                "extravagant land! You, the player, and all the obstacles you shall face have three attributes: Strength, Speed, " +
                "and Cunning. At each encounter you will choose a course of action and roll a dice to improve your attributes. " +
                "At the end of the encounter if the attribute you chose, which corresponds to the course of action you took, " +
                "is greater than the obstacle's, you win! If otherwise, well, you get the idea ;) ");
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


        while (loc < 9) {
            player.setGrade();
            player.getGradeLetter();
            if (loc == 0) {
                //Tutorial Encounter
                int[] rockAttributes = {1, 1, 1};
                Obstacle rock = new Obstacle(rockAttributes, "Rock");
                Encounter tutorial = new Encounter("wandering through your village, you approach a rock :| Oh nooooo... You must choose a course of action oh lost traveler. " +
                        "Whatever shall you do?\n", "\nWould you like to:\n1. Fight\n2. Flee\n3. Negotiate\n Enter your choice:", rock, player);
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
                    System.out.println("Your grade is " + player.getGradeLetter());
                    loc++;
                } else {
                    loc--;
                }
            }

            else if (loc == 1) {
                    //Tutorial Encounter
                    int[] compMouseAttributes = {40, 10, 10};
                    Obstacle compMouse = new Obstacle(compMouseAttributes, "Computer Mouse");
                    Encounter tutorial = new Encounter("A computer mouse approaches you. It looks hungry. You feed it, and it suddenly begins to grow. You wonder if it plans on making you its next meal..." +
                            "Whatever shall you do?\n", "\nWould you like to:\n1. Fight\n2. Flee\n3. Negotiate\n Enter your choice:", compMouse, player);
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
                        System.out.println("Your grade is " + player.getGradeLetter());
                        loc++;
                    } else {
                        loc--;
                    }
            } else if (loc == 2) {
                    //Tutorial Encounter
                    int[] trojanHorseAttributes = {30, 20, 60};
                    Obstacle trojanHorse = new Obstacle(trojanHorseAttributes, "Trojan Horse");
                    Encounter tutorial = new Encounter("A wild Trojan horse has appeared! And it's not the kind you can saddle up..." +
                            "Whatever shall you do?\n", "\nWould you like to:\n1. Fight\n2. Flee\n3. Negotiate\n Enter your choice:", trojanHorse, player);
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
                        System.out.println("Your grade is " + player.getGradeLetter());
                        loc++;
                    } else {
                        loc--;
                    }
            } else if (loc == 3) {
                    //Tutorial Encounter
                    int[] coronaAttributes = {100, 20, 20};
                    Obstacle corona = new Obstacle(coronaAttributes, "Corona");
                    Encounter tutorial = new Encounter("Coronavirus has been spreading through the class, and breaking news says computers can catch Corona now. Your computer has been doing some suspicious coughing. You need a plan to defeat the virus." +
                            "Whatever shall you do?\n", "\nWould you like to:\n1. Fight\n2. Flee\n3. Negotiate\n Enter your choice:", corona, player);
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
                        System.out.println("Your grade is " + player.getGradeLetter());
                        loc++;
                    } else {
                        loc--;
                    }
            } else if (loc == 4) {
                    //Tutorial Encounter
                    int[] duckAttributes = {40, 35, 40};
                    Obstacle duck = new Obstacle(duckAttributes, "Rubber Duck");
                    Encounter tutorial = new Encounter("Enough of these pesky bugs. Your rubber duck, bored from listening to your problems for all these years, is ready to rebel. It helped you defeat your coding struggles, now you must defeat it." +
                            "Whatever shall you do?\n", "\nWould you like to:\n1. Fight\n2. Flee\n3. Negotiate\n Enter your choice:", duck, player);
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
                        System.out.println("Your grade is " + player.getGradeLetter());
                        loc++;
                    } else {
                        loc--;
                    }
            } else if (loc == 5) {
                    //Tutorial Encounter
                    int[] robotAttributes = {45, 45, 40};
                    Obstacle robot = new Obstacle(robotAttributes, "Robot");
                    Encounter tutorial = new Encounter("It's a bird, it's a plane, it's a... robot? It seems that the robot revolution has begun." +
                            "Whatever shall you do?\n", "\nWould you like to:\n1. Fight\n2. Flee\n3. Negotiate\n Enter your choice:", robot, player);
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
                        System.out.println("Your grade is " + player.getGradeLetter());
                        loc++;
                    } else {
                        loc--;
                    }
            } else if (loc == 6) {
                    //Tutorial Encounter
                    int[] salePersonAttributes = {55, 60, 50};
                    Obstacle salePerson = new Obstacle(salePersonAttributes, "Sale Person");
                    Encounter tutorial = new Encounter("You asked for a keyboard, and you got a piano. Wrong on several levels. You aren't happy. The sale person isn't happy that you're not happy. The sale person has a weapon." +
                            "Whatever shall you do?\n", "\nWould you like to:\n1. Fight\n2. Flee\n3. Negotiate\n Enter your choice:", salePerson, player);
                    Thread.sleep(1000);
                    System.out.println(tutorial.getApproach());
                    Thread.sleep(1000);
                    System.out.print(salePerson);
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
                        System.out.println("Your grade is " + player.getGradeLetter());
                        loc++;
                    } else {
                        loc--;
                    }
            } else if (loc == 7) {
                    //Tutorial Encounter
                    int[] momAttributes = {70, 70, 70};
                    Obstacle mom = new Obstacle(momAttributes, "Mom");
                    Encounter tutorial = new Encounter("You dropped your supposedly waterproof phone in a lake. Your mom is angry because it was expensive, and she's coming after you." +
                            "Whatever shall you do?\n", "\nWould you like to:\n1. Fight\n2. Flee\n3. Negotiate\n Enter your choice:", mom, player);
                    Thread.sleep(1000);
                    System.out.println(tutorial.getApproach());
                    Thread.sleep(1000);
                    System.out.print(mom);
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
                        System.out.println("Your grade is " + player.getGradeLetter());
                        loc++;
                    } else {
                        loc--;
                    }


            } else if (loc == 8 && player.getGrade() >= 100) {
                //Tutorial Encounter
                int[] trahatt = {90, 90, 90};
                Obstacle rock = new Obstacle(trahatt, "TraHydra");
                Encounter finalBoss = new Encounter("After endless fights, dangerous adventures, and countless close calls with death, you have finally arrived. The lair of the TraHydra stands before you. " +
                        "\nYou stare up at foreboding castle, and as you look the gates open wide and a single large figure steps toward you. The TraHydra.\nHe calls out: who dares stand before the gates of  my castle" +
                        "\nTrembling, you call out: It is I, " + player.getPlayerType() + "\nSnarling, the TraHydra takes another step" +
                        "How do you choose to approach this fight.\n", "\nWould you like to:\n1. Attack head on with your heavy weapons\n2. Hide in the shadows and strike from behind\n3. Show the TraHydra the error of its ways\n Enter your choice:", rock, player);
                Thread.sleep(1000);
                System.out.println(finalBoss.getApproach());
                Thread.sleep(1000);
                System.out.print(rock);
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
                    System.out.println("You have been bested by the TraHydra, barely escaping with your life.");
                    loc--;
                }
            } else {
                loc--;
            }

        }

        System.out.println("Congratulations! You have defeated the TraHydra and retaken the land of Thermopylae, earning a "
                + player.getGradeLetter() + " in the process.");

    }

    public static int Dice() {
        return (int) (Math.random() * 6) + 1;
    }
}
