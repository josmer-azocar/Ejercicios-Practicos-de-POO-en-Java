package lab7_josmerazocar_josueazocar;

import java.util.Comparator;

public class ComparadorPorAnio implements Comparator<CantanteFamoso> {
    
    @Override
    public int compare(CantanteFamoso c1, CantanteFamoso c2) {
 
        return Integer.compare(c1.getAnioEmision(), c2.getAnioEmision());
    }
}