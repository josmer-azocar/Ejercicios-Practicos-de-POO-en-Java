package lab4_josmerazocar_josueazocar_ej1;

public class Personas extends Transporte{
    private int numPersonas;
    private int horas;
    
    public Personas() {
        super();
        numPersonas = 0;
        horas = 0;
    }

    public Personas(int numPersonas, int horas, String tipo) {
        super(tipo);
        this.numPersonas = numPersonas;
        this.horas = horas;
    }

    public int getNumPersonas() {
        return numPersonas;
    }

    public void setNumPersonas(int numPersonas) {
        this.numPersonas = numPersonas;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

 
    @Override
    public double calcularExtra(){
        if (numPersonas <= 9){
            super.cantidadExtra = 0.5 * horas;
        } else {
            super.cantidadExtra = 1 * horas;
        }
        return super.cantidadExtra;
    }
    
    @Override
    public void mostrarDatos(){
         super.mostrarDatos();
           System.out.println("NUMERO DE PERSONAS: " + this.numPersonas);
            System.out.println("HORAS : " + this.horas);
        
     }
}
