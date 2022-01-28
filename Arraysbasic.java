package DSAQ.Arrays;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class Arraysbasic {
    public static void main (String[] args){

        Scanner in = new Scanner(System.in);
        int [] arr=new int[5];
        System.out.println("Enter the number");
        for (int i=0;i<arr.length;i++){
           arr[i]=in.nextInt();
        }
        //printArray type 1
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        //printArray type 2
        //System.out.println(Arrays.toString(arr));
    }

}
