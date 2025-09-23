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
public class Comprador {
    
    private String nombre;
    private String apellido;
    private int fechaNac;
    private String tipo;
    
    //Constructor
    public Comprador() {
        nombre = "";
        apellido = "";
        fechaNac = 0;
        tipo = "";
    }

    public Comprador(String nombre, String apellido, int fechaNac, String tipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(int fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
   
      public void imprimir(){
        System.out.println("nombre: " + nombre + ", Apellido: " + apellido + ", Fecha de Nacimiento: " + fechaNac
        + ", Tipo: " + tipo);
    }
    
}
