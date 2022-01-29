package DSAQ.Arrays;
import java.util.*;
public class arrayQ8largestsum {
    /**
     * Kadane's Algorithm for Maximum Sum Sub array
     */
    public static void main(String[] args) {
        int[] arr = {1,-2,1,-3,4,-1,2,1,-5,4};
       // largestSum(arr);
        System.out.println(largestSum(arr));
    }
    static int largestSum(int []arr){
        int currentsum=arr[0];
        int overallsum=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (currentsum>=0){
                currentsum+=arr[i];
            }else {
                currentsum=arr[i];
            }
            if (currentsum>overallsum){
                overallsum=currentsum;
            }

        }
        return overallsum;
    }
}

