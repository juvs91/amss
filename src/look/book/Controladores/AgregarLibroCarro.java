package look.book.Controladores;

import look.book.Modelos.Libro;
import look.book.Modelos.Modelo;

public class AgregarLibroCarro extends Controlador {

    public AgregarLibroCarro() {
    }

    public boolean agregarLibro(int id, int cantidad) {
        Libro libro = Modelo.buscar(Libro.class, id);
        if (cantidad == 0 || cantidad > libro.getCantDisponible()) {
            return false;
        }

        usuario.getCarroDeCompras().agregarLibro(libro, cantidad);
        return true;
    }
}
