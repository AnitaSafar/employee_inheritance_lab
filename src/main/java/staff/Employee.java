package staff;

public abstract class Employee {

    private String name;
    private String NI;
    private double salary;

    public Employee(String name, String NI, double salary) {
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNI() {
        return NI;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary){
        this.salary = newSalary;
    }

    public void raiseSalary(double raise){
//        double salary = this.getSalary();
        double newSalary = this.getSalary() + raise;
        this.setSalary(newSalary);
    }

    public double payBonus(){
        return this.salary*0.01;
    }


}
