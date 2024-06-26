import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt(i);
        }
        boolean isAscending = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                isAscending = false;
            }

        }
        if(isAscending){
            System.out.println("sorted array");
        }
        else{
            System.out.println("unsorted array");
        }
    }
}