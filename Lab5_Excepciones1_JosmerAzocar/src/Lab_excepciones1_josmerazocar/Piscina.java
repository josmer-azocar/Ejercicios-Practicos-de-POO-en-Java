
package Lab_excepciones1_josmerazocar;

public class Piscina {
    
    private int nivel;
    public final int MAX_NIVEL;

    public Piscina() {
        nivel=0;
        this.MAX_NIVEL = 0;
    }

    public Piscina(int max) throws CrearExc {
        if (max<=0){
            throw new CrearExc("La capacidad no puede ser negativa");
        }
        else {
               nivel=0;
               this.MAX_NIVEL = max;
        }
    }

    public int getNivel() {
        return nivel;
    }

    public void vaciar(int cant)throws VaciarExc{
        if (cant>nivel){
            throw new VaciarExc("La cantidad a vaciar supera al nivel actual");
        } else {
        nivel = nivel-cant;
        }
    }
    
    public void llenar(int cant) throws LlenarExc{
        int aux = nivel+cant;
        if (aux>MAX_NIVEL || cant>MAX_NIVEL) {
            throw new LlenarExc("La Cantidad a llenar supera el nivel Maximo");
        } else {
        nivel = nivel+cant;
        }
        
    }
    
}
