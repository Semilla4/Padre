/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;
import Datos.Conexion;
import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Map;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Pedido extends javax.swing.JFrame {
//Ojala que salga
double sub;
    private int idCliente;
    private String nombreCliente;
    private Logica.Pedido pedidoData = new Logica.Pedido();

   
    
    public Pedido() {
        initComponents();
        setLocationRelativeTo(null); // Centrar ventana
        setSize(800, 600); // Definir tamaño
        mostrar1();
        mostrar2();
        mostrar3();
        pack();
    }

    // Setters para recibir datos de Inicio
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cboCombo = new javax.swing.JComboBox<>();
        cboMetodo = new javax.swing.JComboBox<>();
        btnSalir = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        spnCantidad = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        txtSub = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        mostrar3 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        mostrar1 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        mostrar2 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setText("Elije tu pedido");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 15, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/solo1.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 65, 160, 150));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/combo2.jpg"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 65, -1, 150));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/combo 3.jpg"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 65, 145, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setText("Personal");
        jLabel5.setEnabled(false);
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 233, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setText("Combo para 2");
        jLabel6.setEnabled(false);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 234, -1, 17));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setText("Familiar");
        jLabel7.setEnabled(false);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 233, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setText("S/ 8.00");
        jLabel8.setEnabled(false);
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 394, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel9.setText("S/ 15.00");
        jLabel9.setEnabled(false);
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 394, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel10.setText("S/ 28.00");
        jLabel10.setEnabled(false);
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 394, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel11.setText("Seleccione su combo:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 448, -1, 22));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel12.setText("Cantidad:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 510, -1, -1));

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel13.setText("Metodo de pago:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 568, -1, -1));

        cboCombo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cboCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Personal", "Combo para 2", "Familiar" }));
        cboCombo.setToolTipText("");
        jPanel2.add(cboCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 447, -1, -1));

        cboMetodo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cboMetodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Transferencia", "Plin", "Yape" }));
        jPanel2.add(cboMetodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 565, -1, -1));

        btnSalir.setBackground(new java.awt.Color(255, 51, 51));
        btnSalir.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 681, 85, -1));

        btnAceptar.setBackground(new java.awt.Color(50, 164, 58));
        btnAceptar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 681, 78, -1));

        spnCantidad.setVerifyInputWhenFocusTarget(false);
        jPanel2.add(spnCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 509, 98, -1));

        jLabel14.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel14.setText("SubTotal");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 629, -1, -1));
        jPanel2.add(txtSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 628, 125, -1));

        mostrar3.setEditable(false);
        jScrollPane2.setViewportView(mostrar3);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 145, 106));

        mostrar1.setEditable(false);
        jScrollPane3.setViewportView(mostrar1);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 270, 164, 106));

        mostrar2.setEditable(false);
        jScrollPane4.setViewportView(mostrar2);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 270, 164, 106));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void mostrar1(){
    mostrar1.setText("-1 Hamburguesa\n-1 Papa personal\n-1 Gaseosa de 350ml\n-Cremas");
}
private void mostrar2(){
    mostrar2.setText("-2 Hambuerguesas\n-2 Papas personales\n-2 Gaseosas de 500ml\n-Cremas");
}
private void mostrar3(){
    mostrar3.setText("-4 Hamburguesas\n-1 Papa Familiar\n-1 personal\n-1 Gaseosa de 1.5L\n-Cremas");
}
    
    private void calcularTotal() {
        
       Map<String, Double> precios = new HashMap<>();
        
        precios.put("Personal", 8.00);
        precios.put("Combo para 2", 15.00);
        precios.put("Familiar", 28.00); 
        
    String seleccion = (String) cboCombo.getSelectedItem();
    if (seleccion == null) {
        return;
    }
    int cantidad = (int) spnCantidad.getValue();
    if (cantidad <= 0) {
        return;
    }
    double precio = precios.get(seleccion);
    if (precio <= 0) {
        return;
    }
    sub = precio * cantidad;
     txtSub.setText(String.format("S/ %.2f", sub));
}

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        calcularTotal();

    String combo = (String) cboCombo.getSelectedItem();
    int cantidad = (int) spnCantidad.getValue();
    String metodoPago = (String) cboMetodo.getSelectedItem();
    double precioUnitario = sub / cantidad; // Calculamos el precio unitario aquí

    try {
        Connection conn = Conexion.obtenerConexion();

        // Guardar pedido
        int idPedido = pedidoData.guardarPedido(conn, idCliente, metodoPago);

        if (idPedido > 0) {
            // Guardar detalle del pedido
            pedidoData.guardarDetallePedido(conn, idPedido, combo, cantidad);

            // Crear e mostrar el recibo, pasando los datos necesarios
            Recibo re = new Recibo(idPedido, nombreCliente, combo, cantidad, precioUnitario, metodoPago, sub);
            JOptionPane.showMessageDialog(null, "Su Pedido a sido recepcionado\nAhora cancela en caja S/ " + sub);
            re.setVisible(true);

            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Error al crear el pedido");
        }

        Conexion.cerrarConexion(conn);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error de base de datos: " + e.getMessage());
    }
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int desicion = JOptionPane.showConfirmDialog(null,"¿Desea cancelar el pedido?","Salir",JOptionPane.YES_NO_OPTION);
        
        switch(desicion){
            case 0:
             this.setVisible(false);
             Inicio ini = new Inicio();
             ini.setVisible(true);
            break;    
            case 1:
            break;    
        }
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboCombo;
    private javax.swing.JComboBox<String> cboMetodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextPane mostrar1;
    private javax.swing.JTextPane mostrar2;
    private javax.swing.JTextPane mostrar3;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTextField txtSub;
    // End of variables declaration//GEN-END:variables

    

    
}
