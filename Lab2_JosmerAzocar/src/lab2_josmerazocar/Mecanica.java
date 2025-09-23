
package lab2_josmerazocar;


public class Mecanica extends Reparacion{

    public Mecanica() {
        super();
    }

    public Mecanica(String descripcion) {
        super();
        super.descripcion = descripcion;
    }

    @Override
    public void setNroHoras(int nroHoras) {
         if(nroHoras<0 || nroHoras>336){
          System.out.println("Error: valor fuera de Rango");      
        } else{
        this.nroHoras = nroHoras;
        System.out.println("Operación exitosa");
        }
    }
    
    
    @Override
    public double calcularPrecioTotal(){
        double Precio = super.calculoPrecioFijo() + super.precioMaterial * 11;
        return Precio;
    }    
    
      @Override
    public void consultar() {
                super.consultar();
                System.out.println("Precio del Material: " + super.getPrecioMaterial());      
                System.out.println("Precio: " + this.calcularPrecioTotal());      
        }
    
}
