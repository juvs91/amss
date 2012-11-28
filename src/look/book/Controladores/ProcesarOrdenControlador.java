package look.book.Controladores;

import look.book.Modelos.CarroDeCompras;
import look.book.Modelos.Compra;

public class ProcesarOrdenControlador extends Controlador {
    
    public ProcesarOrdenControlador() {
    }
    
    public void procesarOrden() {
        Compra compra = new Compra(usuario.getCarroDeCompras(), usuario.getId(), 0);
        compra.guardar();
        
        usuario.setCarroDeCompras(new CarroDeCompras());
    }
}
