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
public class ClassPedido {
    
    private int obtenerIdCliente(String clienteNombre) {
    int idCliente = 0;
    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fastfood", "root", "")) {
        String sql = "SELECT id FROM cliente WHERE nombre = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, clienteNombre);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            idCliente = rs.getInt("id");
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    return idCliente;
}
    
    
}
