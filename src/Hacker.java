public class Hacker extends Player {

    public Hacker () {
        super();
    }

    @Override
    public void setPlayerAttributeStatus() {
        playerAttribute[0] = -30; //fight, strength
        playerAttribute[1] = 30; //flee, speed
        playerAttribute[2] = 40; //negotiate, cunning
    }

    /* Strength, Cunning,  Speed*/
}
