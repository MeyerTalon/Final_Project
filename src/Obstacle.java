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

    //Getters
    public int[] getAttributes()
    {
        return attributes;
    }
    public String getObstacleName()
    {
        return obstacleName;
    }
    //Create 3 getters for each attribute

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
