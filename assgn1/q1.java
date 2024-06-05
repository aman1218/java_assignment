public class q1 {
    static void fact(int n){
        int i,f=1;
        for(i=1;i<=n;i++){
            f = f*i;
        }
        System.out.println("The factorial is:" + f);

    }

    public static void main(String[] args){
    fact(5);
    
    }
    
}

