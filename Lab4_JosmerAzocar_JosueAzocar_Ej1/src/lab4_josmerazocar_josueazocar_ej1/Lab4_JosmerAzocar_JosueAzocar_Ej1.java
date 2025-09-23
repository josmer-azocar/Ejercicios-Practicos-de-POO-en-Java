package lab4_josmerazocar_josueazocar_ej1;

import java.util.ArrayList;
import java.util.List;


public class Lab4_JosmerAzocar_JosueAzocar_Ej1 {


    public static void main(String[] args) {
       
      List<Conductor> listaConductores= new ArrayList<> ();  
      List<Transporte> listaTransportes= new ArrayList<> ();    
      
      Administrativo admin1 = new Administrativo(2654594, "Fernando", "Balles",30 );
      
      Conductor conductor1 = new Conductor(5, 14285684, "Jose", "Gomez", 45);
      Conductor conductor2 = new Conductor(7, 19524865, "Luis", "Rodriguez", 36);
      Conductor conductor3 = new Conductor(7, 25689456, "Jesus", "Rodriguez", 28);
      
      Personas transporte1 = new Personas(5,5, "TRANSPORTE DE PERSONAS" );
      Mercancias transporte2 = new Mercancias(10, "TRANSPORTE DE MERCANCIAS");
      MPeligrosas transporte3 = new MPeligrosas(10, "TRANSPORTE DE MERCANCIAS PELIGROSAS", 8);
       
      admin1.añadirConductor(listaConductores, conductor1);
      admin1.añadirConductor(listaConductores, conductor2);
      admin1.añadirConductor(listaConductores, conductor3);
      
      admin1.añadirTransporteConductor(transporte1, conductor1, listaTransportes);
      admin1.añadirTransporteConductor(transporte2, conductor2, listaTransportes);
      admin1.añadirTransporteConductor(transporte3, conductor3, listaTransportes);
      
      admin1.mostrarTransportesPeligro(listaTransportes);
      
      admin1.informeSueldos(listaConductores);
    }
    
}
