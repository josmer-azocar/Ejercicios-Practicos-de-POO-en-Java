package lab4_josmerazocar_josueazocar_ej1;

public class Mercancias extends Transporte{
    protected double toneladas;

    public Mercancias() {
        super();
        toneladas = 0;
    }

    public Mercancias(double toneladas, String tipo) {
        super(tipo);
        this.toneladas = toneladas;
    }

    public double getToneladas() {
        return toneladas;
    }

    public void setToneladas(double toneladas) {
        this.toneladas = toneladas;
    }
    
    @Override
    public double calcularExtra(){
        super.cantidadExtra = 2 * this.toneladas;
        
        return super.cantidadExtra;
    }
    
     @Override
    public void mostrarDatos(){
         super.mostrarDatos();
           System.out.println("CANTIDAD DE TONELADAS: " + this.toneladas);
        
     }
}
