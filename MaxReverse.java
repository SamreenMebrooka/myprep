import java.util.Arrays;

import static java.util.Collections.reverse;
import static java.util.Collections.swap;

public class MaxReverse {
    public static void main(String[] args) {
        int []arr={2,5,8,34,56,12};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
//        System.out.println(max(arr,1,5));
    }
//    static int max(int[]arr,int start,int end){
//        int maxval= arr[0];
//        for(int i=start;i<end;i++){
//            if(arr[i]>maxval){
//                maxval=arr[i];
//            }
//        }
//        return maxval;

        //reverse array
            static void reverse(int[]arr){
                int start=0;
                int end=arr.length-1;
                while(start<end){
                    swap(arr,start,end);{
                        start++;
                        end--;
                    }
                }


        }
        static void swap(int[] arr, int start, int end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
    }
}
