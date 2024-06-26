import java.util.Arrays;

public class Linearsearch {
    //    public static void main(String[] args) {
//        int[] arr = {2, 4, 6, 7, 8, 9, 12, 34};
//        int target = 84;
//        System.out.println(  linearSearch(arr, target));
//    }
//
//    static boolean linearSearch(int[] arr, int target) {
//        for (int i = 0; i < arr.length; i++) {
//            int element = arr[i];
//            if (element == target) {
//                return true;
//                // return element ;
////                return i;
//            }
//        }
//
//        return false;
//    }
    // search in a string
    public static void main(String[] args) {
        String str="Samreen";
        char target = 'm';
        System.out.println(Arrays.toString(str.toCharArray()));
        // System.out.println(str(str,target));
    }
static boolean str(String str,char target){
        for (int i=0;i<str.length();i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
}
}