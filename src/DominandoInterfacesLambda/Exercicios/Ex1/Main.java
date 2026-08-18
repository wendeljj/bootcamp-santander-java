package DominandoInterfacesLambda.Exercicios.Ex1;

import DominandoInterfacesLambda.Exercicios.Ex1.Records.Email;
import DominandoInterfacesLambda.Exercicios.Ex1.Records.SMS;
import DominandoInterfacesLambda.Exercicios.Ex1.Records.SocialMedia;
import DominandoInterfacesLambda.Exercicios.Ex1.Records.Whatsapp;

import java.util.Scanner;

public class Main {

    static void main() {
        boolean isRunning = true;
        String message = "";
        while(isRunning) {
            System.out.println("\n--Sistema de envio de mensagens--\n");
            System.out.print("1. Escrever uma mensagem\n2. Enviar mensagem por SMS\n" +
                    "3. Enviar mensagem por E-mail\n4. Enviar mensagem por Redes Sociais\n" +
                    "5. Enviar mensagem por Whatsapp\n6. Encerrar a aplicação\n\nEscolha uma opção: ");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option){
                case 1 -> {
                    message = collectMessage();
                    System.out.print("\n" + message);
                    System.out.println("\nMensagem salva com sucesso.");
                }
                case 2 -> {
                    if (message.isEmpty()){
                        System.out.println("\nMensagem inválida.");
                    }
                    else {
                        var sms = smsClass(message);
                        System.out.print(sms.message());
                        System.out.println("\nMensagem enviada com sucesso.");
                    }
                }
                case 3 -> {
                    if (message.isEmpty()){
                        System.out.println("\nMensagem inválida.");
                    }
                    else {
                        var email = emailClass(message);
                        System.out.print(email.message());
                        System.out.println("\nMensagem enviada com sucesso.");
                    }
                }
                case 4 -> {
                    if (message.isEmpty()){
                        System.out.println("\nMensagem inválida.");
                    }
                    else {
                        var socialMedia = socialMediaClass(message);
                        System.out.print(socialMedia.message());
                        System.out.println("\nMensagem enviada com sucesso.");
                    }
                }
                case 5 -> {
                    if (message.isEmpty()){
                        System.out.println("\nMensagem inválida.");
                    }
                    else {
                        var whatsapp = whatsappClass(message);
                        System.out.print(whatsapp.message());
                        System.out.println("\nMensagem enviada com sucesso.");
                    }
                }
                case 6 -> {
                    System.out.println("Aplicação encerrada.");
                    isRunning = false;
                }
                default -> {
                    System.out.println("Opção inválida.");
                }
            }
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    private static String collectMessage(){
        System.out.print("Escreva uma mensagem: ");
        return scanner.nextLine();
    }

    private static SMS smsClass(String message){
        return new SMS(message);
    }

    private static Email emailClass(String message){
        return new Email(message);
    }

    private static SocialMedia socialMediaClass(String message){
        return new SocialMedia(message);
    }

    private static Whatsapp whatsappClass(String message){
        return new Whatsapp(message);
    }
}
