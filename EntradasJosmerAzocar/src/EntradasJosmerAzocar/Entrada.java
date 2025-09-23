/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntradasJosmerAzocar;

/**
 *
 * @author LPB-14
 */
public abstract class Entrada {
    
    protected int id;
    protected Zona obZ;
    protected Comprador obC;
    
    //Constructor S/P 
    public Entrada() {
        id = 0;
        obZ = null;
        obC = null;
    }
  
    //Constructor C/P
    public Entrada(int id, Zona obZ, Comprador obC) {    
        this.id = id;
        this.obZ = obZ;
        this.obC = obC;
    }

    //Get/Set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Zona getObZ() {
        return obZ;
    }

    public void setObZ(Zona obZ) {
        this.obZ = obZ;
    }

    public Comprador getObC() {
        return obC;
    }
    
    public void setObC(Comprador obC) {    
        this.obC = obC;
    }

    //Otros metodos
    public abstract double calcPrecio();
    
       public void imprimir(){
        System.out.println("ID: " + id + ", Zona: " + obZ.getNombre() + ", Comprador: " + obC.getNombre());
    }
}
