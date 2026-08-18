package CollectionsClassesUteis.Exercicios.Ex2;

public enum NumberEnum {
    DDD_TEL(10, s -> s.replaceAll("(\\d{2})(\\d{4})(\\d{4})",
            "($1)$2-$3")),
    DDD_CEL(11, s -> s.replaceAll("(\\d{2})(\\d{5})(\\d{4})",
            "($1)$2-$3")),
    TEL(8, s -> s.replaceAll("(\\d{4})(\\d{4})",
            "$1-$2")),
    CEL(9, s -> s.replaceAll("(\\d{5})(\\d{4})",
            "$1-$2"));

    private final int length;
    private final Formatter formatter;

    NumberEnum(int length, Formatter formatter){
        this.length = length;
        this.formatter = formatter;
    }

    public int getLength(){
        return length;
    }
    public Formatter getNumFormatter(){
        return formatter;
    }
}
