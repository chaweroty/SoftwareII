package SRPII;

public class Factura {
    private String fecha;
    private int id;
    private String vendedor;
    private double valor;
    private Cliente cliente;

    public Factura(String fecha, int id, String vendedor, double valor, Cliente cliente) {
        this.fecha = fecha;
        this.id = id;
        this.vendedor = vendedor;
        this.valor = valor;
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
