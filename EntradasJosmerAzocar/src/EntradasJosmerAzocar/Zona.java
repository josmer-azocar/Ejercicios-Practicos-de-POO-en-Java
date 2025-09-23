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
public class Zona {
    
    //Atributos
    private String nombre;
    private int numLocalidades;
    private double precioNormal;
    private double precioAbonado;
    
    //Constructor S/P
    public Zona() {
        nombre = "";
        numLocalidades = 0;
        precioNormal = precioAbonado = 0;
    }
    
    //Constructor C/P
    public Zona(String nombre, int numLocalidades, double precioNormal, double precioAbonado) {
        this.nombre = nombre;
        this.numLocalidades = numLocalidades;
        this.precioNormal = precioNormal;
        this.precioAbonado = precioAbonado;
    }
    
    //Set/Get
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumLocalidades() {
        return numLocalidades;
    }

    public void setNumLocalidades(int numLocalidades) {
        this.numLocalidades = numLocalidades;
    }

    public double getPrecioNormal() {
        return precioNormal;
    }

    public void setPrecioNormal(double precioNormal) {
        this.precioNormal = precioNormal;
    }

    public double getPrecioAbonado() {
        return precioAbonado;
    }

    public void setPrecioAbonado(double precioAbonado) {
        this.precioAbonado = precioAbonado;
    }

    //Otros metodos
    public void imprimir(){
        System.out.println("nombre: " + nombre + ", Num Localidades: " + numLocalidades + ", Precio Normla: " + precioNormal
        + ", Precio Abonado: " + precioAbonado);
    }
    
}
