
package lab_simulacionexamen_josmerazocar;

public class Producto {
    protected int codigo;
    protected String nombre;
    protected double precio;

    public Producto() {
        codigo = 0;
        nombre = "";
        precio = 0;
    }
    
    public Producto(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "PRODUCTO= " + "Nombre:" + nombre;
    } 
    
}
