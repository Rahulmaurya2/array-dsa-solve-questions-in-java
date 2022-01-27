package DSAQ.Arrays;
import java.util.Arrays;
public class arrayQ2maxvalue {
    //Find the maximum and minimum element in an array
    public static void main(String[] args) {
        int [] arr={2,3,32,1,50,45,16};
        //System.out.println(max(arr));

        //System.out.println(min(arr));
        System.out.println(maxRange(arr,2,5));
    }
    //Find the maximum with range
    static int maxRange(int[] arr, int start, int end) {
        int max=arr[start];
        for (int i=start;i<end;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    //Find the minimum
    static int min(int[] arr) {
        int minval=arr[0];
         for (int i = 0; i < arr.length; i++) {
             if (arr[i]<minval){
                 minval=arr[i];
             }

         }
         return minval;
    }
    //Find the maximum
    static int max(int[] arr) {
         int maxVAl = arr[0];
         for (int i = 1; i < arr.length; i++) {
             if (arr[i] > maxVAl){
                 maxVAl = arr[i];
             }
         }
         return maxVAl;
    }

}
