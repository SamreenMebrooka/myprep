import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();


        for(int i=0;i<=t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            int ans=a+b;
            for(int j=1;j<=n;j++){


                System.out.println(ans);
                ans=(int)(ans+Math.pow(2,j)*b);
            }
            System.out.println();
        }

    }
}
