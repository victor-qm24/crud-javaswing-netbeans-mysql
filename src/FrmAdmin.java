
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import modelo.TipoDocumento;
import modelo.TipoDocumentoDAO;
import modelo.Usuario;
import modelo.UsuarioDAO;
import modelo.Proyecto;
import modelo.ProyectoDAO;
import modelo.Rol;
import modelo.RolDAO;

public class FrmAdmin extends javax.swing.JFrame {

    private final TipoDocumentoDAO tipoDocumentoDAO;
    private final UsuarioDAO usuarioDAO;
    private final ProyectoDAO proyectoDAO;
    private final RolDAO rolDAO;
    DefaultListModel<Usuario> listModel = new DefaultListModel();

    public FrmAdmin() {
        tipoDocumentoDAO = new TipoDocumentoDAO();
        usuarioDAO = new UsuarioDAO();
        proyectoDAO = new ProyectoDAO();
        rolDAO = new RolDAO();

        initComponents();
        loadTiposDocumento();
        loadProyectos();
        loadRoles();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelUsuarios = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnAgregarUsuario = new javax.swing.JButton();
        comboTipoDocumento = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        comboProyecto = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnActualizarUsuario = new javax.swing.JButton();
        btnEliminarUsuario = new javax.swing.JButton();
        btnBuscarUsuario = new javax.swing.JButton();
        btnListarUsuarios = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listUsuarios = new javax.swing.JList<>();
        btnInactivarUsuario = new javax.swing.JButton();
        txtApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        comboEstado = new javax.swing.JComboBox<>();
        comboRol = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        labelWelcome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelUsuarios.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setText("Nombre");

        jLabel2.setText("Email");

        jLabel3.setText("Tipo de documento");

        btnAgregarUsuario.setText("Agregar Usuario");
        btnAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUsuarioActionPerformed(evt);
            }
        });

        comboTipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoDocumentoActionPerformed(evt);
            }
        });

        jLabel4.setText("Proyecto");

        comboProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProyectoActionPerformed(evt);
            }
        });

        jLabel5.setText("Id");

        btnActualizarUsuario.setText("Actualizar Usuario");
        btnActualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarUsuarioActionPerformed(evt);
            }
        });

        btnEliminarUsuario.setText("Eliminar Usuario");
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });

        btnBuscarUsuario.setText("Buscar Usuario");
        btnBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUsuarioActionPerformed(evt);
            }
        });

        btnListarUsuarios.setText("Listar Usuarios");
        btnListarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarUsuariosActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listUsuarios);

        btnInactivarUsuario.setText("Inactivar Usuario");
        btnInactivarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInactivarUsuarioActionPerformed(evt);
            }
        });

        jLabel6.setText("Apellido");

        txtDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoActionPerformed(evt);
            }
        });

        jLabel7.setText("Documento");

        jLabel8.setText("Telefono");

        jLabel9.setText("Usuario");

        jLabel10.setText("Contraseña");

        jLabel11.setText("Estado");

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));

        jLabel12.setText("Rol");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelUsuariosLayout = new javax.swing.GroupLayout(jPanelUsuarios);
        jPanelUsuarios.setLayout(jPanelUsuariosLayout);
        jPanelUsuariosLayout.setHorizontalGroup(
            jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuariosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUsuariosLayout.createSequentialGroup()
                        .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre)
                            .addComponent(txtApellido)
                            .addComponent(comboTipoDocumento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDocumento)
                            .addComponent(txtEmail)
                            .addComponent(txtTelefono)
                            .addComponent(txtUsuario)
                            .addComponent(txtContraseña)
                            .addComponent(comboEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelUsuariosLayout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(comboProyecto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboRol, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUsuariosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAgregarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnActualizarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnListarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInactivarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(124, 124, 124))))
        );
        jPanelUsuariosLayout.setVerticalGroup(
            jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelUsuariosLayout.createSequentialGroup()
                        .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(comboProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addGap(27, 27, 27)
                .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarUsuario)
                    .addComponent(btnActualizarUsuario)
                    .addComponent(btnEliminarUsuario))
                .addGap(18, 18, 18)
                .addGroup(jPanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarUsuario)
                    .addComponent(btnListarUsuarios)
                    .addComponent(btnInactivarUsuario))
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar)
                .addContainerGap())
        );

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setText("Formulario para CRUD de USUARIOS");

        labelWelcome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(115, 115, 115))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(labelWelcome)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUsuarioActionPerformed
        agregarUsuario();
    }//GEN-LAST:event_btnAgregarUsuarioActionPerformed

    private void comboTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoDocumentoActionPerformed

    private void comboProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProyectoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboProyectoActionPerformed

    private void btnActualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarUsuarioActionPerformed
        actualizarUsuario();
    }//GEN-LAST:event_btnActualizarUsuarioActionPerformed

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
        eliminarUsuario();
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    private void btnBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUsuarioActionPerformed
        buscarUsuario();
    }//GEN-LAST:event_btnBuscarUsuarioActionPerformed

    private void btnListarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarUsuariosActionPerformed
        listarUsuarios();
    }//GEN-LAST:event_btnListarUsuariosActionPerformed

    private void btnInactivarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInactivarUsuarioActionPerformed
        inactivarUsuario();
    }//GEN-LAST:event_btnInactivarUsuarioActionPerformed

    private void txtDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void loadTiposDocumento() {
        try {
            List<TipoDocumento> tipos = tipoDocumentoDAO.obtenerTiposDocumento();
            for (TipoDocumento tipo : tipos) {
                comboTipoDocumento.addItem(tipo);
            }
        } catch (SQLException e) {
        }
    }

    private void loadProyectos() {
        try {
            List<Proyecto> proyectos = proyectoDAO.obtenerProyecto();
            for (Proyecto proyecto : proyectos) {
                comboProyecto.addItem(proyecto);
            }
        } catch (SQLException e) {
        }

    }

    private void loadRoles() {
        try {
            List<Rol> roles = rolDAO.obtenerRol();
            for (Rol rol : roles) {
                comboRol.addItem(rol);
            }
        } catch (SQLException e) {
        }

    }

    private void agregarUsuario() {
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String documento = txtDocumento.getText();
        String email = txtEmail.getText();
        String telefono = txtTelefono.getText();
        String usuario = txtUsuario.getText();
        String contraseña = txtContraseña.getText();
        String estado = (String) comboEstado.getSelectedItem();

        TipoDocumento tipoDocumento = (TipoDocumento) comboTipoDocumento.getSelectedItem();
        Proyecto proyecto = (Proyecto) comboProyecto.getSelectedItem();
        Rol rol = (Rol) comboRol.getSelectedItem();

        if (tipoDocumento != null && proyecto != null && rol != null) {
            try {
                usuarioDAO.agregarUsuario(new Usuario(0, nombre, apellido,
                        documento, email, telefono, usuario, contraseña, estado,
                        tipoDocumento.getId(), proyecto.getId(), rol.getId()));
                limpiar();
            } catch (SQLException e) {
            }
        }
    }

    private void actualizarUsuario() {
        String idString = txtId.getText();
        if (!idString.isEmpty()) {
            int id = Integer.parseInt(idString);
            String nombre = txtNombre.getText();
            String apellido = txtApellido.getText();
            String documento = txtDocumento.getText();
            String email = txtEmail.getText();
            String telefono = txtTelefono.getText();
            String usuario = txtUsuario.getText();
            String contraseña = txtContraseña.getText();
            String estado = (String) comboEstado.getSelectedItem();
            TipoDocumento tipoDocumento = 
                    (TipoDocumento) comboTipoDocumento.getSelectedItem();
            Proyecto proyecto = (Proyecto) comboProyecto.getSelectedItem();
            Rol rol = (Rol) comboRol.getSelectedItem();

            if (tipoDocumento != null && proyecto != null) {
                try {
                    usuarioDAO.actualizarUsuario(new Usuario(id, nombre, 
                            apellido,documento, email, telefono, usuario, 
                            contraseña, estado,tipoDocumento.getId(), 
                            proyecto.getId(), rol.getId()));
                    JOptionPane.showMessageDialog(this, 
                            "Usuario actualizado exitosamente.");                    
                    limpiar();
                } catch (SQLException e) {
                }
            } else {
                JOptionPane.showMessageDialog(this, 
                        "Por favor seleccione un tipo de documento.");
            }
        } else {
            JOptionPane.showMessageDialog(this, 
                    "Por favor seleccione un usuario para actualizar.");
        }
    }

    private void eliminarUsuario() {

        String idString = txtId.getText();
        if (!idString.isEmpty()) {
            int id = Integer.parseInt(idString);
            try {
                usuarioDAO.eliminarUsuario(id);
                JOptionPane.showMessageDialog(this, 
                        "Usuario eliminado exitosamente.");
                limpiar();
            } catch (SQLException e) {
            }
        } else {
            JOptionPane.showMessageDialog(this, 
                    "Por favor seleccione un usuario para eliminar.");
        }
    }

    private void buscarUsuario() {
        listUsuarios.setModel(listModel);
        listModel.clear();
        String idStr = txtId.getText();
        if (!idStr.isEmpty()) {
            int id = Integer.parseInt(idStr);
            try {
                Usuario usuario = usuarioDAO.buscarUsuario(id);
                if (usuario != null) {
                    List<Usuario> users = new ArrayList<>();
                    users.add(usuario);
                    for(Usuario user:users){listModel.addElement(user);}
                    txtId.setText(String.valueOf(usuario.getId()));
                    txtNombre.setText(usuario.getNombre());
                    txtApellido.setText(usuario.getApellido());
                    txtDocumento.setText(usuario.getDocumento());
                    txtEmail.setText(usuario.getEmail());
                    txtTelefono.setText(usuario.getTelefono());
                    txtUsuario.setText(usuario.getUsuario());
                    txtContraseña.setText(usuario.getContraseña());
                    comboEstado.setSelectedItem(usuario.getEstado());
                    comboTipoDocumento.setSelectedItem(
                            new TipoDocumento(usuario.getTipoDocumentoId(), 
                                    ""));
                    comboProyecto.setSelectedItem(new Proyecto(
                            usuario.getProyectoId(), "", "", 
                            ""));
                    comboRol.setSelectedItem(new Rol(usuario.getRolId(), 
                            ""));
                } else {
                    JOptionPane.showMessageDialog(this, 
                            "Usuario no encontrado.");
                }
            } catch (SQLException e) {
            }
        } else {
            JOptionPane.showMessageDialog(this, 
                    "Por favor ingrese un ID para buscar.");
        }
    }

    private void listarUsuarios() {

        listUsuarios.setModel(listModel);
        listModel.clear();
        try {
            List<Usuario> usuarios = usuarioDAO.obtenerUsuarios();
            for (Usuario usuario : usuarios) {
                listModel.addElement(usuario);
            }
        } catch (SQLException e) {
        }
    }

    private void inactivarUsuario() {
        String idString = txtId.getText();
        if (!idString.isEmpty()) {
            try {
                int id = Integer.parseInt(idString);
                String estado = "Inactivo";
                usuarioDAO.inactivarUsuario(id, estado);
                JOptionPane.showMessageDialog(this, 
                        "Usuario actualizado exitosamente.");
                limpiar();
            } catch (SQLException ex) {
                Logger.getLogger(FrmAdmin.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, 
                    "Por favor seleccione un usuario para actualizar.");
        }
    }

    private void limpiar() {
        txtId.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtDocumento.setText("");
        txtEmail.setText("");
        txtTelefono.setText("");
        txtUsuario.setText("");
        txtContraseña.setText("");
        listModel.clear();
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            //new FrmAdmin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActualizarUsuario;
    public javax.swing.JButton btnAgregarUsuario;
    public javax.swing.JButton btnBuscarUsuario;
    public javax.swing.JButton btnEliminarUsuario;
    public javax.swing.JButton btnInactivarUsuario;
    public javax.swing.JButton btnLimpiar;
    public javax.swing.JButton btnListarUsuarios;
    public javax.swing.JComboBox<String> comboEstado;
    public javax.swing.JComboBox<Proyecto> comboProyecto;
    public javax.swing.JComboBox<Rol> comboRol;
    public javax.swing.JComboBox<TipoDocumento> comboTipoDocumento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelUsuarios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelWelcome;
    public javax.swing.JList<Usuario> listUsuarios;
    public javax.swing.JTextField txtApellido;
    public javax.swing.JTextField txtContraseña;
    public javax.swing.JTextField txtDocumento;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JTextField txtId;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtTelefono;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
