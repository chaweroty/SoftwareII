// Esta clase para que cumpla con el SRP  debe tener una unica responsabilidad, por lo que esta clase se enfoca unicamente en la autenticacion del usuario
public class AutenticacionUsuario {
    public boolean validarContraseña(String contraseña, String contraseñaU) {
        return contraseña.equals(contraseñaU);
    }
}