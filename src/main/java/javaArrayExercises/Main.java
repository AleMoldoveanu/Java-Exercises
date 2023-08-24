package javaArrayExercises;

public class Main {
    public static void main(String[] args) {
        //Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
        //firstLast6([1, 2, 6]) → true
        //firstLast6([6, 1, 2, 3]) → true
        //firstLast6([13, 6, 1, 2, 3]) → false
        System.out.println(JavaArrayExercises.firstLast6(new int[]{5,7,6}));
        //Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
        //Both arrays will be length 1 or more.
        //commonEnd([1, 2, 3], [7, 3]) → true
        //commonEnd([1, 2, 3], [7, 3, 2]) → false
        //commonEnd([1, 2, 3], [1, 3]) → true
        System.out.println(JavaArrayExercises.commonEnd(new int[] {1,2,3},new int[]{1,2}));
        //Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
        //reverse3([1, 2, 3]) → [3, 2, 1]
        //reverse3([5, 11, 9]) → [9, 11, 5]
        //reverse3([7, 0, 0]) → [0, 0, 7]
        System.out.println(JavaArrayExercises.reverse3(new int[]{1,2,3}));
        //Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
        // middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
        // middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
        // middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
        System.out.println(JavaArrayExercises.middleWay(new int[]{1,2,3}, new int[]{4,5,6}));
        //Given an int array length 2, return true if it does not contain a 2 or 3.
        // no23([4, 5]) → true
        // no23([4, 2]) → false
        // no23([3, 5]) → false
        System.out.println(JavaArrayExercises.no23(new int[]{4,5}));
    }
}
