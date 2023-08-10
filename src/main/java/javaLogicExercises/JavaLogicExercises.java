package javaLogicExercises;

public class JavaLogicExercises {
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend && cigars >= 40) {
            return true;
        } else return !isWeekend && cigars >= 40 && cigars <= 60;
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
        if (tea < 5 || candy < 5) {
            return 0;
        } else if (tea >= 2 * candy || candy >= 2 * tea) {
            return 2;
        } else {
            return 1;
        }
    }

    public static boolean twoAsOne(int a, int b, int c) {
        if (a + b == c) {
            return true;
        } else if (b + c == a) {
            return true;
        } else return a + c == b;
    }

    public static boolean lastDigit(int a, int b, int c) {
        int aRight = a % 10;
        int bRight = b % 10;
        int cRight = c % 10;
        return (aRight == bRight) || (aRight == cRight) || (bRight == cRight);
    }

    public static int maxMod5(int a, int b) {
        if (a == b) {
            return 0;
        }
        if (a % 5 == b % 5) {
            return Math.min(a, b);
        }
        return Math.max(a, b);
    }

    public static int blueTicket(int a, int b, int c) {
        int abSum = a + b;
        int bcSum = b + c;
        int acSum = a + c;
        if (abSum == 10 || bcSum == 10 || acSum == 10) {
            return 10;
        } else if (abSum - bcSum == 10 || abSum - acSum == 10 || bcSum - abSum == 10 || bcSum - acSum == 10 || acSum - abSum == 10 || acSum - bcSum == 10) {
            return 5;
        } else {
            return 0;
        }
    }

    public static int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0;
        } else if (you >= 8 || date >= 8) {
            return 2;
        } else {
            return 1;
        }
    }

    public static int sortaSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 19) {
            return 20;
        } else {
            return sum;
        }
    }

    public static boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode) {
            return n <= 1 || n >= 10;
        } else {
            return n <= 10 && n >= 1;
        }
    }

    public static boolean old35(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return false;
        } else if (n % 3 == 0) {
            return true;
        } else return n % 5 == 0;
    }

    public static int teenSum(int a, int b) {
        if (a >= 13 && a <= 19 || b >= 13 && b <= 19) {
            return 19;
        } else {
            return a + b;
        }
    }

    public static String fizzString(String str) {
        if (str.startsWith("f") && str.endsWith("b")) {
            return "FizzBuzz";
        } else if (str.startsWith("f")) {
            return "Fizz";
        } else if (str.endsWith("b")) {
            return "Buzz";
        } else return str;
    }

    public static boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk) {
            return c > b;
        } else {
            return b > a && c > b;
        }
    }

    public static boolean lessBy10(int a, int b, int c) {
        if (a + 10 <= b || a + 10 <= c) {
            return true;
        } else if (b + 10 <= a || b + 10 <= c) {
            return true;
        } else return c + 10 <= a || c + 10 <= b;
    }

    public static int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (b != a && c != a) {
            return 1;
        } else {
            return 0;
        }
    }

    public static boolean shareDigit(int a, int b) {
        if (a < 10 || a > 99 || b < 10 || b > 99) {
            throw new IllegalArgumentException("Numbers must be in the range 10 to 99.");
        }
        int num1Digit1 = a % 10;
        int num1Digit2 = a / 10;
        int num2Digit1 = b % 10;
        int num2Digit2 = b / 10;
        return num1Digit1 == num2Digit1 || num1Digit1 == num2Digit2 || num1Digit2 == num2Digit1 || num1Digit2 == num2Digit2;
    }

    public static boolean squirrelPlay(int temp, boolean isSummer) {
        if (!isSummer && temp >= 60 && temp <= 90) {
            return true;
        } else return isSummer && temp >= 60 && temp <= 100;
    }

    public static String alarmClock(int day, boolean vacation) {
        if (!vacation) {
            if (day > 0 && day < 6) {
                return "7:00";
            } else return "10:00";
        } else {
            if (day > 0 && day < 6) {
                return "10:00";
            } else return "off";
        }
    }

    public static boolean specialEleven(int n) {
        return n % 11 == 0 || n % 11 == 1;
    }

    public static boolean less20(int n) {
        return n % 20 == 18 || n % 20 == 19;
    }

    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isMorning && isMom && !isAsleep) {
            return true;
        } else if (!isMorning && !isMom && !isAsleep) {
            return true;
        } else if (!isMorning && isMom && !isAsleep) {
            return true;
        } else if (isMorning && isMom) {
            return false;
        } else if (isMorning && isAsleep) {
            return false;
        } else if (!isMorning && !isMom) {
            return false;
        }
        return false;
    }

    public static String fizzString2(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz" + "!";
        } else if (n % 5 == 0) {
            return "Buzz" + "!";
        } else if (n % 3 == 0) {
            return "Fizz" + "!";
        } else {
            return n + "!";
        }
    }

    public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk){
            return a <= b && b <= c;
        } else {
            return a < b && b < c;
        }
    }

    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles && die1 == die2){
            die1 = (die1 % 6) + 1;
        } return die1 + die2;
    }
    public static int greenTicket(int a, int b, int c) {
        if (a == b && b == c){
            return 20;
        } else if (a == b || b == c || a == c){
            return 10;
        } else {
            return 0;
        }
    }
    public static int sumLimit(int a, int b) {
        int sum = a + b;
        int numDigitsA = String.valueOf(a).length();
        int numDigitsSum = String.valueOf(sum).length();
        if (numDigitsSum == numDigitsA){
            return sum;
        } else {
            return a;
        }
    }
    public static int forExercise(int[] a){
        int count = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] % 2 == 0){
                count++;
            }
        } return count;
    }

}


