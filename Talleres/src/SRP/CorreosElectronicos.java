package SRP;

// Esta clase para que cumpla con el SRP  debe tener una unica responsabilidad, el objetivo de esta es gestionar toda comunicacion que tenga que ver con el usuario
public class CorreosElectronicos {

    public void enviarCorreo(String para, String asunto, String cuerpo) {
        System.out.println("Correo enviado a: "+para);
        System.out.println("Asunto: "+ asunto);
        System.out.println("Cuerpo: " +cuerpo);
        System.out.println("Enviado.");
    }
}
