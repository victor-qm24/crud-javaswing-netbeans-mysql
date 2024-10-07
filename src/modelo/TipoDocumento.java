/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


public class TipoDocumento {
    private final int id;
    private final String descripcion_tipo;

    public TipoDocumento(int id, String descripcion_tipo) {
        this.id = id;
        this.descripcion_tipo = descripcion_tipo;
    }

    public int getId() { return id; }
    public String getDescripcion_tipo() { return descripcion_tipo; }
    
    @Override
    public String toString() {
        return descripcion_tipo;
    }
}
