package lab4_josmerazocar_josueazocar_ej1;


public abstract class Transporte {
    protected String tipo;
    protected double cantidadExtra;

    public Transporte() {
        tipo = "";
        cantidadExtra = 0;
    }

    public Transporte(String tipo) {
        this.tipo = tipo;
        cantidadExtra = 0;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCantidadExtra() {
        return cantidadExtra;
    }

    public void setCantidadExtra(double cantidadExtra) {
        this.cantidadExtra = cantidadExtra;
    }
    
    public abstract double calcularExtra();
    
     public void mostrarDatos(){
         System.out.println("////////////////////////////////////////");
         System.out.println("TIPO DE TRANSPORTE: " + this.tipo);
         System.out.println("////////////////////////////////////////");

     }
}
