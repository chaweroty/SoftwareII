package Taller12.Taller12VariablesProtegidas;

public class Notificador {
    private CanalNotificacion canal;

    public Notificador(CanalNotificacion canal) {
        this.canal = canal;
    }
    public void enviarNotificacion(Notificacion notificacion){
        canal.enviarNotificacion(notificacion);
    }
}
