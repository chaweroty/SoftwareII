package Taller12.Taller12Indireccion;

public class Main {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Sebastián", "10074", new GmailNotificaciones());
        Usuario usuario2 = new Usuario("Juliana", "20034", new OutlookNotificaciones());

        usuario1.generarCorreo();
        usuario2.generarCorreo();
    }
}
