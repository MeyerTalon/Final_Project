public class Dice {
    private int roll;

    public Dice() {
        this.roll = (int) 6*Math.random()+1;
    }
    public int getRoll() {
        return roll;
    }
}