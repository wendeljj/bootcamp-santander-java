package HerancaPolimorfismoJava.Exercicios.Ex3.Classes;

public abstract sealed class Clock permits BRLClock, USClock {

    protected int hour;
    protected int minute;
    protected int second;

    public Clock(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23)
            this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59)
            this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59)
            this.second = second;
    }

    public abstract String returnClock();
}
