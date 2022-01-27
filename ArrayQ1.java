package DSAQ.Arrays;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayQ1 {
    public static void main(String[] args){
       // Reverse the array
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the size of array :");
       int n=in.nextInt();
       int [] arr=new int[n];
       System.out.println("Enter the element in Array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println("This is reverse array:");
        reverse(arr);
        //for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i]);
        //}
        System.out.println(Arrays.toString(arr));
    }


       static void reverse(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
        static void swap(int[] arr, int in1, int in2) {
        int temp=arr[in1];
        arr[in1] = arr[in2];
        arr[in2]=temp ;
    }
}
