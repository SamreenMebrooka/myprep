import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr1 = {3, 5, 7, 1, 8, 9};
        int target = 8;
        System.out.println(linearsearch(arr1, target));
    }

    static int linearsearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }

        }
        return -1;
    }
}

