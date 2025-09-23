package empleadosjosmerazocar;

public class PorComision extends Empleados {

    private double ventas;

    public PorComision() {
        super();
        this.ventas = 0;
    }

    public PorComision(int numSS, String nombre, String apellido, int ventas) {
        super(numSS, nombre, apellido);
        this.ventas = ventas;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Ventas: " + ventas);
        System.out.println("Sueldo: " + calcularSalario());

    }
    
    @Override
    public double calcularSalario() {
        double comision;
        comision = ventas * 0.30;
        return comision;
    }
    
}
