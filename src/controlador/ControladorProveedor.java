package controlador;

import modelo.Proveedor;
import modelo.ProveedorDAO;
import vista.VistaProveedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class ControladorProveedor implements ActionListener {

    ProveedorDAO dao = new ProveedorDAO();
    Proveedor Proveedor = new Proveedor();
    VistaProveedor vista = new VistaProveedor();
    DefaultTableModel modelo = new DefaultTableModel();

    public ControladorProveedor(VistaProveedor vista) {
        this.vista = vista;
        this.vista.btnListarCli.addActionListener(this);
        this.vista.btnAgregarCli.addActionListener(this);
        this.vista.btnActuCli.addActionListener(this);
        this.vista.btnElimiCli.addActionListener(this);
        this.vista.btnRegisCli.addActionListener(this);
        this.vista.btnBuscaCli.addActionListener(this);
        this.vista.btnConfirmActCli.addActionListener(this);
    }

    public void nuevo() {
        vista.txtCedCli.setText("");
        vista.txtNomCli.setText("");
        vista.txtAplCli.setText("");
        vista.txtTelCli.setText("");
        vista.txtCorrElecCli.setText("");
        vista.txtCiuCli.setText("");
        vista.txtDirCli.setText("");
        vista.txtNomCli.requestFocus();
    }

    public void clear() {
        for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    public void delete() {
        int fila = vista.tablaCli.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Seleccione una fila");
        } else {
            int id = Integer.parseInt((String) vista.tablaCli.getValueAt(fila, 0).toString());
            dao.Delete(id);
            System.out.println("El resultado es: " + id);
            JOptionPane.showMessageDialog(vista, "Usuario Eliminado");
        }
        clear();
    }

    public void add() {
    Proveedor nuevoProveedor = new Proveedor(); // Crear un nuevo objeto Estudiante
    int ced = Integer.parseInt(vista.txtCedCli.getText());
    String nom = vista.txtNomCli.getText();
    String apel = vista.txtAplCli.getText();
    String tel = vista.txtTelCli.getText();
    String email = vista.txtCorrElecCli.getText();
    String ciu = vista.txtCiuCli.getText();
    String dir = vista.txtDirCli.getText();
    
    nuevoProveedor.setNit(ced);
    nuevoProveedor.setNombre(nom);
    nuevoProveedor.setApellido(apel);
    nuevoProveedor.setTelefono(tel);
    nuevoProveedor.setEmail(email);
    nuevoProveedor.setCiudad(ciu);
    nuevoProveedor.setDireccion(dir);
    
    int r = dao.agregar(nuevoProveedor);
    if (r == 1) {
        JOptionPane.showMessageDialog(vista, "Proveedor Agregado con Exito");
    } else {
        JOptionPane.showMessageDialog(vista, "Error");
    }
    clear();
}


    public void Actualizar() {
        if (vista.txtCedCli.getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "Se sugiere que el usuario seleccione "
                    + "la opción \"Actualizar\" para solucionar el problema. ");

        } else {
            int ced = Integer.parseInt(vista.txtCedCli.getText());
            String nom = vista.txtNomCli.getText();
            String apel = vista.txtAplCli.getText();
            String tel = vista.txtTelCli.getText();
            String email = vista.txtCorrElecCli.getText();
            String ciu = vista.txtCiuCli.getText();
            String dir = vista.txtDirCli.getText();

            Proveedor.setNit(ced);
            Proveedor.setNombre(nom);
            Proveedor.setApellido(apel);
            Proveedor.setTelefono(tel);
            Proveedor.setEmail(email);
            Proveedor.setCiudad(ciu);
            Proveedor.setDireccion(dir);
            
            int r = dao.actualizar(Proveedor);
            if (r == 1) {
                JOptionPane.showMessageDialog(vista, "Usuario Actualizado con Exito");
            } else {
                JOptionPane.showMessageDialog(vista, "Error");
            }

        }
        clear();
    }

    void centrarCeldas(JTable tabla) {
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < vista.tablaCli.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(tcr);
        }
    }

    public void listar(JTable tabla) {
        centrarCeldas(tabla);
        modelo = (DefaultTableModel) tabla.getModel();
        tabla.setModel(modelo);
        clear();
        List<Proveedor> lista = dao.listar();
        Object[] objeto = new Object[7];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getNit();
            objeto[1] = lista.get(i).getNombre();
            objeto[2] = lista.get(i).getApellido();
            objeto[3] = lista.get(i).getTelefono();
            objeto[4] = lista.get(i).getEmail();
            objeto[5] = lista.get(i).getCiudad();
            objeto[6] = lista.get(i).getDireccion();
            modelo.addRow(objeto);
        }
        tabla.setRowHeight(35);
        tabla.setRowMargin(10);
    }
    public void buscarProveedor() {
    if (vista.txtCedCli.getText().equals("")) {
        JOptionPane.showMessageDialog(vista, "Ingrese la cédula del Proveedor a buscar");
    } else {
        int nit = Integer.parseInt(vista.txtCedCli.getText());

        Proveedor ProveedorEncontrado = dao.buscarProveedorPorNit(nit);
        
        if (ProveedorEncontrado != null) {
            // Mostrar los datos del Proveedor en los campos de la vista
            vista.txtNomCli.setText(ProveedorEncontrado.getNombre());
            vista.txtAplCli.setText(ProveedorEncontrado.getApellido());
            vista.txtTelCli.setText(ProveedorEncontrado.getTelefono());
            vista.txtCorrElecCli.setText(ProveedorEncontrado.getEmail());
            vista.txtCiuCli.setText(ProveedorEncontrado.getCiudad());
            vista.txtDirCli.setText(ProveedorEncontrado.getDireccion());
        } else {
            JOptionPane.showMessageDialog(vista, "Proveedor no encontrado");
        }
    }
    clear();
}


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnListarCli) {
            clear();
            listar(vista.tablaCli);
            nuevo();
        }
        if (e.getSource() == vista.btnAgregarCli) {
            add();
            listar(vista.tablaCli);
            nuevo();
        }
        if (e.getSource() == vista.btnActuCli) {
            int fila = vista.tablaCli.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(vista, "Seleccione una Fila");
            } else {
                
                int ced = Integer.parseInt((String) vista.tablaCli.getValueAt(fila, 0).toString());
                String nom = (String) vista.tablaCli.getValueAt(fila, 1);
                String apel = (String) vista.tablaCli.getValueAt(fila, 2);
                String tel = (String) vista.tablaCli.getValueAt(fila, 3);
                String email = (String) vista.tablaCli.getValueAt(fila, 4);
                String ciu = (String) vista.tablaCli.getValueAt(fila, 5);
                String dir = (String) vista.tablaCli.getValueAt(fila, 6);

                vista.txtCedCli.setText("" + ced);
                vista.txtNomCli.setText(nom);
                vista.txtAplCli.setText(apel);
                vista.txtTelCli.setText(tel);
                vista.txtCorrElecCli.setText(email);
                vista.txtCiuCli.setText(ciu);
                vista.txtDirCli.setText(dir);
            }
        }
        
        if (e.getSource() == vista.btnConfirmActCli) {
            Actualizar();
            listar(vista.tablaCli);
            nuevo();
        }
        
        if (e.getSource() == vista.btnElimiCli) {
            delete();
            listar(vista.tablaCli);
            nuevo();
        }
        if (e.getSource() == vista.btnRegisCli) {
            nuevo();
        }
        
        if (e.getSource() == vista.btnBuscaCli) {
            buscarProveedor();
            
        }

    }
}

