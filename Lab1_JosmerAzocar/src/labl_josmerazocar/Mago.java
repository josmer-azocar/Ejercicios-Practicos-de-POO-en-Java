package labl_josmerazocar;

import javax.swing.JOptionPane;

public class Mago extends Personaje{
    
    private String[] hechizos;
    
    public Mago(){
    super();
    super.inteligencia = 17;
    hechizos = new String[4];
}
    
    public Mago(String n, String r, int f, int i, int v)
    {
        super(n, r, f, i, v);
        super.inteligencia = Mago.validarInteligencia(i);
        super.fuerza = Mago.validarFuerza(f);
        hechizos = new String[4];
    }

    @Override
    public void setInteligencia(int i) {
         super.inteligencia = Mago.validarInteligencia(i);
    }

    @Override
    public void setFuerza(int f) {
        super.fuerza = Mago.validarFuerza(f);

    }
      
@Override
public void imprimir() {
    super.imprimir();
    
    for (String hechizo : hechizos) {
        if (hechizo != null) {
            JOptionPane.showMessageDialog(null, "hechizo guardado de " + this.getNombre() + " : " + hechizo);
        }
    }
}
    
    public void aprendeHechizo(String h){
        //añade un hechizo al array en un espacio vacio      
        for(int i=0;i<4;i++){
        if (hechizos[i] == null) {
            hechizos[i]= h;
            System.out.println("hechizo nuevo agregado: " + h); 
            break;
        } 
    }
    JOptionPane.showMessageDialog(null, this.getNombre() + " aprendió: " + h);

 } 
    
    public void lanzarHechizo(Personaje o, String h){
        o.puntosVidaActual=o.puntosVidaActual - 10;  
        JOptionPane.showMessageDialog(null, o.getNombre() + " recibió un ataque de estilo " + h);
        //Borrar hechizo del arreglo   
         for (int i = 0; i < 4; i++) {
          if (hechizos[i] != null && hechizos[i].equals(h)) {
            hechizos[i] = null;
            return; 
        }
    }     
}
    
       public static int validarFuerza(int fuerza){
        if (fuerza < 0) {
           System.out.println("Se otorgo un valor por defecto"); 
            fuerza = 0; 
        } else if (fuerza > 15) {
          System.out.println("Se otorgo un valor por defecto"); 
            fuerza = 15; 
        } else {
            fuerza = fuerza; 
        }
           return fuerza;
    }
     
     public static int validarInteligencia(int inteligencia){
        if (inteligencia < 17) {
          System.out.println("Se otorgo un valor por defecto"); 
            inteligencia = 17; 
        } else if (inteligencia > 20) {
           System.out.println("Se otorgo un valor por defecto"); 
            inteligencia = 20; 
        } else {
            inteligencia = inteligencia;
        }
          return inteligencia;
    }
}
