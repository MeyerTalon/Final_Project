import java.util.*;
public class Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int roll = 0;
        System.out.print(Dice());



        System.out.println("Welcome to Thermopylae\nIt is a world filled with.......");

        System.out.println("You can choose to play as a\n1. Hacker\n2. Intern\n3. Debugger\nSelect your choice");
        if (scan.nextInt() > 0 && scan.nextInt() < 4) {
            final int character = scan.nextInt;
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
