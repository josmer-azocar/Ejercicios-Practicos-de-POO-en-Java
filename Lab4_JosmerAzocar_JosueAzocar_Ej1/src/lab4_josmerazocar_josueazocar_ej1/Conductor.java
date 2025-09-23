package lab4_josmerazocar_josueazocar_ej1;

public class Conductor extends Usuario{
    private Transporte tipoTransporte;
    private int horasConducidas;
    private Sueldo sueldo;

    public Conductor() {
        super();
        horasConducidas = 0;
        tipoTransporte = null;
        sueldo = new Sueldo();
    }

    public Conductor(int horasConducidas, int CI, String nombre, String apellido, int edad) {
        super(CI, nombre, apellido, edad);
         tipoTransporte = null;
        this.horasConducidas = horasConducidas;
        sueldo = new Sueldo();     
    }

    public Transporte getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(Transporte tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public int getHorasConducidas() {
        return horasConducidas;
    }

    public void setHorasConducidas(int horasConducidas) {
        this.horasConducidas = horasConducidas;
    }

    public Sueldo getSueldo() {
        return sueldo;
    }

    public void setSueldo(Sueldo sueldo) {
        this.sueldo = sueldo;
    }
    
   public double calcularSueldoFijo(){
       double fijo;
       
      fijo= sueldo.getSUELDOBASE() + (5 * horasConducidas);
       sueldo.setMonto(fijo);
       return fijo;
   }
   
   public void mostrarInformacion(){
       System.out.println("//////////////////////////////////////////////////////");
       System.out.println("Conductor: " + super.nombre + " " + super.apellido + ", CI: " + super.CI);
       System.out.println("Horas conducidas: " + this.horasConducidas + ", Sueldo: " + calcularSueldoFijo() + "$ " + "Extra: " + tipoTransporte.calcularExtra() + "$ " );
       System.out.println("Tipo de Transporte: " + tipoTransporte.getTipo()); 
       System.out.println("//////////////////////////////////////////////////////////////");
   }

}
