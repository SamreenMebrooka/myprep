
public class BinarySearch {
    public static void main(String[] args) {
        int[]arr={-24,-12,0,2,4,5,9,12,14,21};
        int target=21;
        int ans=binarySearch(arr,target);
        System.out.println(ans);

    }
    static int binarySearch(int []arr,int target){
        int start=0;
        int end=arr.length-1;
      //  int mid= (start+end)/2;
        while (start <= end) {
            int mid= (start+end)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid +1;
            }else{
                return mid;
            }
        }
        return  -1;
    }

}
