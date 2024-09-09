package Taller7_1DIP;

import java.util.Date;

public class Orden {
    private Date fecha;
    private String lugarOrigen;
    private String lugarDestino;


    public Orden(Date fecha, String lugarOrigen, String lugarDestino) {
        this.fecha = fecha;
        this.lugarOrigen = lugarOrigen;
        this.lugarDestino = lugarDestino;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugarOrigen() {
        return lugarOrigen;
    }

    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    public String getLugarDestino() {
        return lugarDestino;
    }

    public void setLugarDestino(String lugarDestino) {
        this.lugarDestino = lugarDestino;
    }
}
