package HerancaPolimorfismoJava.Exercicios.Ex3.Classes;

public non-sealed class USClock extends Clock {

    private String periodIndicator;
    public USClock(int hour, int minute, int second){
        super(hour, minute, second);
        periodIndicator = (hour >= 12 ? "PM" : "AM");
        if (hour == 0){
            this.hour = 12;
        } else if (hour > 12){
            this.hour = hour - 12;
        } else{
            this.hour = hour;
        }
    }

    public String getPeriodIndicator() {
        return periodIndicator;
    }

    public void setPeriodIndicator() {
        this.periodIndicator = (hour >= 12 ? "PM" : "AM");
    }

    @Override
    public String returnClock(){
        return String.format("%02d:%02d:%02d %s",getHour(), getMinute(), getSecond(), getPeriodIndicator());

    }
}
