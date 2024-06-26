import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

import static java.lang.Long.sum;

public class methods {
    public static void main(String[] args) {
       /* int ans = sum();
        System.out.println("the answer is: "+ans);

    }
    static int  sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num 1:");
        int num1 = sc.nextInt();
        System.out.print("enter num2:");
        int num2 = sc.nextInt();
        int sum=num1+num2;
        System.out.println("sum is "+sum);
        return sum;
    }*/
        add();
        System.out.println("the sum of 2 num is"+ sum(2,4));
    }
    public static void add(){
        int a=10;
        int b=20;
        int sum = a+b;
        System.out.println(sum);
    }
}
