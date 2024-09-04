package Taller6_I_ISP;

public class Main {
     public static void main(String [] args){

         IPaquetePequeño paquetePequeño = new PaquetePequeño(10,"20x20x20",400);
         IPaqueteGrande paqueteGrande = new PaqueteGrande(20, "40x80x40", "aereo", 200);
         IPaquetePeligroso paquetePeligroso = new PaquetePeligroso(80, "80x80x80","radiactivo",true);


         System.out.println("EL costo del envio del paquete pequeño es de: " + paquetePequeño.calcularCostoEnvioPequeño());
         System.out.println("EL costo del envio del paquete grande es de: " +paqueteGrande.calcularCostoEnvioGrande());
         System.out.println("EL costo del envio del paquete peligroso es de: " + paquetePeligroso.calcularCostoEnvioPeligroso());






     }
}
