package look.book.Modelos;

import look.book.Config;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class Modelo<T> {

    private static Connection conexion;
    private static Statement stm;
    protected String tabla;

    static {
        try {
            conexion = DriverManager.getConnection(Config.url, Config.usuario, Config.clave);
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        try {
            stm = conexion.createStatement();
        } catch (SQLException ex) {
            System.out.println("SQLException ERROR: " + ex.getMessage());
        }
    }

    public static Connection getConexion() {
        return conexion;
    }

    public static <T extends Modelo> LinkedList<T> buscarTodos(Class<T> c) {
        return buscarTodos(c, null, "");
    }

    public static <T extends Modelo> LinkedList<T> buscarTodos(Class<T> c, String[] condiciones) {
        return buscarTodos(c, condiciones, "");
    }

    public static <T extends Modelo> LinkedList<T> buscarTodos(Class<T> c, String[] condiciones, String opciones) {
        LinkedList<T> modelos = new LinkedList<T>();
        try {   

            T modelo = c.newInstance();
            String query = "select * from " + modelo.tabla + " where 1";
            if (condiciones != null) {
                for (int i = 0; i < condiciones.length; i++) {
                    query += " and " + condiciones[i];
                }
            }
            query += " " + opciones;

            ResultSet rs = stm.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData();
            int numeroColumnas = rsmd.getColumnCount();

            while (rs.next()) {
                modelo = c.newInstance();
                for (int i = 1; i <= numeroColumnas; i++) {
                    String nombre = rsmd.getColumnName(i);
                    Field field;
                    try {
                        field = c.getDeclaredField(nombre);
                        field.setAccessible(true);
                        field.set(modelo, rs.getObject(nombre));

                    } catch (NoSuchFieldException ex) {
                    } catch (SecurityException ex) {
                    }
                }

                modelos.add(modelo);
            }

        } catch (InstantiationException ex) {
            System.out.println("InstantiationException ERROR: " + ex.getMessage());
        } catch (IllegalAccessException ex) {
            System.out.println("IllegalAccessException ERROR: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("SQLException ERROR: " + ex.getMessage());
        }

        return modelos;
    }

    public static <T extends Modelo> T buscar(Class<T> c, int id) {
        String[] condiciones = {"id = " + id};
        List<T> lista = buscarTodos(c, condiciones);
        if (lista != null) {
            return lista.get(0);
        }

        return null;
    }

    public final boolean guardar() {
        return false;
    }
}
