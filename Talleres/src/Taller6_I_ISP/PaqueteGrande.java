package Taller6_I_ISP;

public class PaqueteGrande extends Paquete implements IPaqueteGrande{
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
    public double calcularCostoEnvioGrande() {
        double costoBase = 50.0;
        double costoPeso = this.getPeso() * 2.0;
        double costoVolumen = this.volumen * 1.5;

        if (this.medioDeTransporte.equalsIgnoreCase("aéreo")) {
            costoBase += 20.0;
        } else if (this.medioDeTransporte.equalsIgnoreCase("terrestre")) {
            costoBase += 10.0;
        }

        return costoBase + costoPeso + costoVolumen;
    }
}
