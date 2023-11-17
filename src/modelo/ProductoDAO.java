
package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO { // Declaración de la clase EstudianteDAO
    
    PreparedStatement ps;
   ResultSet rs;
   Connection con;
   Conexion conectar = new Conexion();
   Producto p = new Producto();
   
   
   public List listar(){
       List<Producto> datos = new ArrayList<>();
       try {
            con = conectar.getConnection(); // Establece una conexión con la base de datos utilizando el método getConnection de la clase Conexion
            ps = con.prepareStatement("select * from producto"); // Prepara la consulta a la base de datos utilizando el método prepareStatement de la clase Connection
            rs = ps.executeQuery(); // Ejecuta la consulta a la base de datos utilizando el método executeQuery de la clase PreparedStatement y almacena los resultados en la variable rs
            while(rs.next()){ // Inicio del bucle while que recorre todos los registros devueltos por la consulta
                Producto p = new Producto(); 
                p.setReferencia(rs.getInt(1)); // Asignación del valor del primer campo del registro a la propiedad id del objeto Estudiante
                p.setNombre(rs.getString(2)); 
                p.setTalla(rs.getString(3)); 
                p.setGenero(rs.getString(4));
                p.setColor(rs.getString(5));  // Asignación del valor del cuarto campo del registro a la propiedad Cantidad del objeto Estudiante
                p.setCategoria(rs.getString(6));  // Asignación del valor del cuarto campo del registro a la propiedad Cantidad del objeto Estudiante
                p.setPrecio_unitario(rs.getDouble(7));
                p.setValor_unitario(rs.getDouble(8));
                p.setCantidad(rs.getInt(9));
                datos.add(p); // Agrega el objeto Estudiante a la lista datos
            }
        } catch (Exception e) { // Captura y manejo de excepciones
            System.out.println(e);
            
        }        
        return datos; // Devuelve la lista de objetos Estudiante
    }   
    
    public int agregar(Producto per){
        int r=0;
        String sql = "insert into producto(referencia, nombre, talla, cantidad, genero, color, categoria, precio_unitario, valor_unitario)values(?,?,?,?,?,?,?,?,?)";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, per.getReferencia());
            ps.setString(2, per.getNombre());
            ps.setString(3, per.getTalla());
            ps.setInt(4, per.getCantidad());
            ps.setString(5, per.getGenero());
            ps.setString(6, per.getColor());
            ps.setString(7, per.getCategoria());
            ps.setDouble(8, per.getPrecio_unitario());
            ps.setDouble(9, per.getValor_unitario());
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
    
    public int actualizar(Producto per){
        int r =0;
        String sql = "UPDATE zapateria.producto SET nombre = ?, talla = ?, cantidad=?, genero = ?, color = ?, categoria = ?, precio_unitario = ?, valor_unitario = ? WHERE referencia = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, per.getNombre());
            ps.setString(2, per.getTalla());
            ps.setInt(3, per.getCantidad());
            ps.setString(4, per.getGenero());
            ps.setString(5, per.getColor());
            ps.setString(6, per.getCategoria());
            ps.setDouble(7, per.getPrecio_unitario());
            ps.setDouble(8, per.getValor_unitario());
            ps.setInt(9, per.getReferencia());
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
        String sql = "delete from zapateria.producto where referencia =" + id;
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            r = ps.executeUpdate();
            
        } catch (Exception e) {
        }
        return r;
    }
    public Producto buscarProductoPorReferencia(int Referencia) {
    Producto Producto = null;
    String sql = "SELECT * FROM producto WHERE referencia = ?";
    try {
        con = conectar.getConnection();
        ps = con.prepareStatement(sql);
        ps.setInt(1, Referencia);
        rs = ps.executeQuery();

        if (rs.next()) {
            Producto = new Producto();
            Producto.setReferencia(rs.getInt("Referencia"));
            Producto.setNombre(rs.getString("nombre"));
            Producto.setTalla(rs.getString("Talla"));
            Producto.setCantidad(rs.getInt("Cantidad"));
            Producto.setGenero(rs.getString("Genero"));
            Producto.setColor(rs.getString("Color"));
            Producto.setCategoria(rs.getString("Categoria"));
            Producto.setPrecio_unitario(rs.getDouble("Precio_unitario"));
            Producto.setValor_unitario(rs.getDouble("Valor_unitario"));
            Producto.setCantidad(rs.getInt("Cantidad"));
        }
    } catch (Exception e) {
        System.out.println(e);
     }
    return Producto;
}
    public Producto buscarProductoPorReferenciaFactura(int Referencia) {
    Producto Producto = null;
    String sql = "SELECT * FROM producto WHERE referencia = ?";
    try {
        con = conectar.getConnection();
        ps = con.prepareStatement(sql);
        ps.setInt(1, Referencia);
        rs = ps.executeQuery();

        if (rs.next()) {
            Producto = new Producto();
            Producto.setReferencia(rs.getInt("Referencia"));
            Producto.setNombre(rs.getString("nombre"));
            Producto.setTalla(rs.getString("Talla"));
            Producto.setCantidad(rs.getInt("Cantidad"));
            Producto.setGenero(rs.getString("Genero"));
            Producto.setColor(rs.getString("Color"));
            Producto.setCategoria(rs.getString("Categoria"));
            Producto.setPrecio_unitario(rs.getDouble("Precio_unitario"));
            Producto.setValor_unitario(rs.getDouble("Valor_unitario"));
            Producto.setCantidad(rs.getInt("Cantidad"));
        }
    } catch (Exception e) {
        System.out.println(e);
     }
    return Producto;
}

    
}