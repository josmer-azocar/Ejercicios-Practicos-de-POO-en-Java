package lab3_josmerazocar;

public abstract class FormaPago {
    
    protected String tipodePago;
    
    public FormaPago() {
        this.tipodePago = "";
    }

    public FormaPago(String TipodePago) {
        this.tipodePago = TipodePago;
    }

    public String getTipodePago() {
        return tipodePago;
    }

    public void setTipodePago(String TipodePago) {
        this.tipodePago = TipodePago;
    }
        
}
