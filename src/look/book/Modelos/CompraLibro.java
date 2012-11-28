package look.book.Modelos;


public class CompraLibro extends Modelo {

    private int compraId;
    private int libroId;
    private int cantidad;

    public CompraLibro() {
        tabla = "compralibro";
    }

    public Libro getLibro() {
        Libro l = Modelo.buscar(Libro.class, libroId);
        return l;
    }

    public int getCompraId() {
        return compraId;
    }

    public void setCompraId(int compraId) {
        this.compraId = compraId;
    }

    public int getLibroId() {
        return libroId;
    }

    public void setLibroId(int libroId) {
        this.libroId = libroId;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
