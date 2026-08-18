package AbstracaoClassesEncapsulamentoJava.Classes;

public class PersonTest {

    public static void main(String[] args){

        var male = new Person("Joao");
        var female = new Person("Maria");

        male.setAge(18);
        female.setAge(19);

        System.out.printf("Male name: %s\nMale age: %d\n",
                male.getName(), male.getAge());
        System.out.printf("Female name: %s\nFemale age: %d\n",
                female.getName(), female.getAge());

    }

}
