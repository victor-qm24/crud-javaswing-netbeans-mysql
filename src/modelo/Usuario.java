
package modelo;

public class Usuario {
    private final int id;
    private final String nombre;
    private final String apellido;
    private final String documento;    
    private final String email;
    private final String telefono;
    private final String usuario;    
    private final String contraseña;
    private final String estado;    
    private final int tipoDocumentoId;
    private final int proyectoId;
    private final int rolId;
        
    /*public Usuario(int id, String nombre, String email, int tipoDocumentoId, 
                int proyectoId) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.tipoDocumentoId = tipoDocumentoId;
        this.proyectoId = proyectoId;
        
    }*/

    public Usuario(int id, String nombre, String apellido, String documento, 
            String email, String telefono, String usuario, String contraseña, 
            String estado, int tipoDocumentoId, int proyectoId, int rolId) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.email = email;
        this.telefono = telefono;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.estado = estado;
        this.tipoDocumentoId = tipoDocumentoId;
        this.proyectoId = proyectoId;
        this.rolId = rolId;
    }
        
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getDocumento() { return documento; }
    public String getEmail() { return email; }
    public String getTelefono() { return telefono; }
    public String getUsuario() { return usuario; }
    public String getContraseña() { return contraseña; }
    public String getEstado() { return estado; }
    public int getTipoDocumentoId() { return tipoDocumentoId; }
    public int getProyectoId() { return proyectoId; }    
    public int getRolId() { return rolId; }
    
    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Apellido: " + apellido 
                + ", Documento: " + documento + ", Email: " + email + ", "
                + "Telefono: " + telefono +", Usuario: " + usuario + ", "
                + "Contraseña: " + contraseña + ", Estado: " + estado;
    }
}
