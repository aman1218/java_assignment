package Assgn2;

class Student2 {
    private int age;

    public void getData(int age) {
        this.age = age;
    }

   
    public void printData() {
        System.out.println("Age is: " + age);
    }

    public static void main(String[] args) {
       
        Student2 s1 = new Student2();
        Student2 s2 = new Student2();

        
        s1.getData(22);


        s2.getData(25);

        System.out.println("Data for Student 1:");
        s1.printData();

        
        System.out.println("\nData for Student 2:");
        s2.printData();
    }
}
