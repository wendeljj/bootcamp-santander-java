package CollectionsClassesUteis.Exercicios.Ex1;

import java.util.stream.LongStream;

public enum OperationEnum {
    ADDITION(n -> LongStream.of(n).reduce(Long::sum).orElse(0), "+"),
    SUBTRACTION(n -> LongStream.of(n).reduce((n1, n2) -> n1 - n2).orElse(0), "-");

    private final Calc operationCallback;
    private final String symbol;

    OperationEnum(final Calc operationCallback, String symbol){
        this.operationCallback = operationCallback;
        this.symbol = symbol;
    }

    public Calc getOperationCallback(){
        return operationCallback;
    }

    public String getSymbol(){
        return symbol;
    }
}
