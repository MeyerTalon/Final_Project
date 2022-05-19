public class Intern extends Player {

    public Intern () {
            super();
    }

    @Override
    public void setPlayerAttributeStatus() {
            playerAttributeStatus[0] = -40; //fight, strength
            playerAttributeStatus[1] = 60; //flee, speed
            playerAttributeStatus[2] = -10; //negotiate, cunning
    }

            /* Strength, Cunning,  Speed*/
}
