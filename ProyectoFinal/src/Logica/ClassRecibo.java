/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;
import Datos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;
/**
 *
 * @author Usuario
 */
public class ClassRecibo {
    private void actualizarEstadoPedido(int id, String estado) {
    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fastfood", "root", "")) {
        String sql = "UPDATE pedido SET estado = ? WHERE id = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, estado);
        pst.setInt(2, id);
        int filasActualizadas = pst.executeUpdate();
        if (filasActualizadas > 0) {
            System.out.println("Estado del pedido actualizado correctamente");
        } else {
            System.out.println("No se pudo actualizar el estado del pedido");
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}
    
    
}
