package Assgn2;

public class q7 {
    int id;
    String name;
        void q7(int id, String name){
        System.out.println("The id is:" + id);
        System.out.println("The name is:" + name);
    }

    public static void main(String[] args){
        q7 obj1 = new q7();
        q7 obj2 = new q7();
        obj1.q7(2,"Satyam");
        obj2.q7(5,"Sattu");
    }
    
}
