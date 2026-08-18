package DominandoInterfacesLambda.Exercicios.Ex3.Records;

import DominandoInterfacesLambda.Exercicios.Ex3.Interfaces.AreaCalculator;

public record Circle(double radius) implements AreaCalculator {
    static double pi = 3.14;
    @Override
    public double getArea(){
        return pi * (radius * radius);
    }
}
