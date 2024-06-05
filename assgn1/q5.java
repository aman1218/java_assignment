import java.util.Scanner;

public class q5{
    static int factorial(int n){
        if(n<=1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.println("Enter a number: ");
    num=sc.nextInt();

    int res=factorial(num);

    System.out.println("Factorial of the number is:" + res);
    }
}
