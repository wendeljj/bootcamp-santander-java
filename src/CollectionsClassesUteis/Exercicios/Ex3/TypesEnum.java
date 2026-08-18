package CollectionsClassesUteis.Exercicios.Ex3;

public enum TypesEnum {
    TEXTO("texto", "\"%s\""::formatted),
    DATA("data", "\"%s\""::formatted),
    DATA_HORA("data_hora", "\"%s\""::formatted),
    INTEIRO("inteiro", "%s"::formatted),
    FLUTUANTE("flutuante", "%s"::formatted),
    BOOLEANO("booleano", "%s"::formatted);

    private final String type;
    private final Formatter jsonFormatter;

    TypesEnum(String type, Formatter jsonFormatter){
        this.type = type;
        this.jsonFormatter = jsonFormatter;
    }

    public String getType(){
        return type;
    }

    public Formatter getJsonFormatter(){
        return jsonFormatter;
    }
}
