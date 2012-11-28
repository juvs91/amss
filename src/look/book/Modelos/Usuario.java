package look.book.Modelos;

import java.util.LinkedList;

public class Usuario extends Modelo {

    private int id;
    private String nombreUsuario;
    private String contrasena;
    private CarroDeCompras carroDeCompras;

    public Usuario() {
        carroDeCompras = new CarroDeCompras();
        tabla = "usuarios";
    }
    
    public LinkedList<Compra> getCompras(){
        return Compra.getComprasPorUsuarioId(id);
    }

    public Usuario(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        carroDeCompras = new CarroDeCompras();
        tabla = "usuarios";
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreUsuario() {
        return this.nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public CarroDeCompras getCarroDeCompras() {
        return carroDeCompras;
    }

    public void setCarroDeCompras(CarroDeCompras carroDeCompras) {
        this.carroDeCompras = carroDeCompras;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
}
