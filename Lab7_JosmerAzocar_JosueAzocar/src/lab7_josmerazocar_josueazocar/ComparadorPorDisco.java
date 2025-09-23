package lab7_josmerazocar_josueazocar;

import java.util.Comparator;

public class ComparadorPorDisco implements Comparator<CantanteFamoso> {
    
    @Override
    public int compare(CantanteFamoso c1, CantanteFamoso c2) {
        
        return c1.getDiscoMasVendido().compareTo(c2.getDiscoMasVendido());
    }
}