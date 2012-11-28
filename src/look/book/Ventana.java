package look.book;

import look.book.Controladores.Controlador;
import look.book.Vistas.IniciarSesion;
import javax.swing.*;
import look.book.Vistas.CarritoCompras;
import look.book.Vistas.Historial;
import look.book.Vistas.ListadoLibros;

public class Ventana extends javax.swing.JFrame {

    private JComponent componenteActual;

    public Ventana() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonListado = new javax.swing.JButton();
        botonCarrito = new javax.swing.JButton();
        botonHistorial = new javax.swing.JButton();
        botonCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 800));
        setMinimumSize(new java.awt.Dimension(800, 800));
        setPreferredSize(new java.awt.Dimension(800, 800));
        setResizable(false);

        botonListado.setText("Ver Listado de Libros");
        botonListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListadoActionPerformed(evt);
            }
        });

        botonCarrito.setText("Ver Carrito de Compras");
        botonCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCarritoActionPerformed(evt);
            }
        });

        botonHistorial.setText("Ver Historial");
        botonHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHistorialActionPerformed(evt);
            }
        });

        botonCerrarSesion.setText("Cerrar Sesión");
        botonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(308, Short.MAX_VALUE)
                .addComponent(botonListado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonCarrito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonHistorial)
                .addGap(18, 18, 18)
                .addComponent(botonCerrarSesion))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonListado)
                    .addComponent(botonCarrito)
                    .addComponent(botonHistorial)
                    .addComponent(botonCerrarSesion))
                .addContainerGap(777, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCarritoActionPerformed
        Controlador.ventana.cambiarVista(new CarritoCompras());
    }//GEN-LAST:event_botonCarritoActionPerformed

    private void botonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarSesionActionPerformed
        int ax = JOptionPane.showConfirmDialog(null, "¿Estas seguro de querer cerrar sesión?\n    Tu carro de compras se perdera.");
        if (ax == JOptionPane.YES_OPTION) {
            Controlador.ventana.cambiarVista((JPanel) (new IniciarSesion()));
            Controlador.ventana.menuInvisible();
        }
    }//GEN-LAST:event_botonCerrarSesionActionPerformed

    private void botonHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonHistorialActionPerformed
        Controlador.ventana.cambiarVista(new Historial());
    }//GEN-LAST:event_botonHistorialActionPerformed

    private void botonListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListadoActionPerformed
        Controlador.ventana.cambiarVista(new ListadoLibros());
    }//GEN-LAST:event_botonListadoActionPerformed

    public void menuVisible() {
        botonListado.setVisible(true);
        botonHistorial.setVisible(true);
        botonCarrito.setVisible(true);
        botonCerrarSesion.setVisible(true);
    }

    public void menuInvisible() {
        botonListado.setVisible(false);
        botonHistorial.setVisible(false);
        botonCarrito.setVisible(false);
        botonCerrarSesion.setVisible(false);
    }

    public void cambiarVista(JComponent panel) {
        if (componenteActual != null) {
            getContentPane().remove(componenteActual);
        }

        componenteActual = panel;

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)));

        pack();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Controlador.ventana.cambiarVista((JPanel) (new IniciarSesion()));
                Controlador.ventana.setVisible(true);
                Controlador.ventana.menuInvisible();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCarrito;
    private javax.swing.JButton botonCerrarSesion;
    private javax.swing.JButton botonHistorial;
    private javax.swing.JButton botonListado;
    // End of variables declaration//GEN-END:variables
}
