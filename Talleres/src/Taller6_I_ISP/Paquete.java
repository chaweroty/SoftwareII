package Taller6_I_ISP;

public abstract class Paquete {
    protected double peso;
    protected String dimensiones;

    public Paquete(double peso, String dimensiones) {
        this.peso = peso;
        this.dimensiones = dimensiones;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }
}


