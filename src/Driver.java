import java.util.*;
public class Driver {
    public static void main() {
        Obstacle ob1 = new Obstacle([90, 20, 1], "Trahan");
        Encounter test = new Encounter("A Trahan crosses your path", "Would you like to:\n1. Fight\n2. Flee\n3. Negotiate",  ob1);
    }
}
