
abstract class A{
    public abstract void object();   
}

class B extends A{
    @Override
    public void object(){
        System.out.println("Call mme fromm B");
    }
}

class Main{
    public static void main(String [] args){
        B b = new B();
        b.object();
    }
}