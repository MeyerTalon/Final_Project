public class InternThatWorksout extends Player {

    public InternThatWorksout () {
            super();
    }

    @Override
    public void setPlayerAttributeStatus() {
            playerAttributeStatus[0] = 40; //fight, strength
            playerAttributeStatus[1] = 10; //flee, speed
            playerAttributeStatus[2] = -10; //negotiate, cunning
    }

            /* Strength, Cunning,  Speed*/
}
