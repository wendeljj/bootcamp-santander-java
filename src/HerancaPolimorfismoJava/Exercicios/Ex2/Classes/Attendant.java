package HerancaPolimorfismoJava.Exercicios.Ex2.Classes;

public non-sealed class Attendant extends User {
    private double cashOnBox;

    public Attendant(String name, String email, String password, double cashOnBox){
        super(name, email, password);
        this.cashOnBox = cashOnBox;
    }

    public double getCashOnBox() {
        return cashOnBox;
    }

    public void setCashOnBox(double cashOnBox) {
        this.cashOnBox = cashOnBox;
    }

    public void receivePayment(double payment){
        if(payment <= 0){
            System.out.println("Pagamento inválido");
            return;
        }
        cashOnBox += payment;
    }

    public void closeRegister(){
        System.out.printf("Fechando o caixa com %.2f$.\n", cashOnBox);
    }
}
