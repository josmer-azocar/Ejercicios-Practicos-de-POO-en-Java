package labl_josmerazocar;

import javax.swing.JOptionPane;

public abstract class Personaje {
    //Atributos
    protected String nombre, raza;
    protected int fuerza, inteligencia, puntosVidaActual, puntosVidaMaximo;
    
 
    //Constructor S/P
    public Personaje(){
      
        nombre = raza = "";
        fuerza = inteligencia = 0;
        puntosVidaMaximo = 100;
        puntosVidaActual = puntosVidaMaximo;     
    }
    
    //Constructor C/P
    public Personaje(String n, String r, int f, int i, int v) {  
        this.nombre = n;
        this.raza = Personaje.validarRaza(r);
        this.fuerza = Personaje.validarFuerza(f);
        this.inteligencia = Personaje.validarInteligencia(i);
        this.puntosVidaMaximo = Personaje.validarPuntosVidaMaximo(v);
        this.puntosVidaActual = puntosVidaMaximo; 
    }
    
    // Set/Get
    public String getNombre(){    
        return nombre;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String r) {
        this.raza = r;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int f) {
        this.fuerza = Personaje.validarFuerza(f);
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int i) {    
        this.inteligencia = Personaje.validarInteligencia(i);
    }

    public int getPuntosVidaActual() {
        return puntosVidaActual;
    }

    public void setPuntosVidaActual(int puntosVidaActual) {
        this.puntosVidaActual = puntosVidaActual;
    }

    public int getPuntosVidaMaximo() {
        return puntosVidaMaximo;
    }

    public void setPuntosVidaMaximo(int puntosVidaMaximo) {
        this.puntosVidaMaximo = Personaje.validarPuntosVidaMaximo(puntosVidaMaximo);
    }
     
    //Metodos
    public void imprimir() {
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + 
                ", Raza: " + raza + 
                ", Fuerza: " + fuerza + 
                ", Inteligencia: " + inteligencia + ", Vida Actual: " + puntosVidaActual);
    }

    public static String validarRaza(String raza) {
       if (!raza.equals("humano") && !raza.equals("elfo") && 
        !raza.equals("enano") && !raza.equals("orco")) {
        raza = "humano"; 
        System.out.println("Se otorgo un valor por defecto"); 
    }
        return raza;
}
    
    public static int validarPuntosVidaMaximo(int vidaMaxima){
         if (vidaMaxima < 0) {
            vidaMaxima = 0;
        } else if (vidaMaxima > 100) {
            vidaMaxima = 100; 
        } else {
            vidaMaxima = vidaMaxima; 
        }
          return vidaMaxima;
    }

   public static int validarFuerza(int fuerza){
        if (fuerza < 0) {
            fuerza = 0; 
        } else if (fuerza > 20) {
            fuerza = 20; 
        } else {
            fuerza = fuerza; 
        }
         return fuerza;
    }
   
     public static int validarInteligencia(int inteligencia){
          if (inteligencia < 0) {
            inteligencia = 0; 
        } else if (inteligencia > 20) {
            inteligencia = 20; 
        } else {
            inteligencia = inteligencia;
        }
          return inteligencia;
    }
}