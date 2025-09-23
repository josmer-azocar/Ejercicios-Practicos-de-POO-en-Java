/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntradasJosmerAzocar;

/**
 *
 * @author LPB-14
 */
public class Abonado extends Entrada{

    public Abonado() {
        super();
    }

    public Abonado(int id, Zona obZ, Comprador obC) {
        super(id, obZ, obC);
    }
    
    @Override
    public double calcPrecio() {
             return super.getObZ().getPrecioAbonado();
    }
    
}
