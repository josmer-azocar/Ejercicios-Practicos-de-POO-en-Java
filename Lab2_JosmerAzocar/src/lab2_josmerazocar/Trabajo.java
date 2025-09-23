
package lab2_josmerazocar;
import java.util.Scanner;

public abstract class Trabajo {
   
    protected int identificador;
    private static int contadorId = 0;
    protected String descripcion;
    protected int nroHoras;
    protected boolean estadoFinalizado;
    
    Scanner scanner = new Scanner(System.in);
    
    public Trabajo(){
        this.identificador = contadorId;
        this.descripcion = "";
        this.nroHoras = 0;
        this.estadoFinalizado = false ;
        contadorId++;
    }

    public Trabajo(String descripcion) {
        this.identificador = contadorId;
        this.nroHoras = 0;
        this.descripcion = descripcion;
        this.estadoFinalizado = false ;
        contadorId++;
    }

    public int getIdentificador() {
        return identificador;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNroHoras() {
        return nroHoras;
    }

    public void setNroHoras(int nroHoras) {
        this.nroHoras = nroHoras;
    }

    public String isEstadoFinalizado() {
        if (this.estadoFinalizado){
            return "Finalizado";
        } else
            return "No finalizado";    
    }

    public void setEstadoFinalizado(boolean estadoFinalizado) {
        this.estadoFinalizado = estadoFinalizado;
    }
     
    public void registrar(Trabajo o){
       System.out.println("Ingrese la descripción del trabajo");
        String descrip = scanner.nextLine();
        System.out.println("Se ha registrado su trabajo con exito!!!");
        System.out.println("El codigo para identificar es: " + this.identificador);
        this.descripcion = descrip;
    }
    
       public void consultar() {
                System.out.println("Los datos de su trabajo son los siguientes:");
                System.out.println("Identificador: " + this.getIdentificador());
                System.out.println("Descripción: " + this.getDescripcion());
                System.out.println("Nro de horas trabajado: " + this.getNroHoras());
                System.out.println("Estado: " + this.isEstadoFinalizado());      
        }
    
    public void actualizar(){
        if(!this.estadoFinalizado) {
        System.out.println("Valores Actuales modificables:");
        System.out.println("1)Nro de horas trabajado: " + this.getNroHoras());
        System.out.println("2)Estado: " + this.isEstadoFinalizado()); 
        int opc = scanner.nextInt();
        switch(opc){
            case 1:
            System.out.println("Ingrese el numero de horas que trabajadas");
            int horas = scanner.nextInt();
            setNroHoras(horas);
            break;
            case 2:
             System.out.println("Se ha finalizado el trabajo? 1)si 2)no");
            int opcion = scanner.nextInt();
            if (opcion== 1){
              this.estadoFinalizado=true;
            }
            System.out.println("Operación exitosa");
            break;
            default:
            System.out.println("Opcion invalida");
        }
        } else{
                System.out.println("Este trabajo ya ha finalizado");
    }
    }
    
    protected double calculoPrecioFijo(){
      double fijo= this.nroHoras * 30;   
        return fijo;
    }
     
    public abstract double calcularPrecioTotal(); 
}
