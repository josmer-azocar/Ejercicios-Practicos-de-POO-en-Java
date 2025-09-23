
package empleadosjosmerazocar;

public class PorHoras extends Empleados {
    int horas;
    double montoxHoraN;
    double montoxHoraE;

    public PorHoras(int numSS, String nombre, String apellido, int horas, double montoHorasN, double montoHorasE) {
        super(numSS, nombre, apellido);
        this.horas = horas;
        this.montoxHoraN = montoHorasN;
        this.montoxHoraE = montoHorasE;
    }

    public PorHoras() {
        super();
        this.horas = 0;
        this.montoxHoraN = 0;
        this.montoxHoraE = 0;
    }

    
    public int getHoras() {
        return this.horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getMontoHorasN() {
        return this.montoxHoraN;
    }

    public void setMontoHorasN(double montoHorasN) {
        this.montoxHoraN = montoHorasN;
    }

    public double getMontoHorasE() {
        return this.montoxHoraE;
    }

    public void setMontoHorasE(double montoHorasE) {
        this.montoxHoraE = montoHorasE;
    }

    
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Horas: " + horas + ", Monto x Hora normal: " + montoxHoraN + ", Monto x Horas extras: " + montoxHoraE);
        System.out.println("Salario: " + calcularSalario());
    }

    @Override
    public double calcularSalario(){
        if(horas <= 40)
            return (horas * montoxHoraN);
        else
            return ((horas - 40) * montoxHoraE) + (40 * montoxHoraN);
    }
}
