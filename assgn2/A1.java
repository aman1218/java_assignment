package Assgn2;

import java.util.Scanner;

class A1 implements sum, add {
    int a,b,s=0;
    public void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numm");
        a=sc.nextInt();
        b=sc.nextInt();
        s=a+b;
    }
    public void disp() {
        System.out.println("Sum is :"+ s);
    }
    public static void main(String[] args){
        A1 obj = new A1();
        obj.sum();
        obj.disp();
        
    }
}
interface sum{
    void sum();
}
interface add{
    void disp();
}

