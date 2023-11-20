
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    /*
      String url = "jdbc:mysql://root:f54eh4gaD5GcBCHHCDDgB4F4-DcffA43@monorail.proxy.rlwy.net:55478/railway";
    String user="root", pass="f54eh4gaD5GcBCHHCDDgB4F4-DcffA43";
    */
    String url = "jdbc:mysql://localhost:3306/zapateria";
    String user="root", pass="admin";
    Connection con;
    
     public Connection getConnection(){
         try {
             //class.forName("com.mysql.jdbc.Driver");
             con=(Connection) DriverManager.getConnection(url, user, pass);
                
         } catch (Exception e) {
             System.out.println(e);
         }
         return con;
     }
    
}
