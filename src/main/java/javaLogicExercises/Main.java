package javaLogicExercises;

public class Main {
    public static void main(String[] args) {
        //When squirrels get together for a party, they like to have cigars.
        //A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
        //Unless it is the weekend, in which case there is no upper bound on the number of cigars.
        //Return true if the party with the given values is successful, or false otherwise.
        //cigarParty(30, false) → false
        //cigarParty(50, false) → true
        //cigarParty(70, true) → true
        System.out.println(JavaLogicExercises.cigarParty(50, true));
        //The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum or difference is 6. Note: the function Math.abs(num) computes the absolute value of a number.
        //love6(6, 4) → true
        //love6(4, 5) → false
        //love6(1, 5) → true
        System.out.println(JavaLogicExercises.love6(1,5));
        //You are driving a little too fast, and a police officer stops you.
        //Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket.
        //If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1.
        //If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
        //caughtSpeeding(60, false) → 0
        //caughtSpeeding(65, false) → 1
        //caughtSpeeding(65, true) → 0*/
        System.out.println(JavaLogicExercises.caughtSpeeding(85, true));
        //Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
        //more20(20) → false
        //more20(21) → true
        //more20(22) → true
        System.out.println(JavaLogicExercises.more20(62));
        //Given a non-negative number "num", return true if num is within 2 of a multiple of 10.
        //nearTen(12) → true
        //nearTen(17) → false
        //nearTen(19) → true
        System.out.println(JavaLogicExercises.nearTen(11));
        //We are having a party with amounts of tea and candy. Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great.
        //A party is good (1) if both tea and candy are at least 5. However, if either tea or candy is at least double the amount of the other one, the party is great (2).
        //However, in all cases, if either tea or candy is less than 5, the party is always bad (0).
        System.out.println(JavaLogicExercises.teaParty(6,7));
        //Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
        System.out.println(JavaLogicExercises.twoAsOne(9, 5, 5));
    }
}
