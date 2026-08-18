package HerancaPolimorfismoJava.Introducao.domain;

public non-sealed class Salesman extends Employee{

    private double commission;

    public Salesman(String name, int age, String code, double commission){
        super(name, age, code);
        this.commission = commission;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public String getCode(){
        return String.format("%s-SL", this.code);
    }
}
