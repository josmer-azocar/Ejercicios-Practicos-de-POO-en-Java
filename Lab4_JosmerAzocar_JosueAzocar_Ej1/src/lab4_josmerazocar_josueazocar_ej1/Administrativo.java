package lab4_josmerazocar_josueazocar_ej1;

import java.util.List;

public class Administrativo extends Usuario{

    public Administrativo() {
        super();
    }

    public Administrativo(int CI, String nombre, String apellido, int edad) {
        super(CI, nombre, apellido, edad);
    }
 
    
    public void añadirConductor(List <Conductor> lista, Conductor conduc) {
        lista.add(conduc);  
        System.out.println("Conductor añadido con exito!!!");       

}
    public void añadirTransporteConductor(Transporte transpor, Conductor conduc, List <Transporte> lista){
        conduc.setTipoTransporte(transpor);
        lista.add(transpor);
       System.out.println("El tipo de Transporte se ha relacionado con el Conductor con exito!!!");       

    }
    
    public void mostrarTransportesPeligro(List <Transporte> lista){
        for(Transporte t : lista){
            if(t instanceof MPeligrosas){
            t.mostrarDatos();
        }
      }
   }
    
    public void informeSueldos(List <Conductor> lista){
         System.out.println("INFORMACION DE LOS CONDUCTORES: ");
          for(Conductor c : lista){
            c.mostrarInformacion();
      }
    }
}
