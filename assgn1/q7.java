public class q7 {
        static void fact(int n){
            int i;
            float f=1;
            float s=0;
            for(i=1;i<=n;i++){
                f = f*i;
                s = s + (1 / f);
            }
            System.out.println("The sum is:" + s);
        }
        public static void main(String[] args){
            fact(5);
            }
}
