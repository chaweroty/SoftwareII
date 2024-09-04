package Taller6_I_ISP;

public class PaquetePequeño extends Paquete implements IPaquetePequeño{
    private float valorDeclarado;
    public PaquetePequeño(double peso, String dimensiones, float valorDeclarado) {
        super(peso, dimensiones);
        this.valorDeclarado = valorDeclarado;
    }
    public float getValorDeclarado() {
        return valorDeclarado;
    }
    public void setValorDeclarado(float valorDeclarado) {
        this.valorDeclarado = valorDeclarado;
    }


    @Override
    public double calcularCostoEnvioPequeño() {
        double costoBase = this.getPeso() * 3.0;
        double costoSeguro = this.valorDeclarado * 0.05;

        return costoBase + costoSeguro;
    }
}
