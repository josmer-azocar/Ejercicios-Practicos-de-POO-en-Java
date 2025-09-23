package labl_josmerazocar;

import javax.swing.JOptionPane;

public class Clerigo extends Personaje{

    private String nombreDios;
    private boolean donCuracion = false;

    public Clerigo() {
        super();
        super.inteligencia = 12;
        super.fuerza = 18;
        nombreDios = "";
    }
      
    public Clerigo(String n, String r, int f, int i, int v, String d) {
        super(n, r, f, i, v);
         super.inteligencia = Clerigo.validarInteligencia(i);
         super.fuerza = Clerigo.validarFuerza(f);
         this.nombreDios = d;
    }

    @Override
    public void setInteligencia(int i) {
           super.inteligencia = Clerigo.validarInteligencia(i);
    }

    @Override
    public void setFuerza(int f) {
           super.inteligencia = Clerigo.validarInteligencia(f); 
    }
   
    public void rezar(){
        if (this.donCuracion == false) {
            this.donCuracion = true;
        }
      JOptionPane.showMessageDialog(null, this.getNombre() + " recibió el don de la curación");
    }
    
    public void curar(Personaje o){
        if (this.donCuracion == true) {
       o.puntosVidaActual=o.puntosVidaActual + 10; 
       JOptionPane.showMessageDialog(null, this.getNombre() + " curó a " + o.getNombre());
    } else {
           JOptionPane.showMessageDialog(null, "Aún no tienes el don de la Curación");
        }
}
    
    public static int validarFuerza(int fuerza){
        if (fuerza < 18) {
            System.out.println("Se otorgo un valor por defecto"); 
            fuerza = 18; 
        } else if (fuerza > 20) {
            System.out.println("Se otorgo un valor por defecto"); 
            fuerza = 20; 
        } else {
            fuerza = fuerza; 
        }
     return fuerza;
    }
   
   public static int validarInteligencia(int inteligencia){
       if (inteligencia < 12) {
           System.out.println("Se otorgo un valor por defecto"); 
            inteligencia = 12; 
        } else if (inteligencia > 16) {
            System.out.println("Se otorgo un valor por defecto"); 
            inteligencia = 16; 
        } else {
            inteligencia = inteligencia;
        }
     return inteligencia;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        JOptionPane.showMessageDialog(null,"Nombre del Dios de " + this.getNombre() + " : "  + nombreDios);
    }
}

