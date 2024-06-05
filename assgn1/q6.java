import java.util.Scanner;

public class q6 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                
                System.out.println("Not prime: "+n); 
                return false;// n is divisible by i, so it's not a prime number
            }
        }
        System.out.println( "the number" +" " + n +" "+ "is prime"); 
        return true;
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.println("Enter a number: ");
    num=sc.nextInt();

    isPrime(num);

    //System.out.println("the number :" + res + " " + "prime");
}
}
