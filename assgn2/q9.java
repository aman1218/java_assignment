package Assgn2;
class Main {
    public static void main(String[] args) {
        car c = new car();
        c.engine();
        truck t = new truck();
        t.engine();
    }
}
abstract class vehicle {
    public abstract void engine();
}
class car extends vehicle{
    @Override
    public void engine(){
        System.out.println("Car has good engine");
    }
}

class truck extends vehicle{
    @Override
    public void engine(){
        System.out.println("truck has bad engine");
    }
}

