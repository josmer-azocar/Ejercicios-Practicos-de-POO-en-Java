
package empleadosjosmerazocar;

public abstract class Empleados {
    protected String nombre;
    protected String apellido;
    protected int numSS;

    public Empleados() {
        this.nombre = "";
        this.apellido = "";
        this.numSS = 0;
    }

    public Empleados(int numSS, String nombre, String apellido) {
        this.numSS = numSS;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumSS() {
        return this.numSS;
    }

    public void setNumSS(int numSS) {
        this.numSS = numSS;
    }

    public void imprimir() {
        System.out.println("Datos: " + this.nombre + " " + this.apellido + ". Num de Seguro Social:" + this.numSS);
    }

    public abstract double calcularSalario();
}