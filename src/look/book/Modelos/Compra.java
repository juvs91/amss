package look.book.Modelos;

import java.sql.Date;
import java.util.LinkedList;

public class Compra extends Modelo {

    private int id;
    private Date fecha;
    private int metodo_envio;
    private float costo_total;
    private float peso_total;
    private float envio_total;
    private int usuarioId;
    private LinkedList<CompraLibro> compraLibro;

    public Compra() {
        tabla = "compras";
    }

    public static LinkedList<Compra> getComprasPorUsuarioId(int id) {
        String condicion[] = {" usuarioId = " + id + " "};
        LinkedList<Compra> lista = Modelo.buscarTodos(Compra.class, condicion);

        for (Compra c : lista) {
            condicion[0] = " compraId = " + id + " ";
            c.compraLibro = Modelo.buscarTodos(CompraLibro.class, condicion);
        }
        return lista;
    }

    public LinkedList<CompraLibro> getComprasLibro() {
        return compraLibro;
    }   

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getMetodo_envio() {
        return metodo_envio;
    }

    public void setMetodo_envio(int metodo_envio) {
        this.metodo_envio = metodo_envio;
    }

    public float getCosto_total() {
        return costo_total;
    }

    public void setCosto_total(float costo_total) {
        this.costo_total = costo_total;
    }

    public float getPeso_total() {
        return peso_total;
    }

    public void setPeso_total(float peso_total) {
        this.peso_total = peso_total;
    }

    public float getEnvio_total() {
        return envio_total;
    }

    public void setEnvio_total(float envio_total) {
        this.envio_total = envio_total;
    }
}
