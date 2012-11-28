package look.book.Vistas;

import look.book.Controladores.Controlador;
import look.book.Modelos.CarroDeCompras;
import look.book.Modelos.Libro;

public class LibroCarro extends javax.swing.JPanel {

    private CarroDeCompras carro;
    private CarritoCompras vista;
    private Libro libro;
    private int cant;

    public LibroCarro(CarroDeCompras carro, Libro libro, int cant, CarritoCompras vista) {
        initComponents();
        this.vista = vista;
        this.cant = cant;
        this.libro = libro;
        this.carro = carro;

        cantidad.setText("" + cant);
        autor.setText(libro.getAutor());
        titulo.setText(libro.getTitulo());
        pesoUnitario.setText(String.format("%.2f kg", libro.getPeso()));
        pesoTotal.setText(String.format("%.2f kg", libro.getPeso() * cant));
        precioUnitario.setText(String.format("$%.2f", libro.getPrecio()));
        costoTotal.setText(String.format("$%.2f", libro.getPrecio() * cant));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        autor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        precioUnitario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        costoTotal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pesoUnitario = new javax.swing.JLabel();
        pesoTotal = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        botonElminiar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(712, 76));
        setMinimumSize(new java.awt.Dimension(712, 76));
        setPreferredSize(new java.awt.Dimension(712, 76));

        titulo.setText("Titulo");

        autor.setText("autor");

        jLabel1.setText("Precio unitario: ");

        precioUnitario.setText("$0.00");

        jLabel2.setText("Costo Total:");

        costoTotal.setText("$0.00");

        jLabel4.setText("Peso unitario:");

        jLabel5.setText("Peso total:");

        pesoUnitario.setText("0.00 kg");

        pesoTotal.setText("0.00 kg");

        jLabel6.setText("Cantidad:");

        cantidad.setText("0");

        botonElminiar.setText("Eliminar libro");
        botonElminiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonElminiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(autor, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                    .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(costoTotal)
                    .addComponent(precioUnitario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantidad))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(pesoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonElminiar)))
                .addGap(0, 24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(precioUnitario)
                    .addComponent(jLabel4)
                    .addComponent(pesoUnitario)
                    .addComponent(jLabel6)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(autor))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(costoTotal)
                            .addComponent(jLabel5)
                            .addComponent(pesoTotal)
                            .addComponent(botonElminiar))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonElminiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonElminiarActionPerformed
        carro.eliminarLibro(libro, Integer.parseInt(cantidad.getText()));
        Controlador.ventana.cambiarVista(new CarritoCompras());
    }//GEN-LAST:event_botonElminiarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel autor;
    private javax.swing.JButton botonElminiar;
    private javax.swing.JTextField cantidad;
    private javax.swing.JLabel costoTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel pesoTotal;
    private javax.swing.JLabel pesoUnitario;
    private javax.swing.JLabel precioUnitario;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
