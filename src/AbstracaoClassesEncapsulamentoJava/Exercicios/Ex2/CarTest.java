package AbstracaoClassesEncapsulamentoJava.Exercicios.Ex2;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        boolean interactiveMenu = true;

        var car = new Car();

        while (interactiveMenu){
            System.out.println("\n-- Sistema de Carro --\n");
            System.out.println("1. Ligar o Carro");
            System.out.println("2. Desligar o Carro");
            System.out.println("3. Acelerar o Carro");
            System.out.println("4. Diminuir velocidade do Carro");
            System.out.println("5. Virar o Carro para esquerda");
            System.out.println("6. Virar o Carro para direita");
            System.out.println("7. Verificar velocidade do Carro");
            System.out.println("8. Subir marcha do Carro");
            System.out.println("9. Descer marcha do Carro");
            System.out.println("10. Sair");

            System.out.print("\nSelecione uma opção: ");
            int option = scanner.nextInt();
            System.out.println();

            switch (option){
                case 1 -> car.setOn();
                case 2 -> car.setOff();
                case 3 -> car.accelerate();
                case 4 -> car.decelerate();
                case 5 -> car.turnLeft();
                case 6 -> car.turnRight();
                case 7 -> System.out.println(car.getSpeed() + " Km/h");
                case 8 -> car.pushMarch();
                case 9 -> car.downMarch();
                case 10 -> interactiveMenu = false;
                default -> System.out.println("Opção inválida");
            }
        }
    }
}
