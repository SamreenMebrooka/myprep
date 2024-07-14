import java.util.Scanner;

class Solution{
    static int searchInSorted(int arr[], int N, int K)
    {
        int start =0;
        int end= N -1;
        while(start<=end){
            int mid= start+(end-start) /2;
            if(K<arr[mid]){
                end= mid-1;
            }else if(K> arr[mid]){
                start= mid+1;
            }else{
                return mid;
            }
        }
        return -1;

    }

    public static void main(String[]args){
        int N= 5;
        int [] arr ={1,2,3,4,6};
        int K=6;
        int ans=searchInSorted(arr,N,K);
        System.out.println(ans);
    }
}