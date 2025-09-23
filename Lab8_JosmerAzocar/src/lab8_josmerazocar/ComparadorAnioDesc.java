
package lab8_josmerazocar;

import java.util.Comparator;

public class ComparadorAnioDesc implements Comparator<Libro> {

    @Override
    public int compare(Libro t, Libro t1) {
       return t1.getAnioPublicacion() - t.getAnioPublicacion();
    }
}
