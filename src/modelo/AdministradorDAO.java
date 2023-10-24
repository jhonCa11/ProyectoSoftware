package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class AdministradorDAO { // Declaración de la clase EstudianteDAO
    
    PreparedStatement ps;
   ResultSet rs;
   Connection con;
   Conexion conectar = new Conexion();
   Administrador p = new Administrador();
   
      
    public int agregar(Administrador per){
        int r=0;
        String sql = "INSERT INTO usuarios(usuario, contraseña, cedula)values(?,?,?)";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, per.getUsuario());
            ps.setString(2, per.getContrasena());            
            ps.setInt(3, per.getCedula());
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


    
}
