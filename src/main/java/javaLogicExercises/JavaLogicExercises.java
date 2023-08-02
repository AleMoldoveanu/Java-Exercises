package javaLogicExercises;

public class JavaLogicExercises {
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend == true && cigars >= 40) {
            return true;
        } else if (isWeekend == false && cigars >= 40 && cigars <= 60) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean love6(int a, int b) {
        if (a == 6 || b == 6) {
            return true;
        } else if (a + b == 6) {
            return true;
        } else if (a - b == 6) {
            return true;
        } else return b - a == 6;
    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if (!isBirthday) {
            if (speed <= 60) {
                return 0;
            } else if (speed <= 80) {
                return 1;
            } else {
                return 2;
            }
        } else {
            if (speed <= 65) {
                return 0;
            } else if (speed <= 85) {
                return 1;
            } else {
                return 2;
            }
        }
    }

    public static boolean more20(int n) {
        return (n % 20 == 1 || n % 20 == 2);
    }

    public static boolean nearTen(int num) {
        return (num % 10 <= 2 || num % 10 >= 8);
    }
    public static int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5){
            return 0;
        } else if (tea >= 2 * candy || candy >= 2 * tea){
            return 2;
        } else {
            return 1;
        }
    }
    public static boolean twoAsOne(int a, int b, int c) {
        if (a + b == c){
            return true;
        } else if ( b + c == a){
            return true;
        } else return a + c == b;
    }

}

