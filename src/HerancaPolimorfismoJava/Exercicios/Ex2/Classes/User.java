package HerancaPolimorfismoJava.Exercicios.Ex2.Classes;

import java.util.Objects;
import java.util.Scanner;

public sealed abstract class User permits Manager, Salesman, Attendant {
    private String name;
    private String email;
    private String password;
    protected boolean isAdmin;

    public User(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
        this.isAdmin = false;
    }

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public final void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public final void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void login(String email, String password){
        if (!Objects.equals(email, this.email) || !Objects.equals(password, this.password) ){
            System.out.println("Login inválido.");
            return;
        }
        System.out.println("Logado com sucesso.");
    }

    public void logoff(){
        System.out.println("Desconectado com sucesso.");
    }

    public void changeData(String name, String email){
        this.name = name;
        this.email = email;
    }

    public void changePassword(String oldPassword, String newPassword){
        if (!Objects.equals(oldPassword, password)){
            System.out.println("Senha inválida.");
            return;
        }
        System.out.print("Senha alterada com sucesso.");

    }

}
