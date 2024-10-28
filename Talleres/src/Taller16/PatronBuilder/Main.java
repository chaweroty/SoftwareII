package Taller16.PatronBuilder;

public class Main {

    public static void main(String[] args) {

        Usuario usuario1 = new Builder()
                .setNombre("Sultan")
                .setEdad(57)
                .setCorreo("sultanelmagico@gmail.com")
                .addInteres("Tomar te")
                .addInteres("Meditar")
                .build();

        Usuario usuario2 = new Builder()
                .setNombre("Sebastián")
                .setEdad(24)
                .setCorreo("sebastian@gmail.com")
                .addInteres("Tecnología")
                .addInteres("Finanzas")
                .build();

        System.out.println(usuario1);
        System.out.println(usuario2);
    }
}
