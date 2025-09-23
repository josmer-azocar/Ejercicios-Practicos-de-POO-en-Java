
package lab2_josmerazocar;


public class Revision extends Trabajo{
    
    private final double EXTRA = 20;

    public Revision() {
        super();
    }

    public Revision(String descripcion) {
        super(descripcion);
    }

    @Override
    public void setNroHoras(int nroHoras) {
        if(nroHoras<0 || nroHoras>168){
          System.out.println("Error: valor fuera de Rango");      
        } else{
        this.nroHoras = nroHoras;
        System.out.println("Operación exitosa");
        }
    }
  
    @Override
    public double calcularPrecioTotal(){
        double Precio = super.calculoPrecioFijo() + EXTRA;
        return Precio;
    }
    
    @Override
    public void consultar() {
                super.consultar();
                System.out.println("Precio: " + this.calcularPrecioTotal());      
        }
}
