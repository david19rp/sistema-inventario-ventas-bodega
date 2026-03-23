package cr.david.casoevaluado_1;

/*
 * Clase CasoEvaluado_1
 * Contiene el metodo main para probar la clase Proyecto.
 */
public class CasoEvaluado_1 {

    public static void main(String[] args) {

        Proyecto proyecto = new Proyecto("Sistema de Ventas", "David");

        // Se agregan puntuaciones de diferentes jurados
        proyecto.agregarPuntuacion(10);
        proyecto.agregarPuntuacion(50);
        proyecto.agregarPuntuacion(70);

        // Se calcula el promedio
        proyecto.calcularPromedio();

        // Se muestran los resultados
        System.out.println("Proyecto: " + proyecto.getNombreProyecto());
        System.out.println("Lider: " + proyecto.getLiderProyecto());
        System.out.println("Promedio: " + proyecto.getPromedio());
        System.out.println("Clasificacion: " + proyecto.obtenerClasificacion());
        //todo corre bien
        // no lo se Rick
    }
}