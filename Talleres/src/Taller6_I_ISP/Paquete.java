package Taller6_I_ISP;

public abstract class Paquete {
    protected double peso;
    protected String dimensiones;

    public Paquete(double peso, String dimensiones) {
        this.peso = peso;
        this.dimensiones = dimensiones;
    }

    public abstract double calcularCosto();
}


