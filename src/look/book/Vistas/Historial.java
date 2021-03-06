/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package look.book.Vistas;

import java.util.LinkedList;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import look.book.Controladores.HistorialControlador;
import look.book.Modelos.Compra;
import look.book.Modelos.CompraLibro;

/**
 *
 * @author Ricardo
 */
public class Historial extends javax.swing.JPanel {

    /**
     * Creates new form Historial
     */
    private LinkedList<Compra> c;
    private DefaultListModel modelo;
    private HistorialControlador historial;
    private Compra comp;
    private String text;
    private LinkedList<CompraLibro> cl;
    private String envio;
    private int i;
    private boolean entrar;

    public Historial() {
        modelo = new DefaultListModel();
        initComponents();
        c = null;
        historial = new HistorialControlador();
        comp = new Compra();
        cl = null;
        mostrarLista();
        listaFactura.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                entrar=lse.getValueIsAdjusting();

                if (entrar) {
                    mostrarCompra(lse);
                    entrar=false;
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaFactura = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();

        setMaximumSize(new java.awt.Dimension(800, 800));
        setMinimumSize(new java.awt.Dimension(800, 800));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Historial");

        listaFactura.setModel(modelo);
        jScrollPane1.setViewportView(listaFactura);

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane2.setViewportView(textArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 105, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listaFactura;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables

    private void mostrarLista() {
        c = historial.getHistorial();
        for (Compra compl : c) {
            modelo.addElement(compl.getId());
        }

    }

    public void mostrarCompra(ListSelectionEvent lse) {
        int x = listaFactura.getSelectedIndex();

        if(x >= c.size() || x < 0)
            return;
        Compra com = c.get(x);
        if (com.getMetodo_envio() == 1) {
            envio = "Aereo";
        } else {
            envio = "Terrestre";
        }
        text="";
        text = text+"El costo total es: " +"$"+com.getCosto_total() +"\n"+"La factura " + com.getId()+"\nEl peso total:"+"$"+com.getPeso_total()+"\nEl total de envio:"+"$"+com.getEnvio_total()+"\nEl metodo de envio:"+envio+"\nLa fecha de la compra:"+com.getFecha();
        text+="\n=========================================";

        for (CompraLibro compLi : com.getComprasLibro()) {
            text += "\n" + "La cantidad: " + compLi.getCantidad() + "\n" + "Titulo:" + compLi.getLibro().getTitulo() + "\n" + "El id del Libro:" + compLi.getCompraId() + "\nEl precio del libro" + "$" + compLi.getLibro().getPrecio();
            text += "\n=========================================";
        }
        textArea.setText(text);
    }
}