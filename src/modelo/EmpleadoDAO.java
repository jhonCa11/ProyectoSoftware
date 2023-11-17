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

public class EmpleadoDAO { // Declaración de la clase EstudianteDAO
    
    PreparedStatement ps;
   ResultSet rs;
   Connection con;
   Conexion conectar = new Conexion();
   Empleado p = new Empleado();
   
   
   public List listar(){
       List<Empleado> datos = new ArrayList<>();
       try {
            con = conectar.getConnection(); // Establece una conexión con la base de datos utilizando el método getConnection de la clase Conexion
            ps = con.prepareStatement("select * from empleado"); // Prepara la consulta a la base de datos utilizando el método prepareStatement de la clase Connection
            rs = ps.executeQuery(); // Ejecuta la consulta a la base de datos utilizando el método executeQuery de la clase PreparedStatement y almacena los resultados en la variable rs
            while(rs.next()){ // Inicio del bucle while que recorre todos los registros devueltos por la consulta
                Empleado p = new Empleado(); 
                p.setCedula(rs.getInt(1)); // Asignación del valor del primer campo del registro a la propiedad id del objeto Estudiante
                p.setNombre(rs.getString(2)); 
                p.setApellido(rs.getString(3)); 
                p.setTelefono(rs.getString(4));
                p.setFechaNacimiento(rs.getString(5));
                p.setEmail(rs.getString(6));  // Asignación del valor del cuarto campo del registro a la propiedad telefono del objeto Estudiante
                p.setCiudad(rs.getString(7));  // Asignación del valor del cuarto campo del registro a la propiedad telefono del objeto Estudiante
                p.setDireccion(rs.getString(8));  // Asignación del valor del cuarto campo del registro a la propiedad telefono del objeto Estudiante
                datos.add(p); // Agrega el objeto Estudiante a la lista datos
            }
        } catch (Exception e) { // Captura y manejo de excepciones
            
        }        
        return datos; // Devuelve la lista de objetos Estudiante
    }   
    
    public int agregar(Empleado per){
        int r=0;
        String sql = "insert into empleado empleado (cedula, nombre, apellido, telefono, email, cargo, salario)values(?,?,?,?,?,?,?,?)";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, per.getCedula());
            ps.setString(2, per.getNombre());
            ps.setString(3, per.getApellido());
            ps.setString(4, per.getTelefono());
            ps.setString(5, per.getFechaNacimiento());
            ps.setString(6, per.getEmail());
            ps.setString(7, per.getCiudad());
            ps.setString(8, per.getDireccion());
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
    
    public int actualizar(Empleado per){
        int r =0;
        String sql = "UPDATE zapateria.Empleado SET nombre = ?, apellido = ?, telefono=?, fechaNacimiento = ?, email = ?, ciudad = ?, direccion = ? WHERE cedula = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, per.getNombre());
            ps.setString(2, per.getApellido());
            ps.setString(3, per.getTelefono());
            ps.setString(4, per.getFechaNacimiento());
            ps.setString(5, per.getEmail());
            ps.setString(6, per.getCiudad());
            ps.setString(7, per.getDireccion());
            ps.setInt(8, per.getCedula());
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
        String sql = "delete from zapateria.Empleado where cedula =" + id;
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            r = ps.executeUpdate();
            
        } catch (Exception e) {
        }
        return r;
    }
    public Empleado buscarEmpleadoPorCedula(int cedula) {
    Empleado Empleado = null;
    String sql = "SELECT * FROM Empleado WHERE cedula = ?";
    try {
        con = conectar.getConnection();
        ps = con.prepareStatement(sql);
        ps.setInt(1, cedula);
        rs = ps.executeQuery();

        if (rs.next()) {
            Empleado = new Empleado();
            Empleado.setCedula(rs.getInt("cedula"));
            Empleado.setNombre(rs.getString("nombre"));
            Empleado.setApellido(rs.getString("apellido"));
            Empleado.setTelefono(rs.getString("telefono"));
            Empleado.setFechaNacimiento(rs.getString("fechaNacimiento"));
            Empleado.setEmail(rs.getString("email"));
            Empleado.setCiudad(rs.getString("ciudad"));
            Empleado.setDireccion(rs.getString("direccion"));
        }
    } catch (Exception e) {
        System.out.println(e);
     }
    return Empleado;
}

    
}