package Taller7_1DIP;

public class Main {
    public static void main(String [] args){

        IProcesarOrdenFedex procesarOrdenFedex = new ProcesarOrdenFedexImpl();
        IProcesarOrdenDhl procesarOrdenDhl = new ProcesarOrdenDhlmpl();
        IProcesarOrdenUps procesarOrdenUps = new ProcesarOrdenUpsImpl();
        SistemaEnvios sistemaEnvios = new SistemaEnvios(procesarOrdenFedex,procesarOrdenDhl,procesarOrdenUps);
        Orden orden = new Orden(null, "Manizales", "Bogota");
        sistemaEnvios.enviarOrdenFedex(orden);
        sistemaEnvios.enviarOrdenDhl(orden);
        sistemaEnvios.enviarOrdenUps(orden);
    }


}
