package AbstracaoClassesEncapsulamentoJava.Exercicios.Ex3;

public class Pet {
    private final String name;
    private boolean isClean;

    public Pet(String name){
        this.name = name;
        isClean = false;
    }

    public String getName(){
        return name;
    }

    public boolean getIsClean(){
        return isClean;
    }

    public void setIsClean(boolean isClean){
        this.isClean = true;
    }
}
