package OCP;
/*
La idea del OCP es que se pueda agregar nuevas funcionalidades a las clases si es requerido pero sin la necesidad de modificar el código que ya exista, este es el código refactorizado
 En el que identificamos la violación al OCP, en este caso son los if-else del código anterior, ya con esta estructura ocasionaba que cuando se deba agregar un nuevo tipo de envío se debía modificar
 este bloque de código modificando la clase envío haciendo que su nivel de acoplamiento sea alto y que este sea difícil de mantener en el tiempo
De esta nueva forma cumplimos con el OCP, generando bajo nivel de acoplamiento, en el momento que se deba añadir o eliminar algún tipo de envío no se deba modificar la clase Envío.
*/

public class Main {
    public static void main(String[] args) {
        Envio envioEstandar = new EnvioEstandar();
        Envio envioExpress = new EnvioExpress();
        Envio envioInternacional = new EnvioInternacional();

        double costoEstandar = envioEstandar.calcularCosto(10, 100);
        double costoExpress = envioExpress.calcularCosto(20, 50);
        double costoInternacional = envioInternacional.calcularCosto(10, 200);

        System.out.println("Costo Envío Estándar: " + costoEstandar);
        System.out.println("Costo Envío Express: " + costoExpress);
        System.out.println("Costo Envío Internacional: " + costoInternacional);
    }
}

