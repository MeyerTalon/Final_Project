import java.util.Scanner;
public class Story {
    public static void main() {

    String usrAnswr;
    int questionNum;

    public static void setUsrAnswr(String usrAnswr) {
        usrAnswr = usrAnswr;
    }

    public static String getUsrAnswr() {
        return usrAnswr;
    }

    public void usrAnswrReaction() {
        if (getUsrAnswer().equals("Fight")){
            if (questionNum == 1) {
                questionNum++;
            }
            if (questionNum == 2) {
                questionNum++;
            }
        }
        if (getUsrAnswer().equals("Flee")){
            if (questionNum == 1) {
                questionNum++;
            }
            if (questionNum == 2) {
                questionNum++;
            }
        }
        if (getUsrAnswer().equals("Negotiate")){
            if (questionNum == 1) {
                questionNum++;
            }
            if (questionNum == 2) {
                questionNum++;
            }
        }
        else {// in case user mistypes
        while (NOT (getUsrAnswer().equals("Fight") ||getUsrAnswer().equals("Flee") || getUsrAnswer().equals("Negotiate")) {
            setUsrAnswer = kybd.nextLine();
        } }


        if (usr.Answer.equals("Fight") && playerAttribute[0] > obstacleAttribute[0]) {
            grade++;
        }
        else {
            grade--;
        }
    }



    }
}
