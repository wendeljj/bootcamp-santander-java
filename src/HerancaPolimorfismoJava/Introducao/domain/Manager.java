package HerancaPolimorfismoJava.Introducao.domain;

public non-sealed class Manager extends Employee {

    private double salary;

    public Manager(String name, int age, String code, double salary){
        super(name, age, code);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getCode(){
        return String.format("%s-MN", this.code);
    }
}
