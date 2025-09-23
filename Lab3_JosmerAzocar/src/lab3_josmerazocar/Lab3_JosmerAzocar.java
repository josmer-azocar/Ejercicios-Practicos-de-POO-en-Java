package lab3_josmerazocar;

public class Lab3_JosmerAzocar {

    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente(31318507, "Josmer", "Azocar", 05062006, "M");
        
        Producto producto1 = new Producto(74189, "balon de futbol grande", 55);
        Producto producto2 = new Producto(16746, "Camisa de equipo de futbol", 25);
        
        Pedido pedido1 = new Pedido(cliente1, 24052025);
        
        pedido1.añadirProducto(producto1);
        pedido1.añadirProducto(producto2);
        
        Factura factura1 = new Factura(pedido1, "efectivo");
        factura1.imprimirFactura();     
    }
    
}
