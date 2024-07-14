//public class Binarysearch2d {
//    public static void main(String[] args) {
//        int [][] arr={
//                {10,20,30,40},
//                {11,22,33,44},
//                {14,24,34,45},
//                {18,28,38,48}
//        };
//        System.out.println(Arrays.toString(Search(arr,10)));
//    }
//    static int[]Search(int[][]arr, int target){
//        int row=0;
//        int coloumn=arr[0].length-1;
//        while(row < arr.length &&  coloumn >= 0){
//            if(arr[row][coloumn]==target){
//                return new int[]{row,coloumn};
//            }
//            if(arr[row][coloumn]< target){
//                row ++;
//            }
//            else{
//                coloumn --;
//            }
//        }
//        return new int[]{-1,-1};
//    }
//}
//import java.util.Arrays;

public class Binarysearch2d  {
    public static void main(String[] args) {
        int [][] arr={
                {10,20,30,40},
                {11,22,33,44},
                {14,24,34,45},
                {18,28,38,48}
        };
        int[] result = Search(arr,34);
        System.out.println(result);
//        if(result[0] != -1 && result[1] != -1) {
//            System.out.println("Element found at row " + result[0] + " and column " + result[1]);
//        } else {
//            System.out.println("Element not found");
//        }
    }
    static int[] Search(int[][]arr, int target){
        int row=0;
        int col=arr[0].length-1;
        while(row < arr.length &&  col >= 0){
            if(arr[row][col]==target){
                return new int[]{row,col};
            }
            if(arr[row][col]< target){
                row ++;
            }
            else{
                col --;
            }
        }
        return new int[]{-1,-1};
    }
}