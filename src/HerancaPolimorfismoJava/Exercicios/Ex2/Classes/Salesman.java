package HerancaPolimorfismoJava.Exercicios.Ex2.Classes;

public non-sealed class Salesman extends User {
    protected int salesQuantity;

    public Salesman(String name, String email, String password, int salesQuantity){
        super(name, email, password);
        this.salesQuantity = salesQuantity;
    }

    public int getSalesQuantity() {
        return salesQuantity;
    }

    public void setSalesQuantity(int salesQuantity) {
        this.salesQuantity = salesQuantity;
    }

    public void makeSale(){
        salesQuantity++;
    }
}
