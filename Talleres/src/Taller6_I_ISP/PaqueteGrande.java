package Taller6_I_ISP;

public class PaqueteGrande extends Paquete{
    private float volumen;
    private String medioDeTransporte;


    public PaqueteGrande(double peso, String dimensiones, String medioDeTransporte, float volumen) {
        super(peso, dimensiones);
        this.medioDeTransporte = medioDeTransporte;
        this.volumen = volumen;
    }

    public float getVolumen() {
        return volumen;
    }

    public void setVolumen(float volumen) {
        this.volumen = volumen;
    }

    public String getMedioDeTransporte() {
        return medioDeTransporte;
    }

    public void setMedioDeTransporte(String medioDeTransporte) {
        this.medioDeTransporte = medioDeTransporte;
    }


    @Override
    public double calcularCosto() {
        return 0;
    }
}
