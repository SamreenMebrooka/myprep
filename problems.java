import java.util.Scanner;
public class problems {
    public static void main(String[] args) {
        //to find the largest number
       /*  Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int max=a;
        if(b>=max){
            max=b;
        }if(c>=max){
            max= c;
        }
        System.out.println(max);
        //case check
        Scanner sc =new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        if(ch >='a' && ch <='z'){
            System.out.println("lowercase");
        }
        else{
            System.out.println("Uppercase");
        }
        //fibonacci number
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        for (int i=1;i<=n;i++) {
            int temp = a;
            a = a + b;
            b = temp;
        }
            System.out.println(a);
        //count the number
        int n =34544424;
        int count=0;
        while(n>0) {
            int rem = n % 10;
            if (rem == 4) {
                count++;

            }
            n = n / 10;
        }
        System.out.println(count);*/
        //reverse num
        int n=456789;
        int ans=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            ans=ans*10+rem;
        }
        System.out.println(ans);

    }
}
