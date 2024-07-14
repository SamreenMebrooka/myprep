public class CielingAndFloor {
    public static void main(String[] args) {
        int [] arr={2,4,5,7,11,14,16,18};
        int target =15;
        int ans=CielingAndFlooring(arr,target);
        System.out.println(ans);
    }
    static int CielingAndFlooring(int []arr,int target){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid=(start+end )/2;
            if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                return mid;
            }
        }
        //return start; //for Cieling:greatest number smaller than or equal to target
        return end;//for floor:smallest number greater than or equal to target

    }
}
