import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.util.Collections.swap;

public class Arraylist {
        public static void main(String[] args) {
//            Scanner sc=new Scanner(System.in);
//            ArrayList<String> list=new ArrayList<>(5);
//            for(int i=0;i<5;i++){
//                list.add(String.valueOf(sc.next()));
//
//            }
//            for(int i=0;i<5;i++){
//                System.out.println(list.get(i));
//            }
            // System.out.println(list);
//            list.add(67);
//            list.add(5);
//            list.remove(0);
//            list.add(0,45);
//            //list.get(1);
//            list.remove(45);
//            System.out.println(list.get(1));


            //swapping array
            int[] arr = {2, 3, 4, 5, 6, 7};
            swap(arr, 2, 4);
            System.out.println(Arrays.toString(arr));
        }
            static void swap(int[] arr, int index1, int index2){
                int temp=arr[index1];
                arr[index1]=arr[index2];
                arr[index2]=temp;


            }
        }
//    }


