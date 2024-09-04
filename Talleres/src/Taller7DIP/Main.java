package Taller7DIP;

public class Main {
    public static void  main(String [] args){
        IServicioDeNotificaciones servicioDeNotificaciones = new ServicioDenotificacionesImpl();
        UsuarioFuncionalidadd usuarioFuncionalidad = new UsuarioFuncionalidadd(servicioDeNotificaciones);
        usuarioFuncionalidad.enviarNotificacion();
    }

}
