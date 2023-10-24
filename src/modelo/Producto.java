
package modelo;

public class Producto {
    private int referencia;
    private String nombre;
    private String talla;
    private String categoria;
    private String genero;
    private String color;
    private double precio_unitario;
    private double valor_unitario;
    private int cantidad;

    public Producto(){
        
    }

    public Producto(int referencia, String nombre, String talla, String genero, String color, double precio_unitario, double valor_unitario, int cantidad, String categoria) {
        this.referencia = referencia;
        this.nombre = nombre;
        this.talla = talla;
        this.genero = genero;
        this.color = color;
        this.precio_unitario = precio_unitario;
        this.valor_unitario = valor_unitario;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public double getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(double valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
}