package lab7_josmerazocar_josueazocar;

import java.util.ArrayList;
import java.util.Iterator; 

public class ListaCantantesFamosos {
    
    private ArrayList<CantanteFamoso> lista;

    public ListaCantantesFamosos() {
        this.lista = new ArrayList<>();
    }

    public ArrayList<CantanteFamoso> getLista() {
        return lista;
    }

    public void setLista(ArrayList<CantanteFamoso> lista) {
        this.lista = lista;
    }
    
    public void agregarCantante(CantanteFamoso cantante) throws ListaCantanteExc {
        for (CantanteFamoso cantanteExistente : lista) {
            if (cantanteExistente.getNombre().equalsIgnoreCase(cantante.getNombre())) {
                
                throw new ListaCantanteExc("Error: El cantante " + cantante.getNombre() + " ya esta en la lista");
            }
        }

        lista.add(cantante);
    }
    
    public void eliminarTodosLosCantantes() {
        lista.clear();
        System.out.println("Se han eliminado todos los cantantes"); 
    }
    

    public void eliminarPorNombre(String nombre) {
        Iterator<CantanteFamoso> iterador = lista.iterator();
        boolean encontrado = false;
        while (iterador.hasNext()) {
            CantanteFamoso cantante = iterador.next();
      
            if (cantante.getNombre().equalsIgnoreCase(nombre)) {
                iterador.remove(); 
                encontrado = true;
                System.out.println("Cantante " + nombre + " ha sido eliminado");
                break; 
            }
        }
        if (!encontrado) {
            System.out.println("No se encontro ningun cantante con el nombre " + nombre);
        }
    }

    public void buscarPorNombre(String nombre) {
        boolean encontrado = false;
        for (CantanteFamoso cantante : lista) {
            if (cantante.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Cantante Encontrado. Datos:");
                System.out.println(cantante.toString());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontro ningun cantante con el nombre " + nombre);
        }
    }
    
    public void buscarPorDisco(String parteDelDisco) {
        boolean encontrado = false;
        System.out.println("Buscando discos que contengan " + parteDelDisco + ":");
        for (CantanteFamoso cantante : lista) {
            if (cantante.getDiscoMasVendido().toLowerCase().contains(parteDelDisco.toLowerCase())) {
                System.out.println("Disco encontrado. Datos:");
                System.out.println(cantante.toString());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontro ningun disco que contenga " + parteDelDisco);
        }
    }
    
    public void mostrarTamanio() {
        System.out.println("El tamaño de la lista de cantantes es: " + lista.size());
    }
    
    public void mostrarTodosLosCantantes() {
        if (lista.isEmpty()) {
            System.out.println("La lista de cantantes esta vacia");
            return;
        }
        System.out.println("Lista de Cantantes:");
        for (CantanteFamoso cantante : lista) {
            if (cantante != null) {
                System.out.println(cantante.toString());
            }
        }
    }
}