package HerancaPolimorfismoJava.Exercicios.Ex3;

import HerancaPolimorfismoJava.Exercicios.Ex3.Classes.BRLClock;
import HerancaPolimorfismoJava.Exercicios.Ex3.Classes.Clock;
import HerancaPolimorfismoJava.Exercicios.Ex3.Classes.USClock;

public class Main {
    public static void main(String[] args) {

        Clock brlClock = new BRLClock(13, 5, 49);
        Clock usClock = new USClock(13,5,42);

        System.out.println(brlClock.returnClock());
        System.out.println(usClock.returnClock());
    }
}
