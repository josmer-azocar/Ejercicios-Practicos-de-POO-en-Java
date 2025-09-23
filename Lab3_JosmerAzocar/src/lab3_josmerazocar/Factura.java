
package lab3_josmerazocar;

import java.util.ArrayList;
import java.util.List;

public class Factura {
    
    private Pedido pedido;
    private List <FormaPago> formasdePago;

    public Factura() {  
        pedido = null;
        formasdePago = new ArrayList<>();
    }

    public Factura(Pedido pedido, String f) {
        this.pedido = pedido;
        formasdePago = new ArrayList<>();
        
        if (f == "efectivo"){
        FormaPago forma = new Efectivo();
        formasdePago.add(forma);
     } 
        else if (f == "cheque"){
        FormaPago forma = new Cheque();
        formasdePago.add(forma);
     } 
         else if (f == "tarjeta de credito"){
        FormaPago forma = new TarjetaCredito();
        formasdePago.add(forma);
     } 
        
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public List<FormaPago> getFormasdePago() {
        return formasdePago;
    }

    public void setFormasdePago(List<FormaPago> formasdePago) {
        this.formasdePago = formasdePago;
    }
    
    public void mostrarMetodosPago() {
         System.out.println("Metodos de Pago utlizados: ");
         for (FormaPago forma : this.formasdePago) {
         System.out.println(forma.getTipodePago());
        }
    }
       
    public void imprimirFactura(){
        System.out.println("Factura: ");
        pedido.imprimirCliente();
        pedido.mostrarProductos();
        System.out.println("Total a pagar (Incluye IVA): " + pedido.calcularCosteTotal());
        mostrarMetodosPago();
    }
}
