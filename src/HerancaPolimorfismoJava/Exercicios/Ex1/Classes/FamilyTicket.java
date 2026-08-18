package HerancaPolimorfismoJava.Exercicios.Ex1.Classes;

public non-sealed class FamilyTicket extends Ticket {
    private int familySize;

    public FamilyTicket(String movieTitle, double price,  int familySize, boolean isDubbed){
        this.familySize = familySize;
        super(movieTitle, price, isDubbed);
    }

    public int getFamilySize() {
        return familySize;
    }

    public void setFamilySize(int familySize) {
        this.familySize = familySize;
    }

    @Override
    public double getPrice(){
        return (familySize > 3 ? (super.getPrice() * familySize) * 0.95 : (super.getPrice() * familySize));
    }
}
