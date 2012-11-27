package look.book.Modelos;

import java.util.LinkedList;

public class CarroDeCompras extends Modelo {

    private LinkedList<Libro> libros;
    private LinkedList<Integer> cantidadPorLibro;
    private double pesoTotal;

    public CarroDeCompras() {
        libros = new LinkedList<Libro>();
        cantidadPorLibro = new LinkedList<Integer>();
    }

    public void agregarLibro(Libro libro, int cantidad) {
        libros.add(libro);
        cantidadPorLibro.add((Integer) cantidad);
    }

    public int getTotalLibros() {
        return libros.size();
    }

    public LinkedList<Integer> getCantidadPorLibro() {
        return cantidadPorLibro;
    }

    public void setCantidadPorLibro(LinkedList<Integer> cantidadPorLibro) {
        this.cantidadPorLibro = cantidadPorLibro;
    }

    public LinkedList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(LinkedList<Libro> libros) {
        this.libros = libros;
    }

    public double getPesoTotal() {
        return this.pesoTotal;
    }

    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }
}
