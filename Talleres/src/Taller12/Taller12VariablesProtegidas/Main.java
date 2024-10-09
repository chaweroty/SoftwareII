package Taller12.Taller12VariablesProtegidas;

public class Main {
    public static void main(String[] args) {
        CanalNotificacion canalCorreo = new CanalCorreoElectronico();
        CanalNotificacion canalSMS = new CanalSMS();
        CanalNotificacion canalWhatsapp = new CanalWhatsapp();

        Notificador notificador = new Notificador(canalCorreo);
        Notificador notificador1 = new Notificador(canalSMS);
        Notificador notificador2 = new Notificador(canalWhatsapp);

        Notificacion notificacion = new Notificacion("Tienes una notificación", ":)");
        notificador.enviarNotificacion(notificacion);
        notificador1.enviarNotificacion(notificacion);
        notificador2.enviarNotificacion(notificacion);
    }
}
