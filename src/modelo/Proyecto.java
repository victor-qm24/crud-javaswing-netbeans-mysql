/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


public class Proyecto {
    private int id;
    private String titulo;
    private String estado;
    private String ubicacion;
    
    public Proyecto(int id, String titulo, String estado, String ubicacion){
        this.id = id;
        this.titulo = titulo;
        this.estado = estado;
        this.ubicacion = ubicacion;
    }

    public Proyecto(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }
    
    public int getId() { return id; }
    public String getTitulo() {return titulo;}
    public String getEstado() {return estado;}
    public String getUbicacion() {return ubicacion;}
    
    @Override
    public String toString() {
        return titulo;
    }
    
}
