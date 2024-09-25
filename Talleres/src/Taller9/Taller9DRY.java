package Taller9;

public class Taller9DRY {
    private String email1 = "pepito@gmail.com";
    private String email2 = "aleja@autolock";

    public void verificarValidezEmail(String email) {
        if (!email.contains("@") || !email.contains(".")) {
            System.out.println("Email inválido: " + email);
        } else {
            System.out.println("Email válido: " + email);
        }
    }

    public static void main(String[] args) {
        Taller9DRY main = new Taller9DRY();
        main.verificarValidezEmail(main.email1);
        main.verificarValidezEmail(main.email2);
    }
}
