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
        //Given three ints, a b c, return true if two or more of them have the same rightmost digit.
        //The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
        //lastDigit(23, 19, 13) → true
        //lastDigit(23, 19, 12) → false
        //lastDigit(23, 19, 3) → true
        System.out.println(JavaLogicExercises.lastDigit(22, 46,51));
        //Given two int values, return whichever value is larger.
        //However if the two values have the same remainder when divided by 5, then the return the smaller value.
        //However, in all cases, if the two values are the same, return 0.
        //maxMod5(2, 3) → 3
        //maxMod5(6, 2) → 6
        //maxMod5(3, 2) → 3
        System.out.println(JavaLogicExercises.maxMod5(5,6 ));
        //You have a blue lottery ticket, with ints a, b, and c on it.
        //This makes three pairs, which we'll call ab, bc, and ac.
        //Consider the sum of the numbers in each pair. If any pair sums to exactly 10, the result is 10.
        //Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5. Otherwise the result is 0.
        //blueTicket(9, 1, 0) → 10
        //blueTicket(9, 2, 0) → 0
        //blueTicket(6, 1, 4) → 10
        System.out.println(JavaLogicExercises.blueTicket(5, 10, 30));
        //You and your date are trying to get a table at a restaurant.
        //The parameter "you" is the stylishness of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes.
        //The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very stylish, 8 or more, then the result is 2 (yes).
        //With the exception that if either of you has style of 2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).
        System.out.println(JavaLogicExercises.dateFashion(9,7));
        //Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.
        System.out.println(JavaLogicExercises.sortaSum(19, 0));
        //Given a number n, return true if n is in the range 1..10, inclusive.
        // Unless outsideMode is true, in which case return true if the number is less or equal to 1, or greater or equal to 10.
        System.out.println(JavaLogicExercises.in1To10(57, true));
        //Return true if the given non-negative number is a multiple of 3 or 5, but not both.
        System.out.println(JavaLogicExercises.old35(55));
        //Given 2 ints, a and b, return their sum.
        //However, "teen" values in the range 13..19 inclusive, are extra lucky. So if either value is a teen, just return 19.
        System.out.println(JavaLogicExercises.teenSum(13, 9));
        //Given a string str, if the string starts with "f" return "Fizz".
        // If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz".
        // In all other cases, return the string unchanged.
        System.out.println(JavaLogicExercises.fizzString("adb"));
        //Given three ints, a b c, return true if b is greater than a, and c is greater than b.
        // However, with the exception that if "bOk" is true, b does not need to be greater than a.
        System.out.println(JavaLogicExercises.inOrder(1, 2, 4, false));
        //Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
        System.out.println(JavaLogicExercises.lessBy10(1, 25, 79));
        //You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2.
        // If they are all the value 2, the result is 10. Otherwise if they are all the same, the result is 5.
        // Otherwise so long as both b and c are different from a, the result is 1. Otherwise the result is 0.
        System.out.println(JavaLogicExercises.redTicket(1, 2, 3));
        //Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23.
        System.out.println(JavaLogicExercises.shareDigit(10, 56));
        //The squirrels in Palo Alto spend most of the day playing.
        //In particular, they play if the temperature is between 60 and 90 (inclusive).
        //Unless it is summer, then the upper limit is 100 instead of 90. Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.
        System.out.println(JavaLogicExercises.squirrelPlay(85, true));
    }
}
