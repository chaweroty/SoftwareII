package Taller17.Singleton;

public class Main {
    public static void main(String[] args) {
        Settings configuracion = Settings.getInstance();
        System.out.println("Tema actual: " + configuracion.getConfiguracion("theme"));
        System.out.println("Idioma actual: " + configuracion.getConfiguracion("language"));

        configuracion.setConfiguracion("theme", "Dark");
        configuracion.setConfiguracion("language", "Es");

        System.out.println("Nuevo tema: " + configuracion.getConfiguracion("theme"));
        System.out.println("Nuevo idioma: " + configuracion.getConfiguracion("language"));

    }
}
