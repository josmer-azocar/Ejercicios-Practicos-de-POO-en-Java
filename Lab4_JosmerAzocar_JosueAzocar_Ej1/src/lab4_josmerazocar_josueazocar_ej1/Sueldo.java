package lab4_josmerazocar_josueazocar_ej1;

public class Sueldo {
    private double monto;
    private final double SUELDOBASE = 700;

    public Sueldo() {
        monto = 0;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getSUELDOBASE() {
        return SUELDOBASE;
    }
        
}
