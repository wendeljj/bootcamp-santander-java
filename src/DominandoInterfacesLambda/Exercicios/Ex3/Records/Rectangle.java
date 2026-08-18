package DominandoInterfacesLambda.Exercicios.Ex3.Records;

import DominandoInterfacesLambda.Exercicios.Ex3.Interfaces.AreaCalculator;

public record Rectangle(double base, double height) implements AreaCalculator {
    @Override
    public double getArea(){
        return base * height;
    }
}
