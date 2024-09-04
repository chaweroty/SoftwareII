package Taller7DIP;

public class UsuarioFuncionalidadd {
    private IServicioDeNotificaciones servicioDeNotificaciones;

    public UsuarioFuncionalidadd(IServicioDeNotificaciones servicioDeNotificaciones) {
        this.servicioDeNotificaciones = servicioDeNotificaciones;
    }

    public void enviarNotificacion(){
        servicioDeNotificaciones.enviarCorreo();
    }
}
