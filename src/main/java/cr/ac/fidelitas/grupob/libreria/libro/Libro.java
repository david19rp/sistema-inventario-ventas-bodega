package cr.ac.fidelitas.grupob.libreria.libro;

public class Libro {

    // atributos del libro
    private int codigo;
    private String titulo;
    private String autor;
    private String categoria;
    private int cantidad;
    private double precio;

    // constructor con parametros
    // este constructor se usa para crear un objeto de tipo Libro enviando todos
    // los datos necesarios desde el inicio. Cada parametro representa uno de
    // los atributos del libro y se asigna al objeto usando la palabra this.
    public Libro(int codigo, String titulo, String autor, String categoria, int cantidad, double precio) {

        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.precio = precio;

    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public String mostrarLibro() {

        return "Codigo: " + codigo
                + "\nTitulo: " + titulo
                + "\nAutor: " + autor
                + "\nCategoria: " + categoria
                + "\nCantidad: " + cantidad
                + "\nPrecio: " + precio;
    }
}
