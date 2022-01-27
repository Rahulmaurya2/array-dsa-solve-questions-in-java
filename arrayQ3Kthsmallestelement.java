package DSAQ.Arrays;
import java.util.*;
import java.util.Collections;
public class arrayQ3Kthsmallestelement {
        /* Find the "Kth" max and min element of an array */
    //that general solution using of sorting function
        public static void main(String[] args) {
            int []arr={2,4,6,8,5,9};
            int k=3;
            Arrays.sort(arr);
            System.out.println(arr[k-1]);
        }
    }
    //this meth use in leetcode
    /*int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> largeK = new PriorityQueue<Integer>(k + 1);

        for(int el : nums) {
            largeK.add(el);
            if (largeK.size() > k) {
                largeK.poll();
            }
        }

        return largeK.poll();

    }
}*/