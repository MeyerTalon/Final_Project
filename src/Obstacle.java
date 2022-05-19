public class Obstacle {
    private int[] attributes;
    private String obstacleName;
    public Obstacle()
    {
        this.attributes = new int[5];
        this.obstacleName = "";
    }
    public Obstacle(int[] a, String oN)
    {
        attributes = a;
        obstacleName = oN;
    }
    public void setAttributes(int[] setAttributes)
    {
        attributes = setAttributes;
    }
    public void setObstacleName(String setObstacleName)
    {
        obstacleName = setObstacleName;
    }
    public int[] getAttributes()
    {
        return attributes;
    }
    public String getObstacleName()
    {
        return obstacleName;
    }
    public String toString()
    {
        String output = new String();
        output = getObstacleName() + " Stats: /nStrength: " + attributes[0] +
                "/nSpeed: " + attributes[1] +
                "/nCunning: " + attributes[2];
        return output;
    }
}
