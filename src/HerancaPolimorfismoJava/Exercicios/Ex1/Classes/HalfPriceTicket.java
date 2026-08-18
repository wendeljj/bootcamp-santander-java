package HerancaPolimorfismoJava.Exercicios.Ex1.Classes;

public non-sealed class HalfPriceTicket extends Ticket {
    public HalfPriceTicket(String movieTitle, double price, boolean isDubbed){
        super(movieTitle, price, isDubbed);
    }

    @Override
    public double getPrice(){
        return super.getPrice()/2;
    }

}
