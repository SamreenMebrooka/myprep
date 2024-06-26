import java.util.ArrayList;
import java.util.Scanner;

public class GfgProblems {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<String>list=new ArrayList<>();

        int n=sc.nextInt();
        for(int i =1;i<=n;++i){

            if(n%3==0 || n%5==0){
                list.add("fizzBuzz");
            }
            else if(n%3==0 && n%5 !=0){
               list.add("Fizz");
            }
            else if(n%3 !=0 && n%5==0){
               list.add("Buzz");
            }
            else{
                list.add(Integer.toString(i));
            }

        }
        System.out.println(list);
    }
}
