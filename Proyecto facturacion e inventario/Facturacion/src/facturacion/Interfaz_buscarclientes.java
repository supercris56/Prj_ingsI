
package facturacion;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CB-JS
 */

/**
 *
 * @version 1.0
 */
public class Interfaz_buscarclientes extends javax.swing.JInternalFrame {

   
    private Object[][] datostabla;    
    control_existencias ctr = new control_existencias();
    public Interfaz_buscarclientes() {
        initComponents();
        mostrar_tabla();
        
    }
              
    
     public void mostrar_tabla(){
        control_cliente control = new control_cliente("Documento","Tipo de documento","Nombres","Apellidos","Direccion","Ciudad","telefono");       
        String[] columnas = {"Documento","Tipo de documento","Nombres","Apellidos","Direccion","Ciudad","Telefono"};
        datostabla = control.consulta_clientes();
        DefaultTableModel datos = new DefaultTableModel(datostabla,columnas);
        jTable1.setModel(datos);


}
    /**
     * 
     * Este método se llama desde dentro del constructor para inicializar el formulario. 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        buscarcliente = new javax.swing.JTextField();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Buscar clientes");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        buscarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarclienteActionPerformed(evt);
            }
        });
        buscarcliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarclienteKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(buscarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(233, 233, 233)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 34, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buscarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarclienteActionPerformed
    
    }//GEN-LAST:event_buscarclienteActionPerformed

    private void buscarclienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarclienteKeyReleased
   
    }//GEN-LAST:event_buscarclienteKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    String[] columnas = {"Documento","Tipo de documento","Nombres","Apellidos","Direccion","Ciudad","Telefono"};
        datostabla = ctr.datos_cliente(buscarcliente.getText());
        DefaultTableModel datostcli = new DefaultTableModel(datostabla,columnas);
        jTable1.setModel(datostcli);
        buscarcliente.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscarcliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
