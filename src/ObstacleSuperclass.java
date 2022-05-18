public class ObstacleSuperclass {
    private int[] attributes;
    private String obstacleName;
    public ObstacleSuperclass()
    {
        this.attributes = new int [5];
        this.obstacleName = "";
    }
    private void setAttributes(int[] setAttributes)
    {
        attributes = setAttributes;
    }
    private void setObstacleName(String setObstacleName)
    {
        obstacleName = setObstacleName;
    }
}
