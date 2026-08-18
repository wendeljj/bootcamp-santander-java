package AbstracaoClassesEncapsulamentoJava.Exercicios.Ex1;

public class BankAccount {

    private final String name;
    private double balance;
    private double overdraft;
    private final double initialOverdraft;
    private double balanceDue;

    public BankAccount(String name, double balance){
        this.name = name;
        if (balance >= 0.0)
            this.balance = balance;
        if (balance <= 500.0 )
            this.overdraft = 50.0;
        else
            this.overdraft = balance * 0.5;
        this.balanceDue = 0;
        this.initialOverdraft = overdraft;
    }

    public String getName() {
        return name;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getOverdraft(){
        return overdraft;
    }

    public double getBalanceDue(){
        return balanceDue;
    }

    public void depositMoney(double money){
        if (money >= balanceDue)
        {
            money -= balanceDue;
            balance += money;
        }
        else{
            balanceDue -= money;
        }
    }

    public boolean spendMoney(double money){
        if (money > (balance + overdraft)){
            System.out.println("O valor da transação excede o limite disponível, incluindo o cheque especial. A transação não foi realizada.");
            return false;
        } else if(money > balance && money < (balance + overdraft)){
            System.out.println("A transação foi realizada utilizando o cheque especial. Conforme as regras da conta, será acrescido um encargo de 20% sobre o valor utilizado do limite. Transação concluída com sucesso.");
            balanceDue = (money - balance) * 1.2;
            money -= balance;
            balance = 0;
            overdraft -= money;
            return true;
        }
        balance -= money;
        return true;
    }

    public boolean isUsingOverdraft(){
        if (overdraft < initialOverdraft)
        {
            System.out.println("A conta possui utilização ativa do cheque especial.");
            return true;
        }
        System.out.println("A conta não possui utilização ativa do cheque especial.");
        return false;
    }

}
