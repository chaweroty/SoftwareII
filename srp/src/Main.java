import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Usuario usuario= new Usuario(
                "Sebastián",
                "García",
                "sebastian.garciag@autonoma.edu.co",
                "hola123"
        );
        AutenticacionUsuario autenticacion = new AutenticacionUsuario();
        Scanner scanner = new Scanner(System.in);
        boolean contraseña = false;
        while(!contraseña){
            System.out.println("Ingresa la contraseña");
            String Icontraseña = scanner.nextLine();
            if(autenticacion.validarContraseña(Icontraseña, usuario.getContraseña())){
                System.out.println("Autenticación correcta");
                contraseña = true;
            }else{
                System.out.println("Contraseña incorrecta, escribela de nuevo ");
            }
        }

        CorreosElectronicos email = new CorreosElectronicos();
        email.enviarCorreo( usuario.getCorreo(),"taller SRP", "Buenas tardes, adjunto por medio de este correo el taller1 de SRP: https://github.com/chaweroty/SoftwareII" );

        CalcularSalario calcularSalario = new CalcularSalario();
        double salario = calcularSalario.calcularSalario(184,20000);
        System.out.println("Tu salario mensual sin contar horas extras fue: " + salario);



    }
}


