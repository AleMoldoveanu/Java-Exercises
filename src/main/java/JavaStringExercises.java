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
}


