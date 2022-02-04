package DSAQ.Arrays;
import java.util.*;

public class arrayQ12NextPermutation {
    public static void main(String[] args) {
        int []arr={1,2,3};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void nextPermutation(int[] arr) {
            int i = arr.length - 2;
            while (i >= 0 && arr[i + 1] <= arr[i]) {
                i--;
            }
            if (i >= 0) {
                int j = arr.length - 1;
                while (arr[j] <= arr[i]) {
                    j--;
                }
                swap(arr, i, j);
            }
            reverse(arr, i + 1);
        }

       static void reverse(int[] arr, int start) {
            int i = start, j = arr.length - 1;
            while (i < j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
}
