package AbstracaoClassesEncapsulamentoJava.Records;

public class PersonTest {
    public static void main(String[] args){
        var male = new Person("Wendel");
        System.out.println(male);
        System.out.println(male.name());

    }
}
