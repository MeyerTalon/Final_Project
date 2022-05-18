public class Dice {
    private int roll;

    public Dice() {
        this.roll = (int) (Math.random()*6)+1;
    }
    public int getRoll() {
        return roll;
    }
}