public class JavaStringExercises {

    public static String helloName(String name) {
        return "Hello " + name + "!";
    }

    public static String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2, 4);
    }

    public static String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    public static String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public static String theEnd(String str, boolean front) {
        if (front) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length() - 1);
        }
    }

    public static boolean endsLy(String input) {
        return input.endsWith("ly");
    }

    public static String middleThree(String str) {
        int middleIndex = str.length() / 2;
        return str.substring(middleIndex - 1, middleIndex + 2);
    }

    public static String lastChars(String a, String b) {
        char firstCharA = (a.length() > 0) ? a.charAt(0) : '@';
        char lastCharB = (b.length() > 0) ? b.charAt(b.length() - 1) : '@';
        return Character.toString(firstCharA) + Character.toString(lastCharB);
    }

    public static String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        } else if (str.startsWith("blue")) {
            return "blue";
        } else {
            return "";
        }
    }

    public static String startWord(String str, String word) {
        if (str.length() < word.length()) {
            return "";
        }
        String front = str.substring(0, word.length());
        String rest = str.substring(1);
        if (front.substring(1).equals(word.substring(1))) {
            return front;
        } else {
            return startWord(rest, word);
        }
    }

    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public static String extraFront(String str) {
        if (str.length() >= 2) {
            String firstTwoChars = str.substring(0, 2);
            return firstTwoChars + firstTwoChars + firstTwoChars;
        } else {
            return str + str + str;
        }
    }

    public static String extraEnd(String str) {
        String lastTwoChars = str.substring(str.length() - 2);
        return lastTwoChars + lastTwoChars + lastTwoChars;
    }

    public static String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public static String left2(String str) {
        if (str.length() < 3) {
            return str;
        }
        String firstTwoChars = str.substring(0, 2);
        String restOfString = str.substring(2);
        return restOfString + firstTwoChars;
    }

    public static String nTwice(String str, int n) {
        String firstNChars = str.substring(0, n);
        String lastNChars = str.substring(str.length() - n);
        return firstNChars + lastNChars;
    }

    public static boolean hasBad(String str) {
        if (str.length() >= 3) {
            String firstTwoChars = str.substring(0, 2);
            return firstTwoChars.equals("ba") || str.startsWith("bad", 1);
        } else if (str.length() == 2) {
            return str.equals("ba");
        } else {
            return str.equals("b");
        }
    }

    public static String conCat(String a, String b) {
        if (a.length() > 0 && b.length() > 0 && a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1);
        } else {
            return a + b;
        }
    }

    public static String withouEnd2(String str) {
        if (str.length() <= 2) {
            return "";
        } else {
            return str.substring(1, str.length() - 1);
        }
    }

    public static String firstTwo(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        } else {
            return str;
        }
    }

    public static String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public static boolean frontAgain(String str) {
        if (str.length() >= 2 && (str.substring(0, 2).equals(str.substring(str.length() - 2)))) {
            return true;
        } else {
            return false;
        }
    }

    public static String without2(String str) {
        if (str.substring(0, 2).equals(str.substring(str.length() - 2))) ;
        {
            return str.substring(2);
        }
    }

    public static String withoutX(String str) {
        if (str.length() >= 2 && str.substring(0, 1).equals("x") && str.substring(str.length() - 1).equals("x")) {
            return str.substring(1, str.length() - 1);
        }
        if (str.length() >= 1 && str.substring(0, 1).equals("x")) {
            return str.substring(1);
        }
        if (str.length() >= 1 && str.substring(str.length() - 1).equals("x")) {
            return str.substring(0, str.length() - 1);
        } else {
            return str;
        }
    }

    public static String comboString(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }

    public static String right2(String str) {
        if (str.length() >= 2) {
            return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
        }
        return str;
    }

    public static String middleTwo(String str) {
        int middleIndex = str.length() / 2;
        String middleChars = str.substring(middleIndex - 1, middleIndex + 1);
        return middleChars;
    }

    public static String twoChar(String str, int index) {
        if (index < 0 || index + 1 >= str.length()) {
            return str.substring(0, 2);
        } else {
            return str.substring(index, index + 2);
        }
    }

    public static String atFirst(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        } else {
            String missingChars = "@@";
            return str.length() == 1 ? str + missingChars.charAt(1) : missingChars;
        }
    }

    public static String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            char lastChar = str.charAt(str.length() - 1);
            char secondLastChar = str.charAt(str.length() - 2);
            return str.substring(0, str.length() - 2) + lastChar + secondLastChar;
        }
    }

    public static String minCat(String a, String b) {
        if (a.length() < b.length()) {
            return a + b.substring(b.length() - a.length());
        } else if (b.length() < a.length()) {
            return a.substring(a.length() - b.length()) + b;
        } else {
            return a + b;
        }
    }

    public static String deFront(String str) {
        if (str.length() <= 2) {
            return "";
        } else if (str.charAt(0) == 'a' && str.charAt(1) == 'b') {
            return str.substring(0, 2) + str.substring(2);
        } else if (str.charAt(0) == 'a') {
            return str.substring(0, 1) + str.substring(2);
        } else if (str.charAt(1) == 'b') {
            return str.substring(1);
        } else {
            return str.substring(2);
        }
    }

}



