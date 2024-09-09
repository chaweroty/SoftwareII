package Taller7RompeDIP;

public class UsuarioFuncionalidad {
    private ServicioDeCorreo servicioDeCorreo = new ServicioDeCorreo();


    public void enviarNotificacion(){
        servicioDeCorreo.enviarCorreo();
    }
}
