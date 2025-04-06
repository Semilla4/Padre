/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Pedido extends javax.swing.JFrame {
    private int idPedido;
    private int idCliente;
    private String estado;
    private String metodoPago;
    private double total;
    private String nombreCliente;
    
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    
    public int guardarPedido(Connection conn, int idCliente, String metodoPago) throws SQLException {
        String sql = "INSERT INTO pedido (id_cliente, metodo_pago) VALUES (?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setInt(1, idCliente);
            stmt.setString(2, metodoPago);
            stmt.executeUpdate();
            
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1);
            }
        }
        return 0;
    }
    
    public void guardarDetallePedido(Connection conn, int idPedido, String comboNombre, int cantidad) throws SQLException {
        // Obtener id_menu y precio del combo
        String sqlMenu = "SELECT id_menu, precio FROM menu WHERE nombre = ?";
        int idMenu = 0;
        double precio = 0;
        
        try (PreparedStatement stmt = conn.prepareStatement(sqlMenu)) {
            stmt.setString(1, comboNombre);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                idMenu = rs.getInt("id_menu");
                precio = rs.getDouble("precio");
            }
        }
        
        double subtotal = precio * cantidad;
        
        String sql = "INSERT INTO detallepedido (id_pedido, id_menu, cantidad, precio_unitario, subtotal) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idPedido);
            stmt.setInt(2, idMenu);
            stmt.setInt(3, cantidad);
            stmt.setDouble(4, precio);
            stmt.setDouble(5, subtotal);
            stmt.executeUpdate();
        }
    }
    
    public void actualizarEstado(Connection conn, int idPedido, String estado) throws SQLException {
        String sql = "UPDATE pedido SET estado = ? WHERE id_pedido = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, estado);
            stmt.setInt(2, idPedido);
            stmt.executeUpdate();
        }
    }
    
    public void registrarVenta(Connection conn, int idPedido, double total, String metodoPago, String estado) throws SQLException {
        String sql = "INSERT INTO ventas (id_pedido, total, metodo_pago, estado) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idPedido);
            stmt.setDouble(2, total);
            stmt.setString(3, metodoPago);
            stmt.setString(4, estado);
            stmt.executeUpdate();
        }
    }

    
}
