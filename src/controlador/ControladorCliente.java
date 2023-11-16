package controlador;

import modelo.Cliente;
import modelo.ClienteDAO;
import vista.VistaCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class ControladorCliente implements ActionListener {

    ClienteDAO dao = new ClienteDAO();
    Cliente cliente = new Cliente();
    VistaCliente vista = new VistaCliente();
    DefaultTableModel modelo = new DefaultTableModel();

    public ControladorCliente(VistaCliente vista) {
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
        vista.txtFecNacCli.setText("");
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
        String cedText = vista.txtCedCli.getText();
        String nom = vista.txtNomCli.getText();
        String apel = vista.txtAplCli.getText();
        String tel = vista.txtTelCli.getText();
        String fecNac = vista.txtFecNacCli.getText();
        String email = vista.txtCorrElecCli.getText();
        String ciu = vista.txtCiuCli.getText();
        String dir = vista.txtDirCli.getText();

        if (cedText.isEmpty() || nom.isEmpty() || apel.isEmpty() || tel.isEmpty() || fecNac.isEmpty() || email.isEmpty() || ciu.isEmpty() || dir.isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Todos los campos son obligatorios. Complete la información.");
        } else {
            try {
                int ced = Integer.parseInt(cedText);

                Cliente nuevoCliente = new Cliente();
                nuevoCliente.setCedula(ced);
                nuevoCliente.setNombre(nom);
                nuevoCliente.setApellido(apel);
                nuevoCliente.setTelefono(tel);
                nuevoCliente.setFechaNacimiento(fecNac);
                nuevoCliente.setEmail(email);
                nuevoCliente.setCiudad(ciu);
                nuevoCliente.setDireccion(dir);

                int r = dao.agregar(nuevoCliente);
                if (r == 1) {
                    JOptionPane.showMessageDialog(vista, "Cliente Agregado con Éxito");
                    clear();
                    listar(vista.tablaCli);
                    nuevo();
                } else {
                    JOptionPane.showMessageDialog(vista, "Error al agregar el cliente");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(vista, "Ingrese un valor válido para la cédula.");
            }
        }
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
            String fecNac = vista.txtFecNacCli.getText();
            String email = vista.txtCorrElecCli.getText();
            String ciu = vista.txtCiuCli.getText();
            String dir = vista.txtDirCli.getText();

            cliente.setCedula(ced);
            cliente.setNombre(nom);
            cliente.setApellido(apel);
            cliente.setTelefono(tel);
            cliente.setFechaNacimiento(fecNac);
            cliente.setEmail(email);
            cliente.setCiudad(ciu);
            cliente.setDireccion(dir);

            int r = dao.actualizar(cliente);
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
        List<Cliente> lista = dao.listar();
        Object[] objeto = new Object[8];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getCedula();
            objeto[1] = lista.get(i).getNombre();
            objeto[2] = lista.get(i).getApellido();
            objeto[3] = lista.get(i).getTelefono();
            objeto[4] = lista.get(i).getFechaNacimiento();
            objeto[5] = lista.get(i).getEmail();
            objeto[6] = lista.get(i).getCiudad();
            objeto[7] = lista.get(i).getDireccion();
            modelo.addRow(objeto);
        }
        tabla.setRowHeight(35);
        tabla.setRowMargin(10);
    }

    public void buscarCliente() {
        if (vista.txtCedCli.getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "Ingrese la cédula del cliente a buscar");
        } else {
            int cedula = Integer.parseInt(vista.txtCedCli.getText());

            Cliente clienteEncontrado = dao.buscarClientePorCedula(cedula);

            if (clienteEncontrado != null) {
                // Mostrar los datos del cliente en los campos de la vista
                vista.txtNomCli.setText(clienteEncontrado.getNombre());
                vista.txtAplCli.setText(clienteEncontrado.getApellido());
                vista.txtTelCli.setText(clienteEncontrado.getTelefono());
                vista.txtFecNacCli.setText(clienteEncontrado.getFechaNacimiento());
                vista.txtCorrElecCli.setText(clienteEncontrado.getEmail());
                vista.txtCiuCli.setText(clienteEncontrado.getCiudad());
                vista.txtDirCli.setText(clienteEncontrado.getDireccion());
            } else {
                JOptionPane.showMessageDialog(vista, "Cliente no encontrado");
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
                String fecNac = (String) vista.tablaCli.getValueAt(fila, 4);
                String email = (String) vista.tablaCli.getValueAt(fila, 5);
                String ciu = (String) vista.tablaCli.getValueAt(fila, 6);
                String dir = (String) vista.tablaCli.getValueAt(fila, 7);

                vista.txtCedCli.setText("" + ced);
                vista.txtNomCli.setText(nom);
                vista.txtAplCli.setText(apel);
                vista.txtTelCli.setText(tel);
                vista.txtFecNacCli.setText(fecNac);
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
            buscarCliente();

        }

    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(vista, message);
    }
}
