public class Player {
    string usrName;
    string usrAnswr;
    int playerNum;
    int grade;
    string gradeLetter;
    Int playerAttribute[] = new int[5];

    public static void setGrade() {
        grade = playerAttribute[0];
        for (int i = 0; i < playerAttribute.length; i++) {
            if (playerAttribute[i] > grade) {
                grade = playerAttribute[i];
            }
        }
    }

    public static int getGrade() {
        return grade;
    }

    public static void setGradeLetter(String Letter) {
        gradeLetter = Letter;
    }

    public static String getUsrName() {
        return userName;
    }


    public static void setUsrAnswr(String usrAnswr) {
        usrAnswr = usrAnswr;
    }

    public static String getUsrAnswr() {
        return usrAnswr;
    }


    public static void gradeLetter() {
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
