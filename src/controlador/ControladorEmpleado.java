package controlador;

import modelo.Empleado;
import modelo.EmpleadoDAO;
import vista.VistaEmpleado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class ControladorEmpleado implements ActionListener {

    EmpleadoDAO dao = new EmpleadoDAO();
    Empleado Empleado = new Empleado();
    VistaEmpleado vista = new VistaEmpleado();
    DefaultTableModel modelo = new DefaultTableModel();

    public ControladorEmpleado(VistaEmpleado vista) {
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

                Empleado nuevoEmpleado = new Empleado();
                nuevoEmpleado.setCedula(ced);
                nuevoEmpleado.setNombre(nom);
                nuevoEmpleado.setApellido(apel);
                nuevoEmpleado.setTelefono(tel);
                nuevoEmpleado.setFechaNacimiento(fecNac);
                nuevoEmpleado.setEmail(email);
                nuevoEmpleado.setCiudad(ciu);
                nuevoEmpleado.setDireccion(dir);

                int r = dao.agregar(nuevoEmpleado);
                if (r == 1) {
                    JOptionPane.showMessageDialog(vista, "Empleado Agregado con Éxito");
                    clear();
                    listar(vista.tablaCli);
                    nuevo();
                } else {
                    JOptionPane.showMessageDialog(vista, "Error al agregar el Empleado");
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

            Empleado.setCedula(ced);
            Empleado.setNombre(nom);
            Empleado.setApellido(apel);
            Empleado.setTelefono(tel);
            Empleado.setFechaNacimiento(fecNac);
            Empleado.setEmail(email);
            Empleado.setCiudad(ciu);
            Empleado.setDireccion(dir);

            int r = dao.actualizar(Empleado);
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
        List<Empleado> lista = dao.listar();
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

    public void buscarEmpleado() {
        if (vista.txtCedCli.getText().equals("")) {
            JOptionPane.showMessageDialog(vista, "Ingrese la cédula del Empleado a buscar");
        } else {
            int cedula = Integer.parseInt(vista.txtCedCli.getText());

            Empleado EmpleadoEncontrado = dao.buscarEmpleadoPorCedula(cedula);

            if (EmpleadoEncontrado != null) {
                // Mostrar los datos del Empleado en los campos de la vista
                vista.txtNomCli.setText(EmpleadoEncontrado.getNombre());
                vista.txtAplCli.setText(EmpleadoEncontrado.getApellido());
                vista.txtTelCli.setText(EmpleadoEncontrado.getTelefono());
                vista.txtFecNacCli.setText(EmpleadoEncontrado.getFechaNacimiento());
                vista.txtCorrElecCli.setText(EmpleadoEncontrado.getEmail());
                vista.txtCiuCli.setText(EmpleadoEncontrado.getCiudad());
                vista.txtDirCli.setText(EmpleadoEncontrado.getDireccion());
            } else {
                JOptionPane.showMessageDialog(vista, "Empleado no encontrado");
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
            buscarEmpleado();

        }

    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(vista, message);
    }
}
