package DominandoInterfacesLambda.Exercicios.Ex3;

import DominandoInterfacesLambda.Exercicios.Ex3.Records.Circle;
import DominandoInterfacesLambda.Exercicios.Ex3.Records.Rectangle;
import DominandoInterfacesLambda.Exercicios.Ex3.Records.Square;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning){
            System.out.println("\n--Sistema de calculo de área--\n");
            System.out.print("1. Quadrado\n2. Retângulo\n" +
                    "3. Circulo\n4. Encerrar a aplicação\n\nEscolha uma opção: ");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option){
                case 1 ->{
                    System.out.print("Insira o valor dos lados do quadrado: ");
                    double side = Double.parseDouble(scanner.nextLine());
                    System.out.printf("%.2f\n", areaSquare(side));
                }
                case 2 ->{
                    System.out.print("Insira o valor da base e da altura: ");
                    String input = scanner.nextLine();
                    String[] parts = input.split(" ");
                    double base = Double.parseDouble(parts[0]);
                    double heigth = Double.parseDouble(parts[1]);

                    System.out.printf("%.2f\n", areaRectangle(base, heigth));
                }
                case 3 ->{
                    System.out.print("Insira o valor do raio do círculo: ");
                    double radius = Double.parseDouble(scanner.nextLine());
                    System.out.printf("%.2f\n", areaCircle(radius));
                }
                case 4 ->{
                    System.out.println("Aplicação encerrada.");
                    isRunning = false;
                }
                default -> {
                    System.out.println("Opção inválida.");
                }
            }
        }
    }

    public static double areaSquare(double side){
        return new Square(side).getArea();
    }
    public static double areaRectangle(double base, double height){
        return new Rectangle(base, height).getArea();
    }
    public static double areaCircle(double radius){
        return new Circle(radius).getArea();
    }
}
