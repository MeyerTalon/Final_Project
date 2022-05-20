public class Intern extends Player {

    public Intern () {
            super();
    }

    @Override
    public void setPlayerAttributeStatus() {
            playerAttributeStatus[0] = 40; //fight, strength
            playerAttributeStatus[1] = 10; //flee, speed
            playerAttributeStatus[2] = 5; //negotiate, cunning
    }

            /* Strength, Cunning,  Speed*/
}
