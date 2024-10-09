package Taller12.Taller12VariablesProtegidas;

public class CanalCorreoElectronico implements CanalNotificacion{
    @Override
    public void enviarNotificacion(Notificacion notificacion) {
        System.out.println("Enviando notificación por correo electrónico: " + notificacion.getTitulo());
    }
}
