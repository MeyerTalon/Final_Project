
public class Global {

    public int loc = 0;

    public String Images() {
        String img = "";
        if (loc == 1) {
            img = "horse.png";
        }
        if (loc == 2) {
            img = "New Piskel (7).png";
        }
        if (loc == 3) {
            img = "RubberDucky.png";
        }
        if (loc == 4) {
            img = "Robot1.png";
        }
        if (loc == 5) {
            img = "Angryvirus6.png";
        }
        return img;
    }
}