
package lab6_josmerazocar;

public class Almacen {
    
    private Elemento []lista;
    private final int N;
    private static int numA = 0;
    private static int numB = 0;
    private int cantidadElem = 0;
    
        public Almacen() {
        N = 0;
        lista = new Elemento[N];
        numA++;
    }

    public Almacen(int tam) {
        N = tam;
        lista = new Elemento[N];
        numA++;
    }

    public Elemento[] getLista() {
        return lista;
    }

    public void setLista(Elemento[] lista) {
        this.lista = lista;
    }

    public static int getNumA() {
        return numA;
    }

    public static void setNumA(int numA) {
        Almacen.numA = numA;
    }
    
    
    public void ingresar(Elemento o) throws AlmacenExc {
        if(cantidadElem ==  N){
            throw new AlmacenExc("Error: Almacen lleno");
        } else {
            for(int i = 0; i < N; i++){
                if (lista[i] != null && lista[i].getClave().equals(o.getClave())){
                    lista[i]=o;
                    return;
                }
            }
            
             for(int i = 0; i < N; i++){
                if (lista[i] == null){
                lista[i] = o;
                cantidadElem++;
                numB++;
                break;
                
              }
            } 
        }
    }
    
        public Elemento sacar(String clave) throws AlmacenExc {
            if (cantidadElem == 0) {
                throw new AlmacenExc("Error: Almacen vacio");
            }

            for (int i = 0; i < N; i++) {
                if (lista[i] != null && lista[i].getClave().equals(clave)) {
                    Elemento encontrado = lista[i]; 
                    lista[i] = null;               
                    cantidadElem--;
                    numB--;
                    return encontrado;             
                }
            }
            return null;
        }
         
      public void imprimir() {
          System.out.println("Tamaño maximo del almacen: " + N + ", Elementos guardados: " + this.cantidadElem);
          for(Elemento e : lista){
              if (e != null){
              e.imprimir();
              }
          }    
    }
     
    public static void informaciongeneral() {
        System.out.println("Almacenes creados: " + numA + ", Cantidad TOTAL de elementos guardados: " + numB);
     }
}
