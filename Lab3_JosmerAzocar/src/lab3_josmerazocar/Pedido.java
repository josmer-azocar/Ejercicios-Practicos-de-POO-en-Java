package lab3_josmerazocar;

import java.util.ArrayList;
import java.util.List;


public class Pedido {
    
    private Cliente cliente;
    private int fecha;
    private List<Producto> productos;

    public Pedido() {
        cliente = null;
        fecha = 0;
        productos = null;
        this.productos = new ArrayList<>();
    }
 
    public Pedido(Cliente cliente, int fecha) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.productos = new ArrayList<>();
    }
    
    public void añadirProducto(Producto h) {    
        this.productos.add(h);
        System.out.println("Producto agregado: " + h.getDescripcion());
    }

    public void mostrarProductos() {
         System.out.println("Productos seleccionados: ");
         for (Producto p : this.productos) {
         System.out.println(p.getCodigo()+ " " + p.getDescripcion() + ", Precio: " + p.getPrecio());
        }
    }
    
    public void imprimirCliente(){
    System.out.println("Informacion del cliente: ");
    System.out.println("Nombre: " + cliente.getNombre() + ", Apellido: " + cliente.getApelllido() + ", Cedula: " + cliente.getCedula());
    }
          
    public double calcularCosteTotal() {
        double costoTotal = 0; 
        double impuestoAux = 0.16;
        double costo=0;
        for (Producto p : this.productos) {
            costo= p.getPrecio() + (p.getPrecio()*impuestoAux);
            costoTotal = costoTotal + costo;
        }

        return costoTotal;
    }
}
