package HerancaPolimorfismoJava.Exercicios.Ex2.Classes;

public non-sealed class Manager extends User{
    public Manager(String name, String email, String password){
        super(name, email, password);
        isAdmin = true;
    }

    public double generateFinancialReport(Attendant attendant){
        return attendant.getCashOnBox();
    }

    public double checkSales(Salesman salesman){
        return salesman.getSalesQuantity();
    }

}
