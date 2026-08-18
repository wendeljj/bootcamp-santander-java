package DominandoInterfacesLambda.Exercicios.Ex3.Records;

import DominandoInterfacesLambda.Exercicios.Ex3.Interfaces.AreaCalculator;

public record Square(double side) implements AreaCalculator {
    @Override
    public double getArea(){
        return side * side;
    }
}
