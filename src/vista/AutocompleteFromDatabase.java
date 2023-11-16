/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class AutocompleteFromDatabase extends JFrame {
    private JComboBox<String> comboBox;
    private List<String> options;
    private JTextField textField;
    private Connection connection;

    public AutocompleteFromDatabase() {
        options = new ArrayList<>();

        // Establecer la conexión a la base de datos (asegúrate de modificar la URL, usuario y contraseña según tu configuración)
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/zapateria", "root", "admin");
            loadOptionsFromDatabase();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        comboBox = new JComboBox<>(options.toArray(new String[0]));

        textField = new JTextField(20);
        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateComboBox();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateComboBox();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateComboBox();
            }
        });

        setLayout(new java.awt.FlowLayout());
        add(comboBox);
        add(textField);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void loadOptionsFromDatabase() {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT cedula FROM cliente");

            while (resultSet.next()) {
                options.add(resultSet.getString("cedula"));
            }

            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void updateComboBox() {
        String prefix = textField.getText();
        List<String> filteredOptions = new ArrayList<>();

        for (String option : options) {
            if (option.startsWith(prefix)) {
                filteredOptions.add(option);
            }
        }

        comboBox.setModel(new DefaultComboBoxModel<>(filteredOptions.toArray(new String[0])));
        comboBox.setPopupVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AutocompleteFromDatabase());
    }
}