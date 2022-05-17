public class DiceRoll {
    private int roll;

    public DiceRoll() {
        this.roll = (int) 6*(Math.random())+1;
    }
    public int getRoll() {
        return roll;
    }
}
