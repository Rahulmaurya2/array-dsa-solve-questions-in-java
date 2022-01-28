package DSAQ.Arrays;
import java.util.Arrays;
import java.util.*;

public class arrayQ5movenegative {
    public static void main(String[] args) {
        int arr[] = { -1, 2,-3,96, -7, 8, -9 };
        rearrange(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void rearrange(int arr[])
    {
        int k = 0, temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (i >= k) {
                    temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }
                k++;
            }
        }
    }
}

