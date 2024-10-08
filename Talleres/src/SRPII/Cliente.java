package SRPII;
//Esta clase para que cumpla con el SRP debe tener una unica responsabilidad, esta clase solo estructura que información debe tener el cliente

public class Cliente {
    private String nombre;
    private String email;
    private String direccion;
    private String cedula;
    private String telefono;

    public Cliente(String nombre, String email, String direccion, String cedula, String telefono) {
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
