package Taller6_I_ISP;

public class PaquetePequeño extends Paquete{
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
    public double calcularCosto() {
        return 0;
    }
}
