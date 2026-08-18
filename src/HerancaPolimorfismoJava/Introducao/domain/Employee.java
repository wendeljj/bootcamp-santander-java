package HerancaPolimorfismoJava.Introducao.domain;

public sealed abstract class Employee permits Manager, Salesman{
    protected String name;
    protected int age;
    protected String code;

    public Employee(String name, int age, String code){
        this.name = name;
        this.age = age;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCode(String code){
        this.code = code;
    }

    public String getCode(){
        return code;
    }

}
