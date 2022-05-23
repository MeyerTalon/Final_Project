
import java.util.Scanner;
public class Player {
    //Variables;
    public String usrName;
    public int playerNum;
    public int grade;
    public String gradeLetter;
    public int[] playerAttributeStatus = new int[3];
    public String[] playerAttributes = new String[3];
    public String playerType;




    // Attributes;
    public void setPlayerAttributes() {
        playerAttributes[0] = "Strength"; //fight
        playerAttributes[1] = "Speed"; //flee
        playerAttributes[2] = "Cunning"; //negotiate
    }

    public void setPlayerAttributeStatus(int f, int s, int c) {
        playerAttributeStatus[0] = f; //fight
        playerAttributeStatus[1] = s; //flee
        playerAttributeStatus[2] = c; //negotiate
    }

          //attribute status getters;



    public void setStrengthStatus(int dice) {
        playerAttributeStatus[0] += dice;
    }

    public void setPlayerType(String p) {
        playerType = p;
    }

    public String getPlayerType() {
        return playerType;
    }

    public String returnClass() {
        return this.getClass().getName();
    }

    public int getStrengthStatus() {
        return playerAttributeStatus[0];
    }

    public int getSpeedStatus() {
        return playerAttributeStatus[1];
    }

    public void setSpeedStatus(int dice) {
        playerAttributeStatus[1] += dice;
    }

    public int getCunningStatus(){
        return playerAttributeStatus[2];
    }

    public void setCunningStatus(int dice) {
        playerAttributeStatus[2] += dice;
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
