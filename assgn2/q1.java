package Assgn2;

class Employee{
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary){
        this.name=name;
        this.salary=salary;
        this.age=age;
    }  
    public String getName(){
        return name;
    }
    public int getAage(){
        return age;
    }
    public Double getSalary(){
        return salary;
    }

    public void Show(){
        System.out.println("Name: "+ name +" , "+ "Age: "+ age +" , "+"Salary: "+ salary);
    }
    public static void main(String [] args){
        Employee[] employees= new Employee[3];

        employees[0]=new Employee("Satyam",22,45000);
        employees[1]=new Employee("Aman",23,55000);
        employees[2]=new Employee("Shweta",27,65000);
        
        for (int i = 0; i < employees.length; i++) {
            employees[i].Show();
        }

    }
}
    

