package AbstracaoClassesEncapsulamentoJava.Exercicios.Ex1;

import java.util.Scanner;

public class BankTest {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        System.out.print("Insira o nome do titular da conta: ");
        String name = scanner.nextLine();
        System.out.print("Insira o saldo inicial desejado: ");
        int balance = scanner.nextInt();

        var bankAccount = new BankAccount(name, balance);
        boolean interactiveMenu = true;

        while (interactiveMenu){
            System.out.printf("+------------------------------------+\n|            Conta Bancária          |\n+------------------------------------+\n| Nome do titular: %-17s |\n+------------------------------------+\n| Escolha uma das seguintes opções:  |\n|1. Consultar saldo                  |\n|2. Consultar cheque especial        |\n|3. Depositar dinheiro               |\n|4. Sacar dinheiro                   |\n|5. Pagar boleto                     |\n|6. Verificar uso do cheque especial |\n|7. Sair                             |\n+------------------------------------+\n\n", bankAccount.getName());
            System.out.print("Insira a opção desejada: ");
            int optionSelected = scanner.nextInt();
            switch (optionSelected) {
                case 1 -> System.out.printf("\n+------------------------------------+\n|            Conta Bancária          |\n+------------------------------------+\n|1. Consultar saldo                  |\n| Saldo: %8.2fR$                  |\n+------------------------------------+\n\n", bankAccount.getBalance());
                case 2 -> System.out.printf("\n+------------------------------------+\n|            Conta Bancária          |\n+------------------------------------+\n|2. Consultar cheque especial       |\n| Saldo Cheque especial: %8.2fR$ |\n+-----------------------------------+\n\n", bankAccount.getOverdraft());
                case 3 -> {
                    System.out.print("Insira o valor que deseja depositar: ");
                    double money = scanner.nextDouble();
                    bankAccount.depositMoney(money);
                }
                case 4 -> {
                    System.out.print("Insira o valor que deseja sacar: ");
                    double money = scanner.nextDouble();
                    bankAccount.spendMoney(money);
                }
                case 5 -> {
                    System.out.print("Insira o valor do boleto a pagar: ");
                    double money = scanner.nextDouble();
                    bankAccount.spendMoney(money);
                }
                case 6 -> bankAccount.isUsingOverdraft();
                case 7 -> interactiveMenu = false;
                default -> System.out.println("Opção Inválida");
            }
        }

    }
}
