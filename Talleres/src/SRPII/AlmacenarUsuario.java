package SRPII;
import java.util.ArrayList;
import java.util.List;
//Esta clase para que cumpla con el SRP  debe tener una unica responsabilidad, esta clase solo se encarga del proceso de almacenas los usuarios
public class AlmacenarUsuario {
    private List<Cliente> clientes = new ArrayList<>();
    public void guardarCliente(Cliente cliente) {
    clientes.add(cliente);
        System.out.println("Cliente guardado satisfactoriamente");
    }
    public List<Cliente> getClientes(){
        return clientes;
    }
}
