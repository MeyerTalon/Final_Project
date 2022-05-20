public class Hacker extends Player {

    public Hacker () {
        super();
    }

    @Override
    public void setPlayerAttributeStatus() {
        playerAttributeStatus[0] = 5; //fight, strength
        playerAttributeStatus[1] = 30; //flee, speed
        playerAttributeStatus[2] = 50; //negotiate, cunning
    }

    /* Strength, Cunning,  Speed*/
}
