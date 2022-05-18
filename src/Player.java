
import java.util.Scanner;
public class Player {
    String usrName;
    int playerNum;
    int grade;
    String gradeLetter;
    int playerAttribute[] = new int[5];

    public void setGrade() {
        grade = playerAttribute[0];
        for (int i = 0; i < playerAttribute.length; i++) {
            if (playerAttribute[i] > grade) {
                grade = playerAttribute[i];
            }
        }
    }

    public void usrName() {
    Scanner usrNameKybd = new Scanner(System.in);
    usrName = usrNameKybd.nextLine();
    }

    public static string getUsrName() {
        return userName;
    }


    public static int getGrade() {
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
