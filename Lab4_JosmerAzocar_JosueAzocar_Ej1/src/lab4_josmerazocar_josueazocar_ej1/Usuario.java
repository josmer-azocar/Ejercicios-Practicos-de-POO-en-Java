package lab4_josmerazocar_josueazocar_ej1;

public abstract class Usuario {
    
    protected int CI;
    protected String nombre;
    protected String apellido;
    protected int edad;

    public Usuario() {
        CI = 0;
        nombre = "";
        apellido = "";
        edad = 0;
    }

    public Usuario(int CI, String nombre, String apellido, int edad) {
        this.CI = CI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
     

}
