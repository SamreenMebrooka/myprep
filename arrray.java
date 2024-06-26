import java.util.Arrays;
import java.util.Scanner;

public class arrray {
    public static void main(String[] args) {
       /* int [] arr= new int[5];
        arr[0]= 1;
        arr[1]=5;
        arr[2]=6;
        System.out.println(arr);*/
//        System.out.print("enter size of array: ");
//        Scanner sc= new Scanner(System.in);
//        int size= sc.nextInt();
//        System.out.println("the size of array is:"+size);
//
//        String[] arr= new String[size];
//        System.out.println("the elements are:");
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.next();
//        }
////        System.out.println("number to be found:");
////        int x= sc.nextInt();
////            for (int i = 0; i < arr.length; i++) {
//                System.out.println(Arrays.toString(arr));;
           // }
//        System.out.println("Enter the no.of subjects:");
//        Scanner sc= new Scanner(System.in);
//        int subjects= sc.nextInt();
//        int[] marks=new int[subjects];
//        System.out.println("enter the marks:");
//        for (int i = 0; i < subjects; i++) {
//            marks[i]= sc.nextInt();
//        }
//        for (int i=0;i<subjects;i++){
//            System.out.println("the marks of the sub are"+marks [i]);
//        }

//          2d arrays:
//        Scanner sc= new Scanner(System.in);
//        int [][] arr =new int[3][2];
//        System.out.println(arr.length);
//        for(int row=0; row < arr.length; row++){
//            for (int col=0;col<arr[row].length;col++){
//                arr[row][col]=sc.nextInt();
//            }
//        }
//        for (int row=0;row<arr.length;row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//                System.out.println(Arrays.toString(arr[row]));
//            }
//        }
            //System.out.println();
        int [][] arr={
                {1,2,3},{3,6,9,12},{4,2,6,8,5}
        };
        for(int row=0;row < arr.length; row++){
            for(int col=0;col < arr[row].length;col++){
                System.out.print(arr[row][col]+" ");

            }
            System.out.println( );
        }

    }
}
