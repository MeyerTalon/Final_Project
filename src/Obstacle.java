public class Obstacle {
    // initial vars
    private int[] attributes;
    private String obstacleName;

    // Constructors
    public Obstacle()
    {
        this.attributes = new int[3];
        this.obstacleName = "";
    }
    public Obstacle(int[] a, String oN)
    {
        attributes = a;
        obstacleName = oN;
    }
    // Setters
    public void setAttributes(int[] setAttributes)
    {
        attributes = setAttributes;
    }
    public void setObstacleName(String setObstacleName)
    {
        obstacleName = setObstacleName;
    }
    public void setStrength(int strength)
    {
        attributes[0] = strength;
    }
    public void setSpeed(int speed)
    {
        attributes[1] = speed;
    }
    public void setCunning(int cunning)
    {
        attributes[2] = cunning;
    }
    //Getters
    public int[] getAttributes()
    {
        return attributes;
    }
    public String getObstacleName()
    {
        return obstacleName;
    }
    public int getStrength()
    {
        return this.attributes[0];
    }
    public int getSpeed()
    {
        return this.attributes[1];
    }
    public int getCunning()
    {
        return this.attributes[2];
    }

    //To String
    public String toString()
    {
        String output = new String();
        output = getObstacleName() + " Stats: /nStrength: " + attributes[0] +
                "/nSpeed: " + attributes[1] +
                "/nCunning: " + attributes[2];
        return output;
    }
}
