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

/**
 *
 * @author quina
 */
public class ProyectoDAO {
    
    public List<Proyecto> obtenerProyecto() throws SQLException {
        List<Proyecto> proyectos = new ArrayList<>();
        String sql = "SELECT * FROM Proyectos";
        try (Connection conn = ConexionBD.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Proyecto py = new Proyecto(rs.getInt("id"), 
                        rs.getString("titulo"),
                        rs.getString("estado"),
                        rs.getString("ubicacion"));
                proyectos.add(py);
            }
        }
        return proyectos;
    }
}
