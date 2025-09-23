package lab3_josmerazocar;

public class Cliente {
    
    private int cedula;
    private String nombre;
    private String apellido;
    private int fechaNac;
    private String sexo;

    public Cliente() {
        cedula = 0;
        nombre = "";
        apellido = "";
        fechaNac = 0;
        sexo = "";
    }
    
    public Cliente(int cedula, String nombre, String apelllido, int fechaNac, String sexo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apelllido;
        this.fechaNac = fechaNac;
        this.sexo = sexo;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelllido() {
        return apellido;
    }

    public void setApelllido(String apelllido) {
        this.apellido = apelllido;
    }

    public int getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(int fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
      public void imprimir(){
          System.out.println("Informacion del cliente: ");
          System.out.println("Nombre: " + nombre + " Apellido: " + apellido + " Cedula: " + cedula);
    }
    
}
