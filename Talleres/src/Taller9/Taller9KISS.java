package Taller9;
import java.util.Scanner;

public class Taller9KISS {

    public String invertirCadena(String cadena){
        StringBuilder sb = new StringBuilder(cadena);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una cadena:");
        String cadena = scanner.nextLine();

        Taller9KISS main = new Taller9KISS();
        System.out.println("La palabra " + cadena + " invertida sería: " + main.invertirCadena(cadena));
    }
}
