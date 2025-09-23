
package lab8_josmerazocar;

import java.util.Comparator;

public class ComparadorIsbnDesc implements Comparator<Libro>{
    
    @Override
    public int compare(Libro t, Libro t1) {
       return t1.getIsbn().compareTo(t.getIsbn());
    }
}
