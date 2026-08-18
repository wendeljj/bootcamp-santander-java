package HerancaPolimorfismoJava.Exercicios.Ex2;

import HerancaPolimorfismoJava.Exercicios.Ex2.Classes.User;
import HerancaPolimorfismoJava.Exercicios.Ex2.Classes.Manager;
import HerancaPolimorfismoJava.Exercicios.Ex2.Classes.Salesman;
import HerancaPolimorfismoJava.Exercicios.Ex2.Classes.Attendant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        mainFlow(scanner);
    }

    public static void mainFlow(Scanner scanner){
        boolean interactiveMenu = true;
        while (interactiveMenu){
            System.out.println("\n--User Register--\n");
            System.out.print("1. Gerente\n2. Vendedor\n3. Atendente\n\n4. Encerrar\n\nEscolha uma opção: ");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option){
                case 1 -> {
                    User manager = managerRegister(scanner);
                    printUser(manager);
                }
                case 2 -> {
                    User salesman = salesmanRegister(scanner);
                    printUser(salesman);
                }
                case 3 -> {
                    User attendant = attendantRegister(scanner);
                    printUser(attendant);
                }
                case 4 -> {
                    interactiveMenu = false;
                }
                default -> {
                    System.out.println("Opção inválida.");
                }
            }

        }
    }

    public static void printUser(User user){
        switch (user){
            case Manager manager -> {
                System.out.printf("\n--Gerente--\nNome: %s\nE-mail: %s\nSenha: %s\nAdministrador: %s\n",
                        manager.getName(), manager.getEmail(), manager.getPassword(), (manager.isAdmin() ? "sim" : "não"));
            }
            case Salesman salesman -> {
                System.out.printf("\n--Vendedor--\nNome: %s\nE-mail: %s\nSenha: %s\nQuantidade de vendas: %d\nAdministrador: %s\n",
                        salesman.getName(), salesman.getEmail(), salesman.getPassword(), salesman.getSalesQuantity(), (salesman.isAdmin() ? "sim" : "não"));
            }
            case Attendant attendant ->{
                System.out.printf("\n--Atendente--\nNome: %s\nE-mail: %s\nSenha: %s\nQuantidade de vendas: %.2f\nAdministrador: %s\n",
                        attendant.getName(), attendant.getEmail(), attendant.getPassword(), attendant.getCashOnBox(), (attendant.isAdmin() ? "sim" : "não"));
            }
        }
    }

    public static User managerRegister(Scanner scanner){
        System.out.print("Insira o nome do gerente: ");
        String name = scanner.nextLine();
        System.out.print("Insira o e-mail do gerente: ");
        String email = scanner.nextLine();
        System.out.print("Insira a senha do gerente: ");
        String password = scanner.nextLine();
        return new Manager(name, email, password);
    }

    public static User salesmanRegister(Scanner scanner){
        System.out.print("Insira o nome do vendedor: ");
        String name = scanner.nextLine();
        System.out.print("Insira o e-mail do vendedor: ");
        String email = scanner.nextLine();
        System.out.print("Insira a senha do vendedor: ");
        String password = scanner.nextLine();
        System.out.print("Insira a quantidade de vendas do vendedor: ");
        int salesQuantity = Integer.parseInt(scanner.nextLine());
        return new Salesman(name, email, password, salesQuantity);
    }

    public static User attendantRegister(Scanner scanner){
        System.out.print("Insira o nome do atendente: ");
        String name = scanner.nextLine();
        System.out.print("Insira o e-mail do atendente: ");
        String email = scanner.nextLine();
        System.out.print("Insira a senha do atendente: ");
        String password = scanner.nextLine();
        System.out.print("Insira o valor em caixa do atendente: ");
        double cashOnBox = Double.parseDouble(scanner.nextLine());
        return new Attendant(name, email, password, cashOnBox);
    }
}
