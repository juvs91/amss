package look.book.Modelos;

public class Libro extends Modelo {

    private int id;
    private String titulo;
    private String autor;
    private double precio;
    private double peso;
    private int cantDisponible;

    public Libro() {
        tabla = "libros";
    }

    public Libro(String titulo, String autor, double precio, double peso, int cantDisponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.peso = peso;
        this.cantDisponible = cantDisponible;
        tabla = "libros";
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getCantDisponible() {
        return cantDisponible;
    }

    public void setCantDisponible(int cantDisponible) {
        this.cantDisponible = cantDisponible;
    }

}
