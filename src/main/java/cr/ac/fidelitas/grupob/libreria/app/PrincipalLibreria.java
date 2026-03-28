package cr.ac.fidelitas.grupob.libreria.app;

import javax.swing.JOptionPane;
import cr.ac.fidelitas.grupob.libreria.libro.Libro;
import cr.ac.fidelitas.grupob.libreria.ubicacion.Ubicacion;

public class PrincipalLibreria {

    public static void main(String[] args) {

        String lectura;
        int opcion;

        // estas variables guardan el ultimo libro registrado
        Libro libroRegistrado = null;
        Ubicacion ubicacionRegistrada = null;

        do {

            lectura = JOptionPane.showInputDialog(
                    "MENU PRINCIPAL\n\n"
                    + "1. Registrar libro\n"
                    + "2. Mostrar ultimo libro registrado\n"
                    + "3. Salir\n\n"
                    + "Digite una opcion:"
            );

            opcion = Integer.parseInt(lectura);

            switch (opcion) {

                case 1:

                    int codigo;
                    String titulo;
                    String autor;
                    String categoria;
                    int cantidad;
                    double precio;

                    int estante;
                    int fila;
                    int columna;

                    lectura = JOptionPane.showInputDialog("Digite el codigo del libro:");
                    codigo = Integer.parseInt(lectura);

                    titulo = JOptionPane.showInputDialog("Digite el titulo del libro");
                    autor = JOptionPane.showInputDialog("Digite el autor del libro");
                    categoria = JOptionPane.showInputDialog("Digite la categoria del libro");

                    lectura = JOptionPane.showInputDialog("Digite la cantidad");
                    cantidad = Integer.parseInt(lectura);

                    lectura = JOptionPane.showInputDialog("Digite el precio");
                    precio = Double.parseDouble(lectura);

                    lectura = JOptionPane.showInputDialog("Digite el estante");
                    estante = Integer.parseInt(lectura);

                    lectura = JOptionPane.showInputDialog("Digite la fila");
                    fila = Integer.parseInt(lectura);

                    lectura = JOptionPane.showInputDialog("Digite la columna");
                    columna = Integer.parseInt(lectura);

                    // creacion de objetos
                    libroRegistrado = new Libro(codigo, titulo, autor, categoria, cantidad, precio);
                    ubicacionRegistrada = new Ubicacion(estante, fila, columna);

                    JOptionPane.showMessageDialog(null, "Libro registrado correctamente");

                    break;

                case 2:

                    if (libroRegistrado == null) {

                        JOptionPane.showMessageDialog(null, "No hay libros registrados");

                    } else {

                        JOptionPane.showMessageDialog(null,
                                "ULTIMO LIBRO REGISTRADO\n\n"
                                + libroRegistrado.mostrarLibro());
                    }

                    break;

                case 3:

                    if (ubicacionRegistrada == null) {

                        JOptionPane.showMessageDialog(null, "No hay ubicacion registrada");

                    } else {

                        JOptionPane.showMessageDialog(null,
                                "UBICACION DEL LIBRO\n\n"
                                + ubicacionRegistrada.mostrarUbicacion());
                    }

                    break;
                default:

                    JOptionPane.showMessageDialog(null, "Opcion invalida");

            }

        } while (opcion != 3);

    }
}
