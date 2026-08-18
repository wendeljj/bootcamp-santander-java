package AbstracaoClassesEncapsulamentoJava.Records;

public record Person(String name, int age) {



    public Person(final String name){
        this(name, 1);
    }

    public String getInfo(){
        return "Name: "+name+"\nAge: "+age+"\n";
    }

}
