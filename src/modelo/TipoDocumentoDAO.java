/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author quina
 */
public class TipoDocumentoDAO {
    
    public List<TipoDocumento> obtenerTiposDocumento() throws SQLException {
        List<TipoDocumento> tipos = new ArrayList<>();
        String sql = "SELECT * FROM TipoDocumento";
        try (Connection conn = ConexionBD.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                TipoDocumento tipo = new TipoDocumento(rs.getInt("id"), rs.getString("descripcion_tipo"));
                tipos.add(tipo);
            }
        }
        return tipos;
    }
}
