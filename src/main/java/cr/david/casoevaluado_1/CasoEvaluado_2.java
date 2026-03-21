/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.david.casoevaluado_1;

/*
 * Clase CasoEvaluado_2
 * Esta clase contiene el metodo main y se utiliza
 * para probar el funcionamiento del sistema de
 * recompensas de empleados.
 */
public class CasoEvaluado_2 {

    /*
     * Metodo principal del programa.
     * Desde aqui se crean los objetos necesarios,
     * se agregan puntajes de evaluacion,
     * se calcula el promedio y se muestra
     * el nivel de desempeno del empleado.
     */
    public static void main(String[] args) {

        /*
         * Se crea un objeto de tipo Empleado con datos de ejemplo.
         * En este punto el empleado aun no tiene evaluaciones registradas.
         */
        Empleado empleado = new Empleado("Juan Perez", "Recursos Humanos");

        /*
         * Se agregan puntajes correspondientes a evaluaciones periodicas
         * realizadas al empleado en distintos momentos.
         */
        empleado.agregarPuntaje(80);
        empleado.agregarPuntaje(90);
        empleado.agregarPuntaje(75);

        /*
         * Se calcula el promedio de desempeno del empleado
         * a partir de los puntajes agregados anteriormente.
         */
        empleado.calcularPromedio();

        /*
         * Se muestran en pantalla los resultados finales del empleado,
         * incluyendo su informacion basica, el promedio obtenido
         * y el nivel de desempeno correspondiente.
         */
        System.out.println("Empleado: " + empleado.getNombreEmpleado());
        System.out.println("Departamento: " + empleado.getDepartamento());
        System.out.println("Promedio: " + empleado.getPromedio());
        System.out.println("Nivel: " + empleado.obtenerNivel());
    }
}