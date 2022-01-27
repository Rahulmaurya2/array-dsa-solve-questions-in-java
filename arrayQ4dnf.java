package DSAQ.Arrays;
import java.util.*;

public class arrayQ4dnf {
    /**
     * Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo
     */
    public static void main(String[] args) {
        int []arr={2,0,2,1,1,0};
        dnf(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void dnf(int []arr){
        int low=0;
        int mid=0;
        int high= arr.length-1;
        int temp;
        while(mid<=high){
            if (arr[mid]==0){
                temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
    }

    /*static void swap(int [] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index1];
        arr[index2]=temp;
    }*/
}
