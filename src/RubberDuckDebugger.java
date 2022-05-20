public class Duck extends Player {

    public Duck () {
        super();
        }

    @Override
    public void setPlayerAttributeStatus() {
        playerAttributeStatus[0] = 10; //fight, strength
        playerAttributeStatus[1] = 50; //flee, speed
        playerAttributeStatus[2] = 20; //negotiate, cunning
        }

        /* Strength, Cunning,  Speed*/
}
