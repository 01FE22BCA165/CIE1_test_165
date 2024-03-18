public class Employee {
    public String name;
    public int EmpId;
    public double salary;

    public Employee(String name, int EmpId, double salary) {
        this.name = name;
        this.EmpId = EmpId;
        this.salary = salary;
    }
    public void display(){
        System.out.println("Name: "+ name);
        System.out.println("Employee ID: "+ EmpId);
        System.out.println("Salary: "+ salary); 
    }
    // public double getSalary(){
    //     return salary;
    // }

    public static void main(String[] args){
        Employee emp1 = new Employee("John", 101, 100000);
        emp1.display();
    }
}