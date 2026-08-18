package AbstracaoClassesEncapsulamentoJava.Exercicios.Ex3;

import java.util.Scanner;

public class PetMachineTest {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        boolean interactiveMenu = true;

        var petMachine = new PetMachine();

        while (interactiveMenu){
            System.out.println("\n-- Sistema de Controle de Banho de Pet --\n");
            System.out.println("1. Dar banho no pet (Necessário 10L de água e 2L de shampoo)");
            System.out.println("2. Abastecer com água");
            System.out.println("3. Abastecer com shampoo");
            System.out.println("4. Verificar nível de água");
            System.out.println("5. Verificar nível de shampoo");
            System.out.println("6. Verificar se tem pet no banho");
            System.out.println("7. Colocar pet na máquina");
            System.out.println("8. Retirar pet da máquina");
            System.out.println("9. Limpar máquina");
            System.out.println("10. Sair");

            System.out.print("\nSelecione uma opção: ");
            int option = Integer.parseInt(scanner.nextLine());
            System.out.println();

            switch (option) {
                case 1 -> petMachine.toBathe();
                case 2 -> {
                    System.out.print(" (A máquina possui um limite de 30L, e suporta 3L por abastecimento).\nQuantos litros de água deseja inserir na máquina? ");
                    double water = Double.parseDouble(scanner.nextLine());
                    petMachine.supplyWater(water);
                }
                case 3 -> {
                    System.out.print(" (A máquina possui um limite de 10L, e suporta 1L por abastecimento).\nQuantos litros de shampoo deseja inserir na máquina? ");
                    double shampoo = Double.parseDouble(scanner.nextLine());
                    petMachine.supplyShampoo(shampoo);
                }
                case 4 -> System.out.printf("A máquina está abastecida com %.1fL de água.", petMachine.getWaterLevel());
                case 5 -> System.out.printf("A máquina está abastecida com %.1fL de shampoo.", petMachine.getShampooLevel());
                case 6 -> {
                    if (!petMachine.getHasPet()){
                        System.out.println("Não há nenhum pet na máquina.");
                    } else{
                        System.out.println("Há pet na máquina.");
                    }
                }
                case 7 -> {
                    if (!petMachine.isClean()){
                        System.out.println("A máquina está suja, é necessário realizar uma limpeza para permitir a entrada de outro pet.");
                    } else if (petMachine.getHasPet()){
                        System.out.println("Já há um pet na máquina.");
                    } else{
                        System.out.print("Insira o nome do Pet a ser colocado na máquina: ");
                        String namePet = scanner.nextLine();
                        var pet = new Pet(namePet);
                        petMachine.putPetInPetMachine(pet);
                    }
                }
                case 8 -> petMachine.removePetInPetMachine();
                case 9 -> petMachine.cleanMachine();
                case 10 -> interactiveMenu = false;
                default -> System.out.println("Opção inválida");
            }
        }
    }
}