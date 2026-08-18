package HerancaPolimorfismoJava.Exercicios.Ex3.Classes;

public non-sealed class BRLClock extends Clock {

    public BRLClock(int hour, int minute, int second){
        super(hour, minute, second);
    }

    @Override
    public String returnClock() {
        return String.format("%02d:%02d:%02d",getHour(), getMinute(), getSecond());
    }
}
