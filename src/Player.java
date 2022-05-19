
import java.util.Scanner;
public class Player {
    //Variables;
    public String usrName;
    public int playerNum;
    public int grade;
    public String gradeLetter;
    public int[] playerAttributeStatus = new int[3];
    public String[] playerAttributes = new String[3];


    // Attributes;
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



    //User name;
    public void setUsrName(String usrName1) {
        this.usrName = usrName1;
    }

    public String getUsrName() {
        return usrName;
    }



    //Grade
    public void setGrade() {
        grade = playerAttributeStatus[0];
        for (int i = 0; i < playerAttributeStatus.length; i++) {
            if (playerAttributeStatus[i] > grade) {
                grade = playerAttributeStatus[i];
            }
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGradeLetter(String letter) {
        gradeLetter = letter;
    }


    public void gradeLetter() {
        setGrade();
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

    public String getGradeLetter() {
        return gradeLetter;
    }

}
