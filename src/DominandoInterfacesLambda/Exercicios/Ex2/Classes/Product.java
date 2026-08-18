package DominandoInterfacesLambda.Exercicios.Ex2.Classes;
import DominandoInterfacesLambda.Exercicios.Ex2.Interfaces.Tribute;

public abstract sealed class Product implements Tribute permits Feeding, Health, Clothing, Culture{
    private double value;
    private double tributeDecimal;

    public Product(double value) {
        if (value > 0) {
            this.value = value;
        }
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getTributeDecimal() {
        return tributeDecimal;
    }

    public void setTributeDecimal(double tributeDecimal) {
        this.tributeDecimal = tributeDecimal;
    }

    @Override
        public double addTribute(){
            return (value * tributeDecimal);
        }

    }

