/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Rol {
    private final int id;
    private final String descripcion_rol;

    public Rol(int id, String descripcion_rol) {
        this.id = id;
        this.descripcion_rol = descripcion_rol;
    }

    public int getId() { return id; }
    public String getDescripcion_rol() { return descripcion_rol; }    
    
    @Override
    public String toString() {
        return descripcion_rol;
    }
}
