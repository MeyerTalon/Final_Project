public class RubberDuckDebugger extends Player {

    public RubberDuckDebugger () {
        super();
        }

    @Override
    public void setPlayerAttributeStatus() {
        playerAttributeStatus[0] = -10; //fight, strength
        playerAttributeStatus[1] = 10; //flee, speed
        playerAttributeStatus[2] = 50; //negotiate, cunning
        }

        /* Strength, Cunning,  Speed*/
}
