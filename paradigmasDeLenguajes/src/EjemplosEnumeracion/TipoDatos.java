package EjemplosEnumeracion;

public class TipoDatos {
    private int prim_entero;
    private Integer ext_entero;

    public enum DiaDeLaSemana{
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO
    }

    public TipoDatos(int a) {
        this.prim_entero=a;
        this.ext_entero= new Integer(a+10);
    }

    public void setPrimEntero(int y){
        this.prim_entero = y;
    }

    public int getPrimEntero(){
        return this.prim_entero;
    }


    public int getObjEntero(){
        return this.ext_entero;
    }
    public static void main(String args[]){
        TipoDatos td = new TipoDatos(10);
        System.out.println("Dato primitivo: "+ td.getPrimEntero());
        System.out.println("Dato No primitivo: "+);
        System.out.print(td.getPrimEntero());
        System.out.println(DiaDeLaSemana.LUNES);
        for(DiaDeLaSemana dia: DiaDeLaSemana.values(){
            System.out.println(dia);
        })
    }
}