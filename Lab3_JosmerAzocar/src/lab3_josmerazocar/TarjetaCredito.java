package lab3_josmerazocar;

public class TarjetaCredito extends FormaPago{
    
    private int fechaCaducidad;
    private int numero;
    private String tipo;

    public TarjetaCredito() {
        fechaCaducidad = 0;
        numero = 0;
        tipo = "";
        super.tipodePago = "tarjeta de credito";

    }
 
    public TarjetaCredito(int fechaCaducidad, int numero, String tipo) {
        this.fechaCaducidad = fechaCaducidad;
        this.numero = numero;
        this.tipo = tipo;
        super.tipodePago = "tarjeta de credito";

    }

    public int getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(int fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
      
}
