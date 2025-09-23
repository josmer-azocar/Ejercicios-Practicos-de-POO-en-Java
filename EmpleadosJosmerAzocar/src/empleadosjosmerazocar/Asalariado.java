
package empleadosjosmerazocar;

public class Asalariado extends Empleados {
    private double salario;

    public Asalariado(int numSS, String nombre, String apellido, int salario) {
        super(numSS, nombre, apellido);
        this.salario = salario;
    }

    public Asalariado() {
        super();
        this.salario = 0;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
     
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Salario: " + this.calcularSalario());
    }

    @Override
    public double calcularSalario() {
        return salario;
    }
}
