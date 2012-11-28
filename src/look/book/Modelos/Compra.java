package look.book.Modelos;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.Date;

public class Compra extends Modelo {

    private int id;
    private Timestamp fecha;
    private int metodo_envio;
    private float costo_total;
    private float peso_total;
    private float envio_total;
    private int usuarioId;
    private LinkedList<CompraLibro> compraLibro;

    public Compra() {
        tabla = "compras";
    }

    public Compra(CarroDeCompras carro, int usuarioId, int metodo_envio) {
        tabla = "compras";
        this.usuarioId = usuarioId;

        LinkedList<Libro> libros = carro.getLibros();
        LinkedList<Integer> cant = carro.getCantidadPorLibro();
        compraLibro = new LinkedList<CompraLibro>();

        for (int i = 0; i < libros.size(); i++) {
            costo_total += libros.get(i).getPrecio() * cant.get(i);
            peso_total += libros.get(i).getPeso() * cant.get(i);
            compraLibro.add(new CompraLibro(0, libros.get(i).getId(), cant.get(i)));
        }

        if (metodo_envio == 0) { // terrestre
            envio_total = 2 * peso_total;
            costo_total = costo_total + peso_total * 2;
        } else {
            envio_total = 4 * peso_total;
            costo_total = costo_total + peso_total * 4;
        }

        Date d = new Date();
        fecha = new Timestamp(d.getTime());


    }

    public void guardar() {
        try {
            String query = "INSERT INTO  compras (`id` ,`fecha` ,`metodo_envio` ,`costo_total` ,"
                    + "`peso_total` ,`envio_total` ,`usuarioId`)VALUES (NULL ,  '" + fecha + "',  '" + metodo_envio + "',"
                    + "  '" + costo_total + "',  '" + peso_total + "',  '" + envio_total + "',  '" + usuarioId + "');";

            stm.executeUpdate(query);

            String f = fecha.toString();
            f = f.substring(0, f.indexOf("."));
            String condiciones[] = {"metodo_envio = " + metodo_envio,
                "fecha = '" + f + "'",
                "usuarioId = " + usuarioId};
            
            LinkedList<Compra> compras = Modelo.buscarTodos(Compra.class, condiciones);
            id = compras.get(0).getId();

            for (CompraLibro cl : compraLibro) {
                query = "INSERT INTO compralibro (`compraId`, `libroId`, `cantidad`) "
                        + "VALUES ('" + id + "', '" + cl.getLibroId() + "', '" + cl.getCantidad() + "');";

                stm.executeUpdate(query);
            }

        } catch (SQLException ex) {
            System.out.println("SQLException ERROR: " + ex.getMessage());
        }
    }

    public static LinkedList<Compra> getComprasPorUsuarioId(int id) {
        String condicion[] = {" usuarioId = " + id + " "};
        LinkedList<Compra> lista = Modelo.buscarTodos(Compra.class, condicion);

        for (Compra c : lista) {
            condicion[0] = " compraId = " + c.getId() + " ";
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

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
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
