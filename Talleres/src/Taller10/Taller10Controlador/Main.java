package Taller10.Taller10Controlador;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();

        usuario.comprar("General");
        usuario.comprar("Platino");
        usuario.comprar("VIP");
        usuario.comprar("Platino");
        usuario.comprar("NoExistente");
    }
}
