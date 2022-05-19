import java.util.*;
public class Driver {
    public static void main() {
        int[] ob1arr = {90, 20, 1};
        Obstacle ob1 = new Obstacle(ob1arr, "Trahan");
        Encounter test = new Encounter("A Trahan crosses your path", "Would you like to:\n1. Fight\n2. Flee\n3. Negotiate", ob1);
        Scanner scan = new Scanner(System.in);
        int choiceTest = scan.nextInt();
        test.setChoice(choiceTest);
    }
}
