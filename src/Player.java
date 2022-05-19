
import java.util.Scanner;
public class Player {
    public String usrName;
    public int playerNum;
    public int grade;
    public String gradeLetter;
    public int[] playerAttributeStatus = new int[3];
    public String[] playerAttributes = new String[3];

    public void setPlayerAttributes() {
        playerAttributes[0] = "Strength"; //fight
        playerAttributes[1] = "Speed"; //flee
        playerAttributes[2] = "Cunning"; //negotiate
    }

    public void setPlayerAttributeStatus() {
        playerAttributeStatus[0] = 0; //fight
        playerAttributeStatus[1] = 0; //flee
        playerAttributeStatus[2] = 0; //negotiate
    }

    public void setGrade() {
        grade = playerAttributeStatus[0];
        for (int i = 0; i < playerAttributeStatus.length; i++) {
            if (playerAttributeStatus[i] > grade) {
                grade = playerAttributeStatus[i];
            }
        }
    }

    public void usrName() {
    Scanner usrNameKybd = new Scanner(System.in);
    usrName = usrNameKybd.nextLine();
    }

    public String getUsrName() {
        return usrName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGradeLetter(String Letter) {
        gradeLetter = Letter;
    }








    public void gradeLetter() {
        if (getGrade() >= 100) {
            setGradeLetter("A+");
        }
        if (getGrade() >= 90 && getGrade() < 100) {
            setGradeLetter("A");
        }
        if (getGrade() >= 80 && getGrade() < 90) {
            setGradeLetter("B");
        }
        if (getGrade() >= 70 && getGrade() < 80) {
            setGradeLetter("C");
        }
        if (getGrade() >= 60 && getGrade() < 70) {
            setGradeLetter("D");
        }
        if (getGrade() < 60) {
            setGradeLetter("F");
        }
    }

}
