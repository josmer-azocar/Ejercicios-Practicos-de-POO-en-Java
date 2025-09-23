
package lab8_josmerazocar;

import java.util.Comparator;

public class ComparadorAutor implements Comparator<Libro>{

    @Override
    public int compare(Libro t, Libro t1) {
        return t.getAutor().compareTo(t1.getAutor());
    }
    
    
}
