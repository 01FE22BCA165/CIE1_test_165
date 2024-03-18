public class DevOps_Engineer extends Employee {
    public int bonus;
    public DevOps_Engineer(String name, int EmpId, double salary,int bonus) {
        super(name, EmpId, salary);
        this.bonus=bonus;
    }

    @override
    public void display(){
        System.out.println("Bonus: "+ bonus);
        System.out.println("Total salary: "+ (salary+bonus));
    }
    
}
