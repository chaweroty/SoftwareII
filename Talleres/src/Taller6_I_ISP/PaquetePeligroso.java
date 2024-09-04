package Taller6_I_ISP;

public class PaquetePeligroso extends Paquete   implements IPaquetePeligroso{

    private String etiquetasPeligro;
    private boolean embalajeEspecial;

    public PaquetePeligroso(double peso, String dimensiones, String etiquetasPeligro, boolean embalajeEspecial) {
        super(peso, dimensiones);
        this.etiquetasPeligro = etiquetasPeligro;
        this.embalajeEspecial= embalajeEspecial;
    }


    public String getEtiquetasPeligro() {
        return etiquetasPeligro;
    }

    public void setEtiquetasPeligro(String etiquetasPeligro) {
        this.etiquetasPeligro = etiquetasPeligro;
    }

    public boolean isEmbalajeEspecial() {
        return embalajeEspecial;
    }

    public void setEmbalajeEspecial(boolean embalajeEspecial) {
        this.embalajeEspecial = embalajeEspecial;
    }


    @Override
    public double calcularCostoEnvioPeligroso() {
        double costoBase = this.getPeso() * 6.0;
        double costoEtiqueta = etiquetasPeligro.isEmpty() ? 0 : 50.0;
        double costoEmbalaje = embalajeEspecial ? 30.0 : 0.0;

        return costoBase + costoEtiqueta + costoEmbalaje;
    }
}
