package Taller6_I_ISP;

public class PaquetePeligroso extends Paquete{

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


}
