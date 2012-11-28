package look.book.Modelos;

import java.util.LinkedList;

public class CarroDeCompras extends Modelo {

    private LinkedList<Libro> libros;
    private LinkedList<Integer> cantidadPorLibro;

    public CarroDeCompras() {
        libros = new LinkedList<Libro>();
        cantidadPorLibro = new LinkedList<Integer>();
    }

    public void eliminarLibro(Libro libro, int cantidad) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getId() == libro.getId()) {
                cantidadPorLibro.set(i, cantidadPorLibro.get(i) - cantidad);
                if (cantidadPorLibro.get(i) <= 0) {
                    cantidadPorLibro.remove(i);
                    libros.remove(i);
                }
                return;
            }
        }
    }

    public void agregarLibro(Libro libro, int cantidad) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getId() == libro.getId()) {
                cantidadPorLibro.set(i, cantidadPorLibro.get(i) + cantidad);
                return;
            }
        }

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
        float pesoTotal = 0;
        for (int i = 0; i < libros.size(); i++) {
            pesoTotal += libros.get(i).getPeso() * cantidadPorLibro.get(i);
        }
        return pesoTotal;
    }
}
