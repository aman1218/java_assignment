public class q4 {
    public static void main(String[] args){
        int n = 10;
        int[] fibo = new int[n]; 

        fibo[0]=0;
        fibo[1]=1;

        for (int i=2; i<n; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];

        }

        int sum=0;
        for(int i=0;i<n;i++){
            sum+=fibo[i];
        }

        System.out.println("First 10 nummbers :");
        for (int i = 0; i < n; i++) {
            System.out.print(fibo[i] + " ");
        }

        System.out.println("\nSum of the first 10 Fibonacci numbers: " + sum);


    }
}
