
package lab_simulacionexamen_josmerazocar;

import java.util.Arrays;

public class Conjunto <T> {
    
    private T[] contenido;

    public Conjunto(Integer tamano) throws ExcConjunto {
        if (tamano > 0 && tamano instanceof Integer){
        this.contenido = (T[]) new Object[tamano];
        } else {
            throw new ExcConjunto("Error relacionado al tamaño del conjunto");
        }
    }

    public T[] getContenido() {
        return contenido;
    }

    public void setContenido(T[] contenido) {
        this.contenido = contenido;
    }
    
    public void nuevoElemento(T elemento) throws ExcConjunto {
        
    boolean existe = false;
    boolean espacioLibre = false;

        for (T element : contenido) {
            if (element != null && element.equals(elemento)) {
                existe = true;
            }
   
            if (!espacioLibre && element == null) {
                espacioLibre = true;
            }
        }

    if (existe) {
        throw new ExcConjunto("El elemento ya existe");
    }
    
    if (!espacioLibre) {
        throw new ExcConjunto("No hay espacio libre");
    }

    for (int i = 0; i < contenido.length; i++) {
        if (contenido[i] == null) {
            contenido[i] = elemento;
            return;  
        }
    }
}
    
    public Conjunto unirConjunto(Conjunto c) throws ExcConjunto{
        int tamano1 = contenido.length;
        int tamano2 = c.contenido.length;
        int tamanoTotal = tamano1 + tamano2;
        
        Conjunto<T> conjuntoResultante = new Conjunto<>(tamanoTotal);
        
       
        for (int i=0; i<tamano1; i++){
            conjuntoResultante.nuevoElemento(contenido[i]);
        }
          for (int i=0; i<tamano2; i++){
            conjuntoResultante.nuevoElemento((T) c.contenido[i]);
        }
          
          return conjuntoResultante;
    }   
    
  public Conjunto diferenciaConjuntos(Conjunto c) throws ExcConjunto {
        if (c == null) {
            throw new ExcConjunto("El conjunto proporcionado para la diferencia no puede ser nulo");
        }
        
        Conjunto<T> conjuntoDiferencia = new Conjunto<>(this.contenido.length);

        for (int i = 0; i < this.contenido.length; i++) {
            T elementoActual = this.contenido[i];
          
            if (!c.contiene(elementoActual)) {
                conjuntoDiferencia.nuevoElemento(elementoActual);
            }
        }
        return conjuntoDiferencia;
    }

   public boolean contiene(T elemento) {
        if (elemento == null) return false;
        for (int i = 0; i < this.contenido.length; i++) {
            if (this.contenido[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }
   
public Conjunto productoCartesiano(Conjunto conjunto) throws ExcConjunto {
    if (conjunto == null) {
        throw new ExcConjunto("El conjunto para el producto cartesiano no puede ser nulo");
    }

    int tamanoTotal = this.contenido.length * conjunto.contenido.length;

    Conjunto conjuntoResultado = new Conjunto<>(tamanoTotal);

    for (int i = 0; i < this.contenido.length; i++) {
        Object A = this.contenido[i];

        for (int j = 0; j < conjunto.contenido.length; j++) {
            Object B = conjunto.contenido[j];

            String par = "(" + A + ", " + B + ")";
            
            conjuntoResultado.nuevoElemento(par);
        }
    }  
    return conjuntoResultado;
}

    @Override
    public String toString() {
        return "Conjunto= " + Arrays.toString(contenido) + '}';
    }
    
}
