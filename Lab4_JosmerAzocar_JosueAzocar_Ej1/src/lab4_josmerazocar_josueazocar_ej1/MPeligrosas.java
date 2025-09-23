package lab4_josmerazocar_josueazocar_ej1;

public class MPeligrosas extends Mercancias{
   private final double FIJOEXTRA = 50;
   private int cantidadTransportes;

    public MPeligrosas() {
        super();
        cantidadTransportes = 0;
    }

    public MPeligrosas(double toneladas, String tipo, int cantidadTransportes) {
        super(toneladas, tipo);
         this.cantidadTransportes = cantidadTransportes;
    }

    public double getFijoExtra() {
        return FIJOEXTRA;
    }

    public int getCantidadTransportes() {
        return cantidadTransportes;
    }

    public void setCantidadTransportes(int cantidadTransportes) {
        this.cantidadTransportes = cantidadTransportes;
    }

    
   @Override
    public double calcularExtra(){
        super.cantidadExtra= super.calcularExtra() + (50 * cantidadTransportes);
        return cantidadExtra;
    }
    
    @Override
    public void mostrarDatos(){
         super.mostrarDatos();
         System.out.println("CANTIDAD DE TRANSPORTES: " + this.cantidadTransportes);      
         System.out.println("//////////////////////////////////////////////");
     }
}
