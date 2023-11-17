package controlador;

import modelo.Producto;
import modelo.ProductoDAO;
import vista.VistaBuscarProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import vista.VistaFactura;
import vista.VistaInventario;

public class ControladorProducto implements ActionListener {

    ProductoDAO dao = new ProductoDAO();
    Producto Producto = new Producto();
    VistaInventario vista = new VistaInventario();
    VistaBuscarProducto VistaProducto = new VistaBuscarProducto();
    DefaultTableModel modelo = new DefaultTableModel();

    public ControladorProducto(VistaInventario vista) {
        this.vista = vista;
        this.vista.btnListarCli.addActionListener(this);
        this.vista.btnAgregarCli.addActionListener(this);
        this.vista.btnActuCli.addActionListener(this);
        this.vista.btnElimiCli.addActionListener(this);
        this.vista.btnRegisCli.addActionListener(this);
        this.vista.btnBuscaCli.addActionListener(this);
        this.vista.btnConfirmActCli.addActionListener(this);
    }
    public ControladorProducto(VistaBuscarProducto vistaF){
        this.VistaProducto = vistaF;
        this.VistaProducto.btnBuscarProduc.addActionListener(this);
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
        vista.txtDirCli1.setText("");
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
    Producto nuevoProducto = new Producto(); // Crear un nuevo objeto Estudiante
    int ced = Integer.parseInt(vista.txtCedCli.getText());
    String nom = vista.txtNomCli.getText();
    String apel = vista.txtAplCli.getText();
    String tel = vista.txtTelCli.getText();
    String fecNac = vista.txtFecNacCli.getText();
    String email = vista.txtCorrElecCli.getText();
    Double ciu = Double.parseDouble(vista.txtCiuCli.getText());
    Double dir = Double.parseDouble(vista.txtDirCli.getText());
    int dir1 = Integer.parseInt(vista.txtDirCli1.getText());
    
    nuevoProducto.setReferencia(ced);
    nuevoProducto.setNombre(nom);
    nuevoProducto.setTalla(apel);
    nuevoProducto.setGenero(tel);
    nuevoProducto.setColor(fecNac);
    nuevoProducto.setCategoria(email);
    nuevoProducto.setPrecio_unitario(ciu);
    nuevoProducto.setValor_unitario(dir);
    nuevoProducto.setCantidad(dir1);
    int r = dao.agregar(nuevoProducto);
    if (r == 1) {
        JOptionPane.showMessageDialog(vista, "Producto Agregado con Exito");
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
            String fecNac = vista.txtFecNacCli.getText();
            String email = vista.txtCorrElecCli.getText();
            Double ciu = Double.parseDouble(vista.txtCiuCli.getText());
            Double dir = Double.parseDouble(vista.txtDirCli.getText());
            int dir1 = Integer.parseInt(vista.txtDirCli1.getText());

            Producto.setReferencia(ced);
            Producto.setNombre(nom);
            Producto.setTalla(apel);
            Producto.setGenero(tel);
            Producto.setColor(fecNac);
            Producto.setCategoria(email);
            Producto.setPrecio_unitario(ciu);
            Producto.setValor_unitario(dir);
            Producto.setCantidad(dir1);
            
            int r = dao.actualizar(Producto);
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
        List<Producto> lista = dao.listar();
        Object[] objeto = new Object[9];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getReferencia();
            objeto[1] = lista.get(i).getNombre();
            objeto[2] = lista.get(i).getTalla();
            objeto[3] = lista.get(i).getGenero();
            objeto[4] = lista.get(i).getColor();
            objeto[5] = lista.get(i).getCategoria();
            objeto[6] = lista.get(i).getPrecio_unitario();
            objeto[7] = lista.get(i).getValor_unitario();
            objeto[8] = lista.get(i).getCantidad();
            modelo.addRow(objeto);
        }
        tabla.setRowHeight(35);
        tabla.setRowMargin(10);
    }
    public void buscarProducto() {
    if (vista.txtCedCli.getText().equals("")) {
        JOptionPane.showMessageDialog(vista, "Ingrese la referencia del Producto a buscar");
    } else {
        int referencia = Integer.parseInt(vista.txtCedCli.getText());

        Producto ProductoEncontrado = dao.buscarProductoPorReferencia(referencia);
        
        if (ProductoEncontrado != null) {
            // Mostrar los datos del Producto en los campos de la vista
            vista.txtNomCli.setText(ProductoEncontrado.getNombre());
            vista.txtAplCli.setText(ProductoEncontrado.getTalla());
            vista.txtTelCli.setText(ProductoEncontrado.getGenero());
            vista.txtFecNacCli.setText(ProductoEncontrado.getColor());
            vista.txtCorrElecCli.setText(ProductoEncontrado.getCategoria());
            vista.txtCiuCli.setText(String.valueOf(ProductoEncontrado.getPrecio_unitario()));
            vista.txtDirCli.setText(String.valueOf(ProductoEncontrado.getValor_unitario()));
            vista.txtDirCli1.setText(String.valueOf(ProductoEncontrado.getCantidad()));

        } else {
            JOptionPane.showMessageDialog(vista, "Producto no encontrado");
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
                String fecNac = (String) vista.tablaCli.getValueAt(fila,4);
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
            buscarProducto();            
        }

    }
}
