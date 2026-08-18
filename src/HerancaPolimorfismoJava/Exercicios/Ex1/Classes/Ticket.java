package HerancaPolimorfismoJava.Exercicios.Ex1.Classes;

public sealed class Ticket permits FamilyTicket, HalfPriceTicket {

    private String movieTitle;
    private double price;
    private boolean isDubbed;

    public Ticket(String movieTitle, double price, boolean isDubbed){
        this.movieTitle = movieTitle;
        this.price = (price > 0) ? price : 0;
        this.isDubbed = isDubbed;
    }

    public String getMovieTitle(){
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle){
        this.movieTitle = movieTitle;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public boolean isDubbed() {
        return isDubbed;
    }

    public void setDubbed(boolean dubbed){
        this.isDubbed = dubbed;
    }
}
