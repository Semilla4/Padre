/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;
import Datos.Conexion;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;
import java.awt.Color;

public class Recibo extends javax.swing.JFrame {
    private int idPedido;
    private String nombreCliente;
    private String combo;
    private int cantidad;
    private double precioUnitario;
    private String metodoPago;
    private double subtotal;
    private Logica.Pedido pedidoData = new Logica.Pedido();

    public Recibo(int idPedido, String nombreCliente, String combo, int cantidad, double precioUnitario, String metodoPago, double subtotal) {
        initComponents();
        setLocationRelativeTo(null);
        this.idPedido = idPedido;
        this.nombreCliente = nombreCliente;
        this.combo = combo;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.metodoPago = metodoPago;
        this.subtotal = subtotal;
        mostrarDetalles();
        TerminosCondiciones();
    }

    private void mostrarDetalles() {
        txtNPedido.setText(String.valueOf(idPedido));
        txtNombre.setText(nombreCliente);
        txtDescripcion.setText(combo);
        txtCantidad.setText(String.valueOf(cantidad));
        txtPrecio.setText(String.format("S/ %.2f", precioUnitario));
        txtMetodo.setText(metodoPago);

        double igv = subtotal * 0.18;
        double total = subtotal;

        txtIgv.setText(String.format("S/ %.2f", igv));
        txtTotal.setText(String.format("S/ %.2f", total));
        txtSubTotal.setText(String.format("S/ %.2f", subtotal - igv)); // Asegúrate de tener este campo en tu frame Recibo
        txtEstado.setText("Pendiente"); // Estado inicial del pedido
       
           
    }
    
    private void TerminosCondiciones() {
    
    txtterminos.setText("""
                        Terminos y Condiciones 
                        -Responsable: Fast Food - Calle Pilon 145, La Molina - RUC: 10749720000
                        -Informacion Recopilada: Datos personales (nombre, DNI, contacto,
                         direcci\u00f3n), detalles del pedido, m\u00e9todo de pago (a trav\u00e9s de
                         pasarelas seguras), uso del servicio, datos t\u00e9cnicos (IP, navegador).
                        -Compartir Informaci\u00f3n: Con proveedores de servicios(entrega, pago,
                         marketing), por ley, con consentimiento.
                        -Env\u00edos: Solo en el distrito. Entrega estimada: 30 min - 1 hora.
                        Costo seg\u00fan distancia.
                        -Devoluciones: Se aceptan por da\u00f1os, error o retraso (notificar 
                         m\u00e1x. 1 hora despu\u00e9s de recibir). Reembolso o cambio 
                        (con pago de diferencia si aplica).
                        -Pagos: Transferencias (Yape, Plin, banca m\u00f3vil), tarjetas (Visa),
                         efectivo. Pagos seguros.
                        -Precios: Consultar en la aplicaci\u00f3n o local. Sujetos a cambio.
                         Facturas a solicitud.""");
    txtterminos.setCaretPosition(0);
    
    
    
}
    Inicio ini = new Inicio();
    
    
    
    public Recibo() {
        initComponents();
        setLocationRelativeTo(null);    
        

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnProcesar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNPedido = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JLabel();
        txtEstado = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JLabel();
        txtMetodo = new javax.swing.JLabel();
        txtIgv = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        txtterminos = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setText("Comprobante de pago");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 6, -1, -1));

        jLabel2.setText("Precio del pedido:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 202, -1, -1));

        jLabel3.setText("Estado del Pedido:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 250, -1, -1));

        jLabel4.setText("Metodo de Pago:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 346, -1, -1));

        jLabel5.setText("IGV:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 396, -1, -1));

        btnProcesar.setText("Procesar Pago");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });
        jPanel1.add(btnProcesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 706, -1, -1));

        btnCancelar.setText("Cancelar Pedido");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 706, -1, -1));

        jLabel6.setText("Descripción del pedido:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 154, -1, -1));

        jLabel10.setText("Cantidad:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 298, -1, -1));

        jLabel11.setText("N° Pedido:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 66, -1, -1));

        jLabel12.setText("Cliente:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 110, -1, -1));

        txtNPedido.setBackground(new java.awt.Color(255, 255, 255));
        txtNPedido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNPedido.setOpaque(true);
        jPanel1.add(txtNPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 60, 100, 22));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNombre.setOpaque(true);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 104, 213, 22));

        txtDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDescripcion.setOpaque(true);
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 148, 213, 22));

        txtEstado.setBackground(new java.awt.Color(255, 255, 255));
        txtEstado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtEstado.setOpaque(true);
        jPanel1.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 244, 144, 22));

        txtCantidad.setBackground(new java.awt.Color(255, 255, 255));
        txtCantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCantidad.setOpaque(true);
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 292, 213, 22));

        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPrecio.setOpaque(true);
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 196, 213, 22));

        txtMetodo.setBackground(new java.awt.Color(255, 255, 255));
        txtMetodo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtMetodo.setOpaque(true);
        jPanel1.add(txtMetodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 340, 213, 22));

        txtIgv.setBackground(new java.awt.Color(255, 255, 255));
        txtIgv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtIgv.setOpaque(true);
        jPanel1.add(txtIgv, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 390, 213, 22));

        jLabel7.setText("SubTotal:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 435, -1, -1));

        txtSubTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtSubTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtSubTotal.setOpaque(true);
        jPanel1.add(txtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 429, 213, 22));

        txtterminos.setSelectionStart(1);
        scroll.setViewportView(txtterminos);

        jPanel1.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 509, 416, 185));

        jLabel8.setText("Precio Total:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 475, -1, -1));

        txtTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTotal.setOpaque(true);
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 469, 100, 22));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 750));

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

    
    private int id;
private String cliente;
private Map<String, String> datos;

public void Comprobante(int id, String cliente, Map<String, String> datos) {
    this.id = id;
    this.cliente = cliente;
    this.datos = datos;
    
    txtNPedido.setText(String.valueOf(id)); 
    txtNombre.setText(cliente);
    
    
    txtDescripcion.setText(datos.get("combo"));
    txtPrecio.setText(datos.get("precio"));
    txtCantidad.setText(datos.get("cantidad"));
    txtMetodo.setText(datos.get("metodo"));
    
    
    double subtotal = Double.parseDouble(datos.get("precio")) * Integer.parseInt(datos.get("cantidad"));
    double igv = subtotal * 0.18;
    txtIgv.setText(String.format("S/ %.2f", igv));
    txtSubTotal.setText(String.format("S/ %.2f", subtotal + igv));
}

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        int decision = JOptionPane.showConfirmDialog(null, "¿Desea cancelar el pedido?", "Cancelar", JOptionPane.YES_NO_OPTION);
    if (decision == JOptionPane.YES_OPTION) {
        try {
            Connection conn = Conexion.obtenerConexion();
            
            pedidoData.actualizarEstado(conn, idPedido, "cancelado");
            
            double total = subtotal + (subtotal * 0.18);
            pedidoData.registrarVenta(conn, idPedido, total, metodoPago, "cancelado");
            
            Conexion.cerrarConexion(conn);
            
            txtEstado.setText("Cancelado");
            this.setVisible(false);
             ini.setVisible(true);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error de base de datos: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        try {
        Connection conn = Conexion.obtenerConexion();

        pedidoData.actualizarEstado(conn, idPedido, "completado");

        double igv = subtotal * 0.18;
        double total = subtotal + igv;
        pedidoData.registrarVenta(conn, idPedido, total, metodoPago, "completado");

        Conexion.cerrarConexion(conn);

        txtEstado.setText("Atendido");
        JOptionPane.showMessageDialog(null, "Gracias por su Compra, Vuelva Pronto");
        this.setVisible(false);
             ini.setVisible(true);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error de base de datos: " + e.getMessage());
    }
    }//GEN-LAST:event_btnProcesarActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(Recibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recibo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JLabel txtCantidad;
    private javax.swing.JLabel txtDescripcion;
    private javax.swing.JLabel txtEstado;
    private javax.swing.JLabel txtIgv;
    private javax.swing.JLabel txtMetodo;
    private javax.swing.JLabel txtNPedido;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtPrecio;
    private javax.swing.JLabel txtSubTotal;
    private javax.swing.JLabel txtTotal;
    private javax.swing.JTextPane txtterminos;
    // End of variables declaration//GEN-END:variables

    
}
