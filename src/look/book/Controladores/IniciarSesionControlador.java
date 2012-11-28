package look.book.Controladores;

import look.book.Modelos.Modelo;
import look.book.Modelos.Usuario;
import look.book.Vistas.ListadoLibros;
import java.util.LinkedList;

public class IniciarSesionControlador extends Controlador {

    public IniciarSesionControlador() {
    }

    public boolean iniciarSesion(String nombreUsuario, String contrasena) {
        String[] condiciones = {"nombreUsuario LIKE '" + nombreUsuario + "'",
            "contrasena LIKE '" + contrasena + "'"};

        LinkedList<Usuario> usuarios = Modelo.buscarTodos(Usuario.class, condiciones);


        if (usuarios.size() > 0) {
            Controlador.usuario = usuarios.get(0);
            
            Controlador.ventana.menuVisible();
            ventana.cambiarVista(new ListadoLibros());
            return true;
        }

        return false;
    }
}
