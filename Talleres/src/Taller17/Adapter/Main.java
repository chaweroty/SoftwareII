package Taller17.Adapter;
public class Main {
    public static void main(String[] args) {

        ImpresoraLaser impresoraLaser = new ImpresoraLaser();
        ImpresoraInkJet impresoraInkJet = new ImpresoraInkJet();

        Impresora impresora1 = new ImpresoraLaserAdapter(impresoraLaser);
        Impresora impresora2 = new ImpresoraInkJetAdapter(impresoraInkJet);

        impresora1.imprimir();
        impresora2.imprimir();
    }
}
