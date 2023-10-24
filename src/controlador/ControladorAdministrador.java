package controlador;

import modelo.Administrador;
import modelo.AdministradorDAO;
import vista.VistaSingUp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.sql.*;

public class ControladorAdministrador implements ActionListener {

    AdministradorDAO dao = new AdministradorDAO();
    Administrador Administrador = new Administrador();
    VistaSingUp vista = new VistaSingUp();
    DefaultTableModel modelo = new DefaultTableModel();

    public ControladorAdministrador(){
        
    }
    public ControladorAdministrador(VistaSingUp vista) {
        this.vista = vista;
        this.vista.btnCancel.addActionListener(this);
        this.vista.btnRegis.addActionListener(this);
    }

    public void nuevo() {
        vista.txtUsua.setText("");
        vista.txtCed.setText("");
        vista.jPasswordField.setText("");
    }
    public int obtenerIdUsuarioActual(Connection con, String nombreUsuario) throws SQLException {
        int idUsuario = -1;  // Valor predeterminado si no se encuentra el usuario

        String query = "SELECT id FROM usuarios WHERE nombre = ?";

        try (PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, nombreUsuario);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    idUsuario = rs.getInt("id");
                }
            }
        }

        return idUsuario;
    }


    public void add() {
    Administrador nuevoAdministrador = new Administrador(); // Crear un nuevo objeto Estudiante
    int ced = Integer.parseInt(vista.txtCed.getText());
    String nom= vista.txtUsua.getText();
    String con = vista.jPasswordField.getText();
    
    nuevoAdministrador.setCedula(ced);
    nuevoAdministrador.setUsuario(nom);
    nuevoAdministrador.setContrasena(con);
    int r = dao.agregar(nuevoAdministrador);
    if (r == 1) {
        JOptionPane.showMessageDialog(vista, "Administrador Agregado con Exito");
    } else {
        JOptionPane.showMessageDialog(vista, "Error");
    }
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnRegis) {
            add();
            nuevo();
        }     

    }
}
