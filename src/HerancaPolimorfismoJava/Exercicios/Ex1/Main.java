package HerancaPolimorfismoJava.Exercicios.Ex1;

import HerancaPolimorfismoJava.Exercicios.Ex1.Classes.Ticket;
import HerancaPolimorfismoJava.Exercicios.Ex1.Classes.HalfPriceTicket;
import HerancaPolimorfismoJava.Exercicios.Ex1.Classes.FamilyTicket;

import java.util.Scanner;

public class Main {
    static void main() {
        var scanner = new Scanner(System.in);

        boolean interactiveMenu = true;

        while (interactiveMenu){
            System.out.println("\n--Sistema Ingresso--\n");
            System.out.println("1. Criar ingresso\n2. Criar ingresso meia-entrada\n3. Criar ingresso pacote família\n4. Encerrar\n");
            Ticket ticket = returnTicket(scanner);

            if (ticket != null){
                printTicket(ticket);
            } else {
                interactiveMenu = false;
            }
        }

    }

    public static boolean askDubbed(Scanner scanner) {
        while (true) {
            System.out.println("O filme é dublado ou legendado?\nEscolha 1 para dublado ou 2 para legendado");
            int option = Integer.parseInt(scanner.nextLine());
            if (option == 1) {
                return true;
            }
            if (option == 2) {
                return false;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    public static void printTicket(Ticket ticket) {
        switch (ticket) {

            case FamilyTicket familyTicket -> {
                System.out.printf("\n--Ingresso família--\nNome do Filme: %s\nPreço do Ingresso: %.2f\nTamanho da família: %d\n%s\n",
                        ticket.getMovieTitle(), familyTicket.getPrice(), familyTicket.getFamilySize(),
                        (ticket.isDubbed() ? "Dublado" : "Legendado"));
            }
            case HalfPriceTicket halfPriceTicket -> {
                System.out.printf("\n--Ingresso meia-entrada--\nNome do Filme: %s\nPreço do Ingresso: %.2f\n%s\n",
                        ticket.getMovieTitle(), halfPriceTicket.getPrice(),
                        (ticket.isDubbed() ? "Dublado" : "Legendado"));
            }
            default -> {
                System.out.printf("\n--Ingresso--\nNome do Filme: %s\nPreço do Ingresso: %.2f\n%s\n",
                        ticket.getMovieTitle(), ticket.getPrice(),
                        (ticket.isDubbed() ? "Dublado" : "Legendado"));
            }
        }
    }

    public static Ticket returnTicket(Scanner scanner) {
        System.out.print("Escolha uma opção: ");
        int option = Integer.parseInt(scanner.nextLine());
        switch (option) {
            case 1 -> {
                System.out.print("Insira o nome do filme: ");
                String movieTitle = scanner.nextLine();
                System.out.print("Insira o preço do ingresso: ");
                double price = Double.parseDouble(scanner.nextLine());
                boolean isDubbed = askDubbed(scanner);
                Ticket ticket = new Ticket(movieTitle, price, isDubbed);
                return ticket;
            }
            case 2 -> {
                System.out.print("Insira o nome do filme: ");
                String movieTitle = scanner.nextLine();
                System.out.print("Insira o preço do ingresso: ");
                double price = Double.parseDouble(scanner.nextLine());
                boolean isDubbed = askDubbed(scanner);
                Ticket ticket = new HalfPriceTicket(movieTitle, price, isDubbed);
                return ticket;
            }
            case 3 -> {
                System.out.print("Insira o nome do filme: ");
                String movieTitle = scanner.nextLine();
                System.out.print("Insira o preço do ingresso: ");
                double price = Double.parseDouble(scanner.nextLine());
                System.out.print("Insira o tamanho da família: ");
                int familySize = Integer.parseInt(scanner.nextLine());
                boolean isDubbed = askDubbed(scanner);
                Ticket ticket = new FamilyTicket(movieTitle, price, familySize, isDubbed);
                return ticket;
            }
            case 4 -> {
                System.out.println("Operação finalizada.");
                return null;
            }
            default ->{
                System.out.println("Opção inválida.");
                return returnTicket(scanner);
            }
        }
    }
}
