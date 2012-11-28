/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package look.book.Controladores;

import java.util.LinkedList;
import look.book.Modelos.Compra;
import look.book.Modelos.CompraLibro;

/**
 *
 * @author usuario
 */
public class HistorialControlador extends Controlador{
    public HistorialControlador(){
    
    }
   
   public LinkedList<Compra> getHistorial(){
       return usuario.getCompras();
   
   }
 
}
