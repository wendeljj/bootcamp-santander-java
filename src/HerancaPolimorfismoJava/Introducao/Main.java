package HerancaPolimorfismoJava.Introducao;

import HerancaPolimorfismoJava.Introducao.domain.Employee;
import HerancaPolimorfismoJava.Introducao.domain.Manager;
import HerancaPolimorfismoJava.Introducao.domain.Salesman;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        printEmployee(new Manager("Romeu", 27, "1", 12000));
        printEmployee(new Salesman("Roberto", 32, "2", 3100));
    }

    public static void printEmployee(Employee employee){

       /* if (employee instanceof Manager manager) {
            employee.setName("Jonas");
            employee.setAge(25);
            manager.setSalary(12000.0);

            System.out.println(employee.getClass().getCanonicalName());
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
            System.out.println(manager.getSalary());
            System.out.println();
        }

        if (employee instanceof Salesman salesman){
            employee.setName("Jonas");
            employee.setAge(25);
            salesman.setComission(242.0);

            System.out.println(employee.getClass().getCanonicalName());
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
            System.out.println(salesman.getComission());
            System.out.println();
        }
        */

        switch (employee){
            case Manager manager ->{
                /*
                employee.setName("Jonas");
                employee.setAge(25);
                manager.setSalary(12000.0);

                 */

                System.out.println(employee.getClass().getCanonicalName());
                System.out.println(employee.getName());
                System.out.println(employee.getAge());
                System.out.println(manager.getSalary());
                System.out.println(manager.getCode());
                System.out.println();
            }
            case Salesman salesman ->{
                /*
                employee.setName("Jonas");
                employee.setAge(25);
                salesman.setComission(242.0);
                */

                System.out.println(employee.getClass().getCanonicalName());
                System.out.println(employee.getName());
                System.out.println(employee.getAge());
                System.out.println(salesman.getCommission());
                System.out.println(salesman.getCode());
                System.out.println();
            }
        }
    }
}
