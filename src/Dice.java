public class Dice {
    private int roll;

    public int Dice() {
        roll = (int) (6*Math.random()+1);
        return roll;
    }
    public int getRoll() {
        return roll;
    }
}