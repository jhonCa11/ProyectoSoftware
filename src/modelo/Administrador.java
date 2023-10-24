
package modelo;

public class Administrador {
    private int cedula;
    private String usuario;
    private String contrasena;

    public Administrador(){
        
    }

    public Administrador(int cedula, String usuario, String contrasena) {
        this.cedula = cedula;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
    
}