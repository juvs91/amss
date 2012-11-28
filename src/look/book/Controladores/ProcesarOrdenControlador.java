package look.book.Controladores;

import look.book.Modelos.CarroDeCompras;
import look.book.Modelos.Compra;

public class ProcesarOrdenControlador extends Controlador {
    
    public ProcesarOrdenControlador() {
    }
    
    public void procesarOrden(int metodo_envio) {
        Compra compra = new Compra(usuario.getCarroDeCompras(), usuario.getId(), metodo_envio);
        compra.guardar();
        
        usuario.setCarroDeCompras(new CarroDeCompras());
    }
}
