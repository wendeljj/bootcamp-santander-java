package DominandoInterfacesLambda.Exercicios.Ex1.Records;

import DominandoInterfacesLambda.Exercicios.Ex1.Interfaces.Message;

public record Whatsapp(String message) implements Message {
    @Override
    public String message(){
        return "Mensagem enviada por Whatsapp: " + message;
    }
}
