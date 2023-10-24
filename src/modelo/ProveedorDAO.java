/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class ProveedorDAO { // Declaración de la clase EstudianteDAO
    
    PreparedStatement ps;
   ResultSet rs;
   Connection con;
   Conexion conectar = new Conexion();
   Proveedor p = new Proveedor();
   
   
   public List listar(){
       List<Proveedor> datos = new ArrayList<>();
       try {
            con = conectar.getConnection(); // Establece una conexión con la base de datos utilizando el método getConnection de la clase Conexion
            ps = con.prepareStatement("select * from zapateria.Proveedor"); // Prepara la consulta a la base de datos utilizando el método prepareStatement de la clase Connection
            rs = ps.executeQuery(); // Ejecuta la consulta a la base de datos utilizando el método executeQuery de la clase PreparedStatement y almacena los resultados en la variable rs
            while(rs.next()){ // Inicio del bucle while que recorre todos los registros devueltos por la consulta
                Proveedor p = new Proveedor(); 
                p.setNit(rs.getInt(1)); // Asignación del valor del primer campo del registro a la propiedad id del objeto Estudiante
                p.setNombre(rs.getString(2)); 
                p.setApellido(rs.getString(3)); 
                p.setTelefono(rs.getString(4));
                p.setEmail(rs.getString(5));  // Asignación del valor del cuarto campo del registro a la propiedad telefono del objeto Estudiante
                p.setCiudad(rs.getString(6));  // Asignación del valor del cuarto campo del registro a la propiedad telefono del objeto Estudiante
                p.setDireccion(rs.getString(7));  // Asignación del valor del cuarto campo del registro a la propiedad telefono del objeto Estudiante
                datos.add(p); // Agrega el objeto Estudiante a la lista datos
            }
        } catch (Exception e) { // Captura y manejo de excepciones
            
        }        
        return datos; // Devuelve la lista de objetos Estudiante
    }   
    
    public int agregar(Proveedor per){
        int r=0;
        String sql = "insert into Proveedor(nit, nombre, apellido, telefono, email, ciudad, empresa)values(?,?,?,?,?,?,?)";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, per.getNit());
            ps.setString(2, per.getNombre());
            ps.setString(3, per.getApellido());
            ps.setString(4, per.getTelefono());
            ps.setString(5, per.getEmail());
            ps.setString(6, per.getCiudad());
            ps.setString(7, per.getDireccion());
            r = ps.executeUpdate();
            if(r==1){
                return 1;
            } else{
                return 0;
            }
                      
        } catch (Exception e) {
            System.out.println(e);
        }
    return r;
    }
    
    public int actualizar(Proveedor per){
        int r =0;
        String sql = "UPDATE zapateria.Proveedor SET nombre = ?, apellido = ?, telefono=?, email = ?, ciudad = ?, empresa = ? WHERE nit = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, per.getNombre());
            ps.setString(2, per.getApellido());
            ps.setString(3, per.getTelefono());
            ps.setString(4, per.getEmail());
            ps.setString(5, per.getCiudad());
            ps.setString(6, per.getDireccion());
            ps.setInt(7, per.getNit());
            r = ps.executeUpdate();
            if(r==1){
                return 1;
            } else{
                return 0;
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return r;
    }
    
    public int Delete(int id){
        int r =0;
        String sql = "delete from zapateria.Proveedor where nit =" + id;
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            r = ps.executeUpdate();
            
        } catch (Exception e) {
        }
        return r;
    }
    public Proveedor buscarProveedorPorNit(int nit) {
    Proveedor Proveedor = null;
    String sql = "SELECT * FROM Proveedor WHERE nit = ?";
    try {
        con = conectar.getConnection();
        ps = con.prepareStatement(sql);
        ps.setInt(1, nit);
        rs = ps.executeQuery();

        if (rs.next()) {
            Proveedor = new Proveedor();
            Proveedor.setNit(rs.getInt("nit"));
            Proveedor.setNombre(rs.getString("nombre"));
            Proveedor.setApellido(rs.getString("apellido"));
            Proveedor.setTelefono(rs.getString("telefono"));
            Proveedor.setEmail(rs.getString("email"));
            Proveedor.setCiudad(rs.getString("ciudad"));
            Proveedor.setDireccion(rs.getString("empresa"));
        }
    } catch (Exception e) {
        System.out.println(e);
     }
    return Proveedor;
}
    
}
