package javaArrayExercises;

public class JavaArrayExercises {

    public static boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
        }

    public static boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1] ;
    }

    public static int[] reverse3(int[] nums) {
        int[] back = new int[nums.length];
        int i,j;
        for (i=0,j=nums.length-1 ; i<nums.length ; i++,j--)
            back[i] = nums[j];
        return back;
    }

    public static int[] middleWay(int[] a, int[] b) {
        return new int[] {a[1], b[1]};
    }
    public static boolean no23(int[] nums) {
        int[] newNo = new int[2];
        return nums[0] != 2 && nums[1] != 2 && nums[0] != 3 && nums[1] != 3;
    }
}

