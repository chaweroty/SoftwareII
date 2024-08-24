package SRP;

//Esta clase para que cumpla con el SRP  debe tener una unica responsabilidad, esta clase solo trata de manejar la parte del salario del usuario
public class CalcularSalario {
    public double calcularSalario(double hora, double precioHora) {
        return hora * precioHora;
    }
}
