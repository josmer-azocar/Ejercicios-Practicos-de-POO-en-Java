
package lab3_josmerazocar;

public class Cheque extends FormaPago{
    
    private int numero;
    private String entidadBancaria;
    
    public Cheque() {
        numero = 0;
        entidadBancaria = "";
        super.tipodePago = "cheque";
    }
    
    public Cheque(int numero, String entidadBancaria) {
        this.numero = numero;
        this.entidadBancaria = entidadBancaria;
        super.tipodePago = "cheque";
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEntidadBancaria() {
        return entidadBancaria;
    }

    public void setEntidadBancaria(String entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }
      
}
