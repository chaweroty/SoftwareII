package Taller10.Taller10Creador;

public class Computadora {
    private String procesador;
    private String tarjetaGrafica;
    private int ram;

    public Computadora(String procesador, String tarjetaGrafica, int ram) {
        this.procesador = procesador;
        this.tarjetaGrafica = tarjetaGrafica;
        this.ram = ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
}
