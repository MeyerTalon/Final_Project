import java.util.*;
public class Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int roll = 0;
        System.out.print(Dice());



        System.out.println("Welcome to Thermopylae\nIt is a world filled with mythical (computer themed) and magical (wholly unoriginal)" +
                "creatures! In this fantastical world you must select your mighty avatar which you will control as you traverse this " +
                "extravegent land!");

        System.out.println("You can choose to play as a\n1. Hacker\n2. Intern that Works Out\n3. Duck\nSelect Below:");
        int character = 0;
        while (character < 1 || character > 3) {
            character = scan.nextInt();
            if (character < 1 || character > 3) System.out.println("Try again");
        }
        if (character == 1) {
            Hacker player = new Hacker();
        } else if (character == 2) {
            Intern player = new Intern();
        } else {
            Duck player = new Duck();
        }

        //Encounter and Obstacle Testing
        int[] ob1arr = {90, 20, 1};
        Obstacle ob1 = new Obstacle(ob1arr, "Trahan");
        Encounter test = new Encounter("A Trahan crosses your path", "Would you like to:\n1. Fight\n2. Flee\n3. Negotiate", ob1);
        System.out.println(test.getApproach() + " " + test.getQuestion());
        System.out.println("What is your choice");
        int choiceTest = scan.nextInt();
        test.setChoice(choiceTest);
        System.out.print(test);

    }

    public static int Dice() {
        return (int) (Math.random() * 6) + 1;
    }
}
