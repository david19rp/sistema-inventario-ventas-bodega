/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.david.casoevaluado_1;

/*
 * Clase Proyecto
 * Almacena la informacion del proyecto y permite
 * calcular el promedio y obtener una clasificacion.
 */
public class Proyecto {

    // Datos del proyecto
    private String nombreProyecto;
    private String liderProyecto;

    // Variables para las evaluaciones
    private int sumaPuntuaciones;
    private int cantidadEvaluaciones;

    // Promedio final
    private double promedio;

    // Constructor de la clase del proyecto 
    //Se inicializa los datos del proyecto y deja los valores numericos en cero
    public Proyecto(String nombreProyecto, String liderProyecto) {
        this.nombreProyecto = nombreProyecto;
        this.liderProyecto = liderProyecto;
        this.sumaPuntuaciones = 0;
        this.cantidadEvaluaciones = 0;
        this.promedio = 0;
    }

    /*
     * Metodo que agrega una puntuacion otorgada por un jurado
     * y aumenta el contador de evaluaciones.
     */
    public void agregarPuntuacion(int puntuacion) {
        sumaPuntuaciones += puntuacion;
        cantidadEvaluaciones++;
    }

    /*
     * Metodo que calcula el promedio de las puntuaciones
     * y lo almacena en el atributo promedio.
     */
    public void calcularPromedio() {
        if (cantidadEvaluaciones > 0) {
            promedio = (double) sumaPuntuaciones / cantidadEvaluaciones;
        }
    }

    /*
     * Metodo que va devolver la clasificacion del proyecto
     * segun el promedio obtenido.
     */
    public String obtenerClasificacion() {
        if (promedio >= 90) {
            return "EXCELENTE";
        } else if (promedio >= 70) {
            return "BUENO";
        } else if (promedio >= 50) {
            return "ACEPTABLE";
        } else {
            return "DEFICIENTE";
        }
    }

    // Getters
    // Permite obtener los valores almacenados del proyecto sin modificar la informacion
    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public String getLiderProyecto() {
        return liderProyecto;
    }

    public double getPromedio() {
        return promedio;
    }
}