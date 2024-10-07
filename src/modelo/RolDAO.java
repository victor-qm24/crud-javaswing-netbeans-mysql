/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RolDAO {
   public List<Rol> obtenerRol() throws SQLException {
        List<Rol> roles = new ArrayList<>();
        String sql = "SELECT * FROM Roles";
        try (Connection conn = ConexionBD.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Rol rol = new Rol(rs.getInt("id"), rs.getString("descripcion_rol"));
                roles.add(rol);
            }
        }
        return roles;
    } 
}
