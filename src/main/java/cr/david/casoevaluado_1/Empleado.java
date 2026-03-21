/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.david.casoevaluado_1;

/*
 * Clase Empleado
 * Esta clase representa a un empleado dentro del sistema de recompensas.
 * Su funcion principal es almacenar la informacion basica del empleado,
 * registrar los puntajes obtenidos en evaluaciones periodicas,
 * calcular el promedio de desempeno y determinar el nivel alcanzado
 * segun dicho promedio.
 */
public class Empleado {

   /*
     * Atributos del empleado.
     * Estos datos identifican al empleado dentro del sistema
     * y permiten asociar los resultados de desempeno a la persona correcta.
     */
    private String nombreEmpleado;
    private String departamento;

    /*
     * Atributos utilizados para el calculo del promedio.
     * sumaPuntajes almacena la suma total de los puntajes obtenidos.
     * cantidadEvaluaciones lleva el conteo de cuantas evaluaciones se han realizado.
     * promedio almacena el resultado final del desempeno del empleado.
     */
    private int sumaPuntajes;
    private int cantidadEvaluaciones;
    private double promedio;

     /*
     * Constructor de la clase Empleado.
     * Se utiliza para crear un nuevo empleado indicando su nombre
     * y el departamento al que pertenece.
     * Los valores numericos se inicializan en cero ya que
     * al momento de crear el empleado aun no tiene evaluaciones registradas.
     */
    public Empleado(String nombreEmpleado, String departamento) {
        this.nombreEmpleado = nombreEmpleado;
        this.departamento = departamento;
        this.sumaPuntajes = 0;
        this.cantidadEvaluaciones = 0;
        this.promedio = 0;
    }

/*
     * Metodo agregarPuntaje
     * Permite registrar un nuevo puntaje correspondiente a una evaluacion
     * periodica del empleado.
     * Cada vez que se agrega un puntaje, este se suma al acumulado
     * y se incrementa la cantidad total de evaluaciones realizadas.
     */
    public void agregarPuntaje(int puntaje) {
        sumaPuntajes += puntaje;
        cantidadEvaluaciones++;
    }

     /*
     * Metodo calcularPromedio
     * Calcula el promedio de desempeno del empleado a partir de los
     * puntajes acumulados y la cantidad de evaluaciones registradas.
     * El resultado se almacena en el atributo promedio para su uso posterior.
     */
    public void calcularPromedio() {
        if (cantidadEvaluaciones > 0) {
            promedio = (double) sumaPuntajes / cantidadEvaluaciones;
        }
    }

   /*
     * Metodo obtenerNivel
     * Determina el nivel de desempeno del empleado segun el promedio obtenido.
     * La clasificacion se realiza utilizando los rangos definidos
     */
    public String obtenerNivel() {
        if (promedio >= 85) {
            return "EXCELENTE";
        } else if (promedio >= 70) {
            return "BUENO";
        } else if (promedio >= 50) {
            return "REGULAR";
        } else {
            return "INSUFICIENTE";
        }
    }

     /*
     * Metodos getters.
     * Permiten acceder a la informacion del empleado y a su promedio
     * de desempeno sin modificar los valores almacenados.
     */
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getPromedio() {
        return promedio;
    }
}