package DSAQ.Arrays;
import java.util.*;

public class arrayQ7rotation {
    public static void main(String[] args) {
        int []arr={-1,-100,3,99};
        rotating(arr,2);
        System.out.println(Arrays.toString(arr));

    }
    static void rotating(int []arr,int k){

        k = k % arr.length;
        if (k<0){
            k=k+arr.length;
        }
        //rotated1
        reverse(arr,0,arr.length-k-1);
        //rotated2
        reverse(arr, arr.length-k, arr.length-1);
        //rotated3
        reverse(arr,0, arr.length-1);
    }
    //reverse array function
    static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
