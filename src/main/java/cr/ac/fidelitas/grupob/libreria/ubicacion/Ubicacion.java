package cr.ac.fidelitas.grupob.libreria.ubicacion;

public class Ubicacion {

    // estos atributos indican donde se encuentra el libro en la libreria
    private int estante;
    private int fila;
    private int columna;

    // constructor que permite crear una ubicacion enviando los datos
    public Ubicacion(int estante, int fila, int columna) {

        this.estante = estante;
        this.fila = fila;
        this.columna = columna;

    }

    public int getEstante() {
        return estante;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public String mostrarUbicacion() {

        return "Estante: " + estante
                + "\nFila: " + fila
                + "\nColumna: " + columna;
    }
}
